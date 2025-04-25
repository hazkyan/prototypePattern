public class SpreadsheetDocument implements Document {
    private String spreadsheetName;
    private int rowCount;
    private int columnCount;

    public SpreadsheetDocument() {
        System.out.println("Creating a Spreadsheet Document prototype.");
    }

    public SpreadsheetDocument(String name, int rows, int cols) {
        this.spreadsheetName = name;
        this.rowCount = rows;
        this.columnCount = cols;
    }

    public Document clone() {
        return new SpreadsheetDocument(spreadsheetName, rowCount, columnCount);
    }

    public void open() {
        System.out.println("Opening Spreadsheet Document: " + spreadsheetName + " (" + rowCount + " rows, " + columnCount + " columns)");
    }

    public String getType() {
        return "Spreadsheet, Name: " + spreadsheetName + ", Rows: " + rowCount + ", Columns: " + columnCount;
    }

    public void setProperties(String name, int rows, int cols) {
        this.spreadsheetName = name;
        this.rowCount = rows;
        this.columnCount = cols;
    }
}