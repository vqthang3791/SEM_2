using System;
class StudentReferences
{
    public static void Main()
    {
        string[] classOne = { "Allan", "Chris", "Monica" };
        string[] classTwo = { "Katie", "Niel", "Mark"};
        Console.WriteLine("Students of Class I:\tStudents of Class II");
        for (int i = 0; i < 3; i++)
        {
            Console.WriteLine(classOne[i] + "\t\t\t" +classTwo[i]);
        }
        classTwo = classOne;
        Console.WriteLine("\nStudents of Class II after referencing Class I:");
        for (int i = 0; i < 3; i++)
        {
            Console.WriteLine(classTwo[i] + " ");
        }
        Console.WriteLine();
        classTwo[2] = "Mike";
        Console.WriteLine("Students of Class I after changing the third student in Class II:");
        for (int i = 0; i < 3; i++)
        {
            Console.WriteLine(classOne[i] + " ");
        }
    }
}