package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Model;
import com.example.demo.service.Service;

@RestController
public class Controller {
	@Autowired
   Service sser;
	//add details separately
	@PostMapping("addcustomer")
	public Model add(@RequestBody Model ss) {
		return sser.saveinfo(ss);
	}	
	//array of customer details
	@PostMapping("addcustomerfull")
	public List<Model> adddetails(@RequestBody List<Model> m){
		return sser.addinfo(m);
	}
	//get details fully
	@GetMapping("showcustomerdetails")
	public List<Model> show(){
		return sser.showinfo();
	}
	
	//get by id
	@GetMapping("showbyid/{id}")
	public Optional<Model> showId(@PathVariable int id){
		return sser.showbyid(id);
	}
	
	//update fully
	@PutMapping("updatecusdet")
	public Model modify(@RequestBody Model ss) {
		return sser.changeinfo(ss);
	}
	
	//update by id
	@PutMapping("updatecustbyid/{id}")
	public String modifybyid(@PathVariable int id,@RequestBody Model ss) {
		return sser.updateinfobyid(id, ss);
	}
	
	//delete data
	@DeleteMapping("deletecushistory")
	public String del(@RequestBody Model ss) {
		sser.deleteinfo(ss);
		return "Deleted the data successfully";
	}
	
	//delete by id
	@DeleteMapping("delid/{id}")
	public void deletemyid(@PathVariable int id) {
		sser.deleteById(id);
	}
	
}
