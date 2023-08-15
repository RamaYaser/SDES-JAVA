
package testjavaframe;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Description extends javax.swing.JFrame {
    ArrayList<String> arr = new ArrayList<String>();

    
    
    public Description() {
        initComponents();
        key_generation();
            try { 
           File myObj = new File("binaryCipher.txt");
           Scanner myReader = new Scanner(myObj);
          while (myReader.hasNext()) {
                String data = myReader.next();
                data=fk(permutationIP(data),Text.key4);
                arr.add(data);
                jTextArea1.setText(jTextArea1.getText() +setStringtoASCII(data));
          }
   
      myReader.close();

        }
            catch (FileNotFoundException ex) {
        }
      catch(IOException e) {
            System.out.println("There is IOException!");
        }         
        

    }                 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Description Frame");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Yu Mincho", 1, 24)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 153, 0));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setFont(new java.awt.Font("Yu Mincho", 0, 24)); // NOI18N
        jButton1.setText("Decrypt again");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Yu Mincho", 0, 24)); // NOI18N
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Mincho", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText(" Plaintext");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Yu Mincho", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setText("Decryption times: 1");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(112, 112, 112)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addComponent(jLabel1)))
                .addGap(0, 149, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(77, 77, 77))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1021, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 12, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 821, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 13, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int count=1;

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(count>=4){
         JOptionPane.showMessageDialog(null,"this button is no longer avalabile");
        }
        else{
        count++;
        jLabel2.setText("Decryption times: "+count);
        decrypted();
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Description.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Description.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Description.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Description.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Description().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

  void decrypted(){
      if(count==2){
          jTextArea1.setText("");
          for(int i=0 ; i<arr.size() ; i++){
              arr.set(i, fk( SW2(arr.get(i)) ,Text.key3) );
               jTextArea1.setText(jTextArea1.getText() +setStringtoASCII(arr.get(i)));
          }
      }
      else if(count==3){
          jTextArea1.setText("");
           for(int i=0 ; i<arr.size() ; i++){
                  arr.set(i, fk( SW2(arr.get(i)) ,Text.key2) );
                   jTextArea1.setText(jTextArea1.getText() +setStringtoASCII(arr.get(i)));
              }
      }
      else{
          jTextArea1.setText("");
            try {
             FileWriter fr=new FileWriter("plainTextDec.txt");
             fr.flush();
             for(int i=0 ; i<arr.size() ; i++){
                  arr.set(i, permutationIPinverse(fk(SW2(arr.get(i)) ,Text.key1)) );
                   jTextArea1.setText(jTextArea1.getText() +setStringtoASCII(arr.get(i)));
              }
             fr.write(jTextArea1.getText());
             fr.close();
        }
            catch (FileNotFoundException ex) {
        }
      catch(IOException e) {
            System.out.println("There is IOException!");
        }
      }
    }   
  
  
    //IP method 
     public static String permutationIP (String str){
        String cipher="";
        for(int i=0; i<8; i++){
            cipher+=str.charAt(Text.IP[i]-1);
        }
       return cipher;
    }  //end  IP method
   
    //IP inverse method
    public static String permutationIPinverse (String str){
        String cipher="";
        for(int i=0; i<8; i++){
            cipher+=str.charAt(Text.IP_inv[i]-1);
        }
       return cipher;
    }  //end  IP inverse method
    
    //convert method from binary to text
    static int binaryToDecimal(String n) {
    String num = n;
 
    // Stores the decimal value
    int dec_value = 0;
 
    // Initializing base value to 1
    int base = 1;
 
    int len = num.length();
    for (int i = len - 1; i >= 0; i--) {
 
        // If the current bit is 1
        if (num.charAt(i) == '1')
            dec_value += base;
        base = base * 2;
    }
 
    // Return answer
    return dec_value;
}
    static String setStringtoASCII(String str){
    // To store size of s
    int N = (str.length());
 
    if (N % 8 != 0) {
        return "Not Possible!";
    }
 
    // To store final answer
    String res = "";
 
    // Loop to iterate through String
    for (int i = 0; i < N; i += 8) {
        int decimal_value
            = binaryToDecimal((str.substring(i, 8+i)));
 
        // Apprend the ASCII character
        // equivalent to current value
        res += (char)(decimal_value);
    }
 
    // Return Answer
    return res;
}  //end of convert method
    
    // method of set text area in gui frame  
  void showText(){
      try { 
           File myObj = new File("plainText2.txt");
      Scanner myReader = new Scanner(myObj);
      
          while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
       jTextArea1.setText(data);
         }
      myReader.close();
        }
            catch (FileNotFoundException ex) {
        }
      catch(IOException e) {
            System.out.println("There is IOException!");
        }         
  }  //end showText
  
  //convert cipher text to binary text
  void convertFile(){
      try {
           File myObj = new File("plainText.txt");
      Scanner myReader = new Scanner(myObj);
      
      FileWriter fw = new FileWriter("binary.txt");
      fw.flush();
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
          fw.write(strToBinary(data));
         }
      myReader.close(); 
      
      fw.close();
      
        }
            catch (FileNotFoundException ex) {
            
        }
      catch(IOException e) {
            System.out.println("There is IOException!");
        }
  }    // end of convert method
  
  //convert cipher text to binary text
         static String strToBinary(String s){
        int n = s.length();
        String ss="";
        for (int i = 0; i < n; i++)
        {
            // convert each char to
            // ASCII value
            int val = Integer.valueOf(s.charAt(i));

            // Convert ASCII value to binary
            String bin = "";
            String bin1="0";
            while (val > 0)
            {
                if (val % 2 == 1)
                {
                    bin += '1';
                }
                else
                    bin += '0';
                val /= 2;
            }
            bin = reverse(bin);
            bin1+=bin;
            if(bin1.length()<8){
                for(int j=bin1.length();j<8;j++)
                    ss+="0";
            }
          ss+=bin1+" ";
        }
        return ss;
    }
         static String reverse(String input){
        char[] a = input.toCharArray();
        int l, r = 0;
        r = a.length - 1;
 
        for (l = 0; l < r; l++, r--)
        {
            // Swap values of l and r
            char temp = a[l];
            a[l] = a[r];
            a[r] = temp;
        }
        return String.valueOf(a);
    }  // end of convert methods
         
         // 4 keys generation method 
  void key_generation() {
        int key_[] = new int[10];
 
        for (int i = 0; i < 10; i++) {  //key after p10
            key_[i] = Text.key[Text.P10[i] - 1];
        }
 
        int Ls[] = new int[5];
        int Rs[] = new int[5];
 
        for (int i = 0; i < 5; i++) {
            Ls[i] = key_[i];
            Rs[i] = key_[i + 5];
        }
 
        int[] Ls_1 = shift(Ls, 1);
        int[] Rs_1 = shift(Rs, 1);
 
        for (int i = 0; i < 5; i++) {
            key_[i] = Ls_1[i];
            key_[i + 5] = Rs_1[i];
        }
 
        for (int i = 0; i < 8; i++) {
            Text.key1+= key_[Text.P8[i] - 1]; 
        }
 
        int[] Ls_2 = shift(Ls, 2);
        int[] Rs_2 = shift(Rs, 2);
 
        for (int i = 0; i < 5; i++) {
            key_[i] = Ls_2[i];
            key_[i + 5] = Rs_2[i];
        }
 
        for (int i = 0; i < 8; i++) {
            Text.key2+= key_[Text.P8[i] - 1];
        }
         
        int[] Ls_3 = shift(Ls, 3);
        int[] Rs_3 = shift(Rs, 3);
 
        for (int i = 0; i < 5; i++) {
            key_[i] = Ls_3[i];
            key_[i + 5] = Rs_3[i];
        }
 
        for (int i = 0; i < 8; i++) {
            Text.key3+= key_[Text.P8[i] - 1];
        } 
        int[] Ls_4 = shift(Ls, 4);
        int[] Rs_4 = shift(Rs, 4);
 
        for (int i = 0; i < 5; i++) {
            key_[i] = Ls_4[i];
            key_[i + 5] = Rs_4[i];
        }
 
        for (int i = 0; i < 8; i++) {
            Text.key4 += key_[Text.P8[i] - 1];
        }
    }  //end of keys generation
