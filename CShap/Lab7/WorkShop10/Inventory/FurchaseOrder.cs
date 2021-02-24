using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Inventory
{
    /// <summary>
    /// 
    /// The program demonstrates the use of try-catch blocks to handle exceptions.
    /// 
    /// Class PurchaseOrder accepts and displays purchase order details
    /// using try-catch blocks.
    /// </summary>
    class FurchaseOrder
    {
        /// <summary>
        /// Byte field to store order ID.
        /// </summary>
        private byte orderID;

        /// <summary>
        /// DateTime field to store order date.
        /// </summary>
        private DateTime orderDate;

        /// <summary>
        /// String field to store customer name.
        /// </summary>
        private string customerName;

        /// <summary>
        /// Byte field to store total quantity of products
        /// </summary>
        private byte totalQuantity;

        /// <summary>
        /// Float field to store total amount of products.
        /// </summary>
        private float totalAmount;

        /// <summary>
        /// Array of byte type to store the product ID
        /// </summary>
        private byte[] productID;

        /// <summary>
        /// Array of string to store the product name.
        /// </summary>
        private string[] productName;

        /// <summary>
        /// Array of byte type to store the product quantity.
        /// </summary>
        private byte[] quantity;

        /// <summary>
        /// Array of float type to store the product price.
        /// </summary>
        private float[] price;

        /// <summary>
        /// Array of float type to store the cost of product amount.
        /// </summary>
        private float[] amount;

        /// <summary>
        /// Method to accept purchase order details.
        /// </summary>
        /// <returns>Returns true or false</returns>
        public bool AcceptOrdereDetails()
        {
            // Accepting and validating the order details using a try-catch block
            try 
            {
                Console.WriteLine("Enter Furchase order Details!");
            orderID:
                Console.Write("Order ID: ");
                orderID = Convert.ToByte(Console.ReadLine());
                if (orderID <= 0)
                {
                    Console.WriteLine("Order ID must be greater than zero");
                    goto orderID;
                }
            orderDate:
                Console.Write("Order date [DD/MM/YYYY]: ");
                orderDate = Convert.ToDateTime(Console.ReadLine());
                if (orderDate > DateTime.Today)
                {
                    Console.WriteLine("Order date cannot not be greater than today's date");
                    goto orderDate;
                }
            customerName:
                Console.Write("Customer Name: ");
                customerName = Console.ReadLine();
                if (customerName == "")
                {
                    Console.WriteLine("Invalid customer name!\n");
                    goto customerName;
                }
            }
            // Catching an exception if the user enters any invalid order details
            catch (Exception objEx)
            {
                Console.WriteLine("Error : (0)", objEx.Message);
                return false;
            }
            return true;
        }

        /// <summary>
        /// Method to accept product details.
        /// </summary>
        /// <returns>Returns true or false</returns>
        public bool AcceptProductDetails()
        {
            // Accepting and validating the product details using a try-catch block
            byte noOfProducts;
            try
            {
            noOfProducts:
                Console.WriteLine("Enter number of product in purchase order: ");
                noOfProducts = Convert.ToByte(Console.ReadLine());
                if (noOfProducts <= 0)
                {
                    Console.WriteLine("Number of product ordered must be greater than zero");
                    goto noOfProducts;
                }

                productID = new byte(noOfProducts);
                productName = new string(noOfProducts);
                quantity = new float(noOfProducts);
                price = new float(noOfProducts);
                amount = new float(noOfProducts);

                for (int i = 0; i < noOfProducts; i++)
                {
                    productID:
                    try
                    {
                        Console.WriteLine("\nEnter Product Details: ");
                        Console.Write("Product ID: ");
                        productID[i] = Convert.ToByte(Console.ReadLine());
                        if (productID[i] <= 0)
                        {
                            Console.WriteLine("Product ID must be greater than zero");
                            goto productID;
                        }
                    }
                    catch (FormatException objEx)
                    {
                        Console.WriteLine("Error: (0)\n", objEx.Message);
                        goto productID;
                    }
                productName:
                    Console.Write("Product Name: ");
                    productName[i] = Console.ReadLine();
                    if (productName[i] == "")
                    {
                        Console.WriteLine("Invalid product name!");
                        goto productName;
                    }
                    try
                    {
                        quantity: 
                        try
                        {
                            Console.Write("Quantity: ");
                            quantity[i] = Convert.ToByte(Console.ReadLine());
                            if (quantity[i] <= 0)
                            {
                                Console.WriteLine("Quantity of product must be greater than zero");
                                goto quantity;
                            }
                        }
                        catch (FormatException objEx)
                        {
                            Console.WriteLine("Error: (0)\n", objEx.Message);
                            goto quantity;
                        }
                        price:
                        try
                        {
                            Console.Write("Price: ");
                            price[i] = Convert.ToSingle(Console.ReadLine());
                            if (price[i] <= 0)
                            {
                                Console.WriteLine("Price of product must be greater than zero");
                                goto price;
                            }
                            amount[i] = quantity[i] * price[i];
                        }
                        catch (FormatException objEx)
                        {
                            Console.WriteLine("Error : (0)\n", objEx.Message);
                            goto price;
                        }
                    }
                    // Catching an exception if the user enters any value greater than the capacity of float type
                    catch (OverflowException objEx)
                    {
                        Console.WriteLine("Error: (0)\n", objEx.Message);
                        return false;
                    }
                }
            }
            // Catching an exception if the user enters any invalid product details
            catch (Exception objEx)
            {
                Console.WriteLine("Error: (0)\n", objEx.Message);
                return false;
            }
            return true;
        }

        /// <summary>
        /// Method to calculate total quantity and amount of the product.
        /// </summary>
        public void CalculateAmount()
        {
            // Calculating the total quantity and amount of the product
            try
            {
                for (int i = 0; i < productID.Length; i++)
                {
                    totalQuantity = (byte)(totalQuantity + quantity[i]);
                    totalAmount = totalAmount + amount[i];
                }
            }
            // Catching the exception if the total quantity or amount after being calculated becomes higher than the capcity of their respective data type
            catch (OverflowException objEx)
            {
                Console.WriteLine("Error:(0)\n", objEx.Message);
            }
        }

        /// <summary>
        /// Method to display the details of purchase order.
        /// </summary>
        public void DisplayOrderDetails()
        {
            //Display the details of purchase order
            Console.WriteLine("\nOrder Details: ");
            Console.WriteLine("-------------------");
            Console.WriteLine("Order ID: (0)", orderID);
            Console.WriteLine("Order Date: (0)", orderDate.ToShortDateString());
            Console.WriteLine("Customer Name: (0)", customerName);
            Console.WriteLine("Total Quantity: (0)", quantity);
            Console.WriteLine("Total Amount: (0:C2)", totalAmount);
        }

        /// <summary>
        /// Method to display product details.
        /// </summary>
        public void DisplayProductDetais()
        {
            // Displaying the details of products
            Console.WriteLine("\nProduct Details: ");
            Console.WriteLine("--------------------");
            Console.WriteLine("Product ID \t Product Name \tQuantity \tPrice \tAmount");
            for (int i = 0; i < productID.Length; i++)
            {
                Console.Write("(0) \t\t(1) \t\t(2) \t\t", productID[i], productName[i], quantity[i]);
                Console.WriteLine("(0) \t(1) ", price[i], amount[i]);
            }
        }
    }
}
