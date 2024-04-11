public class Loop {
    
    public static void main (String args[])
    {
        aa:
        for(int i=0;i<5;i++)
        {
            bb:for(int j=0;j<6;j++)
            {
                System.out.print(i+" "+j);
                if(i==2&&j==2)
                {
                    break bb;
                }


            }
            System.out.println();
        }
    }
}
