package com.brijframework.app.entities;

import static com.brijframework.app.contants.Constants.DESCRIPTION;
import static com.brijframework.app.contants.Constants.IDEN_NO;
import static com.brijframework.app.contants.Constants.LOGO_URL;
import static com.brijframework.app.contants.Constants.NAME;
import static com.brijframework.app.contants.Constants.TYPE_ID;

import jakarta.persistence.Column;
import jakarta.persistence.Lob;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class EOGlobalItem extends EOEntityObject{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name=IDEN_NO)
	private String idenNo;
	
	@Column(name=NAME)
	private String name;
	
	@Column(name=LOGO_URL)
	private String logoUrl;
	
	@Column(name=DESCRIPTION)
	private String desc;
	
	@Column(name=TYPE_ID)
	private String typeId;

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getLogoUrl() {
		return this.logoUrl;
	}

	@Lob
	private String instructions;

	public String getIdenNo() {
		return idenNo;
	}

	public void setIdenNo(String idenNo) {
		this.idenNo = idenNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

}
