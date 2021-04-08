public class ConvertBinary {
    public int getDecimalValue(ListNode head){
        int num = head.val;
        while (head.next != null){
            head = head.next;
            num = head.val + num*2;
        }
        return num;
    }
}



