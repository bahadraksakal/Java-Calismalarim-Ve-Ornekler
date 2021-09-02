package enum_kavrami;

enum Gunler
{
    PAZARTESİ(1), 
    SALI(2), 
    ÇARŞAMBA(3), 
    PERŞEMBE(4), 
    CUMA(5), 
    CUMARTESİ(6), 
    PAZAR(7);
    
    private int gunindisi;
    
    private Gunler(final int gunindisi) {
        this.gunindisi = gunindisi;
    }
    
    int getGunİndisi() {
        return this.gunindisi;
    }
    
    static void Uyari() {
        System.out.println("metotlar ile i\u015flem yap\u0131n\u0131z obje elemanlar\u0131 private durumdad\u0131r");
    }
    
    private static Gunler[] Values() {
        return new Gunler[] { Gunler.PAZARTESİ, Gunler.SALI, Gunler.ÇARŞAMBA, Gunler.PERŞEMBE, Gunler.CUMA, Gunler.CUMARTESİ, Gunler.PAZAR };
    }
}
