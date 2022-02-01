package ensf_409.week_3.String;



import java.util.regex.*;
import java.util.Arrays;
public class Regrex {
    public static void main(String[] args){
        Pattern myPattern = Pattern.compile("Horse",Pattern.CASE_INSENSITIVE); // what I am looking for 
        Matcher myMatcher = myPattern.matcher("Horse are mammals. Seahorse are not."); // which senctence am I compareing it with 
        // to add the count options 
        int counter = 0;
        while( myMatcher.find()){// what are typing to do find,count matches,modify matches
         counter++;
        }// what are typing to do find,count matches,modify matches
        
        System.out.println(counter);



        // splitting string 
        String literal = "Horse are mammals. Seahorse are not mammal.";
        String[] words = literal.split(" are mammals.", -1);
        // for(int i=0;i<words.length;i++){
        //     System.out.println(words[i]);
        // } for . as divident we need to use \\.
        //imagine spilt as a cut on  string when it see a delimiter.
        System.out.println(Arrays.toString(words));
   
    
    
    
    }

public static String removeTrailingWhiteSpace(String myLine){
myLine = myLine.replaceAll("^\\s+$","");
return myLine;}




public static void formattedOutput(){
    System.out.printf("My cat is %d years old", 12);
    String dog = String.format("my string is %s", "aweosme");
    System.out.println(dog);
    
    }
//
}

       






