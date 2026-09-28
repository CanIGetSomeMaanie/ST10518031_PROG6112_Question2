public abstract class Consoles implements iConsoles {
    //abstract class, never instantiated directly

    private String consoleType;
    private String store;
    private int totalSales;

    //Constructor stores the row inputs
    public Consoles(String consoleType, String store, int totalSales) {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }

    //get methods
    @Override
    public String getConsoleType() {
        return consoleType;
    }

    @Override
    public String getStore() {
        return store;
    }

    @Override
    public int getTotalSales() {
        return totalSales;
    }

    public abstract void printReport();
}