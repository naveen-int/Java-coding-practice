import java.util.*;
class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the size of the Array:");
        int n=sc.nextInt();
        int arr[] =new int [n];

        System.out.println("Enter array elements:");
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the target element:");
        int target=sc.nextInt();
        boolean found=false;
        
        for(int j=0;j<n;j++){
            if(arr[j]==target){
                found=true;
               
                System.out.println("Element found at position : " + (j+1));
            }
        }
        if (!found){
            System.out.print("Element not found");
            
        }   
    }   
}
