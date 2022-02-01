/*@author MD Shaherier Khan <a
mdshaherier.khan@ucalgary.ca
@version 1.3
@since 1.0
*/
package ensf_409.week_2;
import java.util.Arrays;
public class SimpleArray{

String[] array = new String[4];

public SimpleArray(String content){
Arrays.fill(array,content);
}
public SimpleArray(){
    this("Hello,world");
}
public String arrayConcat(int index){

if (index > 3) {throw new IllegalArgumentException("index error");}
String y="";
for(int i  = index ; i < array.length ; i++){
y = array[i]+"#"+y;
} 
return y;
}

public String arrayConcat(){
return arrayConcat(0);
}
public String  arrayCrop(int start, int last){
if(last<start){
int temp = last;
last = start;
start = temp;
String y="";
for(int i  = start ; i < last ; i++){
y = array[i]+"#"+y;
} 
return y;
}
else if(start>3 || last>3){
return "Fail";

}
else if(start == last){
    return "Match";
}
else{
    String y="";
for(int i  = start ; i < last ; i++){
y = array[i]+"#"+y;
} 
return y;
}

}
}