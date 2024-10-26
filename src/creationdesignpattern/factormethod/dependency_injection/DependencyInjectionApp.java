package creationdesignpattern.factormethod.dependency_injection;

public class DependencyInjectionApp {
    public static void run() {
        System.out.println("===== DependencyInjection ===== ");

        // Create a factory object
        ReportFactory reportFactory = new ReportFactory();
        ReportService reportService = new ReportService(reportFactory);

        reportService.generateReport("PDF");
        reportService.generateReport("HTML");
    }
}
