package Proxy;

public interface Printable {
    public abstract void setPrinterName(String name);   // ��������
    public abstract String getPrinterName();            // ��ȡ����
    public abstract void print(String string);          // ��ʾ���֣���ӡ�����
}
