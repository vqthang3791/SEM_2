using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Practice
{
    class Program
    {
        static void Main(string[] args)
        {
            Cylinder cylinderTest = new Cylinder();
            Console.WriteLine("Enter the dimensions of the cylinder");
            Console.Write("Radius: ");
            cylinderTest.Radius = Convert.ToDouble(Console.ReadLine());
            Console.Write("Height: ");
            cylinderTest.Height = Convert.ToDouble(Console.ReadLine());

            cylinderTest.Process();
            cylinderTest.Result();

            Console.ReadKey();
        }
    }
}
