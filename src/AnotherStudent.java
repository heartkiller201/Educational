public class AnotherStudent extends Student{

    public AnotherStudent(int id, String name){
        super(name, id);
    }
    public AnotherStudent(String name, int id, double[] grades, Spec major){
        super(name, id, grades, major);
    }
    public String getString(){
        return getName() + " " + getId() + " " + (getGpa()>0.0?getGpa():"нет") + " " + (getMajor()!=null?getMajor():"нет");
    }





}
