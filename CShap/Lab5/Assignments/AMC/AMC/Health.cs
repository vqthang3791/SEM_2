using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AMC
{
    class Health
    {
        int id;
        string reason;
        string solution;
        DateTime date;
        Personnel personnel;

        public Health(int id, string reason, string solution, DateTime date, Personnel personnel)
        {
            this.id = id;
            this.reason = reason;
            this.solution = solution;
            this.date = date;
        }

        public Health Add()
        {
            Console.WriteLine("Enter id: ");
            id = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Enter reason: ");
            reason = Console.ReadLine();

            Console.WriteLine("Enter solution: ");
            solution = Console.ReadLine();

            Console.WriteLine("Enter date: ");
            date = Convert.ToDateTime(Console.ReadLine());

            Console.WriteLine("Enter personel:");
            personnel.Add();

            return new Health(id, reason, solution, date, personnel);
        }
        public void Display()
        {
            Console.WriteLine("ID: " + id);
            Console.WriteLine("Reason: " + reason);
            Console.WriteLine("Solution: " + solution);
            Console.WriteLine("Date: " + date);
            Console.WriteLine("Pesonnel: ");
            personnel.Display();
        }
    }
}
