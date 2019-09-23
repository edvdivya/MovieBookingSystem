package com.cg.movies.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cg.movies.dto.Admin;
import com.cg.movies.dto.Movie;
import com.cg.movies.dto.Show;
import com.cg.movies.dto.Theatre;
import com.cg.movies.exception.UserException;

public class AdminDaoImpl implements AdminDao {

	public static int flag = 0;
	EntityManagerFactory entityFactory = Persistence.createEntityManagerFactory("Movies");

	public Admin save(Admin admin) {

		EntityManager em = entityFactory.createEntityManager();
		Query query = em.createQuery("FROM Admin");

		@SuppressWarnings("unchecked")
		List<Admin> adminList = query.getResultList();

		if (adminList.isEmpty()) {
			EntityTransaction tran = em.getTransaction();
			tran.begin();
			em.persist(admin);
			tran.commit();
			System.out.println("Admin has been added successfully");
			return admin;
		}
		System.out.println("Admin already exists in database");
		return null;
	}

	public List<Admin> findAll() {
		EntityManager em = entityFactory.createEntityManager();
		Query query = em.createQuery("FROM Admin");

		@SuppressWarnings("unchecked")
		List<Admin> adminList = query.getResultList();

		if (adminList.isEmpty()) {
			System.out.println("No admins in the database.");
			return null;
		} else {
			return adminList;
		}
	}

	public Admin find(Integer adminId) {

		EntityManager em = entityFactory.createEntityManager();
		Admin admin = em.find(Admin.class, adminId);

		if (admin == null) {
			System.out.println("Admin not found!!");
			return null;
		} else {
			return admin;
		}
	}

	public Admin remove(Integer adminId) {
		EntityManager em = entityFactory.createEntityManager();
		Admin admin = em.find(Admin.class, adminId);
		EntityTransaction tran = em.getTransaction();
		tran.begin();
		flag = 1;
		tran.commit();
		System.out.println("Admin has been removed");
		return admin;

	}

	public boolean addShowToTheatre(Integer showId, Integer theatreId) {

		EntityManager em = entityFactory.createEntityManager();
		Theatre theatre = em.find(Theatre.class, theatreId);
		Show show = em.find(Show.class, showId);
		EntityTransaction tran = em.getTransaction();

		if (theatre == null || show == null) {
			System.out.println("Theatre not found!!");
			return false;
		} else {
			tran.begin();
			show.setTheatre(theatre);
			tran.commit();
			return true;
		}
	}

	public boolean addMovieToTheatre(Integer movieId, Integer showId, Integer theatreId) {
		EntityManager em = entityFactory.createEntityManager();
		EntityTransaction tran = em.getTransaction();

		Theatre theatre = em.find(Theatre.class, theatreId);
		Show show = em.find(Show.class, showId);
		Movie movie = em.find(Movie.class, movieId);

		if (theatre == null || show == null) {
			System.out.println("Theatre/Show not found!!");
			return false;
		} else {
			tran.begin();
			show.setMovie(movie);
			theatre.getMovieList().add(movie);
			movie.getTheatre().add(theatre);
			tran.commit();
			return true;
		}
	}

	public Admin validateAdminLogin(String userName, String userPass) throws UserException {
		EntityManager em = entityFactory.createEntityManager();
		Query query = em.createQuery("FROM Admin WHERE adminName = :first AND adminPassword = :second");
		query.setParameter("first", userName);
		query.setParameter("second", userPass);
		
		@SuppressWarnings("unchecked")
		List<Admin> adminList = query.getResultList();

		if (adminList.isEmpty()) {
			System.out.println("Log In Successfull");
			return null;
		}
		return adminList.get(0);

	}

}