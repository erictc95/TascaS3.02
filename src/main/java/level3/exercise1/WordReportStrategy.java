package level3.exercise1;

public class WordReportStrategy implements ReportStrategy{
    @Override
    public String generateReport(String data) {
        return "WORD DOCUMENT: " + data;
    }
}
