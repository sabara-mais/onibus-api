package br.com.sabaramais.onibus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sabaramais.onibus.entity.Bus;
import br.com.sabaramais.onibus.repository.BusRepository;

@Service
public class BusService {
	
	@Autowired
	private BusRepository busRepository;

	/**
	 * Get all bus lines from database
	 * @return list of bus lines
	 */
	public Iterable<Bus> findAll() {
		return busRepository.findAll();
	}

	/**
	 * Get a specific bus from database without schedule
	 * @return bus or null if not found
	 */
	public Bus findOne(long id) {
		return busRepository.findOne(id);
	}

	/**
	 * Get a specific bus from database with all schedules
	 * @return bus or null if not found
	 */
	public Bus getBusWithSchedule(long id) {
		return busRepository.getBusWithSchedule(id);
	}

	/**
	 * Get all bus from database with all schedules
	 * @return list of bus
	 */
	public Iterable<Bus> getBusWithSchedule() {
		return busRepository.getBusWithSchedule();
	}
	
}
