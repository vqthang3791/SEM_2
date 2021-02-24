using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodeSnippet21
{
    class Program
    {
        static void Main(string[] args)
        {
            int i = 0;
        display:
            Console.WriteLine("Hello World");
            i++;
            if (i < 5)
            {
                goto display;
            }
        }
    }
}
