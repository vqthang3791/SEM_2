using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Factory
{
    /// <summary>
    /// Class Worker accepts and displays the details of workers
    /// </summary>
    public class Worker
    {
        /// <summary>
        /// Integer fiekd ti stire the worker name.
        /// </summary>
        private string workerName;
        /// <summary>
        /// Integer fiekd ti stire the worker ID.
        /// </summary>
        private int workerID;
        /// <summary>
        /// Integer fiekd ti stire the designation.
        /// </summary>
        private string designation;
        /// <summary>
        /// Double field to store the salary.
        /// </summary>
        private double salary;
        /// <summary>
        /// Double field to store the amount.
        /// </summary>
        private double amount;
        /// <summary>
        /// Integer field to store the number of years of service
        /// </summary>
        private int yearsOfService;
        /// <summary>
        /// Creating an object of the Appraisal class
        /// </summary>
        Appraisal objAppraisal = new Appraisal();
        /// <summray>
        /// Method to accept the details of worker.
        /// <returna>Returns true if input was accepted successfully</returna>
        /// </summray>
        public bool InputDetails()
        {
            Console.Write("Enter the worker name: ");
            workerName = Console.ReadLine();

            Console.Write("Enter the  worker ID: ");
            workerID = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("\nSelect the designation (1-3) : ");
            Console.WriteLine("1- Manager");
            Console.WriteLine("2- Engineer");
            Console.WriteLine("3- Technician");
            Console.Write("Enter the choice : ");
            int value = Convert.ToInt32(Console.ReadLine());

            switch (value)
            {
                case 1:
                    designation = "Manager";
                    salary = 5000;
                    break;
                case 2:
                    designation = " Engineer";
                    salary = 4000;
                    break;
                case 3:
                    designation = " Technician";
                    salary = 3000;
                    break;
                default:
                    Console.WriteLine("invalid option selected");
                    break;
            }
        Service:
            Console.Write("Enter the year of service : ");
            yearsOfService = Convert.ToInt32(Console.ReadLine());

            if (yearsOfService < 0)
            {
                Console.WriteLine("Year of service cannot be negative");
                goto Service;
            } return true;
        }

        public void DisplayDetails()
        {
            amount = objAppraisal.CalculateBonus(designation, yearsOfService, salary);

            Console.WriteLine("\n\nEmployee Name : " + workerName);
            Console.WriteLine("Employee ID : " + workerID);
            Console.WriteLine("Designation : " + designation);
            Console.WriteLine("Salary : " + salary);
            Console.WriteLine("Bonus : " + amount);
            Console.WriteLine("Total income earned : " + (amount + salary));
        }
    }
}
