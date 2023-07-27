package aparati.support;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import aparati.model.Aparat;
import aparati.web.dto.AparatDto;


@Component
public class AparatToAparatDto implements Converter<Aparat, AparatDto>{
	
	@Override
	public AparatDto convert(Aparat source) {
		
		AparatDto retValue = new AparatDto();
		retValue.setId(source.getId());
		retValue.setNaziv(source.getNaziv());
		retValue.setTip(source.getTip());
		retValue.setIstekGarancije(source.getIstekGarancije().toString());
		retValue.setCena(source.getCena());
		retValue.setGarantniRok(source.getGarantniRok());
		
		
		return retValue;
	}

	public List<AparatDto> convert(List<Aparat> source){
		List<AparatDto> ret = new ArrayList<>();
		
		for(Aparat s : source) {
			AparatDto dto = convert(s);
			ret.add(dto);
		}
		return ret;
	}

}
