import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args) {
		int firstNum, secondNum, option, result;
		
		
		do{
			option = Integer.parseInt(JOptionPane.showInputDialog("Escolha:" +"\n"+"0 - sair"+"\n"+""1 - soma""+
"\n"+"2 - subtra��o"+"\n"+"3 - multiplica��o"+"\n"+"4 - divis�o"));
			
			if(option == 1) {
				firstNum = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
				secondNum = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
				result = firstNum + secondNum;
				JOptionPane.showMessageDialog(null, "O resultado da soma � " + result);
			}

			if(option == 2) {
				firstNum = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
				secondNum = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
				result = firstNum - secondNum;
				JOptionPane.showMessageDialog(null, "O resultado da subtra��o � " + result);
			}

			if(option == 3) {
				firstNum = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
				secondNum = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
				result = firstNum * secondNum;
				JOptionPane.showMessageDialog(null, "O resultado da multiplica��o� " + result);
			}

			if(option == 4) {
				firstNum = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
				secondNum = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
				result = firstNum/secondNum;
				JOptionPane.showMessageDialog(null, "O resultado da divis�o � " + result);
			}
		}while(option != 0);

	}

}
