package com.javarush.test.level16.lesson13.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Клубок
1. Создай 5 различных своих нитей c отличным от Thread типом:
1.1. нить 1 должна бесконечно выполняться;
1.2. нить 2 должна выводить "InterruptedException" при возникновении исключения InterruptedException;
1.3. нить 3 должна каждые полсекунды выводить "Ура";
1.4. нить 4 должна реализовать интерфейс Message, при вызове метода showWarning нить должна останавливаться;
1.5. нить 5 должна читать с консоли цифры пока не введено слово "N", а потом вывести в консоль сумму введенных цифр.
2. В статическом блоке добавь свои нити в List<Thread> threads в перечисленном порядке.
3. Нити не должны стартовать автоматически.
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<Thread>(5);
    static {
       threads.add(new t1());
        threads.add(new t2());
        threads.add(new t3());
        threads.add(new t4());
        threads.add(new t5());

    }

    public static class t1 extends Thread{

        @Override
        public void run()
        {
            while (true){}
        }
    }

    public static class t2 extends Thread{
       @Override
      public void run(){

           try
          {
             while (!isInterrupted()){}
              throw new InterruptedException();
          }
          catch (InterruptedException e)
          {
              System.out.println("InterruptedException");
          }
      }
    }

    public static class t3 extends Thread{
        @Override
        public void run()
        {
            while (true){
                try
                {
                    Thread.sleep(500);
                    System.out.println("Ура");
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class t4 extends Thread implements Message{
        public void showWarning(){
                try
            {
                interrupt();
                join();
            }
            catch (InterruptedException e)
            {

            }
        }
        @Override
        public void run(){
            while (!isInterrupted()){
              //  showWarning();
            }
        }

    }

    public static class t5 extends Thread{
        @Override
        public void run(){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String st=""; int Summa=0;

            try
            {
                st=reader.readLine();
                while (!st.equals("N")){
                  Summa+=Integer.parseInt(st);
                    st=reader.readLine();
                }
                System.out.println(Summa);
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

}
