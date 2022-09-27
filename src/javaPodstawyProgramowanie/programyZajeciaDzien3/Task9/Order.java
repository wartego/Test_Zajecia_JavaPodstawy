package javaPodstawyProgramowanie.programyZajeciaDzien3.Task9;

public class Order {
    private int currentOrderItemCounter = 0;
    private int maxOrderItem ;
    private OrderItem[] orderItems;
//    OrderItem orderItem1 = new OrderItem("Cukier",3,4);
//    OrderItem orderItem2 = new OrderItem("Chleb",1,3.5);
//    OrderItem orderItem3 = new OrderItem("Maka",4,8.4);

//    OrderItem[] orderItems = {orderItem1,orderItem2 ,orderItem3};

    public Order(int maxOrderItem) {
        this.maxOrderItem = maxOrderItem;
        orderItems = new OrderItem[maxOrderItem];
    }


    boolean addItem(OrderItem orderItem){
        if (!orderItem.isCorrect()){
            System.out.println(" Item is incorrect!");
            return false;
        }
        if (currentOrderItemCounter >= maxOrderItem){
            System.out.println("Order is full");
            return false;
        }
        orderItems[currentOrderItemCounter] = orderItem;
        currentOrderItemCounter++;
      return true;
    }
    public double getTotalAMount(){
        double totalAmount = 0;
        for(OrderItem element : orderItems){
            if (element != null){
            totalAmount += element.getAmount();
        }
        }

        return totalAmount;
    }
    public int getItemsCount(){
        int total = 0;
        for(OrderItem element : orderItems){
            if(element != null ){
                total += element.getQuantity();
            }
        }
        return total;
    }
    public void print(){
        for (OrderItem element: orderItems){
            if (element != null) {
                element.print();
            }
        }
        System.out.println("Total amount: " + getTotalAMount());
        System.out.println("Count: " + getItemsCount());
    }
}
