#!/bin/sh

set -e

readonly APPROOT=${APPROOT:-"/app"}
export PATH="$PATH:$APPROOT"

exec "$@"
