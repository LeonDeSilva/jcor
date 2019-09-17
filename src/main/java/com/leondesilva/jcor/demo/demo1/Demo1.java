package com.leondesilva.jcor.demo.demo1;

import com.leondesilva.jcor.JCorExecutor;

/**
 * Class for the demo 1
 *
 */
class Demo1 {
    public static void main(String[] args) throws Exception {
        // ======================== Before using JCOR ========================
        /*
            Code is highly unreadable.
            Maintaining the code is difficult.
            Cyclomatic complexity is 11.
        */
        Input input = new Input(22);

        if (input.getCount() <= 5) {
            System.out.println("Between 0 and 5");
        } else if (input.getCount() <= 10) {
            System.out.println("Between 6 and 10");
        } else if (input.getCount() <= 15) {
            System.out.println("Between 11 and 15");
        } else if (input.getCount() <= 20) {
            System.out.println("Between 16 and 20");
        } else if (input.getCount() <= 25) {
            System.out.println("Between 21 and 25");
        } else if (input.getCount() <= 30) {
            System.out.println("Between 26 and 30");
        } else if (input.getCount() <= 35) {
            System.out.println("Between 31 and 35");
        } else if (input.getCount() <= 40) {
            System.out.println("Between 36 and 40");
        } else if (input.getCount() <= 45) {
            System.out.println("Between 41 and 45");
        } else if (input.getCount() <= 50) {
            System.out.println("Between 46 and 50");
        } else {
            System.out.println("Greater than 50");
        }

        // ======================== After using JCOR ========================
        /*
            Cyclomatic complexity is zero.
            Code is readable and clean.
            Code is extensible
         */
        JCorExecutor<Input, Status> jCorExecutor = new JCorExecutor<>();
        jCorExecutor.addHandler(new Handler1());
        jCorExecutor.addHandler(new Handler2());
        jCorExecutor.addHandler(new Handler3());
        jCorExecutor.addHandler(new Handler4());
        jCorExecutor.addHandler(new Handler5());
        jCorExecutor.addHandler(new Handler6());
        jCorExecutor.addHandler(new Handler7());
        jCorExecutor.addHandler(new Handler8());
        jCorExecutor.addHandler(new Handler9());
        jCorExecutor.addHandler(new Handler10());
        jCorExecutor.addHandler(new Handler11());

        Status status = new Status();
        jCorExecutor.execute(input, status);
        System.out.println(status.getMessage());
    }
}
