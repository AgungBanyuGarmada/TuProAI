/**
 *
 * @author banyu
 */
public class Provokasi {
    public static double provokasi;
    public static double rendah(){
        if (provokasi <= 43 ) return 1;
        else if (provokasi >43 && provokasi < 55) return (55-provokasi)/12;
        else return 0;
    }
    public static double sedang(){
        if (provokasi < 55 && provokasi > 43) return (provokasi-43)/12;
        else if (provokasi >= 55 && provokasi <=60) return 1;
        else if (provokasi > 60 && provokasi < 75 )return (75-provokasi)/15;
        else return 0;
    }
    public static double tinggi(){
        if (provokasi >60 && provokasi < 75) return (provokasi-60)/15;
        else if (provokasi == 75) return 1;
        else if (provokasi>75 && provokasi < 78) return (78-provokasi)/3;
        else return 0;
    }
    public static double sangatTinggi(){
        if (provokasi >= 78) return 1;
        else if (provokasi>75 && provokasi < 78) return (provokasi-75)/3;
        else return 0;
    }
}
