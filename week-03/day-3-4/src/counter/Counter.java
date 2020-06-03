package counter;

public class Counter {
//    Create Counter class
//    which has an integer field value
//                    when creating it should have a default value 0 or we can specify it when creating
//    we can add(number) to this counter another whole number
//    or we can add() without parameters just increasing the counter's value by one
//    and we can get() the current value
//    also we can reset() the value to the initial value
//    Check if everything is working fine with the proper test
//    Download CounterTest.java and place it next to your solution
//    If something's red in it, ALT+Enter Add JUnit5 to classpath (5 aka JUnit FIVE not 4 or 3)
//    Then run the tests with the green play button before the lines (run all of them before the classname)

    private int value;
    private static int defaultValue;

    public Counter(){
        this.value = 0;
        Counter.defaultValue = 0;
    }

    public Counter(int value){
        this.value = value;
        Counter.defaultValue = value;
    }

    public void add(int number){
        value += number;
    }

    public void add(){
        value++;
    }

    public int get(){
        return value;
    }

    public void reset(){
        value = Counter.defaultValue;
    }
}
