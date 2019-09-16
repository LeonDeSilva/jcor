package com.leondesilva.jcor.demo.Demo1;

import com.leondesilva.jcor.Handler;

class Handler3 implements Handler<Input, Status> {
    /**
     * Method to evaluate whether the current handler is capable for processing the given input object.
     *
     * @param input the input object
     * @return true if processing should happen through the current handler, else returns false
     */
    @Override
    public boolean evaluate(Input input, Status status) {
        return input.getCount() <= 15;
    }

    /**
     * Method to do the processing.
     *
     * @param input  the input object
     * @param status the status object keep track of the status of execution
     */
    @Override
    public void process(Input input, Status status) {
        status.setMessage("Between 11 and 15");
    }

    /**
     * Method to let the executor know whether the processing should stop from the current handler or not.
     *
     * @param status the status object
     * @return true if processing should end from the current handler, false if processing should also go for next handler
     */
    @Override
    public boolean shouldExitChainAfterProcessing(Status status) {
        return true;
    }
}
