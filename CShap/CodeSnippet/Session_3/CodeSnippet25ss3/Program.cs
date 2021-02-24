using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodeSnippet25ss3
{
    class Program
    {
        static void Main(string[] args)
        {
            int radius = 10;
            double area;
            area = 3.14 * radius * radius;
            object boxed = area;
            Console.WriteLine("Area of the circle = { 0}",boxed);
        }
    }
}
