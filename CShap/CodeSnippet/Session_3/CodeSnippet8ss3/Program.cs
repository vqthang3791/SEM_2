using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodeSnippet8ss3
{
    class Program
    {
        static void Main(string[] args)
        {
            int leftVal = 50;
            int rightVal = 100;
            Console.WriteLine("Equal: " +(leftVal == rightVal));
            Console.WriteLine("Not Equal: " +(leftVal != rightVal));
            Console.WriteLine("Greater: " +(leftVal > rightVal));
            Console.WriteLine("Lesser: " +(leftVal < rightVal));
            Console.WriteLine("Greater or Equal: " +(leftVal >= rightVal));
            Console.WriteLine("Lesser or Equal: " +(leftVal <= rightVal));
        }
    }
}
