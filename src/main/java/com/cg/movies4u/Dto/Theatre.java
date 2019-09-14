package com.cg.movies4u.Dto;

import java.util.List;

public class Theatre {
	
	    private final Integer theatreId;
	    private final String theatreName;
	    private final Integer cityPincode;
	    private final String cityName;
	    private final String theatreLocation;
	    private final String managerName;
	    private final String managerContact;
	    private List<Screen> screens;
	    private List<Movie> movies;
	    private static Integer count=0;

	    public Theatre(String theatreName, Integer cityPincode,
	                   String cityName, String theatreLocation, String managerName,
	                   String managerContact) {
	        this.theatreId = ++count;
	        this.theatreName = theatreName;
	        this.cityPincode = cityPincode;
	        this.cityName = cityName;
	        this.theatreLocation = theatreLocation;
	        this.managerName = managerName;
	        this.managerContact = managerContact;
	    }

	    public Theatre(String theatreName, Integer cityPincode, String cityName,
	                   String theatreLocation, String managerName, String managerContact,
	                   List<Screen> screens, List<Movie> movies) {
	        this.theatreId = ++count;
	        this.theatreName = theatreName;
	        this.cityPincode = cityPincode;
	        this.cityName = cityName;
	        this.theatreLocation = theatreLocation;
	        this.managerName = managerName;
	        this.managerContact = managerContact;
	        this.screens = screens;
	        this.movies = movies;
	    }

	    public Integer getTheatreId() {
	        return theatreId;
	    }

	    public String getTheatreName() {
	        return theatreName;
	    }

	    public Integer getCityPincode() {
	        return cityPincode;
	    }

	    public String getCityName() {
	        return cityName;
	    }

	    public String getTheatreLocation() {
	        return theatreLocation;
	    }

	    public String getManagerName() {
	        return managerName;
	    }

	    public String getManagerContact() {
	        return managerContact;
	    }

	    public List<Screen> getScreens() {
	        return screens;
	    }

	    public void setScreens(List<Screen> screens) {
	        this.screens = screens;
	    }

	    public List<Movie> getMovies() {
	        return movies;
	    }

	    public void setMovies(List<Movie> movies) {
	        this.movies = movies;
	    }

	    public static Integer getCount() {
	        return count;
	    }

	    public void setCount() {
	        count--;
	    }

	    @Override
	    public int hashCode() {
	        final int prime = 31;
	        int result = 1;
	        result = prime * result + ((cityName == null) ? 0 : cityName.hashCode());
	        result = prime * result + ((cityPincode == null) ? 0 : cityPincode.hashCode());
	        result = prime * result + ((managerContact == null) ? 0 : managerContact.hashCode());
	        result = prime * result + ((managerName == null) ? 0 : managerName.hashCode());
	        result = prime * result + ((movies == null) ? 0 : movies.hashCode());
	        result = prime * result + ((screens == null) ? 0 : screens.hashCode());
	        result = prime * result + ((theatreLocation == null) ? 0 : theatreLocation.hashCode());
	        result = prime * result + ((theatreName == null) ? 0 : theatreName.hashCode());
	        return result;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null)
	            return false;
	        if (getClass() != obj.getClass())
	            return false;
	        Theatre other = (Theatre) obj;
	        if (cityName == null) {
	            if (other.cityName != null)
	                return false;
	        } else if (!cityName.equals(other.cityName))
	            return false;
	        if (cityPincode == null) {
	            if (other.cityPincode != null)
	                return false;
	        } else if (!cityPincode.equals(other.cityPincode))
	            return false;
	        if (managerContact == null) {
	            if (other.managerContact != null)
	                return false;
	        } else if (!managerContact.equals(other.managerContact))
	            return false;
	        if (managerName == null) {
	            if (other.managerName != null)
	                return false;
	        } else if (!managerName.equals(other.managerName))
	            return false;
	        if (movies == null) {
	            if (other.movies != null)
	                return false;
	        } else if (!movies.equals(other.movies))
	            return false;
	        if (screens == null) {
	            if (other.screens != null)
	                return false;
	        } else if (!screens.equals(other.screens))
	            return false;
	        if (theatreLocation == null) {
	            if (other.theatreLocation != null)
	                return false;
	        } else if (!theatreLocation.equals(other.theatreLocation))
	            return false;
	        if (theatreName == null) {
	            if (other.theatreName != null)
	                return false;
	        } else if (!theatreName.equals(other.theatreName))
	            return false;
	        return true;
	    }

	    @Override
	    public String toString() {
	        return "Theatre{" +
	                "theatreId=" + theatreId +
	                ", theatreName='" + theatreName + '\'' +
	                ", cityPincode=" + cityPincode +
	                ", cityName='" + cityName + '\'' +
	                ", theatreLocation='" + theatreLocation + '\'' +
	                ", managerName='" + managerName + '\'' +
	                ", managerContact='" + managerContact + '\'' +
	                ", screens=" + screens +
	                ", movies=" + movies +
	                '}';
	    }
	}



