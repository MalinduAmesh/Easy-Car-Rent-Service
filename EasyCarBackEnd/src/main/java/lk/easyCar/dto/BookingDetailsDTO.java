package lk.easyCar.dto;

public class BookingDetailsDTO {

    private String bookingDetailID;
    private String rentLosWaiver;

    private DriverDTO driverDTO;
    private BookingDTO bookingDTO;
    private VehicleDTO vehicleDTO;

    public BookingDetailsDTO() {
    }

    public BookingDetailsDTO(String bookingDetailID, String rentLosWaiver, DriverDTO driverDTO, BookingDTO bookingDTO, VehicleDTO vehicleDTO) {
        this.bookingDetailID = bookingDetailID;
        this.rentLosWaiver = rentLosWaiver;
        this.driverDTO = driverDTO;
        this.bookingDTO = bookingDTO;
        this.vehicleDTO = vehicleDTO;
    }

    public String getBookingDetailID() {
        return bookingDetailID;
    }

    public void setBookingDetailID(String bookingDetailID) {
        this.bookingDetailID = bookingDetailID;
    }

    public String getRentLosWaiver() {
        return rentLosWaiver;
    }

    public void setRentLosWaiver(String rentLosWaiver) {
        this.rentLosWaiver = rentLosWaiver;
    }

    public DriverDTO getDriverDTO() {
        return driverDTO;
    }

    public void setDriverDTO(DriverDTO driverDTO) {
        this.driverDTO = driverDTO;
    }

    public BookingDTO getBookingDTO() {
        return bookingDTO;
    }

    public void setBookingDTO(BookingDTO bookingDTO) {
        this.bookingDTO = bookingDTO;
    }

    public VehicleDTO getVehicleDTO() {
        return vehicleDTO;
    }

    public void setVehicleDTO(VehicleDTO vehicleDTO) {
        this.vehicleDTO = vehicleDTO;
    }
}
