public class NaturalnaTablica {

    private static int iloscTablic;
    private Object[] tab;
    private int wymiar;

    public NaturalnaTablica(int wymiar) {
        this.tab = new Object[wymiar];
        this.wymiar = wymiar;
        iloscTablic++;
    }

    public NaturalnaTablica() {
        this.tab = new Object[5];
        this.wymiar = 5;
        iloscTablic++;
    }

    /*

    Destructors are not used in Java.
    A garbage collector is a program that runs on the Java virtual machine to recover
    the memory by deleting the objects which are no longer in use or have finished their life-cycle.
    We can use object.finalize() method as an alternative if it is really needed in this project.
    It works exactly like a destructor in Java.

    */

    public void finalize() throws Throwable{
        System.out.println("System.Windows.Forms.MessageBox.Show(Obiekt jest niszczony)");
        iloscTablic--;
    }

    public void przedstawSie() {
        System.out.println("Jestem obiektem klasy NaturalnaTablica. W tym momencie ilosc tablic wynosi " + iloscTablic);
    }

    public int getWymiar() {
        return wymiar;
    }
}
