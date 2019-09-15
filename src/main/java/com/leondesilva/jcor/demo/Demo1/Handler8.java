package com.leondesilva.jcor.demo.Demo1;

import com.leondesilva.jcor.Handler;

class Handler8 implements Handler<Input, Status> {
    /**
     * Method to evaluate whether the current handler is capable for processing the given input object.
     *
     * @param input the input object
     * @return true if processing should happen through the current handler, else returns false
     */
    @Override
    public boolean evaluate(Input input) {
        return input.getCount() <= 40;
    }

    /**
     * Method to do the processing.
     *
     * @param input  the input object
     * @param status the status object keep track of the status of execution
     */
    @Override
    public void process(Input input, Status status) {
        status.setMessage("Between 36 and 40");
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