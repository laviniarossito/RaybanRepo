
public class ClasseProdutos {

	String cor;
	float preco;
	
	// Construtor
	public ClasseProdutos(String corPar, float precoPar){
		
		this.cor = corPar;
		this.preco = precoPar;
	}
	
	public String getCor(){
		return cor;
	}

	public float getPreco(){
		return preco;
	}
	
	public void setCor(String color){
		this.cor = color;
	}

	public void setPreco(float price){
		this.preco = price;
	}

}
