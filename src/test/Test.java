package test;

import java.time.LocalDate;

import modelo.Sistema;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sistema sistema=new Sistema();
		try {
			System.out.println(sistema.agregarPedidoPapelMensual(LocalDate.of(2020, 12, 12), 1200, LocalDate.of(2020 ,12, 15), 5));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(sistema.agregarPedidoElectronico(LocalDate.of(2020, 12, 12), 3000,"PC no funciona" , 200));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(sistema.agregarPedidoPapelMensual(LocalDate.of(2020, 12, 12), 1200, LocalDate.of(2020, 12, 16), 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(sistema.agregarPedidoElectronico(LocalDate.of(2020, 12, 14), 3000,"" , 200));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(sistema.agregarPedidoPapelMensual(LocalDate.of(2020, 12, 12), 1200, LocalDate.of(2020 ,12, 16), 3));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(sistema.agregarPedidoElectronico(LocalDate.of(2020, 12, 14), 3000,"PC no funciona" , 200));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(sistema.agregarPedidoElectronico(LocalDate.of(2020, 12, 14), 3000,"Monitor no funciona" , 210));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(sistema.traerPedido("PC no funciona"));
		
		System.out.println(sistema.calcularTotalGeneral());
		
		
	}

}
