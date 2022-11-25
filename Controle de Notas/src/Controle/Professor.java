package Controle;

public class Professor implements View{

	 private int senha;
		
	 @Override
		public boolean senhaAcesso(int senha) {
			if (this.senha == senha) {
				return true;
			}else {
				return false;
			}
		}
	 
}
