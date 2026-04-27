package level3.exercise1;

public class HtmlReportStrategy implements ReportStrategy{

    @Override
    public String generateReport(String data) {
        return "<html><body>" + data + "</body></html>";
    }
}
