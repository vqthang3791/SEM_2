using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Company2
{
    /// <summary>
    /// Class ProductTest is used to test the Product class
    /// </summary>
    class ProductTest
    {
        /// <summary>
        /// The entry point for the application.
        /// </summary>
        /// <param name="args">A list of command line arguments</param>
        static void Main(string[] args)
        {
            // Instantisting the Prodcut class
            Product objProduct = new Product();

            Console.Write("Enter the Customer Name: ");
            string name = Console.ReadLine();
            Console.Write("Enter the invoice number: ");
            int value = Convert.ToInt32(Console.ReadLine());

            // Invokes the SetDetails method of Invoice class
            objProduct.SetDetails(value, name);

            // Invokes the overridden SetDetails method of Product class
            objProduct.SetDetails();

            // Invokes the display method of Product class
            objProduct.Display();
        }
    }
}
