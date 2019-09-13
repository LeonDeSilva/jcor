package com.leondesilva.jcor;

import java.util.LinkedList;
import java.util.List;

/**
 * JCor executor class to execute a list of handlers.
 *
 * @param <I>   the input object type
 * @param <S>   the status object type
 */
public class JCorExecutor<I, S> {
    private List<Handler<I, S>> handlerList = new LinkedList<>();

    /**
     * Method to add a handler to execution list
     *
     * @param handler the handler to add
     */
    public void addHandler(Handler<I, S> handler) {
        handlerList.add(handler);
    }

    /**
     * Method to execute the given list of handlers for a given input and status object.
     *
     * @param input     the input object
     * @param status    the status object
     */
    public void execute(I input, S status) {

        for (Handler<I, S> handler : handlerList) {
            if (handler != null && handler.evaluate(input)) {
                handler.process(input, status);

                if (handler.shouldExitChainAfterProcessing(status)) {
                    break;
                }
            }
        }
    }
}
