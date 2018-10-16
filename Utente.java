package com.javacode.esempio;


	import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

	@XmlRootElement
	public class Utente {
		private int id;
		private String name;
		private String message;
		
		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		private Date date;
	

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Utente() {
			super();
		}

		public Utente(int id, String name, String message, Date date) {
			super();
			this.id = id;
			this.name = name;
			this.message = message;
			this.date = date;
		}
		
	}


