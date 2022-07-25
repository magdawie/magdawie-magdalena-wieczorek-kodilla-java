package com.kodilla.testing.weather.stub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Comparator.naturalOrder;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }
    public double averageTemperature(){
        double tempSum = 0;
        int count = 0;

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            tempSum += temperature.getValue();
            count++;
        }
        double average = tempSum/(double)count;
        return average;
    }
    public double medianTemperature(){
        double tempS = 0;

        List<Double> tempCount = new ArrayList<>();
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            tempCount.add(temperature.getValue());
        }
        tempCount.sort(naturalOrder());

        if (tempCount.size()%2==1) {
            tempS = tempCount.get((tempCount.size()-1)/2);
        } else {
            tempS = (tempCount.get(tempCount.size()/2) + tempCount.get((tempCount.size()/2)-1)) / 2;
        }

        return tempS;
    }

}