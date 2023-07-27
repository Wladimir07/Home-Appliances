package aparati.support;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import aparati.model.Aparat;
import aparati.model.Kategorija;
import aparati.model.Stanje;
import aparati.service.AparatService;
import aparati.service.StanjeService;
import aparati.web.dto.AparatDto;

@Component
public class AparatDtoToAparat implements Converter<AparatDto, Aparat>{
	
	@Autowired
	private AparatService aparatService;
	
	@Autowired
	private StanjeService stanjeService;
	
	@Override
	public Aparat convert(AparatDto source) {
		
		Stanje stanje = null;
		if(source.getStanjeId() != null) {
			stanje = stanjeService.one(source.getStanjeId()).get();
		}
		
		Kategorija kategorija = null;
		if(source.getId() != null) {
			stanje = stanjeService.one(source.getStanjeId()).get();
		}
		
		if(stanje!=null) {
			
			 Aparat aparat;
			 if(source.getId() == null) {
		            aparat = new Aparat();
		        }else {
		            aparat = aparatService.findOne(source.getId());
		     }
				aparat.setNaziv(source.getNaziv());
				aparat.setTip(source.getTip());
				aparat.setIstekGarancije(getLocalDate(source.getIstekGarancije()));
				aparat.setCena(source.getCena());
				aparat.setGarantniRok(source.getGarantniRok());
				
				aparat.setStanje(stanje);
				aparat.setKategorija(kategorija);
			
			
			return aparat;
			
		}else {
			throw new IllegalStateException("Trying to attach to non-existant entities");
		}
	}
	
	private LocalDate getLocalDate(String datum) throws DateTimeParseException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate dat = LocalDate.parse(datum, formatter);
        return dat;
    }

}
