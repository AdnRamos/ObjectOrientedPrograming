public class Address {
    private String county;
    private String street;
    private String number;
    private String neighborhood;
    private String complement;

    public Address (String county, String street, String number, String neighborhood, String complement){
        this.county = county;
        this.street = street;
        this.number = number;
        this.neighborhood = neighborhood;
        this.complement = complement;
    }

    public String getCounty(){
        return county;
    }
    public void setCounty( String county){
        this.county = county;
    }
    public String getStreet( ){
        return street;
    }
    public void setStreet(String street){
        this.street = street;
    }
    public String getNumber(){
        return number;
    }
    public void setNumber(String number){
        this.number = number;
    }
    public String getNeighbordhood(){
        return neighborhood;
    }
    public void setNeighbordhood(String neighborhood){
        this.neighborhood = neighborhood;
    }
    public String getComplement (){
        return complement;
    }
    public void setComplement(String complement){
        this.complement = complement;
    }
}

