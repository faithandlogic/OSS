func majorityElement(nums []int) int {
	// make map
    nap := make(map[int]int)
	// get frequency of each element
    for _, v := range nums {
        nap[v]++
    }
	// find the element with the majority frequency
	// defined as num elements in the array divided by 2
    for k, x := range nap {
        if x > len(nums)/2 {
            return k
        }
    }
	// return -1 if no majority element (impossible)
    return -1
}
