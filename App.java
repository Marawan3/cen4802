class fibonacci
{
   static int fib(int n)
    {
    /* Array For Fibonacci Numbers */
    int f[] = new int[n+2]; // 1 extra to handle case, n = 0
    int i;
      
    /* 0th and 1st number of the series are 0 and 1*/
    f[0] = 0;
    f[1] = 1;
     
    for (i = 2; i <= n; i++)
    {
       /* Add the previous 2 numbers in the series
         and store it */
        f[i] = f[i-1] + f[i-2];
    }
      
    return f[n];
    }
      /*Main Merthod calling Fib method and passing fibonacci number as 10*/
    public static void main (String args[])
    {
        int n = 10;
        System.out.println("The 10th term of the Fibonacci sequence is");
        System.out.println(fib(n));
    }
}