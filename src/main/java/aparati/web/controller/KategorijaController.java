package aparati.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import aparati.model.Kategorija;
import aparati.service.KategorijaService;
import aparati.support.KategorijaToKategorijaDto;
import aparati.web.dto.KategorijaDto;

@RestController
@RequestMapping(value = "/api/kategorije")
public class KategorijaController {
	
	@Autowired
	private KategorijaService kategorijaService;
	
	@Autowired
	private KategorijaToKategorijaDto toDto;
	
	@GetMapping
	public ResponseEntity<List<KategorijaDto>> getAll(
	@RequestParam(required = false) String name){
		
		List<Kategorija> kategorije = kategorijaService.getAll();
		return new ResponseEntity<>(toDto.convert(kategorije), HttpStatus.OK);
	}

}
