

class fibonacci
{
   
   /** 
    * @param n
    * @return int
      F = Array to store numbers
      Forloop to add 0 & 1 by i-2,i-1
    */
   static int fib(int n)
    {
    /* Array For Fibonacci Numbers */
    int f[] = new int[n+2]; // 1 extra to handle case, n = 0
    int i;
      
    /* 0th and 1st number*/
    f[0] = 0;
    f[1] = 1;
     
    for (i = 2; i <= n; i++)
    {
       /* Add 0 & 1 to the series */
        f[i] = f[i-1] + f[i-2];
    }
      
    return f[n];
    }
      
      /** 
       * @param args[]
       * n= Fib number position
       * passing n=10 to get the 10th number 
       * Main Merthod calling Fib method and passing fibonacci number as 10
       */
    public static void main (String args[])
    {
        int n = 10;
        System.out.println("The 10th term of the Fibonacci sequence is");
        System.out.println(fib(n));
    }
}