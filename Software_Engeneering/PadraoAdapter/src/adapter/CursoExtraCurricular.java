package adapter;

public class CursoExtraCurricular {
	private String curso;
	private String instrutor;
	
	public CursoExtraCurricular() {}
	
	public CursoExtraCurricular(String curso, String instrutor) {
		this.curso = curso;
		this.instrutor = instrutor;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(String instrutor) {
		this.instrutor = instrutor;
	}
	
	
}
