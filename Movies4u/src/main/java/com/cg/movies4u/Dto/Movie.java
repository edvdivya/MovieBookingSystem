package com.cg.movies4u.Dto;
import java.util.Date;
import java.util.Objects;

	public class Movie {
		private final Integer movieId;
		private final String movieName;
		private final String genre;
		private final String director;
		private final Integer movieLength;
		private final Date movieReleaseDate;
		private final String language;
		private static Integer count = 0;

		public Movie(String movieName, String genre, String director, Integer movieLength, Date movieReleaseDate,
				String language) {
			this.movieId = ++count;
			this.movieName = movieName;
			this.genre = genre;
			this.director = director;
			this.movieLength = movieLength;
			this.movieReleaseDate = movieReleaseDate;
			this.language = language;
		}

		public Integer getMovieId() {
			return movieId;
		}

		public String getMovieName() {
			return movieName;
		}

		public String getGenre() {
			return genre;
		}

		public String getDirector() {
			return director;
		}

		public Integer getMovieLength() {
			return movieLength;
		}

		public Date getMovieReleaseDate() {
			return movieReleaseDate;
		}

		public String getLanguage() {
			return language;
		}

		public static Integer getCount() {
			return count;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o)
				return true;
			if (!(o instanceof Movie))
				return false;
			Movie movie = (Movie) o;
			return getMovieName().equals(movie.getMovieName()) && getGenre().equals(movie.getGenre())
					&& getDirector().equals(movie.getDirector()) && getMovieLength().equals(movie.getMovieLength())
					&& getMovieReleaseDate().equals(movie.getMovieReleaseDate())
					&& getLanguage().equals(movie.getLanguage());
		}

		@Override
		public int hashCode() {
			return Objects.hash(getMovieName(), getGenre(), getDirector(), getMovieLength(), getMovieReleaseDate(),
					getLanguage());
		}

		@Override
		public String toString() {
			return "Movie{" + "movieId=" + movieId + ", movieName='" + movieName + '\'' + ", genre='" + genre + '\''
					+ ", director='" + director + '\'' + ", movieLength=" + movieLength + ", movieReleaseDate="
					+ movieReleaseDate + ", language='" + language + '\'' + '}';
		}
	}

