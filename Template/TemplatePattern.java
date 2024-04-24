public class TemplatePattern {
    public static void main(String[] args) {
        DataProcessor csvProcessor = new CSVDataProcessor();
        csvProcessor.process();

        DataProcessor xmlProcessor = new XMLDataProcessor();
        xmlProcessor.process();

        DataProcessor jsonProcessor = new JSONDataProcessor();
        jsonProcessor.process();
    }
}
