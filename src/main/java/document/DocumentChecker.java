package document;

public class DocumentChecker {
    public static void main(String[] args) {
        ExcellDocument document = new ExcellDocument();
        Document excellDocument = new ExcellDocument(); // dokument excella jest jedną z postaci naszego dokumentu.
        Document pdfDocument = new PdfDocument(); //pdfDocument jest dokumentem, jest pewną postacią Dokumentu.

        excellDocument.getDescription();
        pdfDocument.getDescription();
    }
}
