package tools

import "sync"

type Set[T comparable] interface {
	Add(v T)
	Remove(v T)
	Values() []T
}

type mapSet[T comparable] struct {
	sync.RWMutex
	container map[T]struct{}
}

func NewConcurrentSafeMapSet[T comparable]() Set[T] {
	return &mapSet[T]{
		container: make(map[T]struct{}),
	}
}

func (s *mapSet[T]) Add(v T) {
	s.RWMutex.Lock()
	s.container[v] = struct{}{}
	s.RWMutex.Unlock()
}

func (s *mapSet[T]) Remove(v T) {
	s.RWMutex.Lock()
	delete(s.container, v)
	s.RWMutex.Unlock()
}

func (s *mapSet[T]) Values() []T {
	s.RWMutex.RLock()
	defer s.RWMutex.RUnlock()
	var rets []T
	for v := range s.container {
		rets = append(rets, v)
	}
	return rets
}
