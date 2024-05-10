package singleton;

import java.sql.SQLException;

import base.Productos;
import base.ProductosCrud;

public class Principal {

	public static void main(String[] args) throws SQLException {
//		ConexionBase.getConnection();

		Productos p = new Productos(3, "Lenteja", "basicos", 110, 0.98);

		ProductosCrud c = new ProductosCrud();

//		c.crear(p);
		
//		c.actualizar(p, 6);
		
//		c.eliminar(8);
		
		p = c.leerProducto(2);
		System.out.println(p);
	}
}
