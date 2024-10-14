package modelo;

import java.time.LocalDate;

public class PedidoPapelMensual extends Pedido {
private LocalDate fechaEntrega;
private int CantidadResmas;

public LocalDate getFechaEntrega() {
	return fechaEntrega;
}

public void setFechaEntrega(LocalDate fechaEntrega) {
	this.fechaEntrega = fechaEntrega;
}

public int getCantidadResmas() {
	return CantidadResmas;
}

public void setCantidadResmas(int cantidadResmas) {
	CantidadResmas = cantidadResmas;
}


public PedidoPapelMensual(int idPedido, LocalDate fechaCreacion, double montoBase, LocalDate fechaEntrega,
		int cantidadResmas) {
	super(idPedido, fechaCreacion, montoBase);
	this.fechaEntrega = fechaEntrega;
	CantidadResmas = cantidadResmas;
}


public double calcularPrecioFinal() {
return getMontoBase() * CantidadResmas;
}


}
