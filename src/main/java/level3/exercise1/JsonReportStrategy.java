package level3.exercise1;

public class JsonReportStrategy implements ReportStrategy{

    @Override
    public String generateReport(String data) {
        return "{ \"report\": \"" + data + "\" }";
    }
}
