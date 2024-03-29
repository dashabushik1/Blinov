/**
 * 1. Создать приложение, удовлетворяющее требованиям, приведенным в задании.
 * Наследование применять только в тех заданиях, в которых это логически обосновано.
 * Аргументировать принадлежность классу каждого создаваемого метода
 * и корректно переопределить для каждого класса методы equals(), hashCode(), toString().
 * Создать объект класса Текст, используя классы Предложение, Слово.
 * Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */
package chapter4.task1;

public class Main {

    public static void main(String[] args) {
        Sentence s1 = new Sentence().addWord(new Word("Baked")).addWord(new Word("salmon"))
                .addWord(new Word("with")).addWord(new Word("unagi"))
                .addWord(new Word("sause")).addWord(new Word("and")).addWord(new Word("red")).addWord(new Word("caviar."));

        Sentence s2 = new Sentence().addWord(new Word("Duck")).addWord(new Word("leg"))
                .addWord(new Word("with")).addWord(new Word("potatoes"))
                .addWord(new Word("and")).addWord(new Word("plum")).addWord(new Word("and")).addWord(new Word("hazelnut"))
                .addWord(new Word("salsa."));

        Sentence s3 = new Sentence().addWord(new Word("Beef")).addWord(new Word("in"))
                .addWord(new Word("Porto")).addWord(new Word("sause"))
                .addWord(new Word("with")).addWord(new Word("shallots."));

        Text t1 = new Text("Main dishes");
        t1.addSentence(s1);
        t1.addSentence(s2);
        t1.addSentence(s3);

        printTitle(t1);
        printText(t1);
    }

    public static void printTitle(Text text) {  // метод выводит на консоль заголовок текста
        System.out.println(text.getTitle());
    }

    public static void printText(Text text) {  // метод выводит на консоль текст
        for (Sentence sentence : text.getSentences()) {
            System.out.println(sentence);
        }
    }
}
