public class Pattern {
    public static void main (String args[])
    {
        int a[]={1,2,3,4,5,6};
        for(int i:a)
        {
            System.out.println(i);
        }
        for(int i=0;i<5;i++)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
