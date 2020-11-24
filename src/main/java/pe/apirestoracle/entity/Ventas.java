package pe.apirestoracle.entity;

import java.util.Date;

public class Ventas {

	private int idventa;
	private Date fecha;
	private String tipodoc;
	private String numdoc;
	private int idpersona;
	private int idusario;
	
	public Ventas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ventas(int idventa, Date fecha, String tipodoc, String numdoc, int idpersona, int idusario) {
		super();
		this.idventa = idventa;
		this.fecha = fecha;
		this.tipodoc = tipodoc;
		this.numdoc = numdoc;
		this.idpersona = idpersona;
		this.idusario = idusario;
	}

	public int getIdventa() {
		return idventa;
	}

	public void setIdventa(int idventa) {
		this.idventa = idventa;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getTipodoc() {
		return tipodoc;
	}

	public void setTipodoc(String tipodoc) {
		this.tipodoc = tipodoc;
	}

	public String getNumdoc() {
		return numdoc;
	}

	public void setNumdoc(String numdoc) {
		this.numdoc = numdoc;
	}

	public int getIdpersona() {
		return idpersona;
	}

	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}

	public int getIdusario() {
		return idusario;
	}

	public void setIdusario(int idusario) {
		this.idusario = idusario;
	}
}
