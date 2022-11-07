package Memento;

import Memento.game.*;

public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);               // ��������ֽ�Ǯ��Ϊ100
        Memento memento = gamer.createMemento();    // ���������״̬
        for (int i = 0; i < 100; i++) {
            System.out.println("==== " + i);        // ��ʾ�����ӵĴ���
            System.out.println("��ǰ״̬:" + gamer);    // ��ʾ���˹����ڵ�״̬

            gamer.bet();    // ������Ϸ 

            System.out.println("���ֽ�ǮΪ" + gamer.getMoney() + "Ԫ��");

            // ������δ���Memento
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("    �����ֽ�Ǯ��������࣬��˱�����Ϸ��ǰ��״̬��");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("    �����ֽ�Ǯ��������࣬��˽���Ϸ�ָ�����ǰ��״̬��");
                gamer.restoreMemento(memento);
            }

            // �ȴ�һ��ʱ��
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("");
        }
    }
}
