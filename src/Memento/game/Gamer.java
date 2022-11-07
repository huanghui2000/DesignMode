package Memento.game;
import java.util.*;

public class Gamer {
    private int money;                          // ���ֽ�Ǯ
    private List fruits = new ArrayList();      // ��õ�ˮ��
    private Random random = new Random();       // �����������
    private static String[] fruitsname = {      // ��ʾˮ�����������
        "ƻ��", "����", "�㽶", "����",
    };
    public Gamer(int money) {                   // ���캯��
        this.money = money;
    }
    public int getMoney() {                     // ��ȡ��ǰ���ֽ�Ǯ
        return money;
    }
    public void bet() {                         // Ͷ�����ӽ�����Ϸ
        int dice = random.nextInt(6) + 1;           // ������
        if (dice == 1) {                            // ���ӽ��Ϊ1���������ֽ�Ǯ
            money += 100;
            System.out.println("���ֽ�Ǯ�����ˡ�");
        } else if (dice == 2) {                     // ���ӽ��Ϊ2�����ֽ�Ǯ����
            money /= 2;
            System.out.println("���ֽ�Ǯ�����ˡ�");
        } else if (dice == 6) {                     // ���ӽ��Ϊ6�����ˮ��
            String f = getFruit();
            System.out.println("�����ˮ��(" + f + ")��");
            fruits.add(f);
        } else {                                    // ���ӽ��Ϊ3��4��5��ʲô�����ᷢ��
            System.out.println("ʲô��û�з�����");
        }
    }
    public Memento createMemento() {                // �������
        Memento m = new Memento(money);
        Iterator it = fruits.iterator();
        while (it.hasNext()) {
            String f = (String)it.next();
            if (f.startsWith("�óԵ�")) {         // ֻ����óԵ�ˮ��
                m.addFruit(f);
            }
        }
        return m;
    }
    public void restoreMemento(Memento memento) {   // ����
        this.money = memento.money;
        this.fruits = memento.getFruits();
    }
    public String toString() {                      // ���ַ�����ʾ���˹�״̬
        return "[money = " + money + ", fruits = " + fruits + "]";
    }
    private String getFruit() {                     // ���һ��ˮ��
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "�óԵ�";
        }
        return prefix + fruitsname[random.nextInt(fruitsname.length)];
    }
}
