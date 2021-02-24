using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodeSnippet10
{
    class CodeSnippet10
    {
        static void Main(string[] args)
        {
            string path = "C:\\Windows\\MyFile.txt";
            bool found = true;
            if (found)
            {
                Console.WriteLine("File path: \'" +path + "\'");
            }
            else
            {
                Console.WriteLine("File Not Found!\a");
            }
        }
    }
}
