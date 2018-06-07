package com.showmanager.show;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.showmanager.show.ShowService;


/* Created by James Park
 * James1994ny@gmail.com
 * 
 */

@RestController
public class ShowController {
	
	@Autowired
	private ShowService ss;
	
	//Returns all shows
	@RequestMapping("/shows")
	public List<Show> getAllShows(){
		return ss.getAllShows();
	}
	
	//Maps addShow method to any request that is a POST on /shows
	@RequestMapping(method=RequestMethod.POST, value="/shows")
	public void addShow(@RequestBody Show show) {//Converts the request into Show instance and passes it into the method
		ss.createShow(show);
	}
	//Updates a show in the DB given an id 
	@RequestMapping(method=RequestMethod.PUT, value="/shows/{id}")
	public void modifyShow(@RequestBody Show show,@PathVariable String id) {
		ss.updateShow(id,show);
	}

}