//shifting method  
  int[] shift(int[] ar, int n){
        while (n > 0) {
            int temp = ar[0];
            for (int i = 0; i < ar.length - 1; i++) {
                ar[i] = ar[i + 1];
            }
            ar[ar.length - 1] = temp;
            n--;
        }
        return ar;
    }  //end of shifting method
           public static String SW2(String data){
        return   data.substring(4,8) + data.substring(0,4);
      
    }

    public static String fk(String input,String key){
        String rs="";
        String ls="";
        for(int i=0;i<4;i++){
            ls+=input.charAt(i);
            rs+=input.charAt(i+4);
        }
        String E_P=expantion(rs,Text.EP);
        String temp1=XOR(E_P,key,8);
        String ls2="";
        String rs2="";
        for(int i=0;i<4;i++)
        {
            ls2+=temp1.charAt(i);
            rs2+=temp1.charAt(i+4);
        }
        String temp2=shrinking(ls2, Text.S0)+shrinking(rs2, Text.S1);
        String temp3=permutation4(temp2,Text.P4);
        String final_result=""+XOR(temp3,ls,4)+rs;


        return final_result;
    }
    
    public static String expantion(String left, int[] EP){
        char []lft=left.toCharArray();
        String expantion="";
        for(int i=0;i<EP.length;i++)
            expantion+=lft[EP[i]-1];
        return expantion;
    }
    public static String permutation4(String input,int[] p4){
       String result="";
       for(int i=0;i<4;i++){
           result+=input.charAt(p4[i]-1);
       }
       return result;
    }
  public static String XOR(String input1,String input2,int bits){
        String result="";
        for(int i=0;i<bits;i++){
            if(input1.charAt(i)!=input2.charAt(i))
                result+="1";
            else
                result+="0";
        }
        return result;
    }
    public static String shrinking(String input, int[][]arr){
        char in[]=input.toCharArray();
        String []numbers={"00","01","10","11"};
        HashMap<String,Integer> map=new HashMap<String,Integer>();
        for(int i=0;i<4;i++)
            map.put(numbers[i],i);
         
        String x1="";
        String x2="";
        x1+=in[0];
        x1+=in[3];
        x2+=in[1];
        x2+=in[2];  
        int num=arr[map.get(x1)][map.get(x2)];
        for(int i=0;i<4;i++){
            if(map.get(numbers[i])==num)
                return numbers[i];        
        }
        return "";
    }
    public static String permutation4(String input1,String input2){
       return ""+input1.charAt(1)+input2.charAt(1)+input2.charAt(0)+input1.charAt(0);
    }
    
}