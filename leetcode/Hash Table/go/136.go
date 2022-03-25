func singleNumber(nums []int) int {
	nap := make(map[int]int)
	for _, v := range nums {
		nap[v]++
	}
	for k, x := range nap {
		if x == 1 {
			return k
		}
	}
	return -1
}