import javax.swing.*;

public class Main {
    public static void main(String[] args) {

//        String input = JOptionPane.showInputDialog("ใส่ตัวเลข1ตัว","0");
//        JOptionPane.showMessageDialog(null,input,"title",JOptionPane.INFORMATION_MESSAGE );
        int ans = JOptionPane.showConfirmDialog(null
                ,"รักหรือเปล่า"
                ,"ถามเธอว์",JOptionPane.YES_NO_OPTION);

        if(ans==JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"Rakna");

        }else{
            JOptionPane.showMessageDialog(null,"Jomwai");
        }

    }
}
