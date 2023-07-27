package aparati.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aparati.model.Stanje;
import aparati.repository.StanjeRepository;
import aparati.service.StanjeService;

@Service
public class JpaStanjeService implements StanjeService{
	
	@Autowired
	private StanjeRepository stanjeRepository;
	
	@Override
	public List<Stanje> getAll(){
		return stanjeRepository.findAll();
	}
	
	@Override
	public Optional<Stanje> one(Long id) {
		return stanjeRepository.findById(id);
	}
	

}
