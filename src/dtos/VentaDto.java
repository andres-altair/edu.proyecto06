package dtos;

import java.time.LocalDateTime;

public class VentaDto {
	
	
	long id ;
	int venta=9999999;
	double importe =  9999999.9;
	LocalDateTime fchIntante  =LocalDateTime.now();

	public VentaDto() {}
	public VentaDto(long id, int venta, double importe, LocalDateTime fchIntante) {
		super();
		this.id = id;
		this.venta = venta;
		this.importe = importe;
		this.fchIntante = fchIntante;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getVenta() {
		return venta;
	}
	public void setVenta(int venta) {
		this.venta = venta;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public LocalDateTime getFchIntante() {
		return fchIntante;
	}
	public void setFchIntante(LocalDateTime fchIntante) {
		this.fchIntante = fchIntante;
	}

	@Override
	public String toString() {
		return "VentaDto [Venta número=" + id + "/n"+ 
				"Euros=" + importe +"/n"+ 
				"Instante de compra=" + fchIntante + "]";
			
	}
}
