package servicios;

import controladores.inicio;

public class IdImplemtacion implements IdInterfaz {

	@Override
	public long crearIdVenta() {
		long id =0;
		/*int orden = inicio.listaVenta.size();
		
		if(orden>0) {	
			id = inicio.listaVenta.get(orden - 1).getId() + 1;
		}else {
			id=1;
		}*/
		return id;
	}

	@Override
	public long crearIdPedidos() {
		long id ;
		int tamanio  =inicio.listaPedido.size();
		if(tamanio>0) {
			id = inicio.listaPedido.get(tamanio-1).getId() +1;
		}else {
			id=0;
		}
		return id;
	}

}
