package kumeler_basic_odev;

import java.util.ArrayList;


class kume {
    ArrayList list = new ArrayList();

    public kume(int[] a) {
        for (int i = 0; i < a.length; ++i) {
            this.list.add(a[i]);
        }
    }

    public void ekle(int eklenecek) {
        this.list.add(eklenecek);
    }

    public void yazdir() {
        System.out.print("K\u00fcme: ");
        for (int i = 0; i < this.list.size(); ++i) {
            System.out.print("[" + this.list.get(i) + "]");
        }
        System.out.println("");
    }

    public void sil(Object silinecek) {
        this.list.remove(silinecek);
    }

    public int compareTo(kume kume) {
        ArrayList ortakelemanlar = new ArrayList(this.list);
        int temp = 0;
        ortakelemanlar.retainAll(kume.list);
        temp = ortakelemanlar.size() == this.list.size() && ortakelemanlar.size() == kume.list.size() ? 1 : 0;
        return temp;
    }
}
