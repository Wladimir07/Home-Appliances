package aparati.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import aparati.model.Aparat;
import aparati.service.AparatService;
import aparati.support.AparatDtoToAparat;
import aparati.support.AparatToAparatDto;
import aparati.web.dto.AparatDto;

@RestController
@RequestMapping(value = "/api/aparati")
public class AparatController {
	
	@Autowired
	private AparatService aparatService;
	
	@Autowired
	private AparatToAparatDto toDto;
	
	@Autowired
	private AparatDtoToAparat toAparat;

	@GetMapping
	public ResponseEntity<List<AparatDto>> getAll(
	@RequestParam(required = false) String name){
		
		List<Aparat> aparati = aparatService.getAll();
		return new ResponseEntity<>(toDto.convert(aparati), HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<AparatDto> add(@Validated @RequestBody AparatDto aparatDto) {
	  
		Aparat aparat = toAparat.convert(aparatDto);
		Aparat saved = aparatService.save(aparat);
	  
		return new ResponseEntity<>(toDto.convert(saved), HttpStatus.CREATED); 
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/{id}", consumes = "application/json")
	public ResponseEntity<AparatDto> edit(@Validated @RequestBody AparatDto aparatDto, @PathVariable Long id) {

		if (!id.equals(aparatDto.getId())) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		Aparat aparat = toAparat.convert(aparatDto);
		Aparat persisted = aparatService.save(aparat);

		return new ResponseEntity<>(toDto.convert(persisted), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	ResponseEntity<AparatDto> delete(@PathVariable Long id) {
		Aparat deleted = aparatService.delete(id);

		if (deleted == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<>(toDto.convert(deleted), HttpStatus.OK);
	}
	
}
