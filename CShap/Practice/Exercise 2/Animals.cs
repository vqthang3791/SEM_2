using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercise_2
{
    abstract class Animals
    {
        public double Weight { get; set; }
        public string Name { get; set; }

        public void setMe(double weight, string name)
        {
            this.Weight = weight;
            this.Name = name;
        }
        public abstract void show();
    }
}
