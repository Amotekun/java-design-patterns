package creationdesignpattern.factormethod.dependency_injection;

public class ReportService {
    private final ReportFactory reportFactory;

    // Constructor injection of the factory
    public ReportService(ReportFactory reportFactory) {
        this.reportFactory = reportFactory;
    }

    public void generateReport(String format) {
        Object report = reportFactory.createReport(format);

        if (report instanceof PDFReport) {
            ((PDFReport) report).generate();
        } else if (report instanceof HTMLReport) {
            ((HTMLReport) report).generate();
        }
    }
}
