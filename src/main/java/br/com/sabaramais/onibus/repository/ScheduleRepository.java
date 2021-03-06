package br.com.sabaramais.onibus.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.sabaramais.onibus.entity.Bus;
import br.com.sabaramais.onibus.entity.Schedule;

public interface ScheduleRepository extends CrudRepository<Schedule, Long>{
	@Query("SELECT s FROM schedule s LEFT JOIN FETCH s.dayType ORDER BY s.time ASC")
	public Set<Schedule> getAllSchedulesByTime();
}
