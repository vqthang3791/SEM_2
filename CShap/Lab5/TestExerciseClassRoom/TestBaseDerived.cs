using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Test
{
    class Program
    {
        class BaseClass
        {
            public virtual void a1()
            {
                Console.WriteLine("Base - a1");
            }

            public virtual void a2()
            {
                Console.WriteLine("Base - a2");
            }
        }

        class DerivedClass : BaseClass
        {
            public override void a1()
            {
                Console.WriteLine("Derived - a1");
            }

            public new void a2()
            {
                Console.WriteLine("Derived - a2");
                Console.ReadKey();
            }
        }
        static void Main(string[] args)
        {
            BaseClass a = new BaseClass();
            DerivedClass b = new DerivedClass();
            BaseClass c = new DerivedClass(); 
            a.a1();
            a.a2(); 
            b.a1();
            b.a2();
            c.a1();
            c.a2(); 
        }
    }
}
