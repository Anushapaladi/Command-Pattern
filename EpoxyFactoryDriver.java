public class EpoxyFactoryDriver {
    public static void main(String[] args) {
        OrderEpoxy orderEpoxy = new OrderEpoxy("metallic");
        orderEpoxy.execute();
        Epoxy epoxy = orderEpoxy.getEpoxy();
        System.out.println(epoxy + "\n");

        orderEpoxy = new OrderEpoxy("flakes");
        orderEpoxy.execute();
        epoxy = orderEpoxy.getEpoxy();
        System.out.println(epoxy + "\n");
    }
}
