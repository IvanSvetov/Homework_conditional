public class Main {
    public static void main(String[] args) {

        //Задание 1
        int age = 17;
        if (age >= 18) {
            System.out.println("Поздравляю с совершеннолетием!");
        }
        else {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно подождать.");
        }

        //Задание 2
        int personAge = 30;
        if (personAge >= 7 && personAge < 18) {
            System.out.println("Ребенок ходит в школу.");
        }
        if (personAge >= 18 && personAge < 24) {
            System.out.println("Человек закончил школу и может отправляться в университет.");
        }
        if (personAge >= 24) {
            System.out.println("Человек окончил университет и ему пора искать работу.");
        }
        else {
            System.out.println("Ребенок еще не пошел в школу.");
        }


        //Задание 3
        int vanCapacity = 102;
        int sitPlace = 60;
        int peopleInVan = 43;
        if (peopleInVan < 60) {
            System.out.println("В вагоне " + (sitPlace - peopleInVan) + " сидячих мест");
        }
        else if (peopleInVan < 102) {
            System.out.println("Сидячих мест не осталось, только стоячее.");
        }
        else if (peopleInVan >= 102) {
            System.out.println("Вагон полностью забит");
        }

        //Задание 4
        int ageOfPerson = 30;
        if (ageOfPerson >= 2 && ageOfPerson <= 6) {
            System.out.println("Если возраст человека равен " + ageOfPerson + ", то ему нужно ходить в детский сад.");
        } else if (ageOfPerson >= 7 && ageOfPerson < 18) {
            System.out.println("Если возраст человека равен " + ageOfPerson + ", то ему нужно ходить в школу.");
        } else if (ageOfPerson >= 18 && ageOfPerson < 24) {
            System.out.println("Если возраст человека равен " + ageOfPerson + ", то ему нужно ходить в университет.");
        } else if (ageOfPerson >= 24) {
            System.out.println("Если возраст человека равен " + ageOfPerson + ", то ему нужно ходить на работу.");
        }
        else {
            System.out.println("Дитя еще не обрела место в этой жизни..");
        }

        //Задание 5
        int ageOfChild = 15;
        if (ageOfChild < 5) {
            System.out.println("Ребенок не может кататься на аттракционе.");
        } else if (ageOfChild >= 5 && ageOfChild < 14) {
            System.out.println("Ребенок может кататься только в сопровождении взрослого.");
        }
        else {
            System.out.println("Можно кататься без сопровождения взрослого.");
        }

        //Задание 6
        int one = 4;
        int two = 5;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Из трех чисел большее число " + one);
        } else if (two > one && two > three) {
            System.out.println("Из трех чисел большее число " + two);
        }
        else {
            System.out.println("Из трех чисел большее число " + three);
        }
    }
}