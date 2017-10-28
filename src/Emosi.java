/**
 *
 * @author banyu
 */
public class Emosi {
    public static double emosi;
    
    public static double sangatrendah(){
        if (emosi <= 36 ) return 1;
        else if (emosi > 36 && emosi < 40) return (40-emosi)/4;
        else return 0;
    }
    public static double rendah(){
        if (emosi > 36 && emosi <= 40) return (emosi-36)/4;
        else if (emosi >= 40 && emosi <=50 ) return 1;
        else if (emosi > 50 && emosi < 61) return (61-emosi)/11;
        else return 0;
    }
    public static double sedang(){
        if (emosi < 61 && emosi > 50) return (emosi-50)/11;
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
