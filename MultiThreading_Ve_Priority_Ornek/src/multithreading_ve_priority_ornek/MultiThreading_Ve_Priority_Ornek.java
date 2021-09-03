package multithreading_ve_priority_ornek;

public class MultiThreading_Ve_Priority_Ornek {

    static int i;
    static int j;

    public static void main(String[] args) {
        Thread t1 = new Thread(){

            @Override
            public void run() {
                for (i = 0; i < 3; ++i) {
                    System.out.println("Thread 1 calisti ...");
                }
            }
        };
        t1.setPriority(1);
        Thread t2 = new Thread(){

            @Override
            public void run() {
                for (j = 0; j < 3; ++j) {
                    System.out.println("Thread 2 calisti ...");
                }
            }
        };
        t2.setPriority(10);
        boolean x = t1.isAlive();
        System.out.println("x in calisma durumu su an icin : " + x + " cunku henuz start() metodunu cagirmadik.");
        t1.start();
        t2.start();
        boolean y = t1.isAlive();
        System.out.println("y nin calisma durumu su an icin : " + y);
        System.out.println("T1'in priority degerini aldik bu da  " + t1.getPriority() + "'a esittir.");
        System.out.println("T2'in priority degerini aldik bu da  " + t2.getPriority() + "'a esittir.");
    }
}
