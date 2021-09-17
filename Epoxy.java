public abstract class Epoxy {
    private Material material;
    private String name;

    public Epoxy(String name) {
        this.name = name;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public String toString() {
        return material + " epoxy floor covering prepared.";
    }

}
