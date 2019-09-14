package com.cg.movies4u.Dto;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Show {

	private final Integer showId;
    private Movie currentMovie;
    private Date movieEndDate;
    private String language;
    private Date showStartTime;
    private Date showEndTime;
    private Date date;
    private Map<Date,List<String>> bookedSeats;
    private Map<Date,List<String>> blockedSeats;
    private static int count=0;

    public Show(Movie currentMovie, Date movieEndDate, String language, Date showStartTime,
                Date showEndTime,Date date, Map<Date,List<String>> bookedSeats, Map<Date,List<String>> blockedSeats) throws Exception {
        this.showId=++count;
        this.currentMovie = currentMovie;
        this.movieEndDate = movieEndDate;
        this.language = language;
        this.showStartTime = showStartTime;
        this.showEndTime = showEndTime;
        this.date = date;
        this.bookedSeats = bookedSeats;
        String str="2019-07-";
        SimpleDateFormat sdf=  new SimpleDateFormat("yyyy-MM-dd");
        for(int i=5;i<=10;i++){
            str="2019-07-"+i;
            //this.bookedSeats.put(sdf.parse(str),new ArrayList<>());
        }
        this.blockedSeats = blockedSeats;
    }

    public Integer getShowId() {
        return showId;
    }

    public Movie getCurrentMovie() {
        return currentMovie;
    }

    public void setCurrentMovie(Movie currentMovie) {
        this.currentMovie = currentMovie;
    }

    public Date getMovieEndDate() {
        return movieEndDate;
    }

    public void setMovieEndDate(Date movieEndDate) {
        this.movieEndDate = movieEndDate;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Date getShowStartTime() {
        return showStartTime;
    }

    public void setShowStartTime(Date showStartTime) {
        this.showStartTime = showStartTime;
    }

    public Date getShowEndTime() {
        return showEndTime;
    }

    public void setShowEndTime(Date showEndTime) {
        this.showEndTime = showEndTime;
    }



    public Map<Date, List<String>> getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(Map<Date,List<String>> bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public Map<Date, List<String>> getBlockedSeats() {
        return blockedSeats;
    }

    public void setBlockedSeats(Map<Date,List<String>> blockedSeats) {
        this.blockedSeats = blockedSeats;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Show{" +
                "showId=" + showId +
                ", currentMovie=" + currentMovie +
                ", movieEndDate=" + movieEndDate +
                ", language='" + language + '\'' +
                ", showStartTime=" + showStartTime +
                ", showEndTime=" + showEndTime +
                '}';
    }

}

	
