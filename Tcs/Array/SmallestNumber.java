import java.util.*;

/*
{2,5,1,3,0};
{8,10,5,7,9};
*/
class SmallestNumber{

    public static int[] input(){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n;i++){

            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }

    public static int smallest(int arr[]){
        // int first = arr[0];
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int array[] = input();
        
        int SmallNumber = smallest(array);
        System.out.println(SmallNumber);
    }
}