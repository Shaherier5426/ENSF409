
//https://d2l.ucalgary.ca/d2l/le/content/425075/viewContent/5135059/View
import java.util.Arrays;
public class Mutidimensional_array {
    public static void main(String[] args){
        // how to assign a mutidimensional array
        int array2Dimensional[][] = {{1,2},{3,4}};// the [][] must be empty.
        int intArray[][] = { {5, 9, 0},{0, 3, 2}, {600, 33, 40}};
           
        int[] array2Dimensional1[];
        array2Dimensional1 = new int [2][3];


        // fill the array
        array2Dimensional1[0] = new int [3];
        Arrays.fill(array2Dimensional1[0],1);
        System.out.println(array2Dimensional1[0][2]);
    }
}
