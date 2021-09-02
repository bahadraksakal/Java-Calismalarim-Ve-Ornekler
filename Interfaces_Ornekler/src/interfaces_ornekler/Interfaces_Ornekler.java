package interfaces_ornekler;


public class Interfaces_Ornekler {

  
    public static void main(String[] args) {
        mehmet mehmet_cakir = new mehmet();
        mehmet_cakir.konus();
        mehmet_cakir.cogal();
        mehmet_cakir.nefesal();
        sinif1 a1 = new sinif1();
        sinif2 b2 = new sinif2();
        a1.metod1();
        a1.who();
        b2.metod2();
        b2.who();
        Tavsan Davsan = new Tavsan();
        Timsah Avust_timsahi = new Timsah();
        Davsan.avlan();
        Davsan.nefesal();
        Avust_timsahi.nefesal();
        Avust_timsahi.surun();
        Avust_timsahi.avlan();
    }
    
}

interface arayuz1 {
    default public void who() {
        System.out.println("Ben arayuz1 im");
    }
    
    public interface arayuz2
    {
        void metod2();
        
        default void who() {
            System.out.println("Ben arayuz 2 yim");
        }
    }

    public void metod1();
}

interface canli {
    default public void nefesal() {
        System.out.println("nefes aliniyor- canli");
    }

    default public void cogal() {
        System.out.println("mehmet çoğalıyor");
    }
}

interface Hayvan extends canli{
    
    public void avlan();
}

interface insan {
    
    default public void nefesal() {
        System.out.println("nefes aliniyor - insan");
    }

    public void konus();
}

interface Interface_Genisletme {
    
    public void bosluk();
}

class mehmet implements insan, canli {
    
    mehmet() {
    }

    @Override
    public void konus() {
        
        System.out.println("mehmet konusuyor");
    }

    @Override
    public void nefesal() {
        
        canli.super.nefesal();
    }
}

class sinif1 implements arayuz1 {
    
    sinif1() {
    }

    @Override
    public void metod1() {
        System.out.println("Ben Metof 1 im arayuz 1 den çağrılım");
    }
}

class sinif2 implements arayuz1.arayuz2 {
    
    sinif2() {
    }

    public void metod2() {
        System.out.println("Ben metot 2 yim arayuz 2 den çağrıldım");
    }
    
}

interface surungen extends Hayvan {
    
    public void surun();
}

class Tavsan implements Hayvan {
    
    Tavsan() {
    }

    @Override
    public void nefesal() {
        System.out.println("Ben tavsanım ve nefes alıyorum");
    }

    @Override
    public void avlan() {
        System.out.println("Ben tavsanım ve avlanıyorum");
  
    }
}
class Timsah implements surungen {
    
    Timsah() {
    }

    @Override
    public void surun() {
        System.out.println("Surunuyorum");
    }

    @Override
    public void avlan() {
        System.out.println("Ben timsahım ve avlanıyorum");
    }

    @Override
    public void nefesal() {
        System.out.println("Ben timsahım ve nefes alıyorum");
    }
}
