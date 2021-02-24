using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AMC
{
    class Troops
    {
        int id;
        string name;
        string location;
        int numOfGroup;
        public Troops(int id, string name, string location, int numOfGroup)
        {
            this.id = id;
            this.name = name;
            this.location = location;
            this.numOfGroup = numOfGroup;
        }
        public Troops Add()
        {
            Console.WriteLine("Enter Troops ID:");
            id = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Enter troops name:");
            name = Console.ReadLine();

            Console.WriteLine("Enter troops location:");
            location = Console.ReadLine();

            Console.WriteLine("Enter num of Group:");
            numOfGroup = Convert.ToInt32(Console.ReadLine());

            return new Troops(id, name, location, numOfGroup);
        }
        public void Display()
        {
            Console.WriteLine("Troops id: " + id);
            Console.WriteLine("Troops name: " + name);
            Console.WriteLine("Troops location: " + location);
            Console.WriteLine("Troops group: " + numOfGroup);
        }
    }
}
