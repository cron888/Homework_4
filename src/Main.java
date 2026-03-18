public class Main {
    public static void main(String[] args) {
        // Задание 1.
        int age = 18; // Можно изменить значение для проверки

        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        // Задание 2.
        int temperature = -3; // Можно изменить значение для проверки

        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        //Задание 3
        int speed = 75; // Можно изменить значение для проверки

        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        //задание 4
        int personAge = 20; // Можно изменить значение для проверки

        if (personAge >= 2 && personAge <= 6) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в детский сад");
        } else if (personAge >= 7 && personAge <= 17) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в школу");
        } else if (personAge >= 18 && personAge <= 24) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в университет");
        } else if (personAge > 24) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить на работу");
        }
        // Задание 5
        int childAge = 12; // Можно изменить значение для проверки

        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе");
        } else if (childAge <= 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        int totalCapacity = 102;
        int sittingCapacity = 60;
        int passengers = 95; // Количество пассажиров, можно менять для проверки

        if (passengers < sittingCapacity) {
            System.out.println("В вагоне есть сидячие места. Свободно: " + (sittingCapacity - passengers) + " сидячих мест.");
        } else if (passengers < totalCapacity) {
            System.out.println("Сидячих мест нет, но есть стоячие. Свободно: " + (totalCapacity - passengers) + " стоячих мест.");
        } else {
            System.out.println("Вагон полностью забит. Мест нет.");
        }
        // Задание 7
        int one = 15;   // Можно изменить значение
        int two = 23;   // Можно изменить значение
        int three = 10; // Можно изменить значение

        int max;

        if (one >= two && one >= three) {
            max = one;
        } else if (two >= one && two >= three) {
            max = two;
        } else {
            max = three;
        }

        System.out.println("Наибольшее из трех чисел: " + max);
    }
}
