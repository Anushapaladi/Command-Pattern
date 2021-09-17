public class OrderEpoxy implements Command {
    private Epoxy epoxy;
    private String type;

    public OrderEpoxy(String type) {
        this.type = type;
    }

    @Override
    public void execute() {
        if (type.toLowerCase().contains("flakes")) {
            epoxy = new FlakesEpoxy();
        } else if (type.toLowerCase().contains("metallic")) {
            epoxy = new MetallicEpoxy();
        }

        PrepareEpoxy prepareEpoxy = new PrepareEpoxy(epoxy, type);
        prepareEpoxy.execute();
    }

    public Epoxy getEpoxy() {
        return epoxy;
    }
}
