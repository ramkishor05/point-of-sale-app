package com.brijframework.app.entities;

import static com.brijframework.app.contants.Constants.DESCRIPTION;
import static com.brijframework.app.contants.Constants.EOGLOBAL_CURRENCY_ITEM;
import static com.brijframework.app.contants.Constants.GLB_IMG_ID;
import static com.brijframework.app.contants.Constants.GROUP_ID;
import static com.brijframework.app.contants.Constants.IDEN_NO;
import static com.brijframework.app.contants.Constants.NAME;
import static com.brijframework.app.contants.Constants.SYMBOL;
import static com.brijframework.app.contants.Constants.TYPE_ID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name=EOGLOBAL_CURRENCY_ITEM ,  uniqueConstraints = { @UniqueConstraint (columnNames = {GROUP_ID, NAME})} )
public class EOGlobalCurrencyItem extends EOEntityObject{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name=IDEN_NO)
	public String idenNo;

	@Column(name=TYPE_ID)
	public String typeId;
	
	@Column(name=NAME)
	public String name;
	
	@Column(name=DESCRIPTION)
	public String description;
	
	@Column(name = SYMBOL)
	public String symbol;
	
	@OneToOne
	@JoinColumn(name = GLB_IMG_ID)
	public EOGlobalMediaDetail globalMediaDetail;

	@ManyToOne
	@JoinColumn(name = GROUP_ID, nullable = false)
	private EOGlobalCurrencyGroup globalCurrencyGroup;

	public String getIdenNo() {
		return idenNo;
	}

	public void setIdenNo(String idenNo) {
		this.idenNo = idenNo;
	}

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

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public EOGlobalMediaDetail getGlobalMediaDetail() {
		return globalMediaDetail;
	}

	public void setGlobalMediaDetail(EOGlobalMediaDetail globalMediaDetail) {
		this.globalMediaDetail = globalMediaDetail;
	}

	public EOGlobalCurrencyGroup getGlobalCurrencyGroup() {
		return globalCurrencyGroup;
	}

	public void setGlobalCurrencyGroup(EOGlobalCurrencyGroup globalCurrencyGroup) {
		this.globalCurrencyGroup = globalCurrencyGroup;
	}
	
	
}
