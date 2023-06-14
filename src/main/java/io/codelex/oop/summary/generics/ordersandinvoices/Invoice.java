package io.codelex.oop.summary.generics.ordersandinvoices;

import java.text.DecimalFormat;
import java.util.List;

public class Invoice {

    private final Order order;
    private final String invoiceNumber;
    private final double priceWithoutVAT;
    private final double priceWithVAT;
    private final double VAT = 0.21;
    private InvoiceStatus invoiceStatus;
    private final int WIDTH = 50;

    public Invoice(Order order, String invoiceNumber) throws WrongOrderException {
        this.order = order;
        List<SellableThing> itemList = order.getItemList();
        if (itemList.isEmpty()) {
            throw new WrongOrderException("ERROR: order is empty!");
        }
        this.invoiceNumber = invoiceNumber;
        this.priceWithoutVAT = itemList.stream().mapToDouble(SellableThing::getPrice).sum();
        this.priceWithVAT = (this.priceWithoutVAT * VAT) + this.priceWithoutVAT;
        this.invoiceStatus = InvoiceStatus.APPROVED;
    }

    public String getInvoiceText() {
        String symbol = "=";
        String topBottom = symbol.repeat(WIDTH + 1);
        DecimalFormat df = new DecimalFormat("0.00");

        String[] products = order.itemsToString().split("\n");
        StringBuilder invoiceProductList = new StringBuilder();
        for (String product : products) {
            invoiceProductList.append(formatInvoiceLine(symbol, " ", product));
        }
        return topBottom + "\n"
                + formatInvoiceLine(symbol, " INVOICE NUMBER ", invoiceNumber)
                + formatInvoiceLine(symbol, " STATUS: ", invoiceStatus)
                + invoiceProductList
                + formatInvoiceLine(symbol, " SUM: ", priceWithoutVAT + " EUR")
                + formatInvoiceLine(symbol, " VAT (21%): ", df.format(priceWithoutVAT * VAT) + " EUR")
                + formatInvoiceLine(symbol, " TOTAL: ", df.format(priceWithVAT) + " EUR")
                + topBottom;
    }

    private <T> String formatInvoiceLine(String symbol, String displayText, T dataText) {
        String space = " ";
        String invoiceLine = symbol + displayText + dataText;
        return invoiceLine + space.repeat(WIDTH - invoiceLine.length()) + symbol + "\n";
    }

    public void send() {
        this.invoiceStatus = InvoiceStatus.SENT;
    }
}
