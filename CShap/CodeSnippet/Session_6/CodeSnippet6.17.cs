using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodeSnippet6._17
{
    class Employees
    {
        string _empName;
        int _empAge;
        string _deptName;
        Employees(string name, int num)
        {
            _empName = name;
            _empAge = num;
            _deptName = "Research & Development";
        }
        static void Main(string[] args)
        {
            Employees objEmp = new Employees("John", 10);
            Console.WriteLine(objEmp._deptName);
        }
    }
}
