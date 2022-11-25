package Controle;

public class VisualizarAluno{

	private int senhaCadastro = 123;
	
	
	public boolean cadastrar(View prof) {
		if(prof.senhaAcesso(this.senhaCadastro)) {
			return true;
		}else {
			return false;
		}
	}
}

