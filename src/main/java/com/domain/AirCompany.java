package com.domain;

import java.util.List;

/**
 * @author Stepan
 */
public class AirCompany {

    List<Flight> flights;

    public Integer totalProfit(){
        Integer total =0;
        for(Flight f : flights){
            total+= f.getProfit();
        }
        return total;
    }

    public void setFlights(List flights) {
        this.flights = flights;
    }

    public List getFlights() {
        return flights;
    }
}
