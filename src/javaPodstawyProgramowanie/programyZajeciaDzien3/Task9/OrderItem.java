package javaPodstawyProgramowanie.programyZajeciaDzien3.Task9;

public class OrderItem {
    private String productName;
    private int quantity;
    private double price;

    public int getQuantity() {
        return quantity;
    }

    public OrderItem(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
    public double getAmount(){
     return quantity * price;
    }
    public boolean isCorrect(){
        return (quantity > 0 && price > 0);
    }
    public void print(){
       StringBuilder sb = new StringBuilder();
       sb.append(productName).append( " | ");
       sb.append(price).append(" zł ").append(" | ");
       sb.append(quantity).append(" pcs ").append(" | ");
       sb.append(getAmount()).append(" zł ");
        System.out.println(sb);
    }

}
