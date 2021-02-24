using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AMC
{
    class Personnel
    {
        int perID;
        string name;
        DateTime DOB;
        string rank;
        int TroopID;
        public Personnel(int perID, string name, DateTime DOB, string rank, int TroopID)
        {
            this.perID = perID;
            this.name = name;
            this.DOB = DOB;
            this.rank = rank;
            this.TroopID = TroopID;
        }
        public Personnel Add()
        {
            Console.WriteLine("Enter perID ");
            perID = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Enter per name: ");
            name = Console.ReadLine();

            Console.WriteLine("Enter date of birth:");
            DOB = Convert.ToDateTime(Console.ReadLine());

            Console.WriteLine("Enter rank: ");
            rank = Console.ReadLine();

            Console.WriteLine("Enter Troops ID");
            TroopID = Convert.ToInt32(Console.ReadLine());

            return new Personnel(perID, name, DOB, rank, TroopID);
        }
        public void Display()
        {
            Console.WriteLine("PerID: " + perID);
            Console.WriteLine("PerName: " + name);
            Console.WriteLine("DOB: " + DOB);
            Console.WriteLine("Rank: " + rank);
            Console.WriteLine("Troops ID: " + TroopID);
        }
    }
}
