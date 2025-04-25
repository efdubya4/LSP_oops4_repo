package src.org.howard.edu.lspfinal.question3;

public class Driver {
    public static void main(String[] args) {
        ReportGenerator salesReport = new SalesReport();
        ReportGenerator inventoryReport = new InventoryReport();

        salesReport.generateReport();
        System.out.println();
        inventoryReport.generateReport();
    }
}