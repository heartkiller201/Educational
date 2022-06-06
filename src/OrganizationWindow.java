import com.allmycode.dummiesframe.DummiesFrame;


public class OrganizationWindow {
    public static void main(String args[]){
        DummiesFrame frame = new DummiesFrame("Расчет налогов");
        frame.addRow("Название организации");
        frame.addRow("Годовая выручка");
        frame.addRow("Коммерческая или некоммерческая true/false");
        frame.setButtonText("Рассчитать налог");
        frame.go();

    }
    public static String calculate(String name, double profit, boolean commercial) {
        Organization org = new Organization();
        org.setName(name);
        org.setProfit(profit);
        org.setCommercial(commercial);
        return "Организация: " + org.getName() + ", Требуется уплатить:" + org.vat() + "$";


    }








}
