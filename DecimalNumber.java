package lp.training;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DecimalNumber {

    public static void main(String[] args) {

        for (BigDecimal bd = new BigDecimal("10"); bd.compareTo(new BigDecimal("0")) != 0; bd = bd.subtract(new BigDecimal("0.1"))) {
            System.out.println(bd);
        }

        BigDecimal bd1 = new BigDecimal(23.334798478989);

        System.out.println("BigDecimal Round Value : " + bd1.setScale(3, RoundingMode.HALF_DOWN));

        BigDecimal bd2 = new BigDecimal(23.3343444121);

        System.out.println("BigDecimal Round Value : " + bd2.setScale(2, RoundingMode.HALF_UP));

    }
}
