package com.hcl.library.grandabclibrary.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id ;
	
	private String uuid ;
	private String  title ;
	private String  catagory;
	private String rackno ;
	private String  author ;
	public Book(int id, String uuid, String title, String catagory, String rackno, String author) {
		super();
		this.id = id;
		this.uuid = uuid;
		this.title = title;
		this.catagory = catagory;
		this.rackno = rackno;
		this.author = author;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	public String getRackno() {
		return rackno;
	}
	public void setRackno(String rackno) {
		this.rackno = rackno;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Books [id=" + id + ", uuid=" + uuid + ", title=" + title + ", catagory=" + catagory + ", rackno="
				+ rackno + ", author=" + author + "]";
	}
	
	
}
