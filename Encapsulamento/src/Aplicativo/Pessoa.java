package Aplicativo;

public class Pessoa {
	private int    codPessoa;
	private String nomePessoa;
	private String emailPessoa;
	private int    idadePessoa;
	private String cpfPessoa;
	
	public void imprimeDados() {
		System.out.println("Código : " + this.codPessoa   + "\n" +
				           "Nome ..: " + this.nomePessoa  + "\n" +
				           "Email..: " + this.emailPessoa + "\n" +
				           "Idade..: " + this.idadePessoa + "\n" +
				           "Cpf....: " + this.cpfPessoa);
	}

	public int getCodPessoa() {
		return codPessoa;
	}

	public void setCodPessoa(int codPessoa) {
		this.codPessoa = codPessoa;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public String getEmailPessoa() {
		return emailPessoa;
	}

	public void setEmailPessoa(String emailPessoa) {
		this.emailPessoa = emailPessoa;
	}

	public int getIdadePessoa() {
		return idadePessoa;
	}

	public void setIdadePessoa(int idadePessoa) {
		this.idadePessoa = idadePessoa;
	}

	public String getCpfPessoa() {
		return cpfPessoa;
	}

	public void setCpfPessoa(String cpfPessoa) {
		this.cpfPessoa = cpfPessoa;
	}
	
}
