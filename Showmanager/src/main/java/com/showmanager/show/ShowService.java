package com.showmanager.show;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShowService{

	//Creates bean that contains extension to CrudRepository
	@Autowired
	private ShowRepository showRepo;
		
	//Retrives all shows
	public List<Show> getAllShows(){
		List<Show> shows = new ArrayList<>();
		
		//connect to DB, runs query to find all, convert each row into show instances and retrives it
		//For each show s in the showrepository.findAll(), add it to the return arraylist
		for(Show s : showRepo.findAll()) {
			shows.add(s);
		}
		
		//Sorts arraylist of shows by id
		Collections.sort(shows);
		return shows;
	}
	
	//Creates a show
	public void createShow(Show show) {
		showRepo.save(show);
	}
	
	//Updates shows. If the show instance already exists in the row, it will automatically update
	public void updateShow(String id,Show show) {
		showRepo.save(show);
	}
	
}
