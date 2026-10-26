import java.time.temporal.JulianFields;
import java.util.List;

public class Insertbeforeval {
    static ListNode insertbVal(ListNode root,int val,int target){
        ListNode newNode = new ListNode(val);
        if(root == null){
            return root;
        }
        if(root.val == target){
            newNode.next = root;
            root = newNode;
            return root;
        }
        ListNode temp = root;
        while(temp.next != null && temp.next.val != target){
            temp = temp.next;
        }
        if(temp.next == null){
            return root;
        }
        newNode.next = temp.next;
        temp.next = newNode;

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
        ListNode res = insertbVal(root,5,10);
        while(res != null){
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,50};
        toList(arr);
    }
}
