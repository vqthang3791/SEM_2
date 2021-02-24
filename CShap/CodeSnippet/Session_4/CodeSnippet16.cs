using System;
class Summation
{
    static void Main(string[] args)
    {
        char c;
        int numOne;
        int numTwo;
        int result;
        for (; ; )
        {
            Console.WriteLine("Enter number one");
            numOne = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter number two");
            numTwo = Convert.ToInt32(Console.ReadLine());
            result = numOne + numTwo;
            Console.WriteLine("Result of Addition: " +result);
            Console.WriteLine("Do you wish to continue [Y / N]");
        c = Convert.ToChar(Console.ReadLine());
        if (c == 'Y' || c == 'y')
        {
            continue;
        }
        else
        {
            break;
        }
    }
}