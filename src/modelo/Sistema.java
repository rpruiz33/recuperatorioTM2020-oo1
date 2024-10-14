package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public class Sistema {
private List<Pedido> pedidos;

public Sistema() {
	super();
	this.pedidos = new ArrayList<Pedido>();
}

public boolean agregarPedidoPapelMensual(LocalDate fechaCreacion , double montoBase, LocalDate fechaEntrega, int cantidadResmas) throws Exception{
	int id=1;

	if (pedidos.size()>0) {
		id=pedidos.get(pedidos.size()-1).getIdPedido()+1;
	}
	if(cantidadResmas==0) {
		throw new Exception("la cantidad de resmas es 0");
	}
	return pedidos.add(new PedidoPapelMensual(id,fechaCreacion,montoBase,  fechaEntrega,  cantidadResmas));	

}
public boolean agregarPedidoElectronico(LocalDate fechaCreacion, double montoBase, String motivo, double porcentajeExtra) throws Exception{
	int id=1;

	if (pedidos.size()>0) {
		id=pedidos.get(pedidos.size()-1).getIdPedido()+1;
	}
	if(motivo.equalsIgnoreCase("")) {
		throw new Exception("el motivo es nulo");
	}
	return pedidos.add(new PedidoElectronico(id,fechaCreacion, montoBase,motivo,porcentajeExtra));	

}

public Pedido traerPedido(int idPedido) {
	int i=0;
	Pedido p=null;
	while(i<pedidos.size()&& p==null) {
		if(pedidos.get(i).getIdPedido()==idPedido) {
			p=pedidos.get(i);
		}
		i++;
	}
return p;
}

public Pedido traerPedido1(int idPedido) {
	int i=0;
	Pedido p=null;
	while(i<pedidos.size()&& p==null) {
		if(pedidos.get(i).getIdPedido()==idPedido) {
			p=pedidos.get(i);
		}
		i++;
	}
return p;
}
public List<Pedido> traerPedido(String motivo) {

	List<Pedido>  p=new ArrayList<Pedido>();
	for(int i=0;i<pedidos.size();i++) {
		if(pedidos.get(i) instanceof PedidoElectronico &&(((PedidoElectronico)pedidos.get(i)).getMotivo().equals(motivo))) {
			p.add(pedidos.get(i));
		}

	}
return p;
}


public double calcularTotalGeneral(){

double finalcosto=0;
	for(int i=0;i<pedidos.size();i++) {
	finalcosto=finalcosto+pedidos.get(i).calcularPrecioFinal();
	}
return finalcosto;
}
}
