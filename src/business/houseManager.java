package business;

import entities.*;

import utils.houseUtil;

import java.util.ArrayList;
import java.util.List;

public class houseManager implements houseService {

    houseUtil util = new houseUtil();

    @Override
    public int getHouseTotal() {
        int temp =  0;
        for (house h: util.houseList){
            temp += h.getPrice();
        }
        return temp;
    }

    @Override
    public int getVillaTotal() {
        int temp =  0;
        for (villa v: util.villaList){
            temp += v.getPrice();
        }
        return temp;
    }

    @Override
    public int getSummerHouseTotal() {
        int temp =  0;
        for (summerHouse s: util.summerHouseList){
            temp += s.getPrice();
        }
        return temp;
    }

    @Override
    public int getAllTotal() {
        int temp =  0;
        for (houseBase b: util.allHouses){
            temp += b.getPrice();
        }
        return temp;
    }

    @Override
    public float getHouseAvgSqmt() {
        float temp = 0;
        int index =0;

        for(house h : util.houseList){
            temp += h.getSqmt();
            index++;
        }

        return  (float) temp / index;
    }

    @Override
    public float getVillaAvgSqmt() {
        float temp = 0;
        int index =0;

        for(villa v : util.villaList){
            temp += v.getSqmt();
            index++;
    }
        return  (float) temp / index;
    }

    @Override
    public float getSummerHouseAvgSqmt() {
            float temp = 0;
            int index =0;

            for(summerHouse s : util.summerHouseList){
                temp += s.getSqmt();
                index++;
            }

            return  (float) temp / index;
    }

    @Override
    public float getAllAvgSqmt() {
            float temp = 0;

            int index =0;

            for(houseBase b : util.allHouses){
                temp += b.getSqmt();
                index++;
            }

            return (float) temp / index;
    }

    @Override
    public List<houseBase> filter(int r, int l) {
        List<houseBase> f = new ArrayList<>();

        for (houseBase a : util.allHouses){
            if (a.getLivingRoom()==l && a.getRoom()==r)
                f.add(a);
        }
        return f;
    }
}
