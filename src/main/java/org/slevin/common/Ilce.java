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
@Table(name="ilce")
public class Ilce {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	@ManyToOne
	private Sehir sehir;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="ILCE_ID")
	private Collection<Mahalle> mahalleList = new LinkedHashSet<Mahalle>();

private Boolean complated;
private Long ilceIndex;
private String sokakQuery;
private String binaQuery;
private String coordinateQuery;
	
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

	public Sehir getSehir() {
		return sehir;
	}

	public void setSehir(Sehir sehir) {
		this.sehir = sehir;
	}

	public Collection<Mahalle> getMahalleList() {
		return mahalleList;
	}

	public void setMahalleList(Collection<Mahalle> mahalleList) {
		this.mahalleList = mahalleList;
	}

	

	public String getSokakQuery() {
		return sokakQuery;
	}

	public void setSokakQuery(String sokakQuery) {
		this.sokakQuery = sokakQuery;
	}

	public String getBinaQuery() {
		return binaQuery;
	}

	public void setBinaQuery(String binaQuery) {
		this.binaQuery = binaQuery;
	}

	public String getCoordinateQuery() {
		return coordinateQuery;
	}

	public void setCoordinateQuery(String coordinateQuery) {
		this.coordinateQuery = coordinateQuery;
	}

	public Long getIlceIndex() {
		return ilceIndex;
	}

	public void setIlceIndex(Long ilceIndex) {
		this.ilceIndex = ilceIndex;
	}
}
