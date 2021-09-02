/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package get_set_basic_ornek;

/**
 *
 * @author bahad
 */
public class banka {
    private int hesapno;
    private String FullyetkiKODU = "3424klmflkdsmcf932\u013142\u01314jwfnewfh474v2jm&%+&gdhdo";

    banka() {
    }

    public int getHesapno() {
        return this.hesapno;
    }

    public String getFullyetkiKODU() {
        return this.FullyetkiKODU;
    }

    public void setHesapno(int hesapno) {
        this.hesapno = hesapno;
    }

    public void setFullyetkiKODU(String FullyetkiKODU) {
        this.FullyetkiKODU = FullyetkiKODU;
    }
}
