package business;

import entities.houseBase;
import java.util.List;

public interface houseService {

    int getHouseTotal();
    int getVillaTotal();
    int getSummerHouseTotal();
    int getAllTotal();

    float getHouseAvgSqmt();
    float getVillaAvgSqmt();
    float getSummerHouseAvgSqmt();
    float getAllAvgSqmt();

    List<houseBase> filter(int r ,int l);
}
