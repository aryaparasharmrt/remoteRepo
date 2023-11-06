// Class is used to get input from user
import java.util.Scanner;

public static void main(Strings args[]) {

  Scanner sc = new Scanner(System.in);
  int val1 = sc.nextInt();
  int val2 = sc.nextInt();

  int result = val1 + val2;
  System.out.print(result);
}

// Merge Sort
public static int[] mergeSor(int[] arr, int firstIndx, int LastIndx) {
    if(firstIndx == LastIndx) {
        int [] res = new int[1];
        res[0] = arr[firstIndx];
      return res;
    }
  int mid = (firstIndx + LastIndx)/2;
  int[] ls = mergeSort(arr, firstIbdx, mid);
  int[] rs = mergeSort(arr, mid+1, LastIndx);
  int[] ans = mergeTwoSortedArrays(ls, rs);
}

public static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {

  int p1 = 0, p2 = 0, p3 = 0;

  int[] arr3 = new int[arr1.length + arr2.length];

  while(p1 < arr1.length && p2 < arr2.length) {
      if(arr1[p1] <= arr2[p2]) {
          arr3[p3] = arr1[p1];
      }else{
        arr3[p3] = arr1[p2];
        p2++;
        p3++;
  }
}

  while(p1 < arr1.length) {
    arr3[p3] = arr1[p1];
    p3++;
    p1++;
  }

  while(p2 < arr2.length) {
    arr3[p3] = arr2[p2];
    p3++;
    p2++;
  }

  return arr3;
}
