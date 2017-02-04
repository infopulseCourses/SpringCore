package com.domain;

import java.util.List;
import java.util.Map;

/**
 * @author Stepan
 */
public class Flight {

    private AirPlane airPlane;
    private Map<String, Ticket> tickets;
    private List<Staff> staff;
    private Integer distance;

    public Integer getProfit() {
        Integer profit = 0;
        for (Ticket t : tickets.values()) {
            profit += t.getPrice();
        }

        for (Staff s : staff) {
            profit -= s.getSalary();
        }
        profit -= airPlane.getFuelConsumption() * distance * 300;
        return profit;
    }

    public void setAirPlane(AirPlane airPlane) {
        this.airPlane = airPlane;
    }

    public void setTickets(Map<String, Ticket> tickets) {
        this.tickets = tickets;
    }

    public void setStaff(List<Staff> staff) {
        this.staff = staff;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }
}
