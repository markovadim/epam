package by.markov.classes.aggregationandcomposition.nation;

import by.markov.classes.service.aggregationandcomposition.nation.NationService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Nation> nations = new ArrayList<>();
        Town lida = new Town("Лида", 100);
        Town pinsk = new Town("Пинск", 80);
        Town orsha = new Town("Орша", 90);
        Town mozyr = new Town("Мозырь", 100);
        Town mogilev = new Town("Могилев", 140);
        Town minsk = new Town("Минск", 2000, true);

        District lidaDistr = new District("Лидский");
        District pinskDistr = new District("Пинский");
        District orshaDistr = new District("Оршанский");
        District mozyrDistr = new District("Мозырьский");
        District minskDistr = new District("Минский");
        District mogilevDistr = new District("Могилевский");

        Region grodno = new Region("Гродно", 4, 280);
        Region brest = new Region("Брест", 1, 320);
        Region mogilevsk = new Region("Могилев", 6, 330);
        Region vitebsk = new Region("Витебск", 2, 290);
        Region gomel = new Region("Гомель", 3, 340);
        Region minsky = new Region("Минск", 7, 410);

        Nation rb1 = new Nation("Беларусь", minsky, minskDistr, minsk);
        Nation rb2 = new Nation("Беларусь", grodno, lidaDistr, lida);
        Nation rb3 = new Nation("Беларусь", brest, pinskDistr, pinsk);
        Nation rb4 = new Nation("Беларусь", vitebsk, orshaDistr, orsha);
        Nation rb5 = new Nation("Беларусь", gomel, mozyrDistr, mozyr);
        Nation rb6 = new Nation("Беларусь", mogilevsk, mogilevDistr, mogilev);

        nations.add(rb1);
        nations.add(rb2);
        nations.add(rb3);
        nations.add(rb4);
        nations.add(rb5);
        nations.add(rb6);

        NationService service = new NationService();
        service.getMenu(nations);
    }
}
