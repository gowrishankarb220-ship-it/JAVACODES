class Main {
    public static void main(String[] args) {
     int vow=0;
     int cons=0;
     String str="apple";
     for(int i=0;i<str.length();i++){
         char ch=str.charAt(i);
         if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
         {
             vow=vow+1;
         }
         else{
             cons=cons+1;
         }
     }
     System.out.println("vowles = "+vow);
     System.out.println("consonent = "+cons);
         }
         }
