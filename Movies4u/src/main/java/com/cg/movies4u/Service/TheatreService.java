package com.cg.movies4u.Service;

import com.cg.movies4u.Dao.*;
import com.cg.movies4u.Dto.Movie;
import com.cg.movies4u.Dto.Screen;
import com.cg.movies4u.Dto.Show;
import com.cg.movies4u.Dto.Theatre;
import com.cg.movies4u.Exception.*;
import java.text.SimpleDateFormat;
import java.util.*;
public class TheatreService implements ITheatreService {

	
	    private ITheatreDao dao = new TheatreDao();

	    @Override
	    public Map<Integer, String> getCities() {
	        return dao.getCities();
	    }

	    @Override
	    public Map<Integer, Theatre> getTheatres() {
	        return dao.getTheatres();
	    }

	    @Override
	    public Theatre addTheatre(Theatre theatre) throws Exception {

	        Validate.validate_theatre(theatre);
	        if(!Validate.validate_duplicate(theatre)){
	            return dao.addTheatre(theatre);
	        }
	        return theatre;
	    }

	    @Override
	    public List<Theatre> getTheatres(Integer cityPincode) throws Exception {
	        if(Validate.validate_Ids(cityPincode)){
	           return dao.getTheatres(cityPincode);
	        }
	        return null;
	    }

	    @Override
	    public Theatre searchTheatre(Integer theatreId) throws Exception {
	        if(Validate.validate_Ids(theatreId)){
	            return dao.searchTheatre(theatreId);
	        }
	        return null;
	    }

	    @Override
	    public Theatre deleteTheatre(Integer theatreId) throws UserException {
	        if(Validate.validate_Ids(theatreId)){
	            return dao.deleteTheatre(theatreId);
	        }
	        return null;
	    }

	    @Override
	    public Set<Movie> getMovies(Integer cityPincode) throws UserException {
	        if(Validate.validate_Ids(cityPincode)){
	            return dao.getMovies(cityPincode);
	        }
	        return null;
	    }

	    @Override
	    public List<Movie> getMoviesinTheatre(Integer theatreId) throws Exception{
	        if(Validate.validate_Ids(theatreId)){
	            return dao.getMoviesinTheatre(theatreId);
	        }
	        return null;
	    }

	    @Override
	    public Show addShow(Integer theatreId, Integer screenId, Show show) throws Exception {
	        // TODO Auto-generated method stub
	        if((Validate.validate_Ids(theatreId)&&(Validate.validate_Ids(screenId)))) {
	            dao.addShow(theatreId, screenId, show);
	        }
	        return null;
	    }



	    @Override
	    public Show deleteShow(Integer theatreId, Integer screenId, Integer showId) throws Exception {
	        // TODO Auto-generated method stub
	        if((Validate.validate_Ids(theatreId)&&(Validate.validate_Ids(screenId)))) {

	           return  dao.deleteShow(theatreId, screenId, showId);
	        }
	        return null;
	    }



	    @Override
	    public Show updateShow(Integer theatreId,Integer screenId, Show show) throws Exception {
	        // TODO Auto-generated method stub
	        if(Validate.validate_Ids(theatreId)) {
	           return dao.updateShow(theatreId,screenId,show);
	        }
	        return null;
	    }



	    @Override
	    public List<String> getSeatsAvailability(Integer theatreId, Integer showId, String date) throws Exception {
	        // TODO Auto-generated method stub
	        if((!Validate.validate_Ids(theatreId)&&(!Validate.validate_Ids(showId)))) {
	            SimpleDateFormat sdfo = new SimpleDateFormat("yyyy-MM-dd");
	            Date user_date = sdfo.parse(date);
	            if(user_date.compareTo(dao.searchShow(theatreId, showId).getMovieEndDate())<0) {
	                return dao.getSeatsAvailability(theatreId, showId, sdfo.parse(date));
	            }
	            else {
	                throw new UserException("please enter a valid date");
	            }
	        }
	        return null;
	    }



	    @Override
	    public List<String> updateSeats(Integer theatreId, Integer showId, String date, List<String> seats) throws Exception{
	        // TODO Auto-generated method stub
	        if((Validate.validate_Ids(theatreId)&&(Validate.validate_Ids(showId)))) {
	            SimpleDateFormat sdfo = new SimpleDateFormat("yyyy-MM-dd");
	            Date user_date=sdfo.parse(date);
	            if(user_date.compareTo(dao.searchShow(theatreId, showId).getMovieEndDate())<0) {
	                return dao.updateSeats(theatreId, showId, sdfo.parse(date), seats);
	            }
	            else {
	                throw new UserException("please enter a valid date");
	            }

	        }
	        return null;
	    }

	    public List<String> cancelSeats(Integer theatreId, Integer showId,String date,List<String> seats) throws Exception{
	        if((!Validate.validate_Ids(theatreId)&&(!Validate.validate_Ids(showId)))) {
	            SimpleDateFormat sdfo = new SimpleDateFormat("yyyy-MM-dd");
	            Date user_date=sdfo.parse(date);
	            if(user_date.compareTo(dao.searchShow(theatreId, showId).getMovieEndDate())<0) {
	                return dao.cancelSeats(theatreId, showId, sdfo.parse(date), seats);
	            }
	            else {
	                throw new UserException("please enter a valid date");
	            }

	        }
	        return null;
	    }

	    @Override
	    public List<Screen> getScreensInTheatre(Integer theatreId) throws Exception {
	        if(Validate.validate_Ids(theatreId)){
	            return(dao.getScreensInTheatre(theatreId));
	        }
	        return null;
	    }

	    @Override
	    public List<Show> getShowsInTheatre(Integer theatreId) throws Exception {
	        if(Validate.validate_Ids(theatreId)){
	            return dao.getShowsInTheatre(theatreId);
	        }
	        return null;
	    }

	    @Override
	    public List<Show> getShowsInScreen(Integer theatreId, Integer screenId) throws Exception {
	        if(Validate.validate_Ids(theatreId)&&Validate.validate_Ids(screenId)){
	            return dao.getShowsInScreen(theatreId,screenId);
	        }
	        return null;
	    }

	    @Override
	    public List<Show> getShowsForMovieInTheatre(Integer theatreId, Integer moviename) throws Exception {
	        List<Show> shows=getShowsInTheatre(theatreId);
	        List<Show> ret = new ArrayList<>();
	        for(int i=0;i<shows.size();i++){
	            if(shows.get(i).getCurrentMovie().getMovieId().equals(moviename)){
	                ret.add(shows.get(i));
	            }
	        }
	        return ret;
	    }

	    @Override
	    public List<String> getAvailableSeats(Show show) throws Exception {
	        List<String> seats=new ArrayList<>();
	        return null;
	    }
	}


