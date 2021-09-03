/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance_mirasalma_extend;

/**
 *
 * @author bahad
 */
public class sekil {
    protected String ad;
    protected final int KOSE;
    protected final int KOSEGEN;
    protected final int IC_ACI_TOPLAMI;

    public sekil(String ad, int KOSE) {
        this.ad = ad;
        this.KOSE = KOSE;
        this.KOSEGEN = KOSE * (KOSE - 3) / 2;
        this.IC_ACI_TOPLAMI = 180 * (KOSE - 2);
    }

    @Override
    public String toString() {
        return this.KOSE + " koseli düzgün geometrik şeklin adı: " + this.ad + "\nbu seklin " + this.KOSEGEN + " adet  kosegeni vardır \niç açıları toplamı " + this.IC_ACI_TOPLAMI + " derecedir";
    }

    public String toString(String x) {
        return super.toString();
    }
}
