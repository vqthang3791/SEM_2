using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Company
{
    class Expenditure
    {
        protected string[] expenditureType = {"Maintenance", "Salary Paid", "Miscellaneous"};
        protected double[] expenditureAmount = new double[3];
        protected double TotalExpenses = 0;
        internal virtual void AcceptDetails()
        {
            Console.Write("Enter the expenditure for the following heads :" + "\n");
            for (int i = 0; i < expenditureType.Length; i++)
            {
                Console.Write(expenditureType[i] + " : ");
                expenditureAmount[i] = Convert.ToDouble(Console.ReadLine());
                TotalExpenses += expenditureAmount[i];
            }
        }
        internal virtual void DisplayDetails()
        {
            Console.WriteLine("\n\nExpenditure Account");
            Console.WriteLine("\nExpenditure Head \t\t Amount ($)");
            Console.WriteLine("=======================================");
            for (int i = 0; i < expenditureType.Length; i++)
            {
                Console.WriteLine(expenditureType[i] + "\t\t\t" + expenditureAmount[i]);
            }
            Console.WriteLine("=======================================");
            Console.WriteLine("Total Expenditure\t\t" + TotalExpenses);
        }
    }
    class Revenue : Expenditure
    {
        private double totalIncome;
        private double balance;
        internal override void AcceptDetails()
        {
            Console.WriteLine("\n");
            base.AcceptDetails();
            Console.WriteLine("\nEnter the revenue earned annually : ");
            totalIncome = Convert.ToDouble(Console.ReadLine());
        }
        internal override void DisplayDetails()
        {
            base.DisplayDetails();
            Console.WriteLine("\nTotal Income \t\t\t" + totalIncome);
            balance = totalIncome - TotalExpenses;
            if(balance < 0)
            {
                Console.WriteLine("\nNet Loss: " + -balance + "\n");
            } else
            {
                Console.WriteLine("\nNet Profit: " + balance + "\n");
            }
        }
    }
}
