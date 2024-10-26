package creationdesignpattern.factormethod.dependency_injection;

public class ReportFactory {
    public Object createReport(String format) {
        if ("PDF".equalsIgnoreCase(format)) {
            return new PDFReport();
        } else if ("HTML".equalsIgnoreCase(format)) {
            return new HTMLReport();
        } else {
            throw new IllegalArgumentException("Unsupported report format: " + format);
        }
    }
}
