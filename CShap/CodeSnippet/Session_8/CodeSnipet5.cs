using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodeSnippetss8
{
    interface IAnimal
    {
        void Habitat();
    }
    class Dog : IAnimal
    {
        public void Habitat()
        {
            Console.WriteLine("Can be housed with human beings");
        }
        static void Main(string[] args)
        {
            Dog objDog = new Dog();
            Console.WriteLine(objDog.GetType().Name);
            objDog.Habitat();
        }
    }
}
