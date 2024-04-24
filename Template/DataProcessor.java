abstract class DataProcessor {
    // Template method
    public final void process() {
        readData();
        processData();
        writeData();
    }

    // Concrete methods
    private void readData() {
        System.out.println("Reading data...");
    }

    private void writeData() {
        System.out.println("Writing data...");
    }

    // Abstract method to be implemented by subclasses
    protected abstract void processData();
}
