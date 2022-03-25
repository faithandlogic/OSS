func majorityElement(nums []int) int {
    nap := make(map[int]int)
    for _, v := range nums {
        nap[v]++
    }
    for k, x := range nap {
        if x > len(nums)/2 {
            return k
        }
    }
    return -1
}
