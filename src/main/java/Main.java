public class Main {
    public static void main(String[] args) {

            Range range1 = new Range(1, 2);
            Range range2 = new Range(2, 6);

            Range range3 =new Range(20);


        System.out.println(range1.getStart());
        range1.setStart(3);
        System.out.print(range1.getStart()+" ");
        System.out.println(range1.getEnd());
        System.out.println("range 2");
        System.out.println(range2.getStart());
        range2.setStart(0);
        System.out.println(range2.getStart());

        System.out.println("Length range2: "+range2.lengthOfRange());
        System.out.println(range2.getEnd());

        System.out.println(range3.getStart()+" "+ range3.getEnd());
    }
}
