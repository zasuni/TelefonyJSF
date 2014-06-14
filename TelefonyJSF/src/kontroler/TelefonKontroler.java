package kontroler;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import domain.Telefon;
 
@ApplicationScoped
public class TelefonKontroler {
	
	private List<Telefon> telefony;
	private int lastId = 1;
	
	public TelefonKontroler() {
		telefony = new ArrayList<Telefon>();
		generujDaneTestowe();
	}
		
	public void dodajNowy(String nazwa, String opis) {
		
		telefony.add(new Telefon(lastId++, nazwa ,opis));
				
	}	 
	
	public void usunTelefon(Telefon telefon) {
		
		telefony.remove(telefon);
		
	} 

	public List<Telefon> getTelefony() {
		  
		return telefony;
	}
	
	public Telefon getTelefonById(int id){
		
		Telefon tel = null;
		
		for(Telefon p : telefony){
			if(p.getId()==id){
				tel=p;
				break;
			}
		}
		
		return tel;
	}

	public void generujDaneTestowe(){
		telefony.add(new Telefon(lastId++, "Nokia","Nokia Lumia 610 4 Kolory Windows 8GB ROM 5Mpx 24m"));
		telefony.add(new Telefon(lastId++, "Nokia","Nokia Asha 230 Dual Sim Czarna"));

		telefony.add(new Telefon(lastId++, "HTC","HTC ONE X QUADCORE 32GB"));
		telefony.add(new Telefon(lastId++, "HTC","HTC WILDFIRE S VIOLET +ETUI"));
		telefony.add(new Telefon(lastId++, "HTC","HTC DESIRE HD G10/GW 24/BEZ SIMLOCKA+karta SD 8GB"));

		telefony.add(new Telefon(lastId++, "Samsung","SAMSUNG GALAXY ACE 2 i8160*WHITE*B/S*"));
		telefony.add(new Telefon(lastId++, "Samsung","Smartfon SAMSUNG Galaxy S4 Active WODOODPORNY+32GB"));
	}


} 	


