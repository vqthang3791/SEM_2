using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodeSnippet6._6
{
    class Calculate
    {
        public static void Addition(int val1, int val2)
        {
            Console.WriteLine(val1 + val2);
        }
        public void Multiply(int val1, int val2)
        {
            Console.WriteLine(val1 * val2);
        }
    }
    class StaticMethods
    {
        static void Main(string[] args)
        {
            Calculate.Addition(10, 50);
            Calculate objCal = new Calculate();
            objCal.Multiply(10, 20);
        }
    }
}
