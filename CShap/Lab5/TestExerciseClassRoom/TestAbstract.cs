using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TestAbstract
{
    abstract class ExportDataBase
    {
        public abstract void Export();
    }

    class TextExport : ExportDataBase
    {
        public override void Export()
        {
            Console.WriteLine("Export data to .txt file");
        }
    }

    class CsvExport : ExportDataBase
    {
        public override void Export()
        {
            Console.WriteLine("Export data to .csv file");
        }
    }

    class Application
    {
        private readonly ExportDataBase exportData;

        public Application(ExportDataBase exportData)
        {
            exportData = exportData;
        }

        public void ExportData()
        {
            exportData.Export();
        }
    }

    class RectangleTester
    {
        static void Main(string[] args)
        {
            Application app = new Application(new TextExport());
            app.ExportData();
            Console.ReadKey();
        }
    }
}
