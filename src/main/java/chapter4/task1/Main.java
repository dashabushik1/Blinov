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
        Word w1 = new Word("Baked");
        Word w2 = new Word("salmon");
        Word w3 = new Word("with");
        Word w4 = new Word("unagi");
        Word w5 = new Word("sause");
        Word w6 = new Word("and");
        Word w7 = new Word("red");
        Word w8 = new Word("caviar.");

        Word w9 = new Word("Duck");
        Word w10 = new Word("leg");
        Word w11 = new Word("with");
        Word w12 = new Word("potatoes");
        Word w13 = new Word("and");
        Word w14 = new Word("plum");
        Word w15 = new Word("and");
        Word w16 = new Word("hazelnut");
        Word w17 = new Word("salsa.");

        Word w18 = new Word("Beef");
        Word w19 = new Word("in");
        Word w20 = new Word("Porto");
        Word w21 = new Word("sause");
        Word w22 = new Word("with");
        Word w23 = new Word("shallots.");

        Sentence s1 = new Sentence();
        s1.addWord(w1);
        s1.addWord(w2);
        s1.addWord(w3);
        s1.addWord(w4);
        s1.addWord(w5);
        s1.addWord(w6);
        s1.addWord(w7);
        s1.addWord(w8);

        Sentence s2 = new Sentence();
        s2.addWord(w9);
        s2.addWord(w10);
        s2.addWord(w11);
        s2.addWord(w12);
        s2.addWord(w13);
        s2.addWord(w14);
        s2.addWord(w15);
        s2.addWord(w16);

        Sentence s3 = new Sentence();
        s2.addWord(w17);
        s2.addWord(w18);
        s2.addWord(w19);
        s2.addWord(w20);
        s2.addWord(w21);
        s2.addWord(w22);
        s2.addWord(w23);

        Text t1 = new Text("Main dishes");
        t1.addSentence(s1);
        t1.addSentence(s2);
        t1.addSentence(s3);

        TextUtils.printHeader(t1);
        TextUtils.printText(t1);
    }
}
