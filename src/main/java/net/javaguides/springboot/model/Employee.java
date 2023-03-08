package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cakeshop")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "caketype")
	private String caketype;

	@Column(name = "cakeflavour")
	private String cakeflavour;
	
	@Column(name="cakeweight")
	private int cakeweight;
	
	@Column(name = "cakesbyocassion")
	private String cakesbyocassion;
	
	public Employee() {
		
	}
	
	public Employee(String caketype, String cakesbyocassion, String cakeflavour,int cakeweight) {
		super();
		this.caketype = caketype;
		this.cakeflavour = cakeflavour;
		this.cakeweight = cakeweight;
		this.cakesbyocassion= cakesbyocassion;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCaketype() {
		return caketype;
	}
	public void setCaketype(String caketype) {
		this.caketype = caketype;
	}
	public String getCakeflavour() {
		return cakeflavour;
	}
	public void setCakeflavour(String cakeflavour) {
		this.cakeflavour = cakeflavour;
	}
	public int getCakeweight()
	{
		return cakeweight;
	}
	public void setCakeweight(int cakeweight )
	{
		this.cakeweight = cakeweight;
	}
	public String getCakesbyocassion() {
		return cakesbyocassion;
	}
	public void setCakesbyocassion(String cakesbyocassion) {
		this.cakesbyocassion = cakesbyocassion;
	}
}
