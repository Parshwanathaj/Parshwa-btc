package com.app.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.model.Movie;
import com.app.service.MovieAppApiService;

@Controller
public class MovieClientController {

	@Autowired
	private MovieAppApiService service;;

	@GetMapping("/")
	public String getAll(Model m) {
		List<Movie> movie = service.getAllMoviesList();
		m.addAttribute("movie", movie);
		return "movie-report.jsp";
	}

	@GetMapping("/add-movie")
	public String addmovie() {
		return "add-movie.jsp";
	}

	@PostMapping("/insert-movie")
	public String addMovie(@ModelAttribute Movie movie, RedirectAttributes attr) {
		service.addMovie(movie);
		attr.addFlashAttribute("success", " Movie Successfully added");
		return "redirect:/";
	}

	@GetMapping("/delete-movie/{movieName}")
	public String deleteMovie(@PathVariable String movieName, RedirectAttributes attr) {
		service.deleteMovieByName(movieName);
		attr.addFlashAttribute("delete", "deleted The " + movieName + " successfully");
		return "redirect:/";
	}

	@GetMapping("/edit-movie/{movieName}")
	public String editMovie(@PathVariable String movieName, Model m) {
		Movie movie = service.getMovieByName(movieName);
		m.addAttribute("movie", movie);
		return "/edit.jsp";
	}

	@PostMapping("/edit-movie/update-movie")
	public String updateMovie(@ModelAttribute Movie movie, RedirectAttributes attr) {
		service.updateMovie(movie);
		attr.addFlashAttribute("edit", movie.getMovieName() + " Movie updated Successfully");
		return "redirect:/";
	}

	@GetMapping("/search-movie")
	public String findMovieByhero(@RequestParam String keyword, Model m) {
		List<Movie> findmovie = service.getMovieByKeyword(keyword);
		if (keyword != null) {
			m.addAttribute("movie", findmovie);
		} else {
			m.addAttribute("movie", service.getAllMoviesList());
		}
		return "movie-report.jsp";
	}

	@GetMapping("/get-all")
	public String getAllList(Model m) {
		List<Movie> movie = service.getAllMoviesList();
		m.addAttribute("movie", movie);
		return "redirect:/";
	}
}