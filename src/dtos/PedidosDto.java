package dtos;

import java.time.LocalDate;

public class PedidosDto {

	long id;
	String nombre = "aaaaa";
	int cantidad = 999999;
	LocalDate fcha = LocalDate.of(9999, 12, 31);
	
	public PedidosDto() {}
	public PedidosDto(long id, String nombre, int cantidad, LocalDate fcha) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.fcha = fcha;
	}


	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public LocalDate getFcha() {
		return fcha;
	}
	public void setFcha(LocalDate fcha) {
		this.fcha = fcha;
	}

	
	@Override
	public String toString() {
		return "PedidosDto [id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad + ", fcha=" + fcha + "]";
	}
}
