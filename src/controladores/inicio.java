package controladores;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.PedidosDto;
import dtos.VentaDto;
import servicios.GerenciaImplementacion;
import servicios.GerenciaInterfaz;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;

public class inicio {

	public static Scanner sc  =new Scanner(System.in);
	public static List<VentaDto> listaVenta  = new ArrayList<VentaDto>();
	public static  List<PedidosDto> listaPedido  = new ArrayList<PedidosDto>();

	
	public static void main(String[] args) {
		MenuInterfaz mi = new MenuImplementacion();
		GerenciaInterfaz gi = new GerenciaImplementacion();
		int opcionMenupricipal ;
		int opcionMenuGerencia;
		int opcionmenuEmpleado;
		boolean cerrado= false;
		do {
			opcionMenupricipal = mi.menuPrincipal();
			switch (opcionMenupricipal) {
			case 0: cerrado =true;
					System.out.println("cerrardo");
					break;
			case 1: opcionMenuGerencia =  mi.menuGerenecia();
					switch (opcionMenuGerencia) {
					case 0: break;
					case 1: gi.mostrarListadoVentaDelDia();
							break;	
					case 2: gi.crearPedido();
							break;
					default:System.out.println("error en la opcion");
					break;
					}
					break;
			case 2: mi.menuEmpleado();
					break;
			default:System.out.println("error en la opcion");
			break;
				
			}
			
			
			
			
		}while(!cerrado);

	}

}
