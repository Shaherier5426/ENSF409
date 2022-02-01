package ensf_409.weeK_1.lecture_2.constructor_this;


// how to make and use constructor,

// public class Creature3 {
//    public static void main(String[] args){
//        Animal obj1 = new Animal("Tiger");
//        System.out.println("The animal is "+ obj1.getAnimalName());
//    } 
// }


// class Animal{
// private String animalType;
// public Animal(String animal){animalType =animal;}

// public String getAnimalName(){return animalType;}
// }

// how to have multiple variable constructor/setter
// public class Creature3{
// public static void main(String[] args){
//     Animal obj2 = new Animal("lion","alpha");
//     obj2.setAnimalType("Monkey");// over writing 
//     System.out.println("THE animal is a "+ obj2.getAnimalType() + " is also a " + obj2.getKingdomType());

// }
// }

// class Animal{
//     private String animalType;
//     private String kingdomType;
//     public Animal(String animal , String kingdom){
//         animalType = animal;
//         kingdomType = kingdom;
//     }
//     public void  setAnimalType(String animal){animalType = animal;}

//     public String getAnimalType(){return animalType;}
//     public String getKingdomType(){return kingdomType;}
// }
// overloading and this 
public class Creature3{
public static void main(String[] args){
    Animal obj2 = new Animal();
    obj2.setAnimalTypeKingdom("Monkey","Mamal");// over writing 
    System.out.println("THE animal is a "+ obj2.getAnimalType() + " is also a " + obj2.getKingdomType());
}
}








class Animal{
    private String animalType;
    private String kingdomType;
    // A methord that used it own class methord must use the this.(self)
    public void setAnimalTypeKingdom(String animal , String kingdom){
        this.setAnimalType(animal); 
        this.setKingdomType(kingdom); // self.name we can apply that to a function
    }

    // constructor that are overloaded dependign on sitation.
    public Animal(String animal){animalType = animal;}
    public Animal(){
        this("mouse"); //<=> Animal(mouse)
    }



    public void  setAnimalType(String animal){animalType = animal;}
    public void  setKingdomType(String kingdom){kingdomType = kingdom;}



    public String getAnimalType(){return animalType;}
    public String getKingdomType(){return kingdomType;}
}