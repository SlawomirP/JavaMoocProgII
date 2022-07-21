package ex810;

import java.util.HashMap;

public class IOU {

    HashMap<String, Double> loan;

    public IOU() {
        this.loan = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.loan.put(toWhom,amount);
    }
    public double howMuchDoIOweTo(String toWhom){
        return this.loan.getOrDefault(toWhom, 0.0);
    }
}
