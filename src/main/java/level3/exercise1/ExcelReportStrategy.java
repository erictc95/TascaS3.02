package level3.exercise1;

public class ExcelReportStrategy implements ReportStrategy{
    @Override
    public String generateReport(String data) {
        return "EXCEL SHEET: " + data;
    }
}
