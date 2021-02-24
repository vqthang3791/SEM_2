using System;
class Employee
{
    public static void Main()
    {
        Array objEmployeeDetails = Array.CreateInstance(typeof(string), 2, 3);
        objEmployeeDetails.SetValue("141", 0, 0);
        objEmployeeDetails.SetValue("147", 0, 1);
        objEmployeeDetails.SetValue("154", 0, 2);
        objEmployeeDetails.SetValue("Joan Fuller", 1, 0);
        objEmployeeDetails.SetValue("Barbara Boxen", 1, 1);
        objEmployeeDetails.SetValue("Paul Smith", 1, 2);
        Console.WriteLine("Rank: " +objEmployeeDetails.Rank);
        Console.WriteLine("Employee ID \tName");
        for (int i = 0; i < 1; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                Console.Write(objEmployeeDetails.GetValue(i, j) + "\t\t");
                Console.WriteLine(objEmployeeDetails.GetValue(i + 1, j));
            }
        }
    }
}