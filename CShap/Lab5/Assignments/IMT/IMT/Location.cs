using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace IMT
{
    class Location
    {
        public string LocationName;
        public string StatusOfTeam;

        public virtual void AcceptStatusTeam()
        {
            Console.Write("Enter the status of medical team : " +
                "\n 1. Not enough" +
                "\n 2. Ready \n");
            this.StatusOfTeam = Convert.ToString(Console.ReadLine());
        }
        public virtual void AcceptLocantionName()
        {
            Console.Write("Enter the Locantion name : ");
            this.LocationName = Convert.ToString(Console.ReadLine());
        }
    }
}
