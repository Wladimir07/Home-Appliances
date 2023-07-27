package aparati.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import aparati.model.Stanje;
import aparati.service.StanjeService;
import aparati.support.StanjeToStanjeDto;
import aparati.web.dto.StanjeDto;

@RestController
@RequestMapping(value = "/api/stanja")
public class StanjeController {
	
	@Autowired
	private StanjeService stanjeService;
	
	@Autowired
	private StanjeToStanjeDto toDto;
	
	@GetMapping
	public ResponseEntity<List<StanjeDto>> getAll(
			@RequestParam(required = false) String name){
		
		List<Stanje> stanja = stanjeService.getAll();
		return new ResponseEntity<>(toDto.convert(stanja), HttpStatus.OK);
	}

}
