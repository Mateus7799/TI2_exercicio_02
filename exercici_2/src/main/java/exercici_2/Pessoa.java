package exercici_2;

public class Pessoa {
	private int codigo;
	private String login;
	private String nome;
	private char sexo;
	
	public Pessoa() {
		this.codigo = -1;
		this.login = "";
		this.nome = "";
		this.sexo = '*';
	}
	
	public Pessoa(int codigo, String login, String nome, char sexo) {
		this.codigo = codigo;
		this.login = login;
		this.nome = nome;
		this.sexo = sexo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Usuario [codigo=" + codigo + ", login=" + login + ", senha=" + nome + ", sexo=" + sexo + "]";
	}	
}
