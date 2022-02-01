Automatic type casting can be performed for which of the following
conversions? ans= int to long

Subclass visibility exists with the following access modifiers:
Public and protected

public class Season
{
    static String name = "Spring";

    public void printSeason (String name)
        Season season new Season();
        String input = name;
        // this.name = "Summer";
        name = "Autumn";
                      
        System.out.print(input + "
        System.out.print(name + "
        System.out.print (Season.name + ", ");
        System.out.println(season.name);
    }
    
public static void main(String args[])
{
    Season mySeason = new Season ();
   mySeason.printSeason ("Winter");
}
}

What is it output :
Winter,aAutumn,Spring,Spring

Note QUestion int he moment Why access elemnt in a static way ?
the ans is a stastic varisble is commom to all objects so it only one var link to n number of object ( it a class variable ). SO it is not possible to change a static variabe for one object only.

What will the following code print?

public class CharacterQuiz {
   private static char theChar = 'a';
   public void aMethod (char theChar) {
       this.theChar = 'B';
   }
   public static void main(String args []) {
       CharacterQuiz theChar = new CharacterQuiz();
       theChar.aMethod ('3');
       System.out.println(theChar);
   }

Ans: It prints the object now. in java it possible to print objects as a whole rather than obj.soething but the reult is the class name / string representation of object. So


What is/are the effect of making a method static?
It can be called from the main() method in the same class without instantiating an object
The method cannot operate on any object variables

this two fact are not alway true 
The return value will always be the same
The method can only operate on static class variables

When you declare an array of objects using dynamic array allocation, what default value populates the array?
Ans is null
int is o 
float is 0.0 
char is Null chars
boll is false

Arrays.copyofRange(array,strt, finish) now note that finsih-1 so if 4 the it 3 so at index 3 it stops.



Which of the following snippets could be used for iterating over a char array called myArray?
for(int value: int[] values) // this means every value in values similar in pythons 



What is the output of System.out.printf("%.3f %s %03d\n", 3.33, "shoelace", 4);
.3 meam 3 decimal place so 3.330 
3d mean 3 significant figure so that 004


