using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodeSnippet5ss3
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
                unchecked
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
