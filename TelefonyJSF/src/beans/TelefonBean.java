package beans;


import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;



import domain.Telefon;
import kontroler.TelefonKontroler;

@ManagedBean(name="telefonBean")
@SessionScoped

public class TelefonBean implements Serializable {


	private static final long serialVersionUID = 1L;
	
	private Telefon telefon = new Telefon();
	private ListDataModel<Telefon> telefony = new ListDataModel<Telefon>();

	@Inject
	private TelefonKontroler telefonKontroler;
	
	public ListDataModel<Telefon> getAllTelefony() {
		telefony.setWrappedData(telefonKontroler.getTelefony());
		return telefony;
	}


	public Telefon getTelefon() {
		return telefon;
	}


	public void setTelefon(Telefon telefon) {
		this.telefon = telefon;
	}
	
	public String addTelefon() {
		telefonKontroler.dodajNowy(telefon.getNazwa(), telefon.getOpis());
		return "listaTelefonow";
	}	
	
	public String usunTelefon() {
		Telefon tel = telefony.getRowData();
		telefonKontroler.usunTelefon(tel);
		return null;
	}
	
	
	
}
