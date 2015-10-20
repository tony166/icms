package org.icms.core.entity;

import java.util.Set;

import org.icms.core.entity.base.BaseEntity;

public class Dictionary extends BaseEntity{
	private static final long serialVersionUID = 1L;
	private Long id;
	private Dictionary parent;
	private Set<Dictionary> child;
	private String code;
	private String name;
	private Boolean isShow;
	private Integer postion;
	private String description;
	
	public Dictionary() {
		super();
	}
	
	public Dictionary(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Dictionary getParent() {
		return parent;
	}
	public void setParent(Dictionary parent) {
		this.parent = parent;
	}
	public Set<Dictionary> getChild() {
		return child;
	}
	public void setChild(Set<Dictionary> child) {
		this.child = child;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
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
	public Boolean getIsShow() {
		return isShow;
	}
	public void setIsShow(Boolean isShow) {
		this.isShow = isShow;
	}
	public Integer getPostion() {
		return postion;
	}
	public void setPostion(Integer postion) {
		this.postion = postion;
	}
}
