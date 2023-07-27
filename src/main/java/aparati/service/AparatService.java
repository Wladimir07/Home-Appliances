package aparati.service;

import java.util.List;
import java.util.Optional;

import aparati.model.Aparat;

public interface AparatService {
	
	List<Aparat> getAll();
	
	public Optional<Aparat> one(Long id);
	
	Aparat save(Aparat aparat);
	 
	Aparat findOne(Long id);
	 
	Aparat update (Aparat aparat);
	
	Aparat delete(Long id);

}
