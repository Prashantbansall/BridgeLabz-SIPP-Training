public class ReportModule implements DataExporter {
    @Override
    public void exportToCSV(String data) {
        System.out.println("Exporting data to CSV: " + data);
    }

    @Override
    public void exportToPDF(String data) {
        System.out.println("Exporting data to PDF: " + data);
    }

    // No need to implement exportToJSON(), uses default
}
