package aparati.support;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import aparati.model.Kategorija;
import aparati.web.dto.KategorijaDto;


@Component
public class KategorijaToKategorijaDto implements Converter<Kategorija, KategorijaDto>{
	
	@Override
	public KategorijaDto convert(Kategorija source) {
		
		KategorijaDto retValue = new KategorijaDto();
		retValue.setId(source.getId());
		retValue.setIme(source.getIme());

		
		return retValue;
	}

	public List<KategorijaDto> convert(List<Kategorija> source){
		List<KategorijaDto> ret = new ArrayList<>();
		
		for(Kategorija s : source) {
			KategorijaDto dto = convert(s);
			ret.add(dto);
		}
		return ret;
	}

}
