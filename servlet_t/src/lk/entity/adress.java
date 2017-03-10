package lk.entity;

public class adress extends identity {
	private String city;
	private String country;
	private long userid;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public long getUserid() {
		return userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "adress [city=" + city + ", country=" + country + ", userid=" + userid + ", id=" + id + "]";
	}

}
