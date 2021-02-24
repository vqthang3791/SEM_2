using System;
class Factorial
{
    static void Main(string[] args)
    {
        int fact = 1;
        int num, i;
        Console.WriteLine("Enter the number whose factorial you wish to calculate");
        num = Convert.ToInt32(Console.ReadLine());
        for (i = 1; i <= num; fact *= i++) ;
        Console.WriteLine("Factorial: " +fact);
    }
}