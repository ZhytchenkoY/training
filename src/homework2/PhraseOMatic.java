package homework2;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"круглосутапап   очнаввап   п м ый", "наивный", "", "белый", "синий", "проникающий", "вонючий", "сильный", "динамичный"};
String [] worldListTwo = {"уполномоченый", "трудный", "древяный", "золотой", "веселый", "сфокусированный", "сетьевой", "совмесный", "центральный", "трудный"};
String [] worldListTree = {"процесс", "талант", "портал", "период времени", "выход из положения", "обзор", "образец"};
int oneLength = wordListOne.length;
int twoLength = worldListTwo.length;
int treeLength = worldListTree.length;

int rand1 = (int) (Math.random() * oneLength);
int rand2 = (int) (Math.random() * twoLength);
int rand3 = (int) (Math.random() * treeLength);

String phrase =  wordListOne[rand1]  +  " " +  worldListTwo[rand2] + " " +  worldListTree[rand3];

        System.out.println("Все, что нам нужно, - это "  +  phrase);
    }
}
