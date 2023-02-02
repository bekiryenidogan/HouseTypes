package utils;

import entities.*;

import java.util.ArrayList;
import java.util.List;

public class houseUtil {

    public List<houseBase> allHouses = new ArrayList<>();
    public List<house> houseList = new ArrayList<>();
    public List<villa> villaList = new ArrayList<>();
    public List<summerHouse> summerHouseList = new ArrayList<>();

    public houseUtil(){
        generate();
    }

    public List<houseBase> getAllHouses(){
        return  allHouses;
    }

    public List<house> getHouseList(){
        return  houseList;
    }

    public List<villa> getVillaList(){
        return  villaList;
    }

    public List<summerHouse> getSummerHouseList(){
        return  summerHouseList;
    }

    private List<houseBase> generate(){
        houseList = generateHouse();
        villaList = generateVilla();
        summerHouseList= generateSummerHouse();

        allHouses.addAll(houseList);
        allHouses.addAll(villaList);
        allHouses.addAll(summerHouseList);

        return allHouses;
    }
    private List<house> generateHouse(){
     List<house> generated = new ArrayList<>();
     house house1 =  new house(150,155,1,2,"house");
     house house2 =  new house(140,145,3,4,"house");
     house house3 =  new house(110,135,5,6,"house");

        generated.add(house1);
        generated.add(house2);
        generated.add(house3);
        return generated;

    }

    private List<villa> generateVilla(){
        List<villa> generated = new ArrayList<>();
        villa villa1 =  new villa(250,55,2,2,"villa");
        villa villa2 =  new villa(340,45,3,1,"villa");
        villa villa3 =  new villa(410,35,5,6,"villa");

        generated.add(villa1);
        generated.add(villa2);
        generated.add(villa3);
        return generated;

    }

    private List<summerHouse> generateSummerHouse(){
        List<summerHouse> generated = new ArrayList<>();
        summerHouse summerHouse1 = new summerHouse(300, 300, 4, 3, "Summer House");
        summerHouse summerHouse2 =  new summerHouse(440,245,3,1,"Summer House");
        summerHouse summerHouse3 =  new summerHouse(510,235,5,6,"Summer House");

        generated.add(summerHouse1);
        generated.add(summerHouse2);
        generated.add(summerHouse3);
        return generated;

    }

}
