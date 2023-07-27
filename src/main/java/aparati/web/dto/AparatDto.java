package aparati.web.dto;

import java.time.LocalDate;

public class AparatDto {
	
	private Long id;
	
	private String naziv;
	
	private String tip;
	
	private String istekGarancije;
	
	private double cena;
	
	private String garantniRok;
	
	
	private Long stanjeId;
	
	private String stanjeOpis;
	

	public AparatDto() {

	}
	
	public Long getStanjeId() {
		return stanjeId;
	}

	public void setStanjeId(Long stanjeId) {
		this.stanjeId = stanjeId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getIstekGarancije() {
		return istekGarancije;
	}

	public void setIstekGarancije(String istekGarancije) {
		this.istekGarancije = istekGarancije;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public String getGarantniRok() {
		return garantniRok;
	}

	public void setGarantniRok(String garantniRok) {
		this.garantniRok = garantniRok;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}


	public String getStanjeOpis() {
		return stanjeOpis;
	}



	public void setStanjeOpis(String stanjeOpis) {
		this.stanjeOpis = stanjeOpis;
	}
	
	

}
