//use GB18030
public class Verification_codev1pre {
    public static void main(String[] args) {
        int m = 1;
        //����m֮��������
        String mn = "";
        //������ַ�������֤�룩
        for (byte c = 00; c < 04; c++) {
        //4��ѭ�������4����֤��
            mn = "";
            //����mn
            for (int i = 0; i < 6; i++) {
            //6��ѭ������6λ��֤��
                m = m + (int) (Math.random() * 5);
                //��ԭ��m�����ϼ�0~4�����������õ���m
                if (m >= 10) {
                //mΪ��λ��
                    m = m - 6;
                    //������m�ϼ�6
                }
                mn = mn + m;
                //���ַ����������m��ֵ
            }
            System.out.println(mn);
            //�����֤��
        }
    }
}
