package chapter4.task7.tours;

import chapter4.task7.tours.Tour;
import chapter4.task7.tours.cruise.CaribbeanOne;
import chapter4.task7.tours.cruise.CaribbeanTwo;
import chapter4.task7.tours.excursion.GrandCanyonOne;
import chapter4.task7.tours.excursion.GrandCanyonTwo;
import chapter4.task7.tours.shopping.FlorenceOne;
import chapter4.task7.tours.shopping.FlorenceTwo;
import chapter4.task7.tours.therapy.DesertHotSpringsOne;
import chapter4.task7.tours.therapy.DesertHotSpringsTwo;
import chapter4.task7.tours.vacation.BaliOne;
import chapter4.task7.tours.vacation.BaliTwo;

import java.util.*;

public class TourCompany {

    private List<Tour> tours = new ArrayList<>();

    public TourCompany() {
        tours.add(new BaliOne());
        tours.add(new BaliTwo());
        tours.add(new GrandCanyonOne());
        tours.add(new GrandCanyonTwo());
        tours.add(new DesertHotSpringsOne());
        tours.add(new DesertHotSpringsTwo());
        tours.add(new FlorenceOne());
        tours.add(new FlorenceTwo());
        tours.add(new CaribbeanOne());
        tours.add(new CaribbeanTwo());
    }

    public String getTours() {
        return tours.toString().replace("[", "")
                .replace("]", "").replace(",", "");
    }

    public void printToursInfo(int number) {
        List<Tour> toursVacation = new ArrayList<>();
        List<Tour> toursExcursion = new ArrayList<>();
        List<Tour> toursTherapy = new ArrayList<>();
        List<Tour> toursShopping = new ArrayList<>();
        List<Tour> toursCruise = new ArrayList<>();
        switch (number) {
            case 1:
                for (Tour tour : tours) {
                    if (tour.getType().equalsIgnoreCase("Vacation tours")) {
                        toursVacation.add(tour);
                    }
                }
                trim(toursVacation);
                break;
            case 2:
                for (Tour tour : tours) {
                    if (tour.getType().equals("Excursion tours")) {
                        toursExcursion.add(tour);
                    }
                }
                trim(toursExcursion);
                break;
            case 3:
                for (Tour tour : tours) {
                    if (tour.getType().equals("Therapy tours")) {
                        toursTherapy.add(tour);
                    }
                }
                trim(toursTherapy);
                break;
            case 4:
                for (Tour tour : tours) {
                    if (tour.getType().equals("Shopping tours")) {
                        toursShopping.add(tour);
                    }
                }
                trim(toursShopping);
                break;
            case 5:
                for (Tour tour : tours) {
                    if (tour.getType().equals("Cruise tours")) {
                        toursCruise.add(tour);
                    }
                }
                trim(toursCruise);
                break;
        }
    }

    public void showSortedTours() {
        Collections.sort(tours, (Tour t1, Tour t2) -> {
            return t1.getCOST() - t2.getCOST();
        });
        for (Tour tour : tours) {
            System.out.println(tour.getType() + " - " + tour.getCOST() + " $.");
        }
    }

    public void trim(List<Tour> tours) {
        System.out.println(tours.toString().replace("[", "")
                .replace("]", "").replace(",", ""));
    }
}



