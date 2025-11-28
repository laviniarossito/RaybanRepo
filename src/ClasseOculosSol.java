
public class ClasseOculosSol extends ClasseProdutos {

	String corLente;
	
	// Construtor 
	public ClasseOculosSol(String cor, float preco, String pigmentacao){
		super(cor, preco);
		
		this.corLente = pigmentacao;
		
	}
	
	public void setCorLente(String pigmento){
		this.corLente = pigmento;

	}
	
	public String getCorLente(){
		return corLente;
	}
	
}
