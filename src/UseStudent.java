public class UseStudent {
    public static void main(String[] args) {

        Student student = new Student("Владимир", 1);
        System.out.printf("Имя: %s, ID: %s, Средний балл: %s", student.getName(), student.getId(), student.getGpa());
        System.out.println(" ");
        student = new Student("Владислав", 2, 4.4, Spec.Компьютерные_науки);
        System.out.printf("Имя: %s, ID: %s, Средний балл: %s, Специальность: %s", student.getName(), student.getId(),
                student.getGpa(), student.getMajor());




    }


}
