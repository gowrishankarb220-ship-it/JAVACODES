import java.util.*;
class library{
    String name;
    String author;
    String category;
    int price;
    int year;
    library(String name,String author,String category,int price,int year){
        this.name=name;
        this.author=author;
        this.category=category;
        this.price=price;
        this.year=year;


    }

void display(){
    System.out.println("name:"+name);
    System.out.println("author:"+author);
    System.out.println("category:"+category);
    System.out.println("price:"+price);
    System.out.println("year:"+year);
    System.out.println();
}
}

public class Main {
    public static void main(String[] args){
        library[]librarys=new library[3];
        library l1=new library("mahabharat","vedvyas","histoey",3500,400 );
        librarys[0]=l1;
        library l2=new library("ramayanam","valmiki","histoey",3500,400 );
        librarys[1]=l2;
        library l3=new library("kalki","kalki","histoey",3500,400 );
        librarys[2]=l3;
        for(int i=0;i<librarys.length;i++){
        librarys[i].display();
        }
        
    }
}
