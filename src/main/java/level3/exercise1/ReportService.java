package level3.exercise1;

public class ReportService {

    private ReportStrategy reportStrategy;

    public ReportService(ReportStrategy reportStrategy) {
        this.reportStrategy = reportStrategy;
    }

    public String generateReport(String data) {
        return reportStrategy.generateReport(data);
    }
}
