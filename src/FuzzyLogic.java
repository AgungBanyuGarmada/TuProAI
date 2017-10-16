
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author banyu
 */
public class FuzzyLogic extends javax.swing.JFrame implements ActionListener{
    private double EmosiRendah;
    private double EmosiSedang;
    private double EmosiTinggi;
    private double ProvokasiRendah;
    private double ProvokasiSedang;
    private double ProvokasiTinggi;
    private double ProvokasiSangatTinggi;
    private Emosi em;
    private Provokasi p;
    private double NKRendah;
    private double NKTinggi;
    private Double Hasil;
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(getOKButton()))
            NKRendah=0;
            NKTinggi=0;
            em.emosi=getEmosiField();
            p.provokasi=getProvokasiField();
            
//            if(em.emosi==45 || em.emosi==70) em.emosi++;
//            if(p.provokasi==43 || p.provokasi==75) p.provokasi++;
            
            EmosiRendah = em.rendah();
            EmosiSedang = em.sedang();
            EmosiTinggi = em.tinggi();
            
            ProvokasiRendah = p.rendah();
            ProvokasiSedang = p.sedang();
            ProvokasiTinggi = p.tinggi();
            ProvokasiSangatTinggi = p.sangatTinggi();
            
            if (EmosiRendah!=0 && ProvokasiRendah !=0){
                System.out.println("a");
                if (NKRendah< findMin(EmosiRendah,ProvokasiRendah))
                    NKRendah= findMin(EmosiRendah,ProvokasiRendah);
            }
            if (EmosiRendah!= 0 && ProvokasiSedang !=0){
                System.out.println("b");
                if (NKRendah< findMin(EmosiRendah,ProvokasiSedang))
                    NKRendah= findMin(EmosiRendah,ProvokasiSedang);
            }
            if (EmosiRendah!= 0 && ProvokasiTinggi!=0){
                System.out.println("c");
                System.out.println("Emosi Rendah" + EmosiRendah);
                System.out.println(ProvokasiTinggi);
                if (NKTinggi < findMin(EmosiRendah,ProvokasiTinggi))
                    NKTinggi = findMin(EmosiRendah,ProvokasiTinggi);
            }
            if (EmosiRendah!= 0 && ProvokasiSangatTinggi!=0){
                System.out.println("d");
                if (NKTinggi< findMin(EmosiRendah,ProvokasiSangatTinggi))
                    NKTinggi= findMin(EmosiRendah,ProvokasiSangatTinggi);
            }
            if (EmosiSedang!= 0 && ProvokasiRendah !=0){
                System.out.println("e");
                if (NKRendah< findMin(EmosiSedang,ProvokasiRendah))
                    NKRendah= findMin(EmosiSedang,ProvokasiRendah);
            }
            if (EmosiSedang!= 0 && ProvokasiSedang !=0){
                System.out.println("f");
                if (NKRendah< findMin(EmosiSedang,ProvokasiSedang))
                    NKRendah= findMin(EmosiSedang,ProvokasiSedang);
            }
            if (EmosiSedang!= 0 && ProvokasiTinggi !=0){
                System.out.println("g");
                if (NKTinggi< findMin(EmosiSedang,ProvokasiTinggi))
                    NKTinggi= findMin(EmosiSedang,ProvokasiTinggi);
            }
            if (EmosiSedang!= 0 && ProvokasiSangatTinggi!=0){
                System.out.println("h");
                if (NKTinggi< findMin(EmosiSedang,ProvokasiSangatTinggi))
                    NKTinggi= findMin(EmosiSedang,ProvokasiSangatTinggi);
            }
            if (EmosiTinggi!= 0 && ProvokasiRendah !=0){
                System.out.println("i");
                if (NKRendah< findMin(EmosiTinggi,ProvokasiRendah))
                    NKRendah= findMin(EmosiTinggi,ProvokasiRendah);
            }
            if (EmosiTinggi!= 0 && ProvokasiSedang !=0){
                System.out.println("j");
                if (NKTinggi< findMin(EmosiTinggi,ProvokasiSedang))
                    NKTinggi= findMin(EmosiTinggi,ProvokasiSedang);
            }
            if (EmosiTinggi!= 0 && ProvokasiTinggi !=0){
                System.out.println("k");
                if (NKTinggi< findMin(EmosiTinggi,ProvokasiTinggi))
                    NKTinggi= findMin(EmosiTinggi,ProvokasiTinggi);
            }
            if (EmosiTinggi!= 0 && ProvokasiSangatTinggi!=0){
                System.out.println("l");
                if (NKTinggi< findMin(EmosiTinggi,ProvokasiSangatTinggi))
                    NKTinggi= findMin(EmosiTinggi,ProvokasiSangatTinggi);
            }
            if (NKTinggi == 0) Hasil =(NKRendah*47/NKRendah); 
            else if (NKRendah ==0) Hasil =(NKTinggi*73/NKTinggi); 
            else Hasil =(NKRendah*47+NKTinggi*73)/(NKRendah+NKTinggi); 
            System.out.println("Hasil = "+Hasil);
            System.out.println(NKTinggi);
            System.out.println(NKRendah);
            if (Hasil>7) JOptionPane.showMessageDialog(this,"Berita HOAX");
            else JOptionPane.showMessageDialog(this,"Berita Benar");
            setEmosiField();
            setProvokasiField();
    }
    
    public FuzzyLogic() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        setActionListener();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane1 = new java.awt.ScrollPane();
        jSlider1 = new javax.swing.JSlider();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        OKButton = new javax.swing.JButton();
        EmosiField = new javax.swing.JSpinner();
        ProvokasiField = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FuzzyLogic", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 24))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel1.setText("Tingkat Emosi");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel2.setText("Tingkat Provokasi");

        OKButton.setText("OK");

        EmosiField.setName(""); // NOI18N
        EmosiField.setOpaque(false);

        ProvokasiField.setName(""); // NOI18N
        ProvokasiField.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(OKButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EmosiField, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(ProvokasiField))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(EmosiField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ProvokasiField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(OKButton))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String[] args) {
        FuzzyLogic FL = new FuzzyLogic();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner EmosiField;
    private javax.swing.JButton OKButton;
    private javax.swing.JSpinner ProvokasiField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSlider1;
    private java.awt.ScrollPane scrollPane1;
    // End of variables declaration//GEN-END:variables

    public void setActionListener(){
        OKButton.addActionListener(this);
//        EmosiField.addKeyListener(this);
//        ProvokasiField.addKeyListener(this);
    }

    public double findMin(Double a, Double b){
        if (a < b) return a;
        else return b;
    }
    
//    public void findMinTinggi(Double a, Double b){
//        if (a < NKTinggi)
//            NKTinggi=a;
//        if (b < NKTinggi)
//            NKTinggi=b;
//    }
    
    public double getEmosiField() {
        Object o = EmosiField.getValue();
        Number n = (Number) o;
        Double i = n.doubleValue();
        return i;        
    }

    public JButton getOKButton() {
        return OKButton;
    }

    public Double getProvokasiField() {
        Object o = ProvokasiField.getValue();
        Number n = (Number) o;
        Double i = n.doubleValue();
        return i;
    }
    
    
//    
//
//    @Override
//    public void keyTyped(KeyEvent e) {
//        char karakter = e.getKeyChar();
//        if(!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))){
//        getToolkit().beep();
//        e.consume();
//        }
//    }
//
//    @Override
//    public void keyPressed(KeyEvent e) {
//        
//    }
//
//    @Override
//    public void keyReleased(KeyEvent e) {
//        
//    }

    public void setEmosiField() {
        EmosiField.setValue(0);
    }

    public void setProvokasiField() {
        ProvokasiField.setValue(0);
    }
}
