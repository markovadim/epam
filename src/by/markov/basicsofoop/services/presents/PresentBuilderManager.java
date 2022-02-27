package by.markov.basicsofoop.services.presents;

import by.markov.basicsofoop.presents.Box;
import by.markov.basicsofoop.presents.Present;
import by.markov.basicsofoop.presents.Sweetness;

import java.util.ArrayList;

public class PresentBuilderManager implements PresentBuilder {

    Present present = new Present();

    @Override
    public PresentBuilder setBox(Box box) {
        present.setBox(box);
        return this;
    }

    @Override
    public PresentBuilder setSweetness(ArrayList<Sweetness> sweetness) {
        present.setSweetnesses(sweetness);
        return this;
    }

    @Override
    public PresentBuilder setPresentPrice() {
        double price = 0.0;
        for (Sweetness sweetness : present.getSweetnesses()) {
            price += sweetness.getSweetnessType().getPrice();
        }
        price += present.getBox().getBoxPrice();
        present.setPresentPrice(price);
        return this;
    }

    @Override
    public Present build() {
        return present;
    }
}
