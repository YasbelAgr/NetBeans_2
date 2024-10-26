import javax.swing.JOptionPane;
public class Ejercicio_2 {
    public static void main(String[] args){
        short A, B, C;
            A= Short.parseShort(JOptionPane.showInputDialog("asigna un valor a A"));
            B= Short.parseShort(JOptionPane.showInputDialog("asigna un valor a B"));
            C= Short.parseShort(JOptionPane.showInputDialog("asogna un valor a C"));
            if (A>B & A>C){
                JOptionPane.showMessageDialog(null, "A es el mayor");
            }else if (B>A & B>C) {
                JOptionPane.showMessageDialog(null, "B es el mayor");
            }else{
                JOptionPane.showMessageDialog(null, "C es el mayor");
            }
        
        }    
}    

