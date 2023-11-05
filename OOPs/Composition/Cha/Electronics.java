package OOPs.Composition.Cha;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Electronics {

    private Calculator calculator;
    private Clock clock;

    public Electronics() {
        calculator = new Calculator();
        clock = new Clock();
    }

    public Calculator getCalculator() {
        return calculator;
    }

    public Clock getClock() {
        return clock;
    }

}

class Calculator {

    public void addition(int num1, int num2) {

        System.out.println(num1 + num2);

    }
}

class Clock {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();

    public void getTimeandDate() {
        System.out.println(dtf.format(now));
    }
}
