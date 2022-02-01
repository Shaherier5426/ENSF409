package ensf_409.week_2.array;


import java.util.Arrays;
public class Array_p {
    public static void main(String[] args) {
    // how to declare an array 
    int[] array;
    int[] array1 = {1,2,3,4,5,6,7,8,9};
    int[] array2 = new int[4];


    // to change pointer to a new array type
    array2 = new int[5];


    // how to copy an array to a new array

    // bad copy (refence copy)
    // array2 = array1;
    // array2[0]= 60;
    // displayAll(array1);
    // System.out.println();
    // displayAll(array2);



    // good copy 1
    // array2 = Arrays.copyOf(array1,array1.length);
    // array2[0] = 60;
    // displayAll(array2);

    // displayAll(array1); // note no change

    // good copy 2
    array2 = Arrays.copyOfRange(array1,0,5);// 0 to 4
    array2[3] = 60;
    displayAll(array2);
    displayAll(array1);





}

    
public static void displayAll(int[] array){
    for(int i=0; i<array.length; i++){
        System.out.println(array[i]);
    
    }
 System.out.println();
}
}
