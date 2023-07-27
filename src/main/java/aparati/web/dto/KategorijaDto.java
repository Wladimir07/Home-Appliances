package aparati.web.dto;

public class KategorijaDto  {
	
	private Long id;
	
	private String ime;

	public KategorijaDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KategorijaDto(Long id, String ime) {
		super();
		this.id = id;
		this.ime = ime;
	}

	public KategorijaDto(String ime) {
		super();
		this.ime = ime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}
	
	

}
