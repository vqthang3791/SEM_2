using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Bank
{
    /// <summary>
    /// Abstract class Loan sets the values of loan amount and the duration of the loan.
    /// </summary>
    public abstract class Loan
    {
        /// <summary>
        /// Double field to store the loan amount.
        /// </summary>
        protected double LoanAmount;
        /// <summary>
        /// Double field to store the interest amount.
        /// </summary>
        protected double InterestAmount;
        /// <summary>
        /// Float field to store the interest rate.
        /// </summary>
        protected float InterestRate;
        /// <summary>
        /// Integer field to sotre the duration of loan.
        /// </summary>
        protected int Duration;
        
        public virtual void SetValues()
        {
        Duration:
            Console.Write("Enter the pay back period for the loan: ");
            Duration = Convert.ToInt32(Console.ReadLine());

            //Checks whether the duration is iese than zero.
            if (Duration <= 0)
            {
                Console.Write("Pay back period cannot be ises than or euqal to zero\n");
                goto Duration;
            }
        }
        /// <summary>
        /// Abstract method to calculate the interest.
        /// </summary>
        /// <returns>Returns the interest amount</returns>
        public abstract double CalculateInterest();

        /// <summary>
        /// Method to calculate the maximum amount of loan.
        /// </summary>
        /// <param name="value"></param>
        public abstract void LoanEligibility(double value);
    }
}
