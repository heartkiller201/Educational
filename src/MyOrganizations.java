public class MyOrganizations {

    public static void main (String args[]) {

        Organization Decorama = new Organization();
        Organization Delfa = new Organization();

        Decorama.name = "ООО Декорама";
        Decorama.profit = 105000.456;
        Decorama.commercial = true;

        Delfa.name = "СП Дельфа";
        Delfa.profit = 3456455.109;
        Delfa.commercial = false;





        System.out.print(Decorama.name + " имеет годовой оборот " + Decorama.profit + "$ ");
        System.out.print(Decorama.commercial ? "" : "не");
        System.out.println("коммерческая.");
        System.out.println("Должна уплатить налог $" + Decorama.tax(10));

        System.out.print(Delfa.name + " имеет годовой оборот " + Delfa.profit + "$ ");
        System.out.print(Delfa.commercial ? "" : "не ");
        System.out.println("коммерческая.");











    }

}
