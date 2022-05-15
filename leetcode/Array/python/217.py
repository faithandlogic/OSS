# 217. Contains Duplicate
# Given an integer array nums,
# return true if any value appears at least twice in the array,
# and return false if every element is distinct.

# for this solution, we can make use of a set to store the values without duplicates
# and check if the length of the set is less than the length of the array
# if it is, then there is a duplicate
class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        return len(set(nums)) < len(nums)

        # or

        # return len(nums) != len(set(nums))

        # or

        # set_nums = set(nums)
        # if len(set_nums) < len(nums):
        #     return True
        # return False