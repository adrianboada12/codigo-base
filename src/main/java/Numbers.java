public class Numbers
{
    private int one;
    private int two;

    public Numbers(int one, int two) {
        this.one = one;
        this.two = two;
    }

    public int getOne() {
        return one;
    }

    public void One(int one) {
        this.one = one;
    }

    public int getTwo() {
        return two;
    }

    public void setTwo(int two) {
        this.two = two;
    }

    public int getSum(){
        int Sum;
        Sum = one + two;
        return Sum;
    }
    public int getSubtraction(){
        int subtraction;
        subtraction = one - two;
        return subtraction;
    }
}

