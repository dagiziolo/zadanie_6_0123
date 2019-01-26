public class LoopTest {

    public static void main(String[] args) {
        double i = 0;
        System.out.printf("%.0f, ", i); //wyciągniete z pętli by był int
        i+=0.1;
        while (i < 3) {
            System.out.printf("%.1f, ", i);
            i += 0.1;
        }
        System.out.printf("%.0f\n", i);  //wyciągniete z pętli by był int

        //druga pętla
        i = 0;
        System.out.printf("%.0f, ", i); //wyciągniete z pętli by był int
        i+=0.1;
        do {
            System.out.printf("%.1f, ", i);
            i += 0.1;
        } while (i < 3);
        System.out.printf("%.0f\n", i); //wyciągniete z pętli by był int


    }


}
