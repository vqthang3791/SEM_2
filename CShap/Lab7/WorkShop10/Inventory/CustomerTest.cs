using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Inventory
{
    class CustomerTest
    {
        static void Main(string[] args)
        {
            try
            {
                Customer objCustomer = new Customer();
                if (objCustomer.AcceptDetails())
                    objCustomer.DisplayDetails();
            }
            catch (Exception objEx)
            {
                Console.WriteLine("Error: (0)", objEx.Message);
            }
        }
    }
}
