import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

class Curso {

	private String nome;
	private int alunos;
	
	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAlunos() {
		return alunos;
	}

	public void setAlunos(int alunos) {
		this.alunos = alunos;
	}
	
	
}

public class ExemploCurso{
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		cursos.sort(Comparator.comparing(Curso::getAlunos));
//		cursos.forEach(c -> System.out.println(c.getNome()));
		
//		cursos.stream()
//			.filter(c -> c.getAlunos() >= 100).forEach(c -> System.out.println(c.getNome()));
//		
//		OptionalDouble average = cursos.stream()
//		.filter(c -> c.getAlunos() >= 100)
//		.mapToInt(c -> c.getAlunos())
//		.average();
//		
//		
//		Optional<Curso> any = cursos.stream()
//			.filter(c -> c.getAlunos() >=100 )
//			.findAny();
//		Curso curso = any.orElse(null);
//		any.ifPresent(c -> System.out.println(c.getNome()));
//		
//		cursos.stream()
//		.filter(c -> c.getAlunos() >=100 )
//		.collect(Collectors.toMap(
//				c -> c.getNome(),
//				c -> c.getAlunos()
//				)).forEach((nome, alunos)->System.out.println("nome: "+nome+" alunos:"+alunos));
//		
		OptionalDouble average = cursos.stream().mapToInt(c->c.getAlunos()).average();
		average.ifPresent(System.out::println);
	}
}
