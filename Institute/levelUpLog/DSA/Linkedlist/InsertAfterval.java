
public class InsertAfterval {
    static ListNode insertatVal(ListNode root, int target, int val){
        if(root == null){
            return root;
        }
        ListNode temp = root;

        while(temp != null && temp.val != target){
            temp = temp.next;
        }
        ListNode ele = new ListNode(val);
        ele.next = temp.next;
        temp.next = ele;

        return root;
    }
     static void toList(int arr[]){
         int n = arr.length;
         ListNode root = new ListNode(arr[0]);
         ListNode temp = root;
        for(int i = 1; i < n; i++){
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }
        ListNode res = insertatVal(root,10,15);
        while(res != null){
            System.out.print(res.val+ " ");
            res = res.next;
        }
     }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40};
        toList(arr);
    }
}
