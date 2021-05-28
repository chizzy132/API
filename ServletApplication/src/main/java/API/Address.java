package API;

public class Address {
   	private String Type;
    private String City;
    private String Country;
    private String Addressline;
      
    public Address(String type, String city, String country, String addressline) {
		Type = type;
		City = city;
		Country = country;
		Addressline = addressline;
	}

	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getAddressline() {
		return Addressline;
	}
	public void setAddressline(String addressline) {
		Addressline = addressline;
	}
}
