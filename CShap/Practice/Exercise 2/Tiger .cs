using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercise_2
{
    class Tiger : Animals
    {
        public Tiger(double weight, string name)
        {
            base.setMe(weight, name);
        }
        public override void show()
        {
            Console.WriteLine("I am a Tiger ^_^");
            Console.WriteLine("My name is: " + Name);
            Console.WriteLine("My weight is: " + Weight);
        }
    }
}
