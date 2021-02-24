using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodeSnippet27
{
    class Program
    {
        static void Main(string[] args)
        {
            int length = 10;
            int breadth = 20;
            int area;
            area = length * breadth;
            object boxed = area;
            int num = (int)boxed;
            Console.WriteLine("Area of the rectangle = { 0}", num);
        }
    }
}
