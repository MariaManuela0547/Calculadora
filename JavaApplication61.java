//import Java.awt.Component;

import javax.swing.JOptionPane;

public class JavaApplication61 {


    public static void main(String[] args) {
        
       // Calc c = new Calc();
        
        String firstNumber = JOptionPane.showInputDialog("Enter first integer");
        String secondNumber = JOptionPane.showInputDialog("Enter second integer");
        String opcao = JOptionPane.showInputDialog("Escolha uma opção: \n 1.soma \n 2.subtração \n 3.multiplição \n 4.divisão ");

         int number1 = Integer.parseInt (firstNumber);
         int number2 = Integer.parseInt (secondNumber);
         int opc = Integer.parseInt(opcao);
      /*   
         Scanner input = new Scanbner(System.in);
         
         System.out.println("Escolha uma opção:");
         System.out.println("1.soma");
         System.out.println("2.subtração");
         System.out.println("3.multiplição");
         System.out.println("4.divisão");
        */ 
         
         if (opc == 1) {
            
         int suss = number1 + number2;
         
                                    JOptionPane.showMessageDialog(null, suss);
         }
         
         if (opc == 2){
             
             int sus = number1 - number2;
         
                                JOptionPane.showMessageDialog(null, sus);
             
             
         }
         
         
         if (opc == 3){
             
             int sum = number1 * number2;
         
                                    JOptionPane.showMessageDialog(null, sum);

      
         
    }
    
         if (opc == 4){
             
             int sud = number1 / number2;
         
   
                      JOptionPane.showMessageDialog(null, sud);
         }
    }
}