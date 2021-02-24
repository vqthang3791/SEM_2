using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Company2
{
    /// <summary>
    /// The program demonstrates the use Polymorphism in C#
    /// </summary>
    class Invoice
    {
        /// <summary>
        /// Integer field to store invoice number.
        /// </summary>
        private int invoiceNumber;

        /// <summary>
        /// String field to store customer name.
        /// </summary>
        private int customerName;

        /// <summary>
        /// DateTime type field to store current date.
        /// </summary>
        private int invoiceDate;

        /// <summary>
        /// Method to set the invoice date.
        /// </summary>
        public virtual void SetDetails()
        {
            DateTime now = DateTime.Now;
            
        }

        /// <smumary>
        /// Mothod to set invoice number and customer name
        /// this method overloads the earliter defined method that has the same name
        /// </smumary>
        /// <param name="number">Accepts the invoice number</param>
        /// <param name="name">Accepts the customer name</param>
        public void SetDetails(int number, string name)
        {
            invoiceNumber = number;
            customerName = name;
        }
        /// <summary>
        /// Method to display the invoice details.
        /// </summary>
        public virtual void Display()
        {
            Console.WriteLine("\nINVOICE DETAILS");
            Console.WriteLine("\nInvoice No:\t" + invoiceNumber);
            Console.WriteLine("Invoice Date:\t" + invoiceDate.ToString());
            Console.WriteLine("Custmer Name:\t" + customerName);
        }
    }
}
