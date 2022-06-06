public class if_else {
    public static void main(String args[]) {
        int weightOfAPerson = 150;
        int elevatorWeightLimit = 1300;
        int numberOfPeople = elevatorWeightLimit / weightOfAPerson;

        if (numberOfPeople >= 10) System.out.println("Семейство поместитися в лифт");
        else { System.out.print("Семейство НЕ поместитися в лифт.");
        System.out.print(" Допустимое количество: ");
        System.out.println(numberOfPeople);}






    }
}

