package aparati.support;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import aparati.model.Stanje;
import aparati.web.dto.StanjeDto;

@Component
public class StanjeToStanjeDto implements Converter<Stanje, StanjeDto>{
	
	@Override
	public StanjeDto convert(Stanje source) {
		
		StanjeDto retValue = new StanjeDto();
		retValue.setId(source.getId());
		retValue.setOpis(source.getOpis());

		
		return retValue;
	}

	public List<StanjeDto> convert(List<Stanje> source){
		List<StanjeDto> ret = new ArrayList<>();
		
		for(Stanje s : source) {
			StanjeDto dto = convert(s);
			ret.add(dto);
		}
		return ret;
	}

}
