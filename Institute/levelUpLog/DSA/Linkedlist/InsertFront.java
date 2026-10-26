public class InsertFront{
    static ListNode insertF(ListNode root, int val){
        ListNode ele = new ListNode(val);
        if(root == null){
            return null;
        }
        ele.next = root;
        return ele;
    }
    static void toList(int arr[]){
        int n = arr.length;
        ListNode root = new ListNode(arr[0]);
        ListNode temp = root;
        for(int i = 1; i < n; i++){
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }
        ListNode ans = insertF(root,2);
        while(ans != null){
            System.out.print(ans.val+" ");
            ans = ans.next;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        toList(arr);
    }
}
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){

        this.val = val;

    }
}