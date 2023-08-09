package ThreadRace;
import java.util.List;
public class NumberProcessor implements Runnable{
    private List<Integer> inputList;
    private List<Integer> evenNumbers;
    private List<Integer> oddNumbers;

    public NumberProcessor(List<Integer> inputList, List<Integer> evenNumbers, List<Integer> oddNumbers) {
        this.inputList = inputList;
        this.evenNumbers = evenNumbers;
        this.oddNumbers = oddNumbers;
    }

    @Override
    public void run() {
        for (Integer number : inputList) {
            if (number % 2 == 0) {
                synchronized (evenNumbers) {
                    evenNumbers.add(number);
                }
            } else {
                synchronized (oddNumbers) {
                    oddNumbers.add(number);
                }
            }
        }
    }
}
