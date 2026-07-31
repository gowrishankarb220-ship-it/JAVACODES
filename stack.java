import java.util.*;
public class stack {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int size, choice, value;
        System.out.println("enter stack size");
        size=sc.nextInt();
        int[]stack=new int[size];
        int top=-1;
        do{
             System.out.println("\n1.push");
             System.out.println("2.pop");
             System.out.println("3.peak");
             System.out.println("4.display");
             System.out.println("5.exit");
             System.out.print("enter choice");
             choice = sc.nextInt();
             switch(choice){
                 case 1:
                 if(top==size-1){
                     System.out.println("stack overflow");
                 }else{
                     System.out.print("enter value");
                     value = sc.nextInt();
                     top++;
                     stack[top]=value;
                     System.out.println(value+"inserted");
                 }
                 break;
                 case 2:
                 if(top==-1){
                System.out.println("stack underflow");
                 }else{
                System.out.println(stack[top]+"removed");
                top--;
                 }
                 break;
                 case 3:
                 if (top==-1){
                     System.out.println("stack is empty");
                 }else{
                     System.out.println("top element= "+stack [top]);
                 }
                 break;
                 case 4:
                 if (top== -1){
                     System.out.println("stack is empty");
                 }else{
                     System.out.println("stack elininate");
                     for(int i = top; i >=0;i--){
                 }
                 }
                 break;
                case 5:
                System.out.println("program ended");
                default:
                System.out.println("invalid choice");
                }
                 }
                 while(choice != 5);
                 sc.close();
             }
            
        }
    
