import java.util.*;

class BinarySearch{
    public static void main(String[] args){
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

        int low=0;
        int high=arr.length-1;
        int index=-1;

        Arrays.sort(arr);
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                found=true;
                index=mid;
                break;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        if(found){
           
            System.out.println("Element found at position : "+ (index+1));
        }
        else{
            System.out.println("Element not found");
        }
    }
}