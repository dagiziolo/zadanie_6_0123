public class FirstName {
    public static void main(String[] args) {
//        String[] firstNameTable = new String[]{"Jan","Zosia","Michał"}; też działa - pytanie co jest "lepszą" praktyką?
        String[] firstNameTable = new String[3];
        firstNameTable[0] = "Jan";
        firstNameTable[1] = "Zosia";
        firstNameTable[2] = "Michał";
        System.out.println(firstNameTable[0] + " " + firstNameTable[1] + " " + firstNameTable[2]);


    }
}
