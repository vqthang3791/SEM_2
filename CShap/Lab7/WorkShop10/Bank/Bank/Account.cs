using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Bank
{
    public class Account
    {
        /// <summary>
        /// Array of integer to store account number.
        /// </summary>
        /// <param name="args"></param>

        int[] accountNumber = new int[2];
        
        /// <summary>
        /// Array of string to store account type.
        /// </summary>
        string[] accountType = new string[2];
        
        /// <summary>
        /// Array of double to store balance.
        /// </summary>
        double[] balance = new double[2];

        /// <summary>
        /// Method to deposit the amount.
        /// </summary>
        /// <param name="accNumber">Accepts the account number of customer</param>
        /// <param name="amount">Accepts the amount to be deposited</param>
        /// <returns></returns>
        public bool Deposit(int accNumber, double amount)
        {
            // Checking the account number and updating the balance
            for (int i = 0; i < accountNumber.Length; i++)
            {
                if (accountNumber[i] == accNumber)
                {
                    balance[i] = balance[i] + amount;
                }
            } return false;
        }

        /// <summary>
        /// Method to withdraw the amount.
        /// </summary>
        /// <param name="accNumber">Accepts the account number of customer</param>
        /// <param name="amount">Accepts the amount to be withdrawn</param>
        /// <returns></returns>
        public bool Withdraw(int accNumber, double amount)
        {
            // Checking the account number and updating the balance
            for (int i = 0; i< accountNumber.Length; i++)
            {
                if (accountNumber[i] == accNumber)
                {
                    // Validating the amount to be withdrawn
                    if (amount > balance[i] - 1)
                    {
                        balance[i] = balance[i];
                        Console.WriteLine("Insufficient balance: ");
                        Console.WriteLine("Mnimum balance must be one dolar!");
                        return false;
                    } else
                    {
                        // Updating the balance
                        balance[i] = balance[i] - amount;
                        return true;
                    }
                }
            } return false;
        }
        
        /// <summary>
        /// Method to search for the account number.
        /// </summary>
        /// <param name="accNo">Accepts the account number</param>
        /// <returns>Returns the index of account number</returns>
        public int Search(int accNo)
        {
            // Searching for the account number and returning the index position
            for (int i = 0; i < accountNumber.Length; i++)
            {
                if (accNo == accountNumber[i]);
                return i;
            } return -1;
        }

        /// <summary>
        /// Method to accept the account details.
        /// </summary>
        /// <returns>return true or false</returns>
        public bool AcceptDetails()
        {
            // Accepting and validating the account details
            int accNo;
            string accType;
            double bal;
            for (int i = 0; i < accountNumber.Length; i++)
            {
                Console.Write("Enter the account number: ");
                accNo = Convert.ToInt32(Console.ReadLine());
                if (accNo <= 0)
                {
                    Console.WriteLine("Invalid account number!");
                    return false;
                }
                Console.Write("Enter account type [Fixed/Savings]/[F/S]");
                string input = Console.ReadLine();
                if (input == "F" || input == "Fixed" || input == "f")
                {
                    accType = "Fidex";
                } else if (input == "S" || input == "Savings" || input == "s")
                {
                    accType = "Savings";
                } else
                {
                    Console.WriteLine("Invalid Date Entry!");
                    return false;
                }
                int index = Search(accNo);
                if (index != -1)
                {
                    Console.WriteLine("Current balance : (0)", balance[index]);
                    accountNumber[i] = accNo;
                    accountType[i] = accType;
                } else
                {
                    Console.Write("Enter current balance: ");
                    bal = Convert.ToDouble(Console.ReadLine());
                    if (bal < 1)
                    {
                        Console.WriteLine("Minimum balance must be one dollar!");
                        return false;
                    }
                    accountNumber[i] = accNo;
                    accountType[i] = accType;
                    balance[i] = bal;
                }
                Console.WriteLine("Enter transaction type: ");
                Console.WriteLine("1. Deposit \n2. Withdrawal");
                Console.Write("Enter your choice: ");
                int choice = Convert.ToInt32(Console.ReadLine());
                switch (choice)
                {
                    case 1:
                        Console.Write("Enter amount to be deposited: ");
                        input = Console.ReadLine();
                        if (Convert.ToDouble(input) > 1)
                        {
                            if (Deposit(accountNumber[i], Convert.ToDouble(input)))
                            {
                                Console.WriteLine("Amount deposited successfully...");
                                return false;
                            } else
                            {
                                Console.WriteLine("Error in updating balance");
                                return false;
                            }
                        } else
                        {
                            Console.WriteLine("Invalid Amount: ");
                            return false;
                        } break;
                    default:
                        Console.WriteLine("Invalid choice!");
                        return false;
                }
                Console.WriteLine();
            } 
            return true;
        }

        /// <summary>
        /// Method to display the account details.
        /// </summary>
        public void DisplayDetails()
        {
            // Displaying the account details
            Console.WriteLine("\nAccount Details: \n");
            Console.WriteLine("A/c No.\tA/c.Type Balance($)");
            Console.Write("(0) \t", accountNumber[0]);
            Console.WriteLine("(0)\t (1)\t", accountType[0], balance[0]);
            for (int i = 1; i < accountNumber.Length; i++)
            {
                bool found = false;
                for (int j = 0; j < i; j++)
                {
                    if (accountNumber[i] == accountNumber[j])
                        found = true;
                } if (!found)
                {
                    Console.Write("(0) \t", accountNumber[i]);
                    Console.WriteLine("(0) \t (1)\t", accountType[i], balance[i]);
                }
            }
        }
    }
}
