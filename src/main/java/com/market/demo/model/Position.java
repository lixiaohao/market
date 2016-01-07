/**
 * 
 */
package com.market.demo.model;

/**
 * @author LiXiaoHao
 *
 */
public class Position {

	private Long id;
	private String name;
	private String deparment;
	public Position() {
		super();
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the deparment
	 */
	public String getDeparment() {
		return deparment;
	}
	/**
	 * @param deparment the deparment to set
	 */
	public void setDeparment(String deparment) {
		this.deparment = deparment;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Position [id=" + id + ", name=" + name + ", deparment="
				+ deparment + "]";
	}
	
	
}
