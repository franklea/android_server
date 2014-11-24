/**
 * 
 */
package com.cs.web.model.vo;

/**
 * @author ZST
 *
 */
public class MyApplyVO extends BaseVO {

	private int id;
	
	private String date;
	
	private ApplyActVO activity;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return the activity
	 */
	public ApplyActVO getActivity() {
		return activity;
	}

	/**
	 * @param activity the activity to set
	 */
	public void setActivity(ApplyActVO activity) {
		this.activity = activity;
	}
}
