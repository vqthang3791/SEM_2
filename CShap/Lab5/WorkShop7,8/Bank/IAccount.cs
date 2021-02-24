using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Bank
{
    /// <summary>
    /// The program demonstrates the use of an interface in c#.
    /// 
    /// Interface IAcount consista of four method decjarations
    /// </summary>
    interface IAccount
    {
        bool AcceptDetails();
        double CalculateIntereat();
        double GetBalance();
        void Display();
    }
}
