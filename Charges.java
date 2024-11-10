import java.util.*;

class Bank{
    protected double defaultCharges=100;
    public double getTranction(){
        return defaultCharges;
    }
}

class ICICI extends Bank{
    private double icici_charged=1.20;
    public double Transaction(){
        return defaultCharges*icici_charged;
    }
}

class HDFC extends Bank{
    private double hdfc_charged=1.40;
    public double Transaction(){
        return defaultCharges*hdfc_charged;
    }
}

public class Charges {
    public static void main(String[] args) {
        ICICI i = new ICICI();
        HDFC h = new HDFC();
        System.out.println("ICICI Transaction Charge: Rs. " + i.Transaction());
        System.out.println("HDFC Transaction Charge: Rs. " + h.Transaction());
    }
}