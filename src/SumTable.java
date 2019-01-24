public class SumTable {
    public static void main(String[] args) {
        int[] table = new int[5];
        table[0] = 1;
        table[1] = 10;
        table[2] = 100;
        table[3] = 1000;
        table[4] = 10000;
        int sum = table[0] + table[2]+table[4];
        System.out.println(sum);
    }
}
