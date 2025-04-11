// ApartmentDetails.java

public class ApartmentDetails {
    private String price;
    private String location;
    private String distance;
    private int bedrooms;
    private String amenities;

    // Default constructor with placeholder data
    public ApartmentDetails() {
        this.price = "N/A";
        this.location = "N/A";
        this.distance = "N/A";
        this.bedrooms = 0;
        this.amenities = "N/A";
    }

    // Getters and Setters would be added here as needed

    @Override
    public String toString() {
        return "Price: " + price + ", Location: " + location +
               ", Distance from work: " + distance + ", Bedrooms: " + bedrooms +
               ", Amenities: " + amenities;
    }
}
