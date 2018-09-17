/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package star.wars;


import javax.swing.JFrame;

/**
 *
 * @author 805452
 */
public class StarWars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame j = new JFrame("star wars");
        Space c = new Space();
        j.add(c);
        j.setSize(1200,960);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
     
       
        j.pack();
        j.setVisible(true);
        j.setLocationRelativeTo(null);

    }
      Public class space extends Jpanel {
          @Override
          public void paintcomponent (Graphics g) {
              super.paintcomponent(g);
              this.setbackground(color.BLACK);
              
              g.setColor(Color.YELLOW);
              
              for (int i = 0; i <200; i++) {
                  
                  x += marginX;
                  y += marginY;
                  repaint();
                  System.out.println(x+""+y);
                  if ( x > 1100 || y > 860) {
              }
                      
              
          }
      }
}
