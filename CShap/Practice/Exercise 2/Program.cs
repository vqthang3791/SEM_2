using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercise_2
{
    class Program
    {
        static void Main(string[] args)
        {
            Lion lionTest = new Lion(45.7, "Simba");
            Tiger tigerTest = new Tiger(30, "Shere Khan");

            lionTest.show();
            Console.WriteLine("--------------------------------");
            tigerTest.show();
        }
    }
}
