using System;
class SingleDimensionArray
{
    static void Main(string[] args)
    {
        string[] students = new string[3] {"James", "Alex", "Fernando"};
        for (int i = 0; i < students.Length; i++)
        {
            Console.WriteLine(students[i]);
        }
    }
}