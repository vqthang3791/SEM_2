using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
// Using the namspace Bank
using Bank;

// AccountTest class declaration in the namespace BankTest
namespace BankTest
{
    /// <summary>
    /// Class AccountTest is used to test the Account class.
    /// </summary>
    class AccountTest
    {
        /// <summary>
        /// The entry point for the application.
        /// </summary>
        /// <param name="args">A list command line arguments</param>
        static void Main(string[] args)
        {
            // Creating an object of the Account class
            Account objAccount = new Account();

            // Invoking the AcceptDetails method of the Account class to accept the details of account
            if (objAccount.AcceptDetails())
                // Invoking the DisplayDetails method of the Account class to display the details of account
                objAccount.DisplayDetails();
        }
    }
}
