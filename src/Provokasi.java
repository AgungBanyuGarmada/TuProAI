/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author banyu
 */
public class Provokasi {
    public static double provokasi;
    public static double rendah(){
        if (provokasi <= 43 ) return 1;
        else if (provokasi >43 && provokasi < 65) return (provokasi-43)/22;
        else return 0;
    }
    public static double sedang(){
        if (provokasi < 65 && provokasi > 43) return -(provokasi-65)/22;
        else if (provokasi == 65 ) return 1;
        else if (provokasi > 65 && provokasi < 70 )return (provokasi-65)/5;
        else return 0;
    }
    public static double tinggi(){
        if (provokasi >65 && provokasi < 70) return -(provokasi-65)/5;
        else if (provokasi >= 70 && provokasi <= 75) return 1;
        else if (provokasi>75 && provokasi < 90) return (provokasi-75)/15;
        else return 0;
    }
    public static double sangatTinggi(){
        if (provokasi >= 90) return 1;
        else if (provokasi>75 && provokasi < 90) return -(provokasi-90)/15;
        else return 0;
    }
}
