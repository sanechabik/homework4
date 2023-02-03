public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он севершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 5;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        }
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 50;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " , то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " , то можно ездить спокойно.");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int agePeople1 = 3;
        boolean goToKindergarten = agePeople1 > 2 && agePeople1 < 6;
        if (goToKindergarten) {
            System.out.println("Если возраст человека равен " + agePeople1 + ", то ему нужно ходить в детский сад.");
        }
        int agePeople2 = 9;
        boolean goToSchool = agePeople2 > 7 && agePeople2 < 18;
        if (goToSchool) {
            System.out.println("Если возраст человека равен " + agePeople2 + ", то ему нужно ходить в школу.");
        }
        int agePeople3 = 20;
        boolean goToUniversity = agePeople3 > 18 && agePeople3 < 24;
        if (goToUniversity) {
            System.out.println("Если возраст человека равен " + agePeople3 + ", то ему нужно ходить в университет.");
        }
        int agePeople4 = 27;
        boolean goToWork = agePeople4 > 24;
        if (goToWork) {
            System.out.println("Если человеку больше " + agePeople4 + ", то ему нужно ходить на работу");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int age = 17;
        boolean cantRide = age < 5;
        if (cantRide) {
            System.out.println("Если ребенку меньше " + age + ", то ему нельзя кататься на аттракционе.");
        }
        boolean canOnlyBeAccompaniedByAnAdult = age > 5 && age < 14;
        if (canOnlyBeAccompaniedByAnAdult) {
            System.out.println("Если ребенку " + age + " лет, то ему можно кататься на аттракционе только в сопровожденни взрослого.");
        }
        boolean canRide = age > 14;
        if (canRide) {
            System.out.println("Если ребенку " + age + ", то е му можно кататься без сопровождения взрослого.");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int totalSeats = 102;
        int seatPlace = 60;
        int standingRoom = totalSeats - seatPlace;

        int seatsUsed = 55;
        int standingUsed = 17;
        if (seatsUsed < seatPlace) {
            System.out.println("Есть еще " + (seatPlace - seatsUsed) + " сидячих мест.");
        }
        if (seatsUsed == seatPlace) {
            System.out.println("Сидячих мест нет");
        }
        if (standingUsed < standingRoom) {
            System.out.println("Есть еще " + (standingRoom - standingUsed) + " стоячих мест.");
        }
        if (standingUsed == standingRoom) {
            System.out.println("Стоячих мест нет");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 5;
        int two = 16;
        int three = 27;
        if (one > two) {
            if (one > three) {
                System.out.println("Максимальное число " + one);
            } else if (three > one) {
                System.out.println("Максимальное число " + three);
            }
        } else if (two > one) {
            if (two > three) {
                System.out.println("Максимальное число " + two);
            } else if (three > two) {
                System.out.println("Максимальное число " + three);
            }
        } else if (one > three) {
            System.out.println("Максимальное число " + one);
        } else if (three > one) {
            System.out.println("аксимальное число " + three);
        }
        else {
            System.out.println("Все числа равны.");
        }
    }
}
