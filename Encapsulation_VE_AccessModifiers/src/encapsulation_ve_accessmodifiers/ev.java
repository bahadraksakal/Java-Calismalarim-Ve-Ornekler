
package encapsulation_ve_accessmodifiers;

public class ev {
    private String belge = "private gizli belge // yalnızca bu class tan";

    private void kasa() {
        System.out.println("private kasaya erişfildi // yalnızca sınıf içinden");
    }

    public ev() {
        this.kasa();
        System.out.println(this.belge);
    }
}
