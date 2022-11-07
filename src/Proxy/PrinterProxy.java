package Proxy;

public class PrinterProxy implements Printable {
    private String name;            // ����
    private Printer real;           // �����ˡ�

    public PrinterProxy(String name) {      // ���캯��
        this.name = name;
    }

    public synchronized void setPrinterName(String name) {  // ��������
        if (real != null) {
            real.setPrinterName(name);  // ͬʱ���á����ˡ�������
        }
        this.name = name;
    }

    public String getPrinterName() {    // ��ȡ����
        return name;
    }

    public void print(String string) {  // ��ʾ
        realize();
        real.print(string);
    }

    private synchronized void realize() {   // ���ɡ����ˡ�
        if (real == null) {
            real = new Printer(name);
        }
    }
}
