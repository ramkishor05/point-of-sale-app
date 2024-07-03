package com.brijframework.app.entities;

import static com.brijframework.app.contants.Constants.DESCRIPTION;
import static com.brijframework.app.contants.Constants.EOGLOBAL_COUNT_FREQ;
import static com.brijframework.app.contants.Constants.NAME;
import static com.brijframework.app.contants.Constants.TYPE_ID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = EOGLOBAL_COUNT_FREQ, uniqueConstraints = { @UniqueConstraint(columnNames = { NAME }) })
public class EOGlobalCountFreq extends EOEntityObject {

	private static final long serialVersionUID = 1L;

	@Column(name=TYPE_ID)
	public String typeId;
	
	@Column(name=NAME)
	public String name;
	
	@Column(name=DESCRIPTION)
	public String description;

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
}
