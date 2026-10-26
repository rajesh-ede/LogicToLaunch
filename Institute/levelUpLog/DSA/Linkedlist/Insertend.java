
public class Insertend {
    static void toList(int arr[]){
        int n = arr.length;
        ListNode root = new ListNode(arr[0]);
        ListNode temp = root;
        for(int i = 1; i < n; i++){
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }
        ListNode res = insertE(root,5);
        while(res != null){
            System.out.print(res.val+" ");
            res = res.next;
        }

    }
    static ListNode insertE(ListNode root, int val){

        ListNode newNode = new ListNode(val);
        if(root == null){
            return newNode;
        }
        ListNode temp = root;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return root;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        toList(arr);
    }
}
