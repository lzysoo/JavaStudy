package design_pattern.factory.simple_factory;

/**
 * �����ࣺ�������ڽӵ��������տͻ��ṩ�Ĳ�������
 *
 * �������Ǳ�ģʽ�ĺ��ģ�����һ������ҵ�߼����ж��߼�������������Ʒ
 */

public class Factory {
    public BMW createBMW(int type){
        switch(type){
            case 320:
                return new BMW320();
            case 523:
                return new BMW523();
            default:
                break;
        }
        return null;
    }
}
