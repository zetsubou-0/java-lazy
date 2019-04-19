package solution.kiryl.city.collection;

import solution.kiryl.city.house.Apartment;

public interface ApartmentList {
    int getAvailableSize();
    int allFilledSize();
    boolean addApartment(int index, Apartment apartment);
}
