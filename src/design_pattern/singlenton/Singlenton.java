package design_pattern.singlenton;

/**
 * �����������ģʽ���ڵ�һ�ε��÷���ʱʵ�����Լ�
 *
 * @author zeyueli
 * @date 2018/8/9 AM:11:00
 */
public class Singlenton {
    private Singlenton(){}//˽�л����캯��
    private static Singlenton single;
    //getInstance()��������Ψһ��ʵ����������static��
    public static Singlenton getInstance(){    //�̲߳���ȫд��
        if(single == null)
            single = new Singlenton();
        return single;
    }

}
/*
public class Singlenton2{
    private Singlenton2(){}
    private static Singlenton2 single;
    public static synchronized Singlenton2 getInstance(){  //�̰߳�ȫд��������ͬ���ֶ�synchronized
        if (single == null)
            single = new Singlenton2();
        return single;
    }
}
*/
/**
 * �����������ģʽ���������ʱ�õ��Լ���ʵ��
 *
 * @author zeyueli
 * @date 2018/8/9 AM:11:30
 */
/*
public class Singlenton3{
    private Singlenton3(){}
    private static Singlenton3 single = new Singlenton3();
    public static Singlenton3 getInstance(){
        return single;
    }
}
*/
/**
 * Ӧ�ó�����
 * Windows��Task Manager�������������
 * Windows��Recycle Bin������վ��
 */





