public class NT2<T> extends NaturalnaTablica {

    public NT2(T[] tab, int wymiar) {
        super(tab, wymiar);
    }

    public NT2(T[] tab) {
        super(tab);
    }

    @Override
    public void przedstawSie() {
        System.out.println("Jestem obiektem klasy NT2");
    }
}
