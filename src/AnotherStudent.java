public class AnotherStudent extends Student{

    public AnotherStudent(int id, String name){
        super(name, id);
    }
    public AnotherStudent(String name, int id, double gpa, Spec major){
        super(name, id, gpa, major);
    }
    public String getString(){
        return getName() + " " + getId() + " " + (getGpa()>0.0?getGpa():"нет") + " " + (getMajor()!=null?getMajor():"нет");
    }





}
