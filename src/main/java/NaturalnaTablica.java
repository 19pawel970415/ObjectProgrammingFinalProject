public class NaturalnaTablica<T> {

    private static int iloscTablic;
    private T[] tab;
    private int wymiar;
    private boolean isMoreThanTwo;

    public NaturalnaTablica(T[] tab, int wymiar) {
        this.tab = tab;
        this.wymiar = wymiar;
        iloscTablic++;
    }

    public NaturalnaTablica(T[] tab) {
        this.tab = tab;
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
        System.out.println("Jestem obiektem klasy NaturalnaTablica.");
    }

    public int getWymiar() {
        return wymiar;
    }

    public boolean isMoreThanTwo() {
        return isMoreThanTwo;
    }

    public String getTabElemsAsText() {
        String tabElemsAsText = "";
        for (int i = 0; i < this.tab.length; i++) {
            tabElemsAsText = tabElemsAsText + this.tab[i].toString();
        }
        return tabElemsAsText;
    }

    @Override
    public String toString() {
        if (iloscTablic > 2) {
            isMoreThanTwo = true;
        } else {
            isMoreThanTwo = false;
        }
        return String.valueOf(iloscTablic);
    }
}
