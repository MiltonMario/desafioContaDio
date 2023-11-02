import javax.swing.JOptionPane;

public class ContaTerminal {

	
	public static void main(String[] args) {

		String nomeCliente;
		String agenciaConta;
		int numeroConta;
		Double saldo;
		String mensagemFinal;
		
		nomeCliente = JOptionPane.showInputDialog(null, "Por favor, digite o seu nome: ");
		agenciaConta = JOptionPane.showInputDialog(null, "Digite o número da sua agência: ");
		numeroConta = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número da sua conta: "));
		saldo = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o seu saldo: "));
		
		mensagemFinal = "Olá " + nomeCliente + " , obrigado por criar uma conta em nosso banco, sua agência é " + agenciaConta + ", conta " + numeroConta + " e seu saldo R$ " + saldo + " já está disponível para saque";
		
		JOptionPane.showMessageDialog(null, mensagemFinal);
		
	}
}
