package level3.exercise1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReportTest {

    private final String expectedHtmlReport = "<html><body>Sales Report</body></html>";
    private final String expectedJsonReport = "{ \"report\": \"Sales Report\" }";
    private final String expectedXmlReport = "<report>Sales Report</report>";
    private final String expectedPdfReport = "PDF DOCUMENT: Sales Report";
    private final String expectedCsvReport = "REPORT, Sales Report";
    private final String expectedExcelReport = "EXCEL SHEET: Sales Report";
    private final String expectedWordReport = "WORD DOCUMENT: Sales Report";
    private final String reportData = "Sales Report";

    @Test
    void shouldGenerateHtmlReport() {
        ReportService reportService = new ReportService(new HtmlReportStrategy());
        String htmlResult = reportService.generateReport(reportData);
        assertEquals(expectedHtmlReport, htmlResult);
    }

    @Test
    void shouldGenerateJsonReport() {
        ReportService reportService = new ReportService(new JsonReportStrategy());
        String jsonResult = reportService.generateReport(reportData);
        assertEquals(expectedJsonReport, jsonResult);
    }

    @Test
    void shouldGenerateXmlReport() {
        ReportService reportService = new ReportService(new XmlReportStrategy());
        String xmlResult = reportService.generateReport(reportData);
        assertEquals(expectedXmlReport, xmlResult);
    }

    @Test
    void shouldGeneratePdfReport() {
        ReportService reportService = new ReportService(new PdfReportStrategy());
        String pdfResult = reportService.generateReport(reportData);
        assertEquals(expectedPdfReport, pdfResult);
    }

    @Test
    void shouldGenerateCsvReport() {
        ReportService reportService = new ReportService(new CsvReportStrategy());
        String csvResult = reportService.generateReport(reportData);
        assertEquals(expectedCsvReport, csvResult);
    }

    @Test
    void shouldGenerateExcelReport() {
        ReportService reportService = new ReportService(new ExcelReportStrategy());
        String excelResult = reportService.generateReport(reportData);
        assertEquals(expectedExcelReport, excelResult);
    }

    @Test
    void shouldGenerateWordReport() {
        ReportService reportService = new ReportService(new WordReportStrategy());
        String wordResult = reportService.generateReport(reportData);
        assertEquals(expectedWordReport, wordResult);
    }
}
