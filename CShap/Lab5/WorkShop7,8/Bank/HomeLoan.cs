using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Bank
{
    /// <summary>
    /// Class HomeLoan impiements the abstract class Loan and umplements the IDetails interface.
    /// 
    /// The program accepts the borrower details, calculates the interest, total amount to be paid
    /// and displayes the details.
    /// </summary>
    public class HomeLoan : Loan, IDetails
    {
        /// <summary>
        /// String field to store the borrower name.
        /// </summary>
        private string borrowerName;
        /// <summary>
        /// String field to store the address of the city.
        /// </summary>
        private string city;
        /// <summary>
        /// Double field to store the Annual income.
        /// </summary>
        private double annualIncome;
        /// <summary>
        /// Double field to store the maximum available loan amount.
        /// </summary>
        private double maxAmount;
        /// <summary>
        /// Method to set the details of the duration of loan amount and interest rate.
        /// </summary>
        public override void SetValues()
        {
            base.SetValues();
            InterestAmount = 15;
        }
        #region IDetails Members
        /// <summary>
        /// Method to set the details of the duration of loan amount an interest rate.
        /// </summary>
        public void AcceptDetails()
        {
            Console.WriteLine("\t\t\t----HOUSING LOAN DETAILS----\n");

            Console.Write("Enter the borrower's name: ");
            borrowerName = Console.ReadLine();
        Income:
            Console.Write("Enter the annual income: ");
            annualIncome = Convert.ToDouble(Console.ReadLine());
            if (annualIncome <= 0)
            {
                Console.WriteLine("Annual salary cannot be negative or zero");
                goto Income;
            }

            // Invoking the LoanEligibility method
            LoanEligibility(annualIncome);

            Console.WriteLine("\nMaximum loan amount available: " + maxAmount + "\n");
        Amount:
            Console.Write("Enter the amount of loan you want: ");
            LoanAmount = Convert.ToInt32(Console.ReadLine());

            // Checks wherjer tje loan amount is less than 500
            if (LoanAmount <= 5000)
            {
                Console.WriteLine("You cannot take a loan of less than 5000 $\n");
                goto Amount;
            }
            if (LoanAmount >= maxAmount)
            {
                Console.WriteLine("Loan amount cannot be more than the permissible limit\n");
                goto Amount;
            }
        }

        /// <summary>
        /// Method to calculate the maximum loan amount available.
        /// </summary>
        /// <param name="value">Accepts the annual salary</param>
        public override void LoanEligibility(double value)
        {
            if (value <= 50000)
            {
                maxAmount = 0;
            } else
            {

                maxAmount = ((value - 50000) * 4);
            }
        }

        /// <summary>
        /// Method to calculate the tital amount the be paid.
        /// </summary>
        /// <returns>Returns the total amount to be paid</returns>
        double CalculateAmount()
        {
            return (LoanAmount + InterestAmount);
        }

        /// <summary>
        /// Method to display the loan details.
        /// </summary>
        public void DisplayDetails()
        {
            // Invoking the CalculateInterest method
            InterestAmount = CalculateAmount();

            Console.WriteLine("\n]nLOAN DETAILS");
            Console.WriteLine("\nBorrower Name: \t\t" + borrowerName);
            Console.WriteLine("City: \t\t\t" + city);
            Console.WriteLine("Annual Income: \t\t" + annualIncome + "$");
            Console.WriteLine("Loan Amount: \t\t" + LoanAmount + "$");
            Console.WriteLine("Interest Rate: \t\t" + InterestRate + "%");
            Console.WriteLine("Diration of loan: \t" + Duration + "years");
            Console.WriteLine("Total Amount: \t\t" + CalculateAmount() + "$");
        }
        #endregion

        /// <summary>
        /// Method to calculate the interest based on the loan amount
        /// </summary>
        /// <returns></returns>
        public override double CalculateInterest()
        {
            if ((LoanAmount >= 5000) && (LoanAmount <= 100000)) 
            {
                InterestRate = 9;
            } else if ((LoanAmount > 100000) && (LoanAmount <= 2500000))
            {
                InterestRate = 9.5F;
            } else if ((LoanAmount > 2500000) && (LoanAmount <= 500000))
            {
                InterestRate = 10;
            } else
            {
                InterestRate = 10.5F;
            } return ((LoanAmount * Duration * InterestRate) / 100);
        }
    }
}
