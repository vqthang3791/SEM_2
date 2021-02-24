using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Inventory
{
    /// <summary>
    /// Class PurchaseOrderTest is used to test the PurchaseOrder class.
    /// </summary>
    /// <remarks>The programs also demonstrates the use of finally block</remarks>
    class FurchaseOrderTest
    {
        /// <summary>
        /// The entry point for the application
        /// </summary>
        /// <param name="args">A list of command line arguments</param>
        static void Main(string[] args)
        {
            // Creating a reference of PurchaseOrder class
            FurchaseOrder objPurchaseOrder;
        AcceptOrder:
            // Character variable to store choice
            char choice = 'N';
            try
            {
                // Creating an object of the FurchaseOrder class
                objPurchaseOrder = new FurchaseOrder();

                // Invoking the AcceptOrderDetails method or the FurchaseOrder class to accept the details of purchase order
                if (objPurchaseOrder.AcceptOrdereDetails())
                {
                    // Invoking the AcceptProductDetails method of the PurchaseOrder class to accpet order details
                    if (objPurchaseOrder.AcceptOrdereDetails())
                    {
                        // Invoking the calculateAmount method of the PurchaseOrder class to calculate total quantity and amount.
                        objPurchaseOrder.CalculateAmount();

                        // Invoking the DisplayoederDetails method of he Furchaseorder class to display the details of product
                        objPurchaseOrder.DisplayOrderDetails();
                    }
                }
            }
            // Catching an exception if the user enters any invaild details
            catch (Exception objEx)
            {
                Console.WriteLine("Error : (0)", objEx.Message);
            }
            // Checking if the user vishes to add more records
            finally
            {
                try
                {
                    objPurchaseOrder = null;
                    Console.Write("\nDo you want to add details for another purchase order (Y/N)? ");
                    choice = Convert.ToChar(Console.ReadLine());
                }
                catch (Exception objEx)
                {
                    Console.WriteLine("Error: (0)", objEx.Message);
                }
            }
            if (choice == 'Y' || choice == 'y')
                goto AcceptOrder;
        }
    }
}
