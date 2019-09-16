package com.leondesilva.jcor.demo.demo2;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Class to represent the ATM state data.
 *
 */
class AtmStateData {
    private Integer remainingAmount;
    private Map<Integer, Integer> dispenserData = new LinkedHashMap<>();

    /**
     * Method to get the remaining amount.
     *
     * @return the remaining amount
     */
    Integer getRemainingAmount() {
        return remainingAmount;
    }

    /**
     * Method to set the remaining amount.
     *
     * @param remainingAmount the remaining amount
     */
    void setRemainingAmount(int remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

    /**
     * Method to get the dispenser data
     *
     * @return the dispenser data
     */
    Map<Integer, Integer> getDispenserData() {
        return dispenserData;
    }

    /**
     * Method to add the dispenser data.
     *
     * @param dispenserUnitAmount the dispenser unit amount
     * @param count               the count
     */
    void addDispenserData(Integer dispenserUnitAmount, Integer count) {
        this.dispenserData.put(dispenserUnitAmount, count);
    }
}
