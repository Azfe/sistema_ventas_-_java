package model;

public class Empleado {
	int id;
	String dni;
	String name;
	String phone;
	String state;
	String user;
	
	// Constructores
	public Empleado() {
		
	}	
	
	public Empleado(int id, String dni, String name, String phone, String state, String user) {
		super();
		this.id = id;
		this.dni = dni;
		this.name = name;
		this.phone = phone;
		this.state = state;
		this.user = user;
	}
	
	// Getters & Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	
	
	
	
	
	

}
