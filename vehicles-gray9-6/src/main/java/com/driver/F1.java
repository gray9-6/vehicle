package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned
        super(name,4,2,5,isManual,"Commerical",8);
    }

    public void accelerate(int rate){
        int newSpeed = super.getCurrentSpeed() + rate; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        if(newSpeed == 0) {
            //Stop the car, set gear as 1
            super.stop();
            super.changeGear(1);
        } else if (newSpeed >=1 && newSpeed <= 50) {
            super.changeGear(1);
        } else if (newSpeed >= 51 && newSpeed <= 100) {
            super.changeGear(2);
        } else if (newSpeed >= 101 && newSpeed <= 150) {
            super.changeGear(3);
        } else if (newSpeed >= 151 && newSpeed <= 200) {
            super.changeGear(4);
        } else if (newSpeed >= 201 && newSpeed <= 250) {
            super.changeGear(5);
        } else if (newSpeed >250) {
            super.changeGear(6);
        }
        //for all other cases, change the gear accordingly

        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
