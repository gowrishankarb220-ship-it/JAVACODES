class mark {
    public static void main(String[] args) {
        String[] name={"aravind","arun","anbu"};
        int[][]mark={
             {80,70,60,90},
             {80,70,75,79},
             {89,67,98,90}};
        System.out.println("Name\tTamil\tEnglish\tMaths\tsocial\tAverage");
        for(int i=0;i<name.length;i++)
        {
            System.out.print(name[i]+"\t");
            double total=0;
            for(int j=0;j<mark[i].length;j++)
            {
                System.out.print(mark[i][j]+"\t \t");
                total+=mark[i][j];
                
            }
        
            System.out.print((total/4));
            System.out.println();
        }
        
}
}
