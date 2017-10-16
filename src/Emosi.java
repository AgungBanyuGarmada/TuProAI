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
        if (emosi <= 41 ) return 1;
        else if (emosi > 41 && emosi < 61) return (61-emosi)/20;
        else return 0;
    }
    public static double sedang(){
        if (emosi < 61 && emosi > 41) return (emosi-41)/20;
        else if (emosi >=61 && emosi <= 70) return 1;
        else if (emosi > 70 && emosi < 85 )return (85-emosi)/15;
        else return 0;
    }
    public static double tinggi(){
        if (emosi >= 85) return 1;
        else if (emosi>70 && emosi < 85) return (emosi-70)/15;
        else return 0;
    }
}
