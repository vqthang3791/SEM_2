namespace Factory
{
    public sealed class AppraisalBase
    {
        /// <summary>
        /// Method to calculate the bonus
        /// </summary>
        /// <param name="designation">Accepts the designation of the employee</param>
        /// <param name="tenure">Accepts the tenure of the employee</param>
        /// <param name="salary">Accepts the salary of the employee</param>

        public double CalculateBonus(string designation, int tenure, double salary)
        {
            if (designation == "Manager")
            {
                if (tenure <= 5)
                {
                    bonus = salary * 1.5;
                }
                else
                {
                    bonus = salary * 2;
                }
            }
        }
    }
}