package aparati.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aparati.model.Kategorija;
import aparati.repository.KategorijaRepository;
import aparati.service.KategorijaService;

@Service
public class JpaKategorijaService implements KategorijaService{
	
	@Autowired
	private KategorijaRepository kategorijaRepository;
	
	@Override
	public List<Kategorija> getAll(){
		return kategorijaRepository.findAll();
	}

}
