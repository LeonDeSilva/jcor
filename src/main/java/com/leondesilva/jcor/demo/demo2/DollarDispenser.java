package com.leondesilva.jcor.demo.demo2;

import com.leondesilva.jcor.Handler;

/**
 * Class to represent the dollar dispenser.
 *
 */
class DollarDispenser implements Handler<AtmInputData, AtmStateData> {
    private Integer dispenserUnitAmount;

    /**
     * Constructor to instantiate the dispenser unit amount.
     *
     * @param dispenserUnitAmount the dispenser unit amount
     */
    DollarDispenser(Integer dispenserUnitAmount) {
        this.dispenserUnitAmount = dispenserUnitAmount;
    }

    /**
     * Method to evaluate whether the current handler is capable for processing the given input object.
     *
     * @param atmInputData  the input object
     * @param atmStateData  the atm state data
     * @return true if processing should happen through the current handler, else returns false
     */
    @Override
    public boolean evaluate(AtmInputData atmInputData, AtmStateData atmStateData) {
        return atmStateData.getRemainingAmount() >= dispenserUnitAmount;
    }

    /**
     * Method to do the processing.
     *
     * @param atmInputData  the input object
     * @param atmStateData the status object keep track of the status of execution
     */
    @Override
    public void process(AtmInputData atmInputData, AtmStateData atmStateData) {
        int dispensedUnitCount = atmStateData.getRemainingAmount() / dispenserUnitAmount;
        int remainingAmount = atmStateData.getRemainingAmount() % dispenserUnitAmount;

        atmStateData.setRemainingAmount(remainingAmount);
        atmStateData.addDispenserData(dispenserUnitAmount, dispensedUnitCount);
    }

    /**
     * Method to let the executor know whether the processing should stop from the current handler or not.
     *
     * @param atmStateData the status object
     * @return true if processing should end from the current handler, false if processing should also go for next handler
     */
    @Override
    public boolean shouldExitChainAfterProcessing(AtmStateData atmStateData) {
        return atmStateData.getRemainingAmount() == 0;
    }
}
