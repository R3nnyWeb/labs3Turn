package Ex1;

import java.util.Date;

public class Train {
    private String destination;
    private String trainNumber;
    private Date departureTime;
    private int allPlaces;
    private int coupePlaces;
    private int secondClassPlaces;
    private int luxuryPlaces;

    private void setAllPlaces() {
        this.allPlaces = coupePlaces + secondClassPlaces + luxuryPlaces;;
    }
    public int getAllPlaces() {
        return allPlaces;
    }

    public Train(String destination, String trainNumber, Date departureTime, int coupePlaces, int secondClassPlaces, int luxuryPlaces) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
        this.coupePlaces = coupePlaces;
        this.secondClassPlaces = secondClassPlaces;
        this.luxuryPlaces = luxuryPlaces;
        setAllPlaces();
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public int getCoupePlaces() {
        return coupePlaces;
    }

    public void setCoupePlaces(int coupePlaces) {
        this.coupePlaces = coupePlaces;
        setAllPlaces();
    }

    public int getSecondClassPlaces() {
        return secondClassPlaces;

    }

    public void setSecondClassPlaces(int secondClassPlaces) {
        this.secondClassPlaces = secondClassPlaces;
        setAllPlaces();

    }

    public int getLuxuryPlaces() {
        return luxuryPlaces;
    }

    @Override
    public String toString() {
        return "Train{" +
                "destination='" + destination + '\'' +
                ", trainNumber='" + trainNumber + '\'' +
                ", departureTime=" + departureTime +
                ", allPlaces=" + allPlaces +
                ", coupePlaces=" + coupePlaces +
                ", secondClassPlaces=" + secondClassPlaces +
                ", luxuryPlaces=" + luxuryPlaces +
                '}';
    }

    public void setLuxuryPlaces(int luxuryPlaces) {
        this.luxuryPlaces = luxuryPlaces;
        setAllPlaces();

    }
}
