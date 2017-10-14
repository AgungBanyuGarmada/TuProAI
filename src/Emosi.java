/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author banyu
 */
public class Emosi {
    public static double emosi;
    public static double rendah(){
        if (emosi <= 40 ) return 1;
        else if (emosi > 40 && emosi <= 60) return (emosi-40)/20;
        else return 0;
    }
    public static double sedang(){
        if (emosi < 60 && emosi > 40) return (emosi-40)/20;
        else if (emosi >=60 && emosi <= 70) return 1;
        else if (emosi > 70 && emosi <= 85 )return (emosi-70)/15;
        else return 0;
    }
    public static double tinggi(){
        if (emosi > 85) return 1;
        else if (emosi>70 && emosi <= 85) return (emosi-70)/15;
        else return 0;
    }
}
