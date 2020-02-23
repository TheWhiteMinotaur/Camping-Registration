package CampingReg;

import java.util.Comparator;

public class SortByName implements Comparator<Site> { 
    @Override 
    public int compare(Site o1, Site o2) { 
        return o1.getNameReserving().compareTo(o2.getNameReserving()); 
    }
}
