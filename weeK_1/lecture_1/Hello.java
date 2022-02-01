
package ensf_409.weeK_1.lecture_1;
import java.util.*;
public class Hello{
    public static void main(String[]args){
        int var = 409;
        double dvar = var;
        float fvar = (float)dvar;
        char cvar = (char)var;


        System.out.println("Hello World "+var+" "+dvar+" "+fvar+" "+cvar);
   
String[] h = {"hello","hi","ohhh"};
String y = "happy";
for(int i=0;i<h.length;i++){
 y = h[i]+y;
System.out.println(y);
} 
}
}


/* type casting SS
widening is automatic as it goes from smaller type to larger type

narrowing is explicit as it goe from small type to larger one 

*/