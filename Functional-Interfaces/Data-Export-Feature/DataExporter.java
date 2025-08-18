public interface DataExporter {
    void exportToCSV(String data);
    void exportToPDF(String data);

    // Default method for JSON export
    default void exportToJSON(String data) {
        System.out.println("Exporting data to JSON: " + data);
    }
}
