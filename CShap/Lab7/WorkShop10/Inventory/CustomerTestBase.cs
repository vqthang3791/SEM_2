namespace Inventory
{
    internal class CustomerTestBase
    {
        static void Main(string[] args)
        {
            try
            {
                Customer objCustomer = new Customer();
                if (objCustomer.AcceptDetails())
                    objCustomer.DisplayDetails();
            }
            catch (Exception objEx)
            {
                Console.WriteLine("Error: (0)", objEx.Message);
            }
        }
    }
}