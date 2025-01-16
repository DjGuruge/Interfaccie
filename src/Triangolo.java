public class Triangolo implements Forma{
    private Integer base;
    private Integer altezza;

    public Triangolo(Integer base, Integer altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public Integer calcolaArea() {
        return (base * altezza)/2;}
}
