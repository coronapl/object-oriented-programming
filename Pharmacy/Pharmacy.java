/*******************************************************************************
*    Author: coronapl
*    Class: Pharmacy
*    Description:
*    Store all of the medicines in the Pharmacy object. Example of
*    aggregation.
*******************************************************************************/

import java.util.*;

public class Pharmacy {

    private ArrayList<Medicine> medicines = new ArrayList<Medicine>();

    public String getMedicines() {

        String medicineInfo = "";

        for(int i=0; i < medicines.size(); i++) {
            medicineInfo = medicineInfo.concat(medicines.get(i).getData());
        }
        return medicineInfo;
    }

    public void addMedicine(Medicine medicine) {
        medicines.add(medicine);
    }
}
