using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Bank
{
    /// <summary>
    /// Class FixedAccount implements the IAcount interface.
    /// The class accepts the deposit amount details, calculates the intereat
    /// and displays the ouputs
    /// </summary>
    class FixedAccount : IAccount
    {
        /// <summary>
        /// String field to store the account holder name.
        /// </summary>
        private string accountHolder;
        /// <summary>
        /// Long field to store the account number.
        /// </summary>
        private long accountNumber;
        /// <summary>
        /// Float field to store the interest rate.
        /// </summary>
        private float interestRate;
        /// <summary>
        /// Integer field to sotre the years of deposit.
        /// </summary>
        private int numberOfYears;
        /// <summary>
        /// Double field to sotre the interest earned on the deposit amout.
        /// </summary>
        private double intereatEarned;
        /// <summary>
        /// Double field to store the total balance inciuding the interest earned.
        /// </summary>
        private double totalBalance;
        #region IAccount Members
        /// <summary>
        /// Method to accpet the details of account holder and the amout deposited
        /// </summary>
        /// <returns>Returns a boolean value</returns>
        public bool AcceptDetails()
        {
            // String variable to store the user input
            string input;

            Console.Write("Enter the name of the account holder: ");
            accountHolder = Console.ReadLine();

        Number:
            Console.Write("Enter the account number: ");
            input = Console.ReadLine();
            accountNumber = Convert.ToInt64(input);

            if (accountNumber <= 0)
            {
                Console.WriteLine("Account number cannot be zero or nagative\n");
                goto Number;
            }
        Amout:
            Console.Write("Enter the deposit amount ($): ");
            deposit = Convert.ToDouble(Console.ReadLine());

            if (deposit <= 0)
            {
                Console.WriteLine("Invalid amount");
                goto Amout;
            }

            Console.WriteLine("Select the tenure for the deposit amount: ");
            Console.WriteLine("\nA. \t1 year \nB. \t3 years \nC. \t5 years");
            Console.Write("\nChoose your option (A - C): ");

            char choice = Convert.ToChar(Console.ReadLine());
            switch (choice)
            {
                case 'A':
                case 'B':
                    numberOfYears = 1;
                    break;
                case 'B':
                case 'b':
                    numberOfYears = 3;
                    break;
                case 'C':
                case 'c':
                    numberOfYears = 5;
                    break;
                default:
                    Console.WriteLine("Invalid choice]a");
                    return false;
            } return true;
        }

        /// <summary>
        /// Method to calculate the interest earned on the amount deposited
        /// </summary>
        /// <returns>Retunrns the interest amount earned</returns>
        public double CalculateIntereat()
        {
            if (deposit <= 50000)
            {
                if (numberOfYears == 1)
                {
                    interestRate = 3.5F;
                } else if (numberOfYears == 3)
                {
                    interestRate = 4;
                } else
                {
                    interestRate = 4.5F;
                }
            } else
            {
                if (numberOfYears == 1)
                {
                    interestRate = 6.5F;
                } else if (numberOfYears == 3)
                {
                    interestRate = 7;
                } else
                {
                    interestRate = 7.5F;
                }
            } return ((deposit * numberOfYears * interestRate) / 100);
        }

        /// <summary>
        /// Method to calculate the total amount received on the maturity date.
        /// </summary>
        /// <returns>Returns the total amount</returns>
        public double GetBalance()
        {
            intereatEarned = CalculateIntereat();
            return (deposit + intereatEarned);
        }

        /// <summary>
        /// Method to calculate the total amount received on the maturity date
        /// </summary>
        public void Display()
        {
            totalBalance = GetBalance();

            Console.WriteLine("\nAccount Holder: \t" + accountHolder);
            Console.WriteLine("Account Number: \t" + accountNumber);
            Console.WriteLine("Amount Deposited: \t" + deposit + "$");
            Console.WriteLine("Interest Rate: \t\t" + intereatEarned + "%");
            Console.WriteLine("Years of deposit: \t" + numberOfYears);
            Console.WriteLine("Intereat Earned: \t" + intereatEarned + "$");
            Console.WriteLine("Maturity Amount: \t" + totalBalance + "$");
        }
        #endregion
    }
}
