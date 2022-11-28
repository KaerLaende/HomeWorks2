public class Main {
    public static void main(String[] args) {
        //Задача 1
        var dog =8;
        var cat=3.6;
        var paper= 763789;
        System.out.println(dog +"\n"+ cat+"\n" +paper);

        //Задача 2
        dog=dog+4;
        cat=cat+4;
        paper=paper+4;
        System.out.println(dog +"\n"+ cat+"\n" +paper);

        //Задача 3
        dog = (int) (dog -3.5); // либо менять тип переменной на Double. Но в задании написанно использовать "var"
        cat = cat - 1.6;
        paper = paper -7639;
        System.out.println(dog +"\n"+ cat+"\n" +paper);

    }
}