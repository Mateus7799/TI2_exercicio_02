package exercici_2;

public class Principal {
	
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		dao.conectar();

		Pessoa usuario = new Pessoa(11, "pablo", "pablo",'M');
		if(dao.inserirPessoa(usuario) == true) {
			System.out.println("Inserção com sucesso -> " + usuario.toString());
		}
				
		System.out.println("==== Mostrar usuários do sexo masculino === ");
		Pessoa[] usuarios = dao.getUsuariosMasculinos();
		for(int i = 0; i < usuarios.length; i++) {
			System.out.println(usuarios[i].toString());
		}

		usuario.setNome("nova senha");
		dao.atualizarUsuario(usuario);

		System.out.println("==== Mostrar usuários === ");
		usuarios = dao.getUsuarios();
		for(int i = 0; i < usuarios.length; i++) {
			System.out.println(usuarios[i].toString());
		}
		
		dao.excluirUsuario(usuario.getCodigo());
		
		usuarios = dao.getUsuarios();
		System.out.println("==== Mostrar usuários === ");		
		for(int i = 0; i < usuarios.length; i++) {
			System.out.println(usuarios[i].toString());
		}
		
		dao.close();
	}
}