package adapter;

public class adptCursoExtraCurricular extends CursoExtraCurricular implements IDados {
	public adptCursoExtraCurricular(String curso, String instrutor) {
		super(curso, instrutor);
	}
	
	@Override
	public String getDados() {
		System.out.println("-- Curso Extracurricular --");
		return this.getCurso();
	}
}
