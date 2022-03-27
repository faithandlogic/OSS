/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
// 1. Make a node that will be the sum of all nodes within group
// 2. After adding a node to the sum, delete node
// 3. Repeat step two while current node is not equal to 0
// 4. When current equals 0, modificaiton node is assigned to current (val of 0) for a reset
// 5. Loop ends with one 0 remaining
// 6. snip off remaining zero by setting the last modified nodes next pointer to nil
func mergeNodes(head *ListNode) *ListNode {
    if head == nil || head.Val == 0 && head.Next == nil{
        return nil
    }
    curr := head
    mod := &ListNode{}
    for curr.Next != nil  {
        if curr.Val == 0 {
            mod = curr
            curr = curr.Next
        }
        if curr.Val != 0 {
            mod.Val += curr.Val
            *curr = *curr.Next
        }
    }
    mod.Next = nil
    return head
}

