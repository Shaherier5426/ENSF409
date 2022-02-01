package ensf_409.weeK_1.lecture_2.constructor_this;


/*@author MD Shaherier Khan <a
mdshaherier.khan@ucalgary.ca
@version 1.2
@since 1.0
*/

public class Creature {
   public static void main(String[] args){

    if(args.length==0){
        throw new IllegalArgumentException("You are required to enter an argument");
    }
    else{
       for (int i = 0; i < args.length;i++){
           System.out.print("this is " +args[i]);
           System.out.println();

       }
       System.out.println();
   }
}
}
