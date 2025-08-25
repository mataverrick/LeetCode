/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class  ListNode(var `val`: Int){
    var next: ListNode? = null
    override fun toString(): String {
        return if(next != null){
            "$`val` -> ${next.toString()}"
        }else{
            "$`val`"
        }
    }
}


class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        val size: Int = count(head)
        if(size == 1) return null

        var current: ListNode? = head
        var count = 1

        val position: Int = size - n

        if(position == 0){
            return head?.next
        }

        while (current != null){
            if(position == count){
                current.next = current.next?.next
            }

            count++
            current = current.next
        }
        return head
    }

    fun count(head: ListNode?): Int{
        var current: ListNode? = head
        var size: Int = 0

        while(current != null){
            size++;
            current = current.next
        }

        return size
    }
}


fun main(){
    val list = ListNode(`val` = 1)
    list!!.next = ListNode(`val` = 2)
    
    val sol = Solution()
    print(sol.removeNthFromEnd(list,2))
}