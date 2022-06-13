public class Student {

        private String name;
        private int id;
        private double gpa;
        private Spec major;


        public Student(String name, int id) {
            this.name = name;
            this.id = id;
            gpa = 0.0;
        }
        public Student(String name, int id, double gpa, Spec major) {
            this.name = name;
            this.id = id;
            this.gpa = gpa;
            this.major = major;
        }
        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }
        public void setId(int id) {
            this.id = id;
        }
        public int getId() {
            return id;
        }
        public void setGpa(double gpa) {
            this.gpa = gpa;
        }
        public double getGpa() {
            return gpa;
        }
        public void setMajor(Spec major) {
            this.major = major;
        }
        public Spec getMajor() {
            return major;
        }





    }




