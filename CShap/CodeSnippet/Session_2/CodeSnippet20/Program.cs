using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodeSnippet20
{
    class Program
    {
        static void Main(string[] args)
        {
            DateTime dt = DateTime.Now;
            // Returns short date and short time with seconds
            Console.WriteLine("Short date and short time with seconds(G):{ 0:G}", dt);
            // Returns month and day - M can also be used
            Console.WriteLine("Month and day(m):{ 0:m}", dt);
            // Returns short time
            Console.WriteLine("Short time(t):{ 0:t}", dt);
            // Returns short time with seconds
            Console.WriteLine("Short time with seconds(T):{ 0:T}", dt);
            // Returns year and month - Y also can be used
            Console.WriteLine("Year and Month(y):{ 0:y}", dt);
        }
    }
}
