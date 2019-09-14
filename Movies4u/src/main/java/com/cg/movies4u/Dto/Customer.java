package com.cg.movies4u.Dto;
import java.time.LocalDate;
import java.util.*;

	public class Customer {

		public Integer customerId;
		private String password;
	    
		private String customerName;
	    private LocalDate dateOfBirth;
	    private List<Booking> myBooking;
	    private String customerContact;
		

		/**
		* Default constructor
		*/
	    public Customer() {
	    }
		
		public Customer(String customerName, LocalDate dateOfBirth, String customerContact) {
			this.customerName = customerContact;
			this.dateOfBirth = dateOfBirth;
			this.customerContact = customerContact;
	    }

		 public boolean signIn(Integer customerId,  String password) {
		        // TODO implement her
				if(this.customerId.equals(customerId))
					if(this.password.equals(password))
						return true;
					
				return true;
	    }
		 
//	    public List<Seat> cancelMovieTicket(Ticket ticket) {
//			List<Seat> listOfSeat = ticket.listOfSeat;
//			ListIterator<Seat> litr;
//			litr = listOfSeat.listIterator();
//			
//			while(litr.hasNext()){
//				litr.next().seatStatus = SeatStatus.AVAILABLE;
//			}
//			
//			return listOfSeat;
//	    }

	    public Boolean chooseCity(Integer cityPincode) {
	        return null;
	    }
	    
	    
	    /**********Getters and Setters***********/
	    public Integer getCustomerId() {
			return customerId;
		}

		public void setCustomerId(Integer customerId) {
			this.customerId = customerId;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getCustomerName() {
			return customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public LocalDate getDateOfBirth() {
			return dateOfBirth;
		}

		public void setDateOfBirth(LocalDate dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}

		public List<Booking> getMyTickets() {
			return null;
		}

		

		public String getCustomerContact() {
			return customerContact;
		}

		public void setCustomerContact(String customerContact) {
			this.customerContact = customerContact;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
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
			Customer other = (Customer) obj;
			if (customerId == null) {
				if (other.customerId != null)
					return false;
			} else if (!customerId.equals(other.customerId))
				return false;
			return true;
		}

	}

