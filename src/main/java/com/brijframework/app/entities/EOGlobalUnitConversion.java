package com.brijframework.app.entities;

import static com.brijframework.app.contants.Constants.EOGLOBAL_UNIT_CONVERSION;
import static com.brijframework.app.contants.Constants.NAME;
import static com.brijframework.app.contants.Constants.TYPE_ID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = EOGLOBAL_UNIT_CONVERSION)
public class EOGlobalUnitConversion extends EOEntityObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = TYPE_ID)
	public String typeId;

	@Column(name = NAME)
	public String name;

	@Column(name = "RPT_QNT")
	private double rptQnt;

	@Column(name = "BASE_QNT")
	private double baseQnt;

	@ManyToOne
	@JoinColumn(name = "BAS_UNIT_ID")
	public EOGlobalUnit baseUnit;

	@ManyToOne
	@JoinColumn(name = "RPT_UNIT_ID")
	public EOGlobalUnit rptUnit;

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

	public double getRptQnt() {
		return rptQnt;
	}

	public void setRptQnt(double rptQnt) {
		this.rptQnt = rptQnt;
	}

	public double getBaseQnt() {
		return baseQnt;
	}

	public void setBaseQnt(double baseQnt) {
		this.baseQnt = baseQnt;
	}

	public EOGlobalUnit getBaseUnit() {
		return baseUnit;
	}

	public void setBaseUnit(EOGlobalUnit baseUnit) {
		this.baseUnit = baseUnit;
	}

	public EOGlobalUnit getRptUnit() {
		return rptUnit;
	}

	public void setRptUnit(EOGlobalUnit rptUnit) {
		this.rptUnit = rptUnit;
	}

}
