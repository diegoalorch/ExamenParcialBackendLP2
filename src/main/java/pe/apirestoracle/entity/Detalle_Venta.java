package pe.apirestoracle.entity;

public class Detalle_Venta {
	
	private int iddetalle;
	private String nomprod;
	private float precio;
	private int cantidad;
	private int idventa;
	private int idproducto;
	
	public Detalle_Venta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Detalle_Venta(int iddetalle, String nomprod, float precio, int cantidad, int idventa, int idproducto) {
		super();
		this.iddetalle = iddetalle;
		this.nomprod = nomprod;
		this.precio = precio;
		this.cantidad = cantidad;
		this.idventa = idventa;
		this.idproducto = idproducto;
	}

	public int getIddetalle() {
		return iddetalle;
	}

	public void setIddetalle(int iddetalle) {
		this.iddetalle = iddetalle;
	}

	public String getNomprod() {
		return nomprod;
	}

	public void setNomprod(String nomprod) {
		this.nomprod = nomprod;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getIdventa() {
		return idventa;
	}

	public void setIdventa(int idventa) {
		this.idventa = idventa;
	}

	public int getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}
	
}
