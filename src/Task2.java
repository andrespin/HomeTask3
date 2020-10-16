import java.util.Random;
import java.util.Scanner;

/*
2 * Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
apple – загаданное
apricot - ответ игрока
ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
Для сравнения двух слов посимвольно, можно пользоваться:
String str = "apple";
str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
Играем до тех пор, пока игрок не отгадает слово
Используем только маленькие буквы
 */
public class Task2 {

    static String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    public static void main(String[] args) {
        game();
    }
    
    static void game()
    {
        boolean bool = true;
        while(bool) {

            int index = new Random().nextInt(words.length);
            System.out.println(words[index]);
            String w = words[index];

            System.out.println("Введите загаданное слово: ");
            Scanner sc = new Scanner(System.in);
            String word = sc.nextLine();
            //      System.out.println(word.length());
            Character w1[] = new Character[w.length()];
            Character word1[] = new Character[word.length()];
            Character buff[] = new Character[word.length() + 15];
            fillbuff(buff, '#');
            for (int i = 0; i < w.length(); i++) {
                w1[i] = w.charAt(i);
            }

            for (int i = 0; i < word.length(); i++) {
                word1[i] = word.charAt(i);
            }
            for (int i = 0; i < word.length(); i++) {

                if (w1[i].equals(word1[i]))
                {
                    buff[i] = word1[i];
                }
                else
                {
                    buff[i] = '#';
                }
            }
            int right = 0;
            for (int i = 0; i < word.length(); i++) {
                if (w1[i].equals(word1[i]))
                {
                    right++;
                }
                if (right == w.length())
                {
                    System.out.println("Вы угадали слово");
                    bool = false;
                }
            }
            System.out.println();
            for (char ch : buff) {
                System.out.print(ch);
            }
        }
    }

    private static void fillbuff(Character buff[], char a)
    {
        for (int i = 0; i < buff.length; i++)
        {
            if (i < 15)
            {
                buff[i] = a;
            }
            else buff[i] = ' ';
        }
    }
}
