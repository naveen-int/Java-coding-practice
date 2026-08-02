import java.util.*;

public class RemoveDuplicatesInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Unique elements:");
        for(int j = 0; j < n; j++) {
            boolean duplicate = false;
            for(int k = 0; k < j; k++) {
                if(arr[j] == arr[k]) {
                    duplicate = true;
                    break;
                }
            }

            if(!duplicate) {
                System.out.print(arr[j] + " ");
                //System.out.println(Arrays.toString(arr));
            }      
        }
        
    }
}
