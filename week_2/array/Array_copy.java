package ensf_409.week_2.array;
import java.util.Arrays;
public class Array_copy {
  public static void main(String[] args) {
    // copyOf()
    int[] explicitLengthArray = new int[4];
    int[] valueCopyArray = Arrays.copyOf(explicitLengthArray, 2);
    valueCopyArray[1] = 93; // value of new array change
    // The value has been changed for the copy
    for (int tmpvalue: valueCopyArray) {
      System.out.println(tmpvalue);
      // The original array retains the original value
      System.out.println(explicitLengthArray[1]); // value of the array orginal array stays the same. 
      char[] originalCharArray = {
        'a',
        'B',
        'c',
        'D',
        '5'
      };
      // copyOfRange()
      char[] subsetCharArray = Arrays.copyOfRange(originalCharArray, 1, 4);
      // does selective copy .copyOfRange(array,1,5) but note that if copy 1 to 3

      Arrays.fill(subsetCharArray, 'z'); // fill the array with z
      // From orginalchararray, starting at index 1, copy to subsetcharArray
      // starting at index 0. copy 2 elements.
      System.arraycopy(originalCharArray, 1, subsetCharArray, 0, 2);// from system 
      for (char tmpcvalue: subsetCharArray) {
        System.out.println(tmpcvalue);
      }

    }
  }
}