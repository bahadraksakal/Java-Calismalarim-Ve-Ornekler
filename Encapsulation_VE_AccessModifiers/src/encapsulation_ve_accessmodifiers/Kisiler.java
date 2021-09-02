package encapsulation_ve_accessmodifiers;


public class Kisiler {
    protected String belge = "gizili belge , bu sınfıtan tücretilen class lardan ve aynı package altındaki kclasslardane erişilebilir.";

    protected void kasa() {
        System.out.println("gizli kasa alt sınıflardan ve aynı paket altından erişilebilir");
    }
}
