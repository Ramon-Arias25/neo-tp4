package neotp4Model;
/**
 * 
 * @author ramon.arias
 * date: 13/05/2021
 * current version: 1
 *	Canina class: to instantiate k9 member through its subclasses
 *
 */
public abstract class Canine {
	private String id;
	private String name;
	private String type;
	private String breed;
	private String sex;

	public Canine(String id, String nombre, String tipo, String raza, String sexo) {
		super();
		this.id = id;
		this.name = nombre;
		this.type = tipo;
		this.breed = raza;
		this.sex = sexo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Canine [id=" + id + ", name=" + name + ", type=" + type + ", breed=" + breed + ", sex=" + sex + "]";
	}

}
