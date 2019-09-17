package com.leondesilva.jcor.demo.demo2;

import com.leondesilva.jcor.JCorExecutor;

import java.util.Map;

/**
 * Class for the demo 2 - ATM example
 *
 */
class Demo2 {
    public static void main(String[] args) throws Exception {
        // ATM input data with the withdrawal amount
        AtmInputData atmInputData = new AtmInputData(480);

        // State object to maintain the dispenser information
        AtmStateData atmStateData = new AtmStateData();

        JCorExecutor<AtmInputData, AtmStateData> jCorExecutor = new JCorExecutor<>();
        // Initializing dispenser
        jCorExecutor.addHandler(new InitDispenser());

        // $100 dispenser, $50 dispenser, $20 dispenser, $10 dispenser added for execution
        jCorExecutor.addHandler(new DollarDispenser(100));
        jCorExecutor.addHandler(new DollarDispenser(50));
        jCorExecutor.addHandler(new DollarDispenser(20));
        jCorExecutor.addHandler(new DollarDispenser(10));

        // Execute the chain
        jCorExecutor.execute(atmInputData, atmStateData);

        // Print the dispenser data
        Map<Integer, Integer> dispenserData = atmStateData.getDispenserData();

        for (Map.Entry<Integer, Integer> entry : dispenserData.entrySet()) {
            System.out.println(entry.getKey() + " Dollar Notes => " + entry.getValue());
        }
    }
}
