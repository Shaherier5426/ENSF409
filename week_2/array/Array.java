package ensf_409.week_2.array;

import java.util.Arrays;
public class Array{
/* 
Array is not an object but the have some common similarities
one data type like 1 element is int the other one is a car
we can enfore it using generics 
array are assign to default values if array is left empty.
Default values
 int: 0
  boolean: false
  double/float: 0.0
  char: \u0000 (null character)
  objects: null

One Dimensional Arrays
how to make an array
*/
// Create an array of integers containing the values shown
public static void main(String[] args){
// Create an array of integers containing the values shown
int[] implicitLengthArray = {1, 2, 3, 5};
// Iterate through the array and output the value.
for (int tmpValue : implicitLengthArray) {
  System.out.println(tmpValue);
}
// Create an array of integers with a length of three
int[] explicitLengthArray = new int[3];
// Iterate through the array: show original values; set new ones
for (int i = 0; i< explicitLengthArray.length;i++) {
  System.out.println(explicitLengthArray[i]);
  explicitLengthArray[i] = 10*i;
  System.out.println(explicitLengthArray[i]);

}
// Change the array  pointer
// Original reference now points to a new array
explicitLengthArray = new int[2];




// Copy an array (by reference)
int[] copyArray = explicitLengthArray;
copyArray[0] =80000;
System.out.println(explicitLengthArray[0]);
// here the change are seen the orginal array too.

                
}
}


