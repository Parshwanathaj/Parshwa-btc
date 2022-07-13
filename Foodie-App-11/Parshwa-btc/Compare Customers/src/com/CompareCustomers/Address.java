package com.CompareCustomers;

public class Address 
{
	String area;
	String city;
public Address() 
	{
		// default constructor
	}
public Address(String area, String city) 
{
		this.area = area;
		this.city = city;
	}
public String getArea() 
	{
		return "";
	}
public void setArea(String area)
{
	}
public String getCity() 
{
		return "";
	}
public void setCity(String city) {

	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((area == null) ? 0 : area.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (area == null) {
			if (other.area != null)
				return false;
		} else if (!area.equals(other.area))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Address [area=" + area + ", city=" + city + "]";
	}
}