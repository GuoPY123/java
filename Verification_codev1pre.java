//use GB18030
public class Verification_codev1pre {
    public static void main(String[] args) {
        int m = 1;
        //变量m之后运算用
        String mn = "";
        //输出的字符串（验证码）
        for (byte c = 00; c < 04; c++) {
        //4次循环，输出4个验证码
            mn = "";
            //重置mn
            for (int i = 0; i < 6; i++) {
            //6次循环生成6位验证码
                m = m + (int) (Math.random() * 5);
                //在原来m基础上加0~4任意整数，得到新m
                if (m >= 10) {
                //m为个位数
                    m = m - 6;
                    //在生成m上减6
                }
                mn = mn + m;
                //给字符串后面添加m的值
            }
            System.out.println(mn);
            //输出验证码
        }
    }
}
