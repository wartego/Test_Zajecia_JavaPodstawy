package javaPodstawyProgramowanie.programyZajeciaDzien3.Task9;

public class Main {
    public static void main(String[] args) {
        OrderItem orderItem1 = new OrderItem("Cukier",3,4);
        OrderItem orderItem2 = new OrderItem("Chleb",1,3.5);
        OrderItem orderItem3 = new OrderItem("Maka",4,8.4);

        Order order = new Order(3);
        order.addItem(orderItem1);
        order.addItem(orderItem2);
//        order.addItem(orderItem2);
      //  System.out.println(order.getTotalAMount());

//        OrderItem[] orderItems = {orderItem1,orderItem2 ,orderItem3};
//        System.out.println(orderItem1.isCorrect());
//        orderItem1.print();
        order.print();
    }
}
