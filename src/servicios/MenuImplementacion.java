package servicios;

import controladores.inicio;

/*
 * implementacion que implementa a MenuInterfaz
 */
public class MenuImplementacion implements MenuInterfaz {

	@Override
	public int menuPrincipal() {
		System.out.println("0. cerrar");
		System.out.println("1. menu Gerencia ");
		System.out.println("2. menu empleado");
		int opcion = inicio.sc.nextInt();
		return opcion;
	}

	@Override
	public int menuGerenecia() {
		System.out.println("0. volver");
		System.out.println("1. mostrar todas las ventas del día ");
		System.out.println("2. crear un nuevo pedido");
		int opcion = inicio.sc.nextInt();
		return opcion;
	}

	@Override
	public int menuEmpleado() {
		System.out.println("0. volver");
		System.out.println("1. cálculo total de ventas diario ");
		System.out.println("2. añadir venta");
		int opcion = inicio.sc.nextInt();
		return opcion;
	}

}
