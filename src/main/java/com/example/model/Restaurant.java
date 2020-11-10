package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="resto", catalog="restaurant")
public class Restaurant {
	@Id 
	@GeneratedValue( strategy=GenerationType.AUTO)
	private int id;
	private String nom;
	private String spec;
	private String lieu;
	private String fprix;
	private String desc;
	private String img;
	public Restaurant(int id, String nom, String spec, String lieu, String fprix, String desc, String img) {
		super();
		this.id = id;
		this.nom = nom;
		this.spec = spec;
		this.lieu = lieu;
		this.fprix = fprix;
		this.desc = desc;
		this.img = img;
	}
	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getSpec() {
		return spec;
	}
	public void setSpec(String spec) {
		this.spec = spec;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public String getFprix() {
		return fprix;
	}
	public void setFprix(String fprix) {
		this.fprix = fprix;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	

}
