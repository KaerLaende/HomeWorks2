public class Main {
    public static void main(String[] args) {
        //Задание 1
        var dog =8;
        var cat=3.6;
        var paper= 763789;
        System.out.println(dog +"\n"+ cat+"\n" +paper);

        //Задание 2
        dog=dog+4;
        cat=cat+4;
        paper=paper+4;
        System.out.println(dog +"\n"+ cat+"\n" +paper);

        //Задание 3
        dog = (int) (dog -3.5); // либо менять тип переменной на Double. Но в задании написанно использовать "var"
        cat = cat - 1.6;
        paper = paper -7639;
        System.out.println(dog +"\n"+ cat+"\n" +paper);


        // Задание 4
        var friend =19;
        System.out.println(friend);
        friend=friend+2;
        System.out.println(friend);
        friend=friend/7;
        System.out.println(friend);

        //Задание 5
        var frog= 3.5;
        System.out.println(frog);
        frog = frog*10;
        System.out.println(frog);
        frog = frog/3.5;
        System.out.println(frog);
        frog = frog+4;
        System.out.println(frog);

        //Задание 6
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        System.out.println("Вес двух бойцов составляет "+(weightBoxer1+weightBoxer2));
        System.out.println("Разница в весе бойцов составляет " + (weightBoxer2 - weightBoxer1) );

        //Задание 7
        var weightDifference = weightBoxer2-weightBoxer1;
        weightDifference= weightBoxer2%weightBoxer1;
        System.out.println(weightDifference);

        //Задание 8

        var totalTime = 640;
        var personalTime =8;
        var allStaffNumber =totalTime/personalTime;
        System.out.println("Всего работников в компании – " + allStaffNumber + " человек");
        allStaffNumber=allStaffNumber+94;
        totalTime=allStaffNumber*personalTime;
        System.out.println("Если в компании работает "+ allStaffNumber+ " человек, то всего "+ totalTime +" часов работы может быть поделено между сотрудниками");

    }
}