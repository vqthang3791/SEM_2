using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Company2
{
    /// <summary>
    /// Class Product inherits the Invoice class and stores and displays product information.
    /// </summary>
    class Product : Invoice
    {
        /// <summary>
        /// String field to store the product name.
        /// </summary>
        private string productName;

        /// <summary>
        /// Integer field to store the quantity sold.
        /// </summary>
        private int quantity;

        /// <summary>
        /// double field to store the price of the prodcut.
        /// </summary>
        private double price;

        /// <summary>
        /// Double field to store the total value of products sold.
        /// </summary>
        private double totalValue;

        /// <summary>
        /// Method to set the details of product.
        /// this method overrides the base class method of the same name which does not take any parametera
        /// </summary>
        public override void SetDetails()
        {
            base.SetDetails();
            Console.Write("Enter the product name: ");
            productName = Console.ReadLine();
        Sale:
            Console.Write("Enter the quantity soid: ");
            quantity = Convert.ToInt32(Console.ReadLine());
            // Validating the quantity of the product
            if (quantity < 0)
            {
                Console.WriteLine("Quantity cannot be negative");
                goto Sale;
            }
        Price:
            Console.Write("Enter the price per unit: ");
            price = Convert.ToDouble(Console.ReadLine());

            // Validating the price of the product
            if (price < 0)
            {
                Console.WriteLine("Price cannot be negative");
                goto Price;
            } totalValue = quantity * price;
        }
        /// <summary>
        /// Method to display the product details
        /// This method overrides the base class method
        /// </summary>
        public override void Display()
        {
            base.Display();
            Console.WriteLine("\nPRODUCT DETAILS");
            Console.WriteLine("\nProduct:\t" + productName);
            Console.WriteLine("Quantity Sold:\t" + quantity);
            Console.WriteLine("Price Per Unit:\t" + price);
            Console.WriteLine("Total Amount:\t" + totalValue);
        }
    }
}
