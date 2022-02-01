public class Ex5_part1 {
static int num;
public static void main(String[] args) {
String animalFact1 =  "Horses are mammals." ;
System.out.println(animalFact1.length());

String animalFact2 =  new String("Elephants are mammals. ");

System.out.println(animalFact2.length());

String animalFact3 = new String (animalFact1);

calculate(animalFact1);
calculate(animalFact2);
}

public static int calculate(String obj){
num += obj.length();
System.out.println(num);
return num;
}

}

