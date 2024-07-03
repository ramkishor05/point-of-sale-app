package com.brijframework.app.entities;

import static com.brijframework.app.contants.Constants.DESCRIPTION;
import static com.brijframework.app.contants.Constants.EOGLOBAL_CATEGORY;
import static com.brijframework.app.contants.Constants.GLB_IMG_ID;
import static com.brijframework.app.contants.Constants.GROUP_ID;
import static com.brijframework.app.contants.Constants.NAME;
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
@Table(name=EOGLOBAL_CATEGORY ,  uniqueConstraints = { @UniqueConstraint (columnNames = {GROUP_ID, NAME})} )
public class EOGlobalCategory extends EOEntityObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = NAME)
	private String name;

	@Column(name = DESCRIPTION)
	private String desc;

	@Column(name = TYPE_ID)
	private String typeId;
	
	@OneToOne
	@JoinColumn(name = GLB_IMG_ID)
	public EOGlobalMediaDetail globalMediaDetail;

	@ManyToOne
	@JoinColumn(name = GROUP_ID, nullable = false)
	private EOGlobalCategoryGroup globalCategoryGroup;

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
	
	public EOGlobalMediaDetail getGlobalMediaDetail() {
		return globalMediaDetail;
	}

	public void setGlobalMediaDetail(EOGlobalMediaDetail globalMediaDetail) {
		this.globalMediaDetail = globalMediaDetail;
	}

	public EOGlobalCategoryGroup getGlobalCategoryGroup() {
		return globalCategoryGroup;
	}

	public void setGlobalCategoryGroup(EOGlobalCategoryGroup globalCategoryGroup) {
		this.globalCategoryGroup = globalCategoryGroup;
	}
}
