import java.util.Scanner;

import static java.lang.Thread.sleep;

public class HomeWork11 {

    public static void main(String[] args) {
        Thread th1 = new Thread(HomeWork11::safeInc);
        Thread th2 = new Thread(HomeWork11::safeInc);
        Thread th3 = new Thread(HomeWork11::safeInc);

        th1.start();
        th2.start();
        th3.start();
    }

    public static synchronized void safeInc() {
        System.out.println("Введите число: ");
        Scanner add1 = new Scanner(System.in);
        int a = add1.nextInt();
        System.out.println("Введите степень: ");
        Scanner add2 = new Scanner(System.in);
        int b = add2.nextInt();
        System.out.println("Данные приняты, производится возведение");

        try {
            sleep(5000);// замораживает программу на 5 секунд
        } catch (InterruptedException ex) {
            System.out.println("Ошибка " + ex);
        }
        System.out.println("Ответ: " + Math.pow(a,b));

            }
        }


