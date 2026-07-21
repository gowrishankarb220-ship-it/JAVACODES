class mark {
    public static void main(String[] args) {
        String[] name={"aravind","arun","anbu"};
        int[][]mark={{80,70,60,90},{80,70,75,79},{89,67,98,90}};
        for(int i=0;i<name.length;i++)
        {
            System.out.println("name = "+name[i]);
            double total=0;
            for(int j=0;j<mark[i].length;j++)
            {
                System.out.print(mark[i][j]+" ");
                total+=mark[i][j];
                
            }
            System.out.println();
            System.out.println("Average;"+(total/4)+"%");
            System.out.println();
        }
        
}
}
