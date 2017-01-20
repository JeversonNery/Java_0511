
package java_0511;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeverson Nery
 */
public class Java_0511 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Informe o nome do aluno: ");
        String nota_1 = JOptionPane.showInputDialog(null, "Informe a primeira nota do aluno (0 a 100)");
        double nt1 = Double.parseDouble(nota_1);
        String nota_2 = JOptionPane.showInputDialog(null, "Informe a segunda nota do aluno (0 a 100)");
        double nt2 = Double.parseDouble(nota_2);
        
        double media = (nt1+nt2)/2;
        
        JOptionPane.showMessageDialog(null, "Resultado final:" + "\nAluno: " + nome + "\nNota 1: " + nt1 + 
                "\nNota 2: " + nt2 + "\nMédia: " + media);
        
    }
    
}
