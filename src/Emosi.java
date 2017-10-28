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
        else if (emosi == 40 ) return 1;
        else if (emosi > 40 && emosi < 50) return (50-emosi)/10;
        else return 0;
    }
    public static double sedang(){
        if (emosi < 50 && emosi > 40) return (emosi-50)/10;
        else if (emosi >=50 && emosi <= 65) return 1;
        else if (emosi > 65 && emosi < 75 )return (75-emosi)/10;
        else return 0;
    }
    public static double tinggi(){
        if (emosi >= 75) return 1;
        else if (emosi>65 && emosi < 75) return (emosi-65)/10;
        else return 0;
    }
}
