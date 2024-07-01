public class Main {
    public static void main(String[] args) {
        System.out.println("안녕 자바");

        //변수 기본 자료형
        boolean boolean_val = true;
        char char_val = 'c';
        byte byte_val = 2;
        short short_val = 10;
        int int_val = 200;
        long long_val = 3000;
        float float_val = 40000;
        double double_val = 500000;
        // 변수의 사이즈도 알고 싶었으나 JAVA 의 변수의 크기는 primative type 을 제외하면 모두 객체,
        // 객체를 가리키는 변수는 어쩌구..
        System.out.printf("boolean  :%10b size(boolean) :%5d \n",boolean_val,Boolean.TYPE);// +"   , size(boolean) : " + Boolean.TYPE);
        System.out.println("char    :"+char_val    +"   , size(char)    : " + Character.BYTES);
        System.out.println("byte    :"+byte_val    +"   , size(byte)    : " + Byte.BYTES);
        System.out.println("short   :"+short_val   +"   , size(short)   : " + Short.BYTES);
        System.out.println("int     :"+int_val     +"   , size(int)     : " + Integer.BYTES);
        System.out.println("long    :"+long_val    +"   , size(long)    : " + Long.BYTES);
        System.out.println("float   :"+float_val   +"   , size(float)   : " + Float.BYTES);
        System.out.println("double  :"+double_val  +"   , size(double)  : " + Double.BYTES);

        //그니까 지금 내 상태는 기본 자료형조차도 출력할 수 없는 능력치를 가지고 있다고 볼 수 있겠다.
        //https://hstory0208.tistory.com/entry/Java-print-println-printf-%EC%B6%9C%EB%A0%A5%EB%AC%B8%EC%9D%98-%EB%AA%A8%EB%93%A0-%EA%B2%83
    }
}
