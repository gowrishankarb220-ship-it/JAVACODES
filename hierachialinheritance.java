class mydaddy{
    void display(){
        System.out.println("my grandpa is former");

    }
}
class mysister extends mydaddy{
    void show(){
    System.out.println("my sister is a doctor");
    }
}
class me extends mydaddy{
void display1(){
    System.out.println("i am a student");
    }
}
public class Main {
    public static void main (String[]args){
        me obj=new me();
        obj.display();
        mysister sis=new mysister();
        sis.show();
        obj.display1();
    }
}
