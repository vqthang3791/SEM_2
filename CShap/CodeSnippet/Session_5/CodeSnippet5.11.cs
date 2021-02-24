using System;
class Students
{
    static void Main(string[] args)
    {
        string[] studentNames = new string[3] { "Ashley", "Joe", "Mikel" };
        foreach (string studName in studentNames)
        {
            {
                Console.WriteLine("Congratulations!! " + studName + " you have been granted an extra leave");
            }
        }
    }
}