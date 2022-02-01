package ensf_409.weeK_1.lecture_2;

public class Exe{
public static void main(String[] args){
Animal obj1 = new Animal("red");
System.out.println(obj1.getLegs());

}
}




class Animal{
private int legs =4;
private String color;


public Animal(String col,int Num_legs){
this.setColor(color);
this.setLegs(Num_legs);
}
public Animal(String col){color = col;}


public int getLegs(){return legs;}

public void setLegs(int Num_legs){  legs = Num_legs;}

public void setColor(String color){ this.color = color;}
}