package domain;

import java.io.Serializable;

public class Telefon implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String nazwa;
	private String opis;

	public Telefon() {

	}

	public Telefon(int id, String nazwa, String opis) {

		this.id = id;
		this.nazwa = nazwa;
		this.opis = opis;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

}
