FROM golang:1.18.4 as builder

WORKDIR /go/micro

ADD . /go/micro

RUN go mod tidy

RUN go build

FROM alpine:3.16.0

# https://stackoverflow.com/questions/34729748/installed-go-binary-not-found-in-path-on-alpine-linux-docker
RUN mkdir /lib64 && ln -s /lib/libc.musl-x86_64.so.1 /lib64/ld-linux-x86-64.so.2

WORKDIR /app

COPY --from=builder /go/micro/micro /app/micro

COPY ./entrypoint.sh /app/entrypoint.sh

ENTRYPOINT ["/app/entrypoint.sh"]
