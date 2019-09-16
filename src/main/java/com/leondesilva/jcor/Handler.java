package com.leondesilva.jcor;

/**
 * Interface to represent a handler in JCor.
 * Handler is equal to a single node or processor in chain of responsibility design.
 *
 * @param <I>   the input object
 * @param <S>   the status object
 */
public interface Handler<I, S> {

    /**
     * Method to evaluate whether the current handler is capable for processing the given input object.
     *
     * @param input  the input object
     * @param status the status object
     * @return  true if processing should happen through the current handler, else returns false
     */
    boolean evaluate(I input, S status);

    /**
     * Method to do the processing.
     *
     * @param input     the input object
     * @param status    the status object keep track of the status of execution
     */
    void process(I input, S status);

    /**
     * Method to let the executor know whether the processing should stop from the current handler or not.
     *
     * @param status    the status object
     * @return          true if processing should end from the current handler, false if processing should also go for next handler
     */
    boolean shouldExitChainAfterProcessing(S status);
}
