package Ex1;

import java.util.Date;
import java.util.EnumMap;

public class Train {
    private Cities destination;
    private String trainNumber;
    private Date departureTime;
    private int summarySeatsCount;
    private EnumMap<SeatTypes, Integer> allSeatsCountByTypes;

    private void setSummarySeatsCount() {
        for (SeatTypes type: SeatTypes.values()) {
            summarySeatsCount += allSeatsCountByTypes.get(type);
        }
    }
    public int getSummarySeatsCount() {
        return summarySeatsCount;
    }

    public Train(Cities destination, String trainNumber, Date departureTime, int commonSeatsCount, int compartmentSeatsCount, int reservedSeatsCount,int luxurySeatsCount ) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
        this.allSeatsCountByTypes = new EnumMap<SeatTypes, Integer>(SeatTypes.class);
        allSeatsCountByTypes.put(SeatTypes.COMMON, commonSeatsCount);
        allSeatsCountByTypes.put(SeatTypes.COMPARTMENT, compartmentSeatsCount);
        allSeatsCountByTypes.put(SeatTypes.RESERVED_SEAT, reservedSeatsCount);
        allSeatsCountByTypes.put(SeatTypes.LUXURY, luxurySeatsCount);
        setSummarySeatsCount();
    }

    public Cities getDestination() {
        return destination;
    }

    public void setDestination(Cities destination) {
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

    public  void setSeatsCountByType(SeatTypes type, int newCount){
        allSeatsCountByTypes.put(type, newCount);
        setSummarySeatsCount();
    }
    public int getSeatsCountByType(SeatTypes type){
        return allSeatsCountByTypes.get(type);
    }

    @Override
    public String toString() {
        return "Train{" +
                "destination=" + destination +
                ", trainNumber='" + trainNumber + '\'' +
                ", departureTime=" + departureTime +
                ", summarySeatsCount=" + summarySeatsCount +
                ", allSeatsCountByTypes=" + allSeatsCountByTypes +
                '}';
    }
}
