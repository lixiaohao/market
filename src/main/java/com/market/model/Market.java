/**
 * 
 */
package com.market.model;

import java.util.Date;

/**
 * @author LiXiaoHao
 *
 */
public class Market {
	
	/**id**/
	private Long 	id;
	/**市场名称**/
	private String 	name;
	/**所在地址**/
	private String 	address;
	/**描述**/
	private String 	comment;
	/**浏览量**/
	private Integer pageViews;
	/**创建日期**/
	private Date    createDate;
	/**
	 * 
	 */
	public Market() {
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
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}
	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}
	/**
	 * @return the pageViews
	 */
	public Integer getPageViews() {
		return pageViews;
	}
	/**
	 * @param pageViews the pageViews to set
	 */
	public void setPageViews(Integer pageViews) {
		this.pageViews = pageViews;
	}
	/**
	 * @return the createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}
	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	
}
