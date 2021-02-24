using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Practice
{
    internal class Cylinder
    {
        public double Radius { get; set; }
        public double Height { get; set; }

        private double BaseArea;
        private double LateralArea;
        private double TotalArea;
        private double Volume;

        public void Process()
        {
            BaseArea = Radius * Radius * Math.PI;
            LateralArea = 2 * Math.PI * Radius * Height;
            TotalArea = 2 * Math.PI * Radius * (Height + Radius);
            Volume = Math.PI * Radius * Radius * Height;
        }

        public void Result()
        {
            Console.WriteLine("--------------------------------");
            Console.WriteLine("Cylinder Characteristics: ");
            Console.WriteLine("Radius: {0}, Height: {1}", Radius, Height);
            Console.WriteLine("Base: {0:F2} | Lateral: {1:F2} | Total: {2:F2} | Volume: {3:F2}", BaseArea, LateralArea, TotalArea, Volume);
        }
    }
}
