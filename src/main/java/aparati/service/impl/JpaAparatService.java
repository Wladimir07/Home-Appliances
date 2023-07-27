package aparati.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aparati.model.Aparat;
import aparati.repository.AparatRepository;
import aparati.service.AparatService;



@Service
public class JpaAparatService implements AparatService{
	
	@Autowired
	private AparatRepository aparatRepository;
	
	@Override
	public List<Aparat> getAll(){
		return aparatRepository.findAll();
	}
	
	@Override
	public Optional<Aparat> one(Long id) {
		return aparatRepository.findById(id);
	}
	
	@Override
    public Aparat save(Aparat aparat) {
        return aparatRepository.save(aparat);
    }
	
	@Override
    public Aparat findOne(Long id) {
        return aparatRepository.findOneById(id);
    }
	
	@Override
	public Aparat update(Aparat aparat) {
		return aparatRepository.save(aparat);
	}
	
	@Override
    public Aparat delete(Long id) {
        Optional<Aparat> aparat = aparatRepository.findById(id);
        if(aparat.isPresent()){
            aparatRepository.deleteById(id);
            return aparat.get();
        }
        return null;
    }

	/*
	 * @Override public Aparat save(AparatDto aparatDto) {
	 * 
	 * Aparat aparat = toEntity.convert(aparatDto);
	 * 
	 * if(aparatDto.getId() != null) { // Trebalo bi da postoji u bazi Optional<A>
	 * oldTaskOptional = one(taskDto.getId()); if(oldTaskOptional.isPresent()) {
	 * Task oldTask = oldTaskOptional.get(); Sprint oldSprint = oldTask.getSprint();
	 * oldSprint.removeTask(taskDto.getId()); sprintRepository.save(oldSprint); } }
	 * 
	 * Sprint sprint = task.getSprint(); sprint.addTask(task); Task savedTask =
	 * taskRepository.save(task); sprintRepository.save(sprint); return savedTask; }
	 */
}
