public class InsertatK {
    static ListNode insertatK(ListNode root,int val , int k){
        if(root == null || k == 1){
            return new ListNode(val);
        }
        ListNode newNode = new ListNode(val);
        ListNode temp = root;
        int cnt = 1;
        while(temp.next != null && cnt < (k-1)){
            temp = temp.next;
            cnt++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return root;
    }
    static void toList(int arr[]){
        int n = arr.length;
        ListNode root = new ListNode(arr[0]);
        ListNode temp  = root;
        for(int i = 1; i < n; i++){
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }
        ListNode res = insertatK(root,6,3);
        while(res != null){
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        toList(arr);
    }
}
