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
import javax.persistence.UniqueConstraint;
@Table(name="sokak",
	    uniqueConstraints=
	        @UniqueConstraint(columnNames={"name","mahalle_id"})
	)

@Entity
public class Sokak {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String name;
	private String value;
	
	@ManyToOne
	private Mahalle mahalle;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="Sokak_ID")
	private Collection<Bina> binaList = new LinkedHashSet<Bina>();

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

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Mahalle getMahalle() {
		return mahalle;
	}

	public void setMahalle(Mahalle mahalle) {
		this.mahalle = mahalle;
	}

	public Collection<Bina> getBinaList() {
		return binaList;
	}

	public void setBinaList(Collection<Bina> binaList) {
		this.binaList = binaList;
	}
}
