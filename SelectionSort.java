import java.util.Scanner;

public class SelectionSort {
    public void sort(int arr[]){
        int n= arr.length;
        for(int i=0;i<n;i++){
            int m_ind=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[m_ind]){
                    m_ind=j;
                    int temp = arr[m_ind];
                    arr[m_ind]=arr[i];
                    arr[i]=temp;
                }
            }
        }
    }
    public void display(int array[]){
        int n = array.length;
         for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SelectionSort ob = new SelectionSort();
        System.out.println("Enter the no of elements of your array:");
        int n = sc.nextInt();
        System.out.println("Enter the array elements:");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
           System.out.printf("Enter the %d element",i);
            arr[i]= sc.nextInt();
        }
        sc.close();
        ob.sort(arr);
        ob.display(arr);
    }
}
