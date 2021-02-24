using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Bank
{
    /// <summary>
    /// Class HomeLoanTest is used to check the HomeLoan class.
    /// </summary>
    class HomeLoanTest
    {
        /// <summary>
        /// The entry point for the application.
        /// </summary>
        /// <param name="args">A list of command line arguments</param>
        static void Main(string[] args)
        {
            // Instantiating the HomeLoan class
            HomeLoan objLoan = new HomeLoan();

            // Invoking the SetValue method of the HomeLoan class
            objLoan.AcceptDetails();

            // Invoking the DisplayDetails method of the HomeLoan class.
            objLoan.DisplayDetails();
        }
    }
}
