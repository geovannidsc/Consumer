
public class Product {

	String nome;
	double valor;
	
	
	
	
	@Override
	public String toString() {
		return nome + ", " + valor ;
	}
	public Product(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
}
