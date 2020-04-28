package task2_1;

public class Main {
    public static void main(String[] args) {
        Department[] noChildred = new Department[0];
        Department[] children1 = {new Department(2, noChildred), new Department(5, noChildred)};
        Department dep1 = new Department(3, children1);
        System.out.println(dep1.totalProcessTime());
    }
}
