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
        int width = 50;
        String symbol = "=";
        String topBottom = symbol.repeat(width + 1);

        DecimalFormat df = new DecimalFormat("0.00");

        String invoiceNumberText = symbol + " INVOICE NUMBER: " + invoiceNumber;
        String invoiceStatusText = symbol + " STATUS: " + invoiceStatus;
        String invoiceSum = symbol + " SUM: " + priceWithoutVAT + " EUR";
        String invoiceVAT = symbol + " VAT (21%): " + df.format((priceWithoutVAT * VAT)) + " EUR";
        String invoiceTotal = symbol + " TOTAL: " + df.format(priceWithVAT) + " EUR";
        String[] products = order.itemsToString().split("\n");
        StringBuilder invoiceProductList = new StringBuilder();
        for (String product : products) {
            invoiceProductList
                    .append(symbol)
                    .append(" ")
                    .append(product)
                    .append(" ".repeat(width - product.length() - 2))
                    .append(symbol)
                    .append("\n");
        }
        return topBottom + "\n"
                + invoiceNumberText + " ".repeat(width - invoiceNumberText.length()) + symbol + "\n"
                + invoiceStatusText + " ".repeat(width - invoiceStatusText.length()) + symbol + "\n"
                + invoiceProductList
                + invoiceSum + " ".repeat(width - invoiceSum.length()) + symbol + "\n"
                + invoiceVAT + " ".repeat(width - invoiceVAT.length()) + symbol + "\n"
                + invoiceTotal + " ".repeat(width - invoiceTotal.length()) + symbol + "\n"
                + topBottom;
    }

    public void send() {
        this.invoiceStatus = InvoiceStatus.SENT;
    }
}
