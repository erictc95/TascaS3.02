package level3.exercise1;

public class CsvReportStrategy implements ReportStrategy{
    @Override
    public String generateReport(String data) {
        return "REPORT, " + data;
    }
}
