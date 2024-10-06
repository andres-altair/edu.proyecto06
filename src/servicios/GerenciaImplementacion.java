package servicios;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import controladores.inicio;
import dtos.PedidosDto;
import dtos.VentaDto;

public class GerenciaImplementacion implements GerenciaInterfaz {

	@Override
	public void mostrarListadoVentaDelDia() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println("fecha en formato dd-MM-yyyy");
		String fechaString = inicio.sc.next();
		LocalDateTime fecha = LocalDateTime.parse(fechaString,formato);
		List<VentaDto> venta  = new ArrayList<VentaDto>();
		for(VentaDto v : inicio.listaVenta) {
			if(fecha.equals(v.getFchIntante())) {
				venta.add(v);
			}
		}
		for(VentaDto v : venta) {
			v.toString();
		}

	}

	IdInterfaz ii = new IdImplemtacion();
	@Override
	public void crearPedido() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		System.out.println("Escribe nombre del pedido");
		long id = ii.crearIdPedidos();
		String nombre  = inicio.sc.next();
		System.out.println("Escribe la cantidad");
		int cantidad  =inicio.sc.nextInt();
		System.out.println("Fecha deseada de entrega (dd-MM-yyyy)");
		String fchaString = inicio.sc.next();
		LocalDate fcha  =LocalDate.parse(fchaString);
		
		PedidosDto pedido  = new PedidosDto(id,nombre,cantidad,fcha);
		inicio.listaPedido.add(pedido);
		

	}

}
