import java.util.Arrays;
public class reverse {
 public void rev(int [] arr) {
  for(int i = 0; i <arr.length/2; i++)
  {
   int temp=arr[i];
   arr[i]=arr[arr.length-i-1];
   arr[arr.length-i-1]=temp;
  }
  System.out.println("Reverse array : "+ Arrays.toString(arr));
 }
 public static void main(String args[]) {
  int[] arr = {23, 92, 56, 39, 93};
  reverse m = new reverse();
  m.rev(arr);
 }
}
