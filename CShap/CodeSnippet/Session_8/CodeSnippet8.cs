using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodeSnippetss8
{
    interface IAnimal
    {
        void Drink();
    }
    interface ICarnivorous
    {
        void Eat();
    }
    interface IReptile : IAnimal, ICarnivorous
    {
        void Habitat();
    }
    class Crocodile : IReptile
    {
        public void Drink()
        {
            Console.WriteLine("Drinks fresh water");
        }
        public void Habitat()
        {
            Console.WriteLine("Can stay in Water and Land");
        }
        public void Eat()
        {
            Console.WriteLine("Eats Flesh");
        }
        static void Main(string[] args)
        {
            Crocodile objCrocodile = new Crocodile();
            Console.WriteLine(objCrocodile.GetType().Name);
            objCrocodile.Habitat();
            objCrocodile.Eat();
            objCrocodile.Drink();
        }
    }
}
