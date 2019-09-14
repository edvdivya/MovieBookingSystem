package com.cg.movies4u.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.cg.movies4u.Dto.Movie;
import com.cg.movies4u.Dto.Screen;
import com.cg.movies4u.Dto.Show;
import com.cg.movies4u.Dto.Theatre;

public interface ITheatreService {

	public Map<Integer,String> getCities();
    public Map<Integer, Theatre> getTheatres();
    public Theatre addTheatre(Theatre theatre) throws Exception;
    public List<Theatre> getTheatres(Integer cityPincode) throws Exception;
    public Theatre searchTheatre(Integer theatreId) throws Exception;
    public Theatre deleteTheatre(Integer theatreId) throws Exception;
    public Set<Movie> getMovies(Integer cityPincode) throws Exception;
    public List<Movie> getMoviesinTheatre(Integer theatreId) throws Exception;
    public Show addShow(Integer theatreId, Integer screenId, Show show) throws Exception;
    public Show deleteShow(Integer theatreId,Integer screenId,Integer showId) throws Exception;
    public Show updateShow(Integer theatreId,Integer screenId,Show show) throws Exception;
    public List<String> getSeatsAvailability(Integer theatreId, Integer showId, String date) throws Exception;
    public List<String> updateSeats(Integer theatreId,Integer showId,String date,List<String> seats) throws Exception;
    public List<String> cancelSeats(Integer theatreId, Integer showId,String date,List<String> seats) throws Exception;
    public List<Screen> getScreensInTheatre(Integer theatreId) throws Exception;
    public List<Show> getShowsInTheatre(Integer theatreId) throws Exception;
    public List<Show> getShowsInScreen(Integer theatreId, Integer screenId) throws Exception;
    public List<Show> getShowsForMovieInTheatre(Integer theatreId,Integer moviename) throws Exception;
    public List<String> getAvailableSeats(Show show) throws Exception;
}
