public class Main {
    public static void main(String[] args) {
        Gojek g = new Gojek();
        Driver d = new Driver();
        Penumpang p = new Penumpang();

        d.setNamdriv("Dudung");
        d.setHp(85321454);
        d.setNo("E 321 NJ");
        d.setType("Avanza");
        p.setNama("Kirani");
        p.setNum(8191000);
        p.setTujuan("Indramayu");
        g.setJarak(5);
        g.getJarak();

        System.out.println("Driver              : "+d.getNamdriv());
        System.out.println("No Hp               : "+d.getHp());
        System.out.println("Type Mobil          : "+d.getType());
        System.out.println("Plat                : "+d.getNo());
        System.out.println("Tujuan              : "+p.getTujuan());
        System.out.println("Dipesan atas nama   : "+p.getNama());
        System.out.println("No Hp               : "+p.getNum());
        System.out.println("Total Pembayaran    : "+g.getHarga());



    }
}