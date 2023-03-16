package Aplicativo;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa pes = new Pessoa();
		pes.setCodPessoa(Integer.parseInt(JOptionPane.showInputDialog("Informe o código da pessoa"))); 
		pes.setNomePessoa("José");
		pes.setEmailPessoa("zedapraia@gmail.com");
		pes.setIdadePessoa(22);
		pes.setCpfPessoa("48440396953");
		//pes.imprimeDados();
		System.out.println("Código : " + pes.getCodPessoa()   + "\n" +
		           "Nome ..: " + pes.getNomePessoa()  + "\n" +
		           "Email..: " + pes.getEmailPessoa() + "\n" +
		           "Idade..: " + pes.getIdadePessoa() + "\n" +
		           "Cpf....: " + pes.getCpfPessoa());
		
		
	}

}
