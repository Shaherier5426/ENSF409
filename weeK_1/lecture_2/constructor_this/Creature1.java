package ensf_409.weeK_1.lecture_2.constructor_this;


// How to make incapsolate, why not to use nested class, How to make a class instance, how to deal with static var.


public class Creature1{
    public static void main(String[] args){
        Animal mouse = new Animal();
        mouse.setAnimalType("mouse");
        
        Animal cat = new Animal();
        cat.setAnimalType("cat");
    
        System.out.println("This creature is a "+ mouse.getAnimalType());
        System.out.println("This creature is a "+ cat.getAnimalType());
        System.out.println("This creature is a "+ Animal.getKingdom());
        System.out.println(Animal.kingdom);
        printer(Animal.getKingdom());

        // This show we dont need to make a instance or object of Animal as we are using static. 
    }




    public static void  printer(String any){
        char[] any1 = any.toCharArray();
        for(char c: any1){
            System.out.println(c);
        }
    
}
}

class Animal{
private static  String animalType;

static String kingdom = "animali";

public void setAnimalType(String animal_arg){animalType = animal_arg;}

public String getAnimalType(){
    return animalType;
}

public static String getKingdom(){return kingdom;}
// The function must be static as it calling a the variable which  is static








}

