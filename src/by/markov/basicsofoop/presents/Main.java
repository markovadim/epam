package by.markov.basicsofoop.presents;

import by.markov.basicsofoop.services.presents.BoxCreator;
import by.markov.basicsofoop.services.presents.PresentBuilderManager;
import by.markov.basicsofoop.services.presents.SweetnessCreator;

public class Main {
    public static void main(String[] args) {

        BoxCreator boxCreator = new BoxCreator();

        SweetnessCreator sweetnessCreator = new SweetnessCreator();

        Present present = new PresentBuilderManager().setBox(boxCreator.createBox()).setSweetness(sweetnessCreator.chooseSweetness()).setPresentPrice().build();
        System.out.println(present);
    }
}
