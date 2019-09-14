package com.cg.movies4u.Dao;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.cg.movies4u.Dto.Movie;
import com.cg.movies4u.Dto.Screen;
import com.cg.movies4u.Dto.Show;
import com.cg.movies4u.Dto.Theatre;

public interface ITheatreDao {

	public Map<Integer,String> getCities();
    public Map<Integer,Theatre> getTheatres();
    public Theatre addTheatre(Theatre theatre);
    public List<Theatre> getTheatres(Integer cityPincode);
    public Theatre searchTheatre(Integer theatreId);
    public Theatre deleteTheatre(Integer theatreId);
    public Set<Movie> getMovies(Integer cityPincode);
    public List<Movie> getMoviesinTheatre(Integer theatreId);
    public Show addShow(Integer theatreId, Integer screenId, Show show);
    public Show deleteShow(Integer theatreId,Integer screenId,Integer showId);
    public Show updateShow(Integer theatreId,Integer screenId,Show show);
    public List<String> getSeatsAvailability(Integer theatreId, Integer showId, Date date);
    public List<String> updateSeats(Integer theatreId,Integer showId,Date date,List<String> seats);
    public List<String> cancelSeats(Integer theatreId, Integer showId,Date date,List<String> seats);
    public Show searchShow(Integer theatreId,Integer showId);
    public List<Screen> getScreensInTheatre(Integer theatreId);
    public List<Show> getShowsInTheatre(Integer theatreId);
    public List<Show> getShowsInScreen(Integer theatreId,Integer screenId);
}
