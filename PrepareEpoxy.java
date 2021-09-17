public class PrepareEpoxy implements Command {
    private Epoxy epoxy;
    private String type;

    public PrepareEpoxy(Epoxy epoxy, String type) {
        this.epoxy = epoxy;
        this.type = type;
    }

    @Override
    public void execute() {
        System.out.println("Preparing epoxy material");
        Material material = null;
        
        if (type.toLowerCase().contains("flakes")) {
            material = new Flakes();
        } else if (type.toLowerCase().contains("metallic")) {
            material = new Metallic();
        }

        epoxy.setMaterial(material);
    }
}
