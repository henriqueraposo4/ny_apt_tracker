// ApartmentDetails.java

public class ApartmentDetails {
    private String price;
    private String location;
    private String neighborhood;
    private int bathrooms;
    private int bedrooms;
    private String distanceToWorkY;
    private String amenities;
    private String originalUrl;

    // Default constructor with placeholder data
    public ApartmentDetails() {
        this.price = "N/A";
        this.location = "N/A";
        this.neighborhood = "N/A";
        this.bathrooms = 0;
        this.bedrooms = 0;
        this.distanceToWorkY = "N/A";
        this.amenities = "N/A";
        this.originalUrl = "N/A";
    }

    // Getters and Setters would be added here as needed

    @Override
    public String toString() {
        return "Price: " + price +
               ", Location: " + location +
               ", Neighborhood: " + neighborhood +
               ", Bathrooms: " + bathrooms +
               ", Bedrooms: " + bedrooms +
               ", Distance to Work Y: " + distanceToWorkY +
               ", Amenities: " + amenities +
               ", Original URL: " + originalUrl;
    }
}
