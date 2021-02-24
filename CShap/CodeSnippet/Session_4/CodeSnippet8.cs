using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodeSnippet8
{
    class Program
    {
        static void Main(string[] args)
        {
            int num = 1;
            Console.WriteLine("Event Number");
            while(num <= 11)
            {
                if((num % 2) == 0)
                {
                    Console.WriteLine(num);
                }
                num = num + 1;
            }
        }
    }
}
