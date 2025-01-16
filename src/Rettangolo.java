public class Rettangolo implements Forma {
    private Integer base;
    private Integer altezza;

    public Rettangolo(Integer base, Integer altezza) {
        this.base = base;
        this.altezza = altezza;
    }
    public Integer calcolaArea() {
        return base * altezza;}
}

