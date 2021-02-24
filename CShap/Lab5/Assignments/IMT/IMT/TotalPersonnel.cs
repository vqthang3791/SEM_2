using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace IMT
{
    class TotalPersonnel : PersonInformation
    {
        public int rank;

        public override void AcceptInformation()
        {
            base.AcceptInformation();
            Console.Write("Enter army rank : ");
            this.rank = Convert.ToInt32(Console.ReadLine());
        }
    }
}
