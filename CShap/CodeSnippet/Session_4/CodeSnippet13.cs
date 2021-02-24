using System;
class Numbers
{
    static void Main(string[] args)
    {
        Console.WriteLine("Square \t\tCube");
        for (int i = 1, j = 0; i < 11; i++, j++)
        {
            if ((i % 2) == 0)
            {
                Console.Write("{ 0} = { 1} \t", i, (i * i));
        Console.Write("{ 0} = { 1} \n", j, (j * j * j));
    }
}
