public class MergeInBetween {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode start = null;
        ListNode end = list1;
        for (int i=0; i<b; ++i, end = end.next){  //end keeps iterating until it reaches b
            if (i == a-1){  //assign start to end when reaches to a-1
                start = end;
            }
        }
        start.next = list2;  //Link start to the head of the list2
        while (list2.next != null){  //Find the end of the list2
            list2 = list2.next;
        }
        list2.next = end.next;  //Link the end of the list2 to b+1
        end.next = null;  //Remove the linkage of node b
        return list1;
    }
}

