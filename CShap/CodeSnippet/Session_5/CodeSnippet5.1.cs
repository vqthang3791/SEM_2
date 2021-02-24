using System;
class Numbers
{
    static void Main(string[] args)
    {
        int[] count = new int[10];//array is created
        int counter = 0;
        for (int i = 0; i < 10; i++)
        {
            count[i] = counter++; //values are assigned to the elements
            Console.WriteLine("The count value is: " +count[i]);
            //element values are printed
        }
    }
}