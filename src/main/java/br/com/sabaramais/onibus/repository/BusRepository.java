package br.com.sabaramais.onibus.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.sabaramais.onibus.entity.Bus;

public interface BusRepository extends CrudRepository<Bus, Long>{

	@Query("select b from bus as b left join fetch b.schedules s where b.id = ?1 order by s.time")
	public Bus getBusWithSchedule(long id);
	
	@Query("select b from bus as b left join fetch b.schedules s where b.id = ?1 and s.dayType.id = ?2 order by s.time")
	public Bus getBusWithSchedulebyDayType(long idBus, long idDayType);
	
	@Query("select distinct b from bus as b left join fetch b.schedules")
	public Iterable<Bus> getBusWithSchedule();
}