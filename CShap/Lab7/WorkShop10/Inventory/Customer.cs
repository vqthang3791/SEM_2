using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Inventory
{
    /// <summary>
    /// 
    /// The program demonstrates the use of nested try and multiple catch block to handle exceptions
    /// 
    /// class Customer accepts and displays the details of customer using nested try and multiple catch blocks
    /// </summary>
    class Customer
    {
        /// <summary>
        /// Short field to store the customer ID
        /// </summary>
        private short customerID;

        /// <summary>
        /// String field to store the customer name.
        /// </summary>
        private string customerName;

        /// <summary>
        /// byte field to store the age
        /// </summary>
        private byte age;

        /// <summary>
        /// Character field to store the gender.
        /// </summary>
        private char gender;

        /// <summary>
        /// String field to store the city.
        /// </summary>
        private string city;

        /// <summary>
        /// Method to accept the details of customer.
        /// </summary>
        /// <returns>Returns true of false</returns>
        public bool AcceptDetails()
        {
            // Accepting and validating the details of customer using nested try and multioke catch blocks
            string input;
            Console.WriteLine("Enter Customer Details: ");
            customerID:
            try
            {
                try
                {
                    Console.Write("Customer ID: ");
                    customerID = Convert.ToInt32(Console.ReadLine());
                    if (customerID <= 0)
                    {
                        Console.WriteLine("Customer ID must be greater than zero.\n");
                        goto customerID;
                    }
                }
                // Cathcing an exception if the user enters any value greater than the capacity of byte type
                catch ( OverflowException objEx)
                {
                    Console.WriteLine("OverflowExcetion: Customer ID is too large!");
                    Console.WriteLine("Error: (0)\n", objEx.Message);
                    goto customerID;
                }
            customerName:
                Console.Write("Customer Name: ");
                customerName = Console.ReadLine();
                if ( customerName == "")
                {
                    Console.WriteLine("Invalid customer name\n");
                    goto customerName;
                }
                age:
                try
                {
                    Console.Write("Age: ");
                    age = Convert.ToByte(Console.ReadLine());
                    if (age <= 0)
                    {
                        Console.WriteLine("Age cannot be negative or zero. \n");
                        goto age;
                    }
                }
                catch (OverflowException objEx)
                {
                    Console.WriteLine("Error: (0)\n", objEx.Message);
                    goto age;
                }
            Gendere:
                Console.Write("Enter the gender [M/F]: ");
                input = Console.ReadLine();
                if (input == "Male" || input == "male" || input == "M" || input == "m")
                {
                    gender = 'M';
                } else if (input == "Female" || input == "female" || input == "F" || input == "f")
                {
                    gender = 'F';
                } else
                {
                    Console.WriteLine("Invalid input!\n");
                    goto Gendere;
                }
            city:
                Console.Write("City: ");
                city = Console.ReadLine();
                if (city == "")
                {
                    Console.WriteLine("Invalid city name!\n");
                    goto city;
                }
            }
            catch (FormatException objEx)
            {
                Console.WriteLine("Error: (0)\n", objEx.Message);
                goto customerID;
            }
            catch (Exception objEx)
            {
                Console.WriteLine("Error: (0)\n", objEx.Message);
                return false;
            }
            return true;
        }

        /// <summary>
        /// Method to display the details of customer.
        /// </summary>
        public void DisplayDetails()
        {
            // Displaying the details of customer
            Console.WriteLine("\nCustomer Details: ");
            Console.WriteLine("---------------------");
            Console.WriteLine("Customer ID: (0)", customerID);
            Console.WriteLine("Customer Name: (0)", customerName);
            Console.WriteLine("Age: (0)", age);
            if (gender == 'M' || gender == 'm')
                Console.WriteLine("Gender: Male");
            else
                Console.WriteLine("Gender: Female");
            Console.WriteLine("City: (0)", city);
        }
    }
}
