package level3.exercise1;

public class PdfReportStrategy implements ReportStrategy{
    @Override
    public String generateReport(String data) {
        return "PDF DOCUMENT: " + data;
    }
}
