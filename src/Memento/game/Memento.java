package Memento.game;
import java.util.*;

public class Memento {
    int money;                              // ���ֽ�Ǯ
    ArrayList fruits;                       // ��ǰ��õ�ˮ��
    public int getMoney() {                 // ��ȡ��ǰ���ֽ�Ǯ��narrow interface��
        return money;
    }
    Memento(int money) {                    // ���캯��(wide interface)
        this.money = money;
        this.fruits = new ArrayList();
    }
    void addFruit(String fruit) {           // ���ˮ��(wide interface)
        fruits.add(fruit);
    }
    List getFruits() {                      // ��ȡ��ǰ��������ˮ����wide interface��
         return (List)fruits.clone();
    }
}
