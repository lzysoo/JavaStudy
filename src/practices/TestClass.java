package practices;

/**
 * ���ΪtestMethod��
 * ��Ϊnullֵ����ǿ��ת��Ϊ�κ�java������,(String)nullҲ�ǺϷ��ġ�
 * ��nullǿ��ת��������Ч�����䷵��ֵ����Ϊnull����static�����ĵ����Ǻ������󶨵ģ�������������з�����������ȷ�����
 * ��������û��static���ξ�ֻ���ö�����з��ʣ�ʹ��null���ö���϶��ᱨ��ָ����ˡ�
 */

public class TestClass {
    public static void main(String[] args) {
        ((TestClass)null).testMethod();
    }
    private static void testMethod() {
        System.out.println("testMethod");
    }
}
