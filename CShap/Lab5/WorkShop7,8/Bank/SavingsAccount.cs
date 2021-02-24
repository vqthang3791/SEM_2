using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Bank
{
    /// <summary>
    /// Class SavingsAccount inherits the abstract base class Account.
    /// 
    /// The class accepts the details of the customer.
    /// and also performs withrawal and deposit transaction and displays
    /// the balance in the account.
    /// </summary>
    public class SavingsAccount : Account
    {
        /// <summary>
        /// Float field to store the minimun balance required in the account.
        /// </summary>
        private float minBanlance;

        /// <summary>
        /// Float field to store the bank charges
        /// </summary>
        private float bankCharge;

        /// <summary>
        /// Boolean field to store the flag value.
        /// </summary>
        public bool Flag = true;

        /// <summary>
        /// Method to accept the details of the customer and process the transaction.
        /// </summary>
        /// <returns></returns>
        public bool AcceptDetails()
        {
            // String varible to store the account number.
            string name;

            // Long varible to store the account number.
            long number;

            // Double variable to sotre the amount to be deposited or withdrawn
            double amount;

            Console.Write("Enter the customer name: ");
            name = Console.ReadLine();

        First:
            Console.Write("Enter the account number: ");
            number = Convert.ToInt64(Console.ReadLine());

            // Check if the account number is iess than or rqual to zero.
            if (number <= 0)
            {
                Console.WriteLine("Invaild Account Number");
                goto First;
            } else
            {
                // Invoking the overriden SetDetails method.
                SetDetails(name, number);
            }

            Console.WriteLine("\nInitial balance available: " + Balance + "\n\n");

            Console.WriteLine("Select the type of transaction: ");
            Console.WriteLine("1. Whitdraw \n 2. Deposit");
            Console.WriteLine("Select your choice");
            int choice = Convert.ToInt32(Console.ReadLine());

            switch (choice)
            {
                case 1:
                    Console.WriteLine("Minimum balance to be maintained: " + minBanlance + "$\n");
                    Console.WriteLine("Enter the amount to be withdrawn: ");
                    amount = Convert.ToDouble(Console.ReadLine());
                    Withdraw(amount);
                    break;
                case 2:
                    Console.Write("Enter the amount to be deposited: ");
                    amount = Convert.ToDouble(Console.ReadLine());
                    Deposit(amount);
                    break;
                default:
                    Console.WriteLine("Invalid Choice");
                    return false;
            }

            if (!Flag)
            {
                return false;
            } else
            {
                return true;
            }
        }

        protected override void SetDetails(string name, long number)
        {
            base.SetDetails(name, number);
            minBanlance = 500;
        }

        /// <summary>
        /// Method to calculate the bank charges.
        /// </summary>
        /// <returns>Return the bank charge</returns>
        protected override double BankCharges()
        {
            if (Balance < minBanlance)
            {
                bankCharge = 200;
            } return bankCharge;
        }
        /// <summary>
        /// MEthod to deposit the money in the account.
        /// </summary>
        /// <param name="amount">Accepts the amount to be deposited</param>
        protected override void Deposit(double amount)
        {
            base.Deposit(amount);
        }
        /// <summary>
        /// Method to withdraw money from the account.
        /// </summary>
        /// <param name="amount">Accepts the amount to be withdrawn</param>
        protected override void Withdraw(double amount)
        {
            if (amount <= Balance)
            {
                base.Withdraw(amount);
            } else
            {
                Console.WriteLine("You do not have sufficient balance in your account");
                Flag = false;
                return;
            }
        }
        /// <summary>
        /// Method to display the account details.
        /// </summary>
        public override void Display()
        {
            base.Display();
        }
    }
}
