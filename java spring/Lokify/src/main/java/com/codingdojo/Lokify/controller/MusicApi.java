package com.codingdojo.Lokify.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.codingdojo.Lokify.models.Music;
import com.codingdojo.Lokify.services.MusicService;



@Controller
public class MusicApi {
	 private final MusicService MusicService;
	    public MusicApi(MusicService MusicService) {
	        this.MusicService = MusicService;
	    }
	 @RequestMapping("/")
	 public String Hello() {
		 return "/music/index.jsp";
	 }
	 @RequestMapping("/dashboard")
	 public String dash(Model model) {
		 List<Music> music = MusicService.allMusic();
		 model.addAttribute("music",music);
		 return "/music/dashobard.jsp";
	 }
	 @RequestMapping(value="/api/music", method=RequestMethod.POST)
	  public Music create(@RequestParam(value="artist") String artist, @RequestParam(value="title") String title, @RequestParam(value="rating") Integer rating) {
	      Music language = new Music(artist, title, rating);
	      return MusicService.createMusic(language);
	  }
	 @RequestMapping(value="/delete/{id}")
	    public String destroy(@PathVariable("id") Long id) {
		 MusicService.deleteMusic(id);
	        return "redirect:/";
	    }
	 
	    @RequestMapping(value="/music/{id}")
	    public String show(@PathVariable("id") Long id,Model model) {
	      Music x = MusicService.findMusic(id);
	      model.addAttribute("x", x);
	      return "/music/song.jsp";
	    }
	    @RequestMapping(value="/music", method=RequestMethod.POST)
	    public String create(@Valid @ModelAttribute("Music") Music x, BindingResult result) {
	        if (result.hasErrors()) {
	            return "/music/add.jsp";
	        } else {
	        	MusicService.createMusic(x);
	            return "redirect:/";
	        }
	    }
	    @RequestMapping("/music/new")
	    public String newLanguage(@ModelAttribute("Music") Music Music) {
	        return "/music/add.jsp";
	    }
	    @RequestMapping("/search/topTen")
	    public String top10(Model model) {
	    	List <Music>  x= MusicService.findTop10ByRating();
	    	model.addAttribute("music",x);
	    	return "/music/top10.jsp";
	    }
	   @RequestMapping("/search")
	   public String search(@RequestParam(value="name") String name,Model model) {
		   Music x=MusicService.searchByArtist(name);
		   if(x.getArtist()!=null) {
			   List <Music> g=MusicService.findByName(x.getArtist());
			   model.addAttribute("x",x);
			   model.addAttribute("g",g);
		   	   return "/music/artist.jsp";
		   }
		   
			   return "redirect:/";
		   
	   }
	      
}
