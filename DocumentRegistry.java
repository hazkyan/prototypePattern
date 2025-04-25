public class DocumentRegistry {
    private PdfDocument pdfPrototype;
    private TextDocument textDocumentPrototype;
    private SpreadsheetDocument spreadsheetPrototype;

    public DocumentRegistry() {
        pdfPrototype = new PdfDocument();
        textDocumentPrototype = new TextDocument();
        spreadsheetPrototype = new SpreadsheetDocument();
    }

    public PdfDocument createPdf(String fileName, String author, int pageCount) {
        PdfDocument doc = (PdfDocument) pdfPrototype.clone();
        doc.setProperties(fileName, author, pageCount);
        return doc;
    }

    public TextDocument createText(String filePath, String encoding, int wordCount) {
        TextDocument doc = (TextDocument) textDocumentPrototype.clone();
        doc.setProperties(filePath, encoding, wordCount);
        return doc;
    }

    public SpreadsheetDocument createSpreadsheet(String name, int rows, int columns) {
        SpreadsheetDocument doc = (SpreadsheetDocument) spreadsheetPrototype.clone();
        doc.setProperties(name, rows, columns);
        return doc;
    }
}