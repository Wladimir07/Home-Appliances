package aparati.web.dto;

public class StanjeDto {
	
	private Long id;
	
	private String opis;
	
	

	public StanjeDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StanjeDto(Long id, String opis) {
		super();
		this.id = id;
		this.opis = opis;
	}

	public StanjeDto(String opis) {
		super();
		this.opis = opis;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}
	
	

}
