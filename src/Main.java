import business.houseManager;
import entities.houseBase;

public class Main {

    public static void main(String[] args){
        houseManager  manage = new houseManager();

        System.out.println("Total price of all Assets ="+manage.getAllTotal());
        System.out.println("Total price of all Houses ="+manage.getHouseTotal());
        System.out.println("Total price of all Villas ="+manage.getVillaTotal());
        System.out.println("Total price of all Summer Houses ="+manage.getSummerHouseTotal());

        System.out.println("-----------------------------------------------------------------------------------");

        System.out.println("Average square meters of all assets ="+manage.getAllAvgSqmt());
        System.out.println("Average square meters of all Houses ="+manage.getHouseAvgSqmt());
        System.out.println("Average square meters of all Villas ="+manage.getVillaAvgSqmt());
        System.out.println("Average square meters of all Summer Houses ="+manage.getSummerHouseAvgSqmt());

        System.out.println("-----------------------------------------------------------------------------------");

        System.out.println("Filter by all assets where 3 rooms and 1 living room");
        for (houseBase b : manage.filter(3,1))
            System.out.println(b.toString());
    }
}
