import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args) {
		int firstNum, secondNum, option, result;
		
		
		do{
			option = Integer.parseInt(JOptionPane.showInputDialog("Escolha:" +"\n"+"0 - sair"+"\n"+""1 - soma""+
"\n"+"2 - subtração"));
			
			if(option == 1) {
				firstNum = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
				secondNum = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
				result = firstNum + secondNum;
				JOptionPane.showMessageDialog(null, "O resultado da soma é " + result);
			}

			if(option == 2) {
				firstNum = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
				secondNum = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
				result = firstNum - secondNum;
				JOptionPane.showMessageDialog(null, "O resultado da subtração é " + result);
			}
		}while(option != 0);

	}

}
