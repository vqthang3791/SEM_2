using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodeSnippet4ss3
{
    class Addition
    {
        static void Main(string[] args)
        {
            byte numOne = 255;
            byte numTwo = 1;
            byte result = 0;
            try
            {
                //This code throws an overflow exception
                checked
                {
                    result = (byte)(numOne + numTwo);
                }
                Console.WriteLine("Result: " +result);
            }
            catch (OverflowException ex)
            {
                Console.WriteLine(ex);
            }
        }
    }
}
