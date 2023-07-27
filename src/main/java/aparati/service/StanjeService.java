package aparati.service;

import java.util.List;
import java.util.Optional;

import aparati.model.Stanje;

public interface StanjeService {
	
	List<Stanje> getAll();
	
	public Optional<Stanje> one(Long id);

}
