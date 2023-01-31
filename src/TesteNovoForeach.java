import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class TesteNovoForeach {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		lista.add("Otavio");
		lista.add("Aparecido");
		lista.add("Pegorin");
//		Collections.sort(lista);
		lista.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		System.out.println(lista);

		Consumer<String> consumidor = s -> System.out.println(s);
		lista.forEach(consumidor);
		lista.forEach(t -> System.out.println(t));

		lista.forEach(System.out::println);
		lista.forEach(palavra -> System.out.println(palavra));

		lista.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		lista.sort(Comparator.comparing(s -> s.length()));
		lista.sort(Comparator.comparing(String::length));

		//Funcionam da mesma forma
		Function<String, Integer> funcao = s -> s.length();
		Function<String,Integer> funcao2 = String::length;
		
		new Thread(() -> System.out.println("Executando um Runnable")).start();
		
		
		
		
		
		
		
		
		lista.sort(String.CASE_INSENSITIVE_ORDER); 
	}
}
