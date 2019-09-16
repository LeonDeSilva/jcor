package com.leondesilva.jcor.demo.demo2;

/**
 * Class to represent ATM input data.
 *
 */
class AtmInputData {
    private int amount;

    /**
     * Constructor to instantiate AtmInputData
     *
     * @param amount the amount to withdraw
     */
    AtmInputData(int amount) {
        this.amount = amount;
    }

    /**
     * Method to get the amount.
     *
     * @return the amount
     */
    int getAmount() {
        return amount;
    }
}
