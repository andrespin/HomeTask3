
/*
1. Написать программу, которая загадывает случайное число от 0 до 9,
 и пользователю дается 3 попытки угадать это число.
 При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное,
  или меньше. После победы или проигрыша выводится запрос –
 «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
 */

import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        game();
    }

    private static void game()
    {
        int RandomNumber = new Random().nextInt(10);
  //      System.out.println(RandomNumber);
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while(i < 3)
        {
            System.out.println("Введите число:");
            int number = scanner.nextInt();
            if (number < RandomNumber)
            {
                System.out.println("Ваше число меньше загаданного");
            }
            else if (RandomNumber != number)
            {
                System.out.println("Ваше число больше загаданного");
            }

            if (RandomNumber == number)
            {
                System.out.println("Вы угадали число! ");
                break;
            }
            i++;
        }
        System.out.println("Хотите ли вы играть дальше: 1 - да, 0 - нет. Введите число");
        Scanner scanner2 = new Scanner(System.in);
        int num = scanner2.nextInt();
        keys(num);

    }

    private static void keys(int num)
    {
        switch (num){
            case 0:
                System.out.println("Вы вышли из игры");
                break;
            case 1:
                System.out.println("Играем заново");
                game();
                break;

            default:
                System.out.println("Введёное вами число не входит в заданный диапазон,");
                System.out.println("введите 1 или 0.");
                keys(num);
        }
    }

}
