package tools

import (
	"testing"

	"github.com/stretchr/testify/require"
)

func TestMapSet(t *testing.T) {
	set := NewConcurrentSafeMapSet[string]()
	set.Add("A")
	set.Add("B")
	set.Add("C")
	set.Remove("B")

	rets := set.Values()
	require.Len(t, rets, 2)
	require.Contains(t, rets, "A")
	require.Contains(t, rets, "C")
}

type testObject struct {
	Name string
}

func TestMapSetObject(t *testing.T) {
	set := NewConcurrentSafeMapSet[testObject]()
	set.Add(testObject{Name: "A"})
	set.Add(testObject{Name: "B"})
	set.Add(testObject{Name: "C"})
	set.Remove(testObject{Name: "B"})

	rets := set.Values()
	require.Len(t, rets, 2)
	for _, v := range set.Values() {
		if v.Name == "A" || v.Name == "C" {
			continue
		}
		require.Failf(t, "remove error", "unknow object %s", v.Name)
	}
}

func TestMapSetObjectP(t *testing.T) {
	set := NewConcurrentSafeMapSet[*testObject]()
	a := &testObject{Name: "A"}
	b := &testObject{Name: "B"}
	c := &testObject{Name: "C"}
	set.Add(a)
	set.Add(b)
	set.Add(c)
	set.Remove(b)

	rets := set.Values()
	require.Len(t, rets, 2)
	for _, v := range set.Values() {
		if v.Name == "A" || v.Name == "C" {
			continue
		}
		require.Failf(t, "remove error", "unknow object %s", v.Name)
	}
}
