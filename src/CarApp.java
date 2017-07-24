/**
 * Created by Grand Circus Student on 7/23/2017.
 */

import java.util.ArrayList;

public class CarApp {
    public static void main(String[] args) {
        //syntax for ArrayList is different
        ArrayList<Cars2> carsList = new ArrayList<Cars2>();
        carsList.add(new Cars2("Ford", "Fusion", 2017, 22000,0));
        carsList.add(new Cars2("Ford", "Edge", 2017,28950,0));
        carsList.add(new Cars2("Ford", "Explorer", 2017,31660,0));

        carsList.add(new Cars2("Dodge", "Stratus", 2005,1633,135983));
        carsList.add(new Cars2("Chrysler", "Pacifica", 2004,1426,250000));
        carsList.add(new Cars2("Saturn", "Vue", 2008,3098,140000));

    }
}
