import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		
		list.add(new Product ("TV", 900.00));
		list.add(new Product ("Mouse", 80.00));
		list.add(new Product ("Tablet", 1900.00));
		list.add(new Product ("HD", 950.00));
		
			
		list.forEach(p -> p.setValor(p.getValor()*1.2));
		list.forEach(System.out::println);	
		
		
	}

}
