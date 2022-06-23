public class verificationcode_v1beta {
    public static void main(String[] args) {
        int code = 0;
        int j = 0;
        cycle1:
        for (int i = 0; i < 4; i++) {
            for (; j < 6; j++) {
                code = 10 * code + (int)(Math.random() * 10);
                if (code < 10) {
                    i--;
                    j++;
                    continue cycle1;
                }
                else if (code < 100000 & j == 5){
                    j--;
                }
            }
            System.out.println(code);
            code = j = 0;
        }
    }
}
