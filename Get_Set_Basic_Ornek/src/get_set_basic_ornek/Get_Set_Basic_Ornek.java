package get_set_basic_ornek;

public class Get_Set_Basic_Ornek {

    public static void main(String[] args) {
        banka ahmetsBankAccount = new banka();
        ahmetsBankAccount.setHesapno(224653);
        System.out.println("ahmet hesap no:  " + ahmetsBankAccount.getHesapno());
        System.out.println("admin key: " + ahmetsBankAccount.getFullyetkiKODU());
    }
    
}
