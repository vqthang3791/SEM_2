using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Bank
{
    /// <summary>
    /// Class FixedAccountTest is used to test the FixedAccount class.
    /// </summary>
    class FixedAccountTest
    {
        /// <summary>
        /// The entry point for the application.
        /// </summary>
        /// <param name="args">A list of command line arguments</param>
        static void Main(string[] args)
        {
            // Creating an object of the FixedAccount class
            FixedAccount objFixed = new FixedAccount();
            Console.WriteLine("\t\t\tFIXED ACCOUNT DETAILS\n");

            char choice;
            do
            {
                // Invoking and checking the return value of the acceptDetails
                // of FixedAccount class.
                if (!objFixed.AcceptDetails())
                {
                    return;
                }
                else
                {
                    // Invoking the Display method of the FixedAccount class
                    objFixed.Display();
                }
                Console.Write("\nDo you with to continue (Y : N): ");
                choice = Convert.ToChar(Console.ReadLine());
                Console.WriteLine();
            } while ((choice == 'y') || (choice == 'Y'));
        }
    }
}
