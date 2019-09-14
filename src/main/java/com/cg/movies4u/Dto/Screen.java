package com.cg.movies4u.Dto;
import java.util.List;

	public class Screen {
	    private final Integer screenId;
	    private final Integer rows;
	    private final Integer columns;
	    private List<Show> shows;
	    private static Integer count=0;

	    public Screen(Integer rows, Integer columns) {
	        this.screenId = ++count;
	        this.rows = rows;
	        this.columns = columns;
	    }

	    public Screen(Integer rows, Integer columns, List<Show> shows) {
	        this.screenId = ++count;
	        this.rows = rows;
	        this.columns = columns;
	        this.shows = shows;
	    }

	    public Integer getScreenId() {
	        return screenId;
	    }

	    public Integer getRows() {
	        return rows;
	    }

	    public Integer getColumns() {
	        return columns;
	    }

	    public List<Show> getShows() {
	        return shows;
	    }

	    public void setShows(List<Show> shows) {
	        this.shows = shows;
	    }

	    @Override
	    public String toString() {
	        return "Screen{" +
	                "screenId=" + screenId +
	                ", rows=" + rows +
	                ", columns=" + columns +
	                ", shows=" + shows +
	                '}';
	    }
	}


