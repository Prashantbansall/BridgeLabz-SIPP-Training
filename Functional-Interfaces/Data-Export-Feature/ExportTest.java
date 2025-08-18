public class ExportTest {
    public static void main(String[] args) {
        DataExporter report = new ReportModule();
        report.exportToCSV("Report1");
        report.exportToPDF("Report1");
        report.exportToJSON("Report1"); // default JSON export
    }
}
