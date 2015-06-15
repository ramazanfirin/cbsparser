package org.slevin.common;

import java.util.Collection;
import java.util.LinkedHashSet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="mahalle")
public class Mahalle {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	@ManyToOne
	private Ilce ilce;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="Mahalle_ID")
	private Collection<Sokak> sokakList = new LinkedHashSet<Sokak>();

	
private Boolean complated;
	
	public Boolean getComplated() {
		return complated;
	}

	public void setComplated(Boolean complated) {
		this.complated = complated;
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Ilce getIlce() {
		return ilce;
	}

	public void setIlce(Ilce ilce) {
		this.ilce = ilce;
	}

	public Collection<Sokak> getSokakList() {
		return sokakList;
	}

	public void setSokakList(Collection<Sokak> sokakList) {
		this.sokakList = sokakList;
	}
}
