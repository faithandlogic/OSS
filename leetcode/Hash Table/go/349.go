func intersection(nums1 []int, nums2 []int) []int {
    // make map
    maps := make(map[int]int)
    for _, n := range nums1 {
        _, key_exists := maps[n] 
        if !key_exists {
            maps[n] = maps[n] + 1
        }
    }
    // make empty array
    var ans []int
    // check second array with map
    for _, n := range nums2{
        if maps[n] == 1 {
            maps[n] = maps[n] - 1
            ans = append(ans, n) 
        }
    }
    // return new array
    return ans
}