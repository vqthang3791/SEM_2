using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Factory
{
    /// <summary>
    /// Class WorkerTest is used to test the Worker class.
    /// </summary>
    class WorkerTest
    {
        /// <summary>
        /// The entry point for the application
        /// </summary>
        /// <param name="args">A list of command line arguments</param>
        static void Main(string[] args)
        {
            //Creating an object of the Worker class
            Worker objWorker = new Worker();

            if (objWorker.InputDetails())
            {
                // Invoking the DisplayDetails method of the Worker
                // class to display the details
                objWorker.DisplayDetails();
            }
        }
    }
}
