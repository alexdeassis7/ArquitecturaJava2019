package com.educacionit.bike.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.educacionit.bike.model.Bike;
import com.educacionit.bike.repositories.BikeRepository;

@RestController
@RequestMapping("api/v1/bikes")
public class BikeController {

	@Autowired
	private BikeRepository bk;

	@GetMapping
	public List<Bike> lista() {
		List<Bike> Bikes = new ArrayList<Bike>();
		return bk.findAll(); // select * from bikes;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Bike bike) {

		bk.save(bike); // insert into .bike..bike..

	}

	@GetMapping("/{id}")
	public Bike get(@PathVariable("id") long id) {
		if (bk.existsById(id)) {
			return bk.getOne(id);
		} else {
			Bike b1 = new Bike();
			b1.setEmail("NO EXISTE EL DATO ");
			;
			return b1;
		}

	}

	@GetMapping("/borrar/{id}")
	@ResponseStatus(HttpStatus.OK)
	public boolean delete(@PathVariable long id) {
		if (bk.existsById(id)) {
			bk.deleteById(id);
			return true;
		} else {
			return false;
		}
	}

}
