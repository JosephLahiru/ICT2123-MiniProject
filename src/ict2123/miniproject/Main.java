package ict2123.miniproject;

import javax.swing.SwingUtilities;

/**
 * @author Joseph Rasanjana
 */

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                IndexPage index = new IndexPage();
                index.show();
            }
        });
    }
    
}
