package neotp4Model;

public abstract class Canino {
	private String id;
	private String nombre;
	private String tipo;
	private String raza;
	private String sexo;

	public Canino(String id, String nombre, String tipo, String raza, String sexo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.raza = raza;
		this.sexo = sexo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "id: " + id + ", nombre: " + nombre + ", tipo: " + tipo + ", raza: " + raza + ", sexo: " + sexo;
	}

}
