using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Bank
{
    /// <summary>
    /// Class SavingsTest is used to test thhe SavingsAccount class
    /// </summary>
    class SavingsTest
    {
        /// <summary>
        /// The entry point for the application.
        /// </summary>
        /// <param name="args">A list of command line arguments</param>
        static void Main(string[] args)
        {
            // Creating an object of the SavingsAccount class.
            SavingsAccount objSavingsAccount = new SavingsAccount();

            if (objSavingsAccount.AcceptDetails())
            {
                //Invoking the Display method of the SavingsAccount class.
                objSavingsAccount.Display();
            } else
            {
                return;
            }
        }
    }
}
