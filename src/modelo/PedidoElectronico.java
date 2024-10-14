package modelo;

import java.time.LocalDate;

public class PedidoElectronico extends Pedido {
private String motivo;
private double PorcentajeExtra;

 @Override
public String toString() {
	return "\nPedidoElectronico [motivo=" + motivo + ", PorcentajeExtra=" + PorcentajeExtra + ", idPedido=" + idPedido
			+ ", fechaCreacion=" + fechaCreacion + ", montoBase=" + montoBase + "]";
}


public String getMotivo() {
	return motivo;
}


public void setMotivo(String motivo) {
	this.motivo = motivo;
}


public double getPorcentajeExtra() {
	return PorcentajeExtra;
}


public void setPorcentajeExtra(double porcentajeExtra) {
	PorcentajeExtra = porcentajeExtra;
}


public PedidoElectronico(int idPedido, LocalDate fechaCreacion, double montoBase, String motivo,
		double porcentajeExtra) {
	super(idPedido, fechaCreacion, montoBase);
	this.motivo = motivo;
	PorcentajeExtra = porcentajeExtra;
}
 
 

public double calcularPrecioFinal() {
    return getMontoBase() *PorcentajeExtra/100;
}

}