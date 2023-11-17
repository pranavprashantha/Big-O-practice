import java.util.*;
class Main {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    printPairs(arr);
    reverse(arr);
  }
  public static void sumProduct(int[] n) {
    int sum = 0;
    int prod = 1;
    for(int a: n) {
      sum+=a;
      prod*= a;
    }
    System.out.println("Sum is " + sum + ". Product is " + prod + ".");
  }
  
  public static void printPairs(int[] n) {
    for(int i = 0; i < n.length; i++) {
      for(int j = 0; j < n.length; j++) {
        System.out.print("" + n[i] + n[j] + " ");
      }
      System.out.println();
    }
  }
  
  public static void reverse(int[] n) {
    for(int i = 0; i < n.length / 2; i++) {
      int temp = n[i];
      n[i] = n[n.length - i - 1];
      n[n.length - i - 1] = temp;
    }
    System.out.println(Arrays.toString(n));
  }
}