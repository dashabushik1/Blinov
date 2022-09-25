/**
 * 2.Создать приложение, удовлетворяющее требованиям, приведенным в задании.
 * Наследование применять только в тех заданиях, в которых это логически обосновано.
 * Аргументировать принадлежность классу каждого создаваемого метода и корректно переопределить для каждого класса
 * методы equals(), hashCode(), toString().
 * Создать объект класса Компьютер, используя классы Винчестер, Дисковод, Оперативная память, Процессор.
 * Методы: включить, выключить, проверить на вирусы, вывести на консоль размер винчестера.
 */
package chapter4.task2;

public class Main {

    public static void main(String[] args) {
        Processor processor = new Processor("Intel", 2);
        Ram ram = new Ram();
        CdRom cdRom = new CdRom();
        Hdd hdd = new Hdd("SSD", "Micron", "256 GB");
        Computer myComputer = new Computer("HomeComp", "UX303LB", "Ubuntu");

        myComputer.setHardDisk(hdd);

        myComputer.switchOn();
        myComputer.virusTest();
        myComputer.getHardDisk().printCapacity();
        myComputer.switchOff();
    }
}
