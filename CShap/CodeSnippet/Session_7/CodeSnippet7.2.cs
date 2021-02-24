using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodeSnippet7._2
{
    class Animal
    {
        public void Eat()
        {
            Console.WriteLine("Every animal eats something.");
        }
        public void DoSomething()
        {
            Console.WriteLine("Every animal does something.");
        }
    }
    class Cat : Animal
    {
        static void Main(String[] args)
        {
            Cat objCat = new Cat();
            objCat.Eat();
            objCat.DoSomething();
        }
    }
}
