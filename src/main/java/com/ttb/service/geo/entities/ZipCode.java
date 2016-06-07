package com.ttb.service.geo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
public class ZipCode {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String postalCode;
	private String placeName;
	private String stateName;
	private String stateCode;
	private String countyName;
	private String countyCode;
	@Column(nullable=true)
	private String cityName;
	@Column(nullable=true)
	private String cityCode;
	private double latitude;
	private double longitude;
	private int accuracy;

	protected ZipCode() {}

	/**
	 * @param postalCode
	 * @param placeName
	 * @param stateName
	 * @param stateCode
	 * @param countyName
	 * @param countyCode
	 * @param cityName
	 * @param cityCode
	 * @param latitude
	 * @param longitude
	 * @param accuracy
	 */
	public ZipCode(String postalCode, String placeName, String stateName, String stateCode, String countyName,
			String countyCode, String cityName, String cityCode, double latitude, double longitude, int accuracy) {
		super();
		this.postalCode = postalCode;
		this.placeName = placeName;
		this.stateName = stateName;
		this.stateCode = stateCode;
		this.countyName = countyName;
		this.countyCode = countyCode;
		this.cityName = cityName;
		this.cityCode = cityCode;
		this.latitude = latitude;
		this.longitude = longitude;
		this.accuracy = accuracy;
	}

	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * @return the placeName
	 */
	public String getPlaceName() {
		return placeName;
	}

	/**
	 * @param placeName the placeName to set
	 */
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	/**
	 * @return the stateName
	 */
	public String getStateName() {
		return stateName;
	}

	/**
	 * @param stateName the stateName to set
	 */
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	/**
	 * @return the stateCode
	 */
	public String getStateCode() {
		return stateCode;
	}

	/**
	 * @param stateCode the stateCode to set
	 */
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	/**
	 * @return the countyName
	 */
	public String getCountyName() {
		return countyName;
	}

	/**
	 * @param countyName the countyName to set
	 */
	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}

	/**
	 * @return the countyCode
	 */
	public String getCountyCode() {
		return countyCode;
	}

	/**
	 * @param countyCode the countyCode to set
	 */
	public void setCountyCode(String countyCode) {
		this.countyCode = countyCode;
	}

	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}

	/**
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	/**
	 * @return the cityCode
	 */
	public String getCityCode() {
		return cityCode;
	}

	/**
	 * @param cityCode the cityCode to set
	 */
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	/**
	 * @return the latitude
	 */
	public double getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return the longitude
	 */
	public double getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	/**
	 * @return the accuracy
	 */
	public int getAccuracy() {
		return accuracy;
	}

	/**
	 * @param accuracy the accuracy to set
	 */
	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ZipCode [id=" + id + ", postalCode=" + postalCode + ", placeName=" + placeName + ", stateName="
				+ stateName + ", stateCode=" + stateCode + ", countyName=" + countyName + ", countyCode=" + countyCode
				+ ", cityName=" + cityName + ", cityCode=" + cityCode + ", latitude=" + latitude + ", longitude="
				+ longitude + ", accuracy=" + accuracy + "]";
	}
	

}
