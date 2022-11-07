package Proxy;

public class Printer implements Printable {
    private String name;
    public Printer(String name) {                   // ���캯��
        this.name = name;
        heavyJob("��������Printer��ʵ��(" + name + ")");
    }
    public void setPrinterName(String name) {       // ��������
        this.name = name;
    }
    public String getPrinterName() {                // ��ȡ����
        return name;
    }

    public void print(String string) {              // ��ʾ����ӡ�����ֵ�����
        System.out.println("=== " + name + " ===");
        System.out.println(string);
    }
    private void heavyJob(String msg) {             // �ػ�
        System.out.print(msg);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.print(".");
        }
        System.out.println("������");
    }
}
