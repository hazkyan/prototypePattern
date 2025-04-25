public class ProcessedDocument {
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();

        Document doc1 = registry.createPdf("annual_report_2024.pdf", "Acme Corp", 150);
        doc1.open();
        System.out.println("Type: " + doc1.getType());
        System.out.println();

        Document doc2 = registry.createText("meeting_notes.txt", "UTF-8", 250);
        doc2.open();
        System.out.println("Type: " + doc2.getType());
        System.out.println();

        Document doc3 = registry.createSpreadsheet("sales_data_q1.xlsx", 1000, 20);
        doc3.open();
        System.out.println("Type: " + doc3.getType());
        System.out.println();

        Document doc4 = registry.createPdf("summary_report.pdf", "Acme Corp", 30);
        doc4.open();
    }
}