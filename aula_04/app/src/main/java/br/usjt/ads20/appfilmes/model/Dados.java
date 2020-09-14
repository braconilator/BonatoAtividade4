package br.usjt.ads20.appfilmes.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Dados {
    public static Hero[] callHeroes(String chave) {
        ArrayList<Hero> lista = makeHero();
        if (chave == null || chave.length() == 0) {
            return lista.toArray(new Hero[0]);
        } else {
            ArrayList<Hero> filtro = new ArrayList<>();
            for (Hero hero : lista) {
                String nome = hero.getTitulo();
                if (nome.toUpperCase().contains(chave.toUpperCase())) {
                    filtro.add(hero);
                }
            }
            return filtro.toArray(new Hero[0]);
        }
    }

    public static ArrayList<Hero> makeHero() {
        ArrayList<Hero> lista = new ArrayList<>();
        Hero hero;
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        hero = new Hero();
        hero.setPosterPath("adversary1.png");
        hero.setBackdropPath("adversary1.png");
        hero.setTitulo("Adversary");
        lista.add(hero);

        hero = new Hero();
        hero.setPosterPath("agentx1.png");
        hero.setBackdropPath("agentx1.png");
        hero.setTitulo("Agent X");
        lista.add(hero);

        hero = new Hero();
        hero.setPosterPath("Amphibion1.png");
        hero.setBackdropPath("Amphibion1.png");
        hero.setTitulo("Amphibion");
        lista.add(hero);

        hero = new Hero();
        hero.setPosterPath("antman1.png");
        hero.setBackdropPath("antman1.png");
        hero.setTitulo("Ant Man");
        lista.add(hero);

        hero = new Hero();
        hero.setPosterPath("apocalypse1.png");
        hero.setBackdropPath("apocalypse1.png");
        hero.setTitulo("Apocalypse");
        lista.add(hero);

        hero = new Hero();
        hero.setPosterPath("bishop1.png");
        hero.setBackdropPath("bishop1.png");
        hero.setTitulo("Bishop");
        lista.add(hero);

        hero = new Hero();
        hero.setPosterPath("blackpanther1.png");
        hero.setBackdropPath("blackpanther1.png");
        hero.setTitulo("Black Panther");
        lista.add(hero);

        hero = new Hero();
        hero.setPosterPath("captainomen1.png");
        hero.setBackdropPath("captainomen1.png");
        hero.setTitulo("Captain Omen");
        lista.add(hero);

        hero = new Hero();
        hero.setPosterPath("colossus1.png");
        hero.setBackdropPath("colossus1.png");
        hero.setTitulo("Colossus");
        lista.add(hero);

        hero = new Hero();
        hero.setPosterPath("destroyer1.png");
        hero.setBackdropPath("destroyer1.png");
        hero.setTitulo("Destroyer");
        lista.add(hero);

        hero = new Hero();
        hero.setPosterPath("exodus1.png");
        hero.setBackdropPath("exodus1.png");
        hero.setTitulo("Exodus");
        lista.add(hero);

        hero = new Hero();
        hero.setPosterPath("hurricane1.png");
        hero.setBackdropPath("hurricane1.png");
        hero.setTitulo("Hurricane");
        lista.add(hero);

        hero = new Hero();
        hero.setPosterPath("kraven1.png");
        hero.setBackdropPath("kraven1.png");
        hero.setTitulo("Kraven");
        lista.add(hero);

        hero = new Hero();
        hero.setPosterPath("ancientone1.png");
        hero.setBackdropPath("ancientone1.png");
        hero.setTitulo("Ancient One");
        lista.add(hero);

        hero = new Hero();
        hero.setPosterPath("scorpion1.png");
        hero.setBackdropPath("scorpion1.png");
        hero.setTitulo("Scorpion");
        lista.add(hero);

        hero = new Hero();
        hero.setPosterPath("stiltman1.png");
        hero.setBackdropPath("stiltman1.png");
        hero.setTitulo("Stilt Man");
        lista.add(hero);

        hero = new Hero();
        hero.setPosterPath("suicide1.png");
        hero.setBackdropPath("suicide1.png");
        hero.setTitulo("Suicide");
        lista.add(hero);

        hero = new Hero();
        hero.setPosterPath("toad1.png");
        hero.setBackdropPath("toad1.png");
        hero.setTitulo("Toad");
        lista.add(hero);

        hero = new Hero();
        hero.setPosterPath("trisentinel1.png");
        hero.setBackdropPath("trisentinel1.png");
        hero.setTitulo("Tri-Sentinel");
        lista.add(hero);

        hero = new Hero();
        hero.setPosterPath("ultravision1.png");
        hero.setBackdropPath("ultravision1.png");
        hero.setTitulo("Ultravision");
        lista.add(hero);

        hero = new Hero();
        hero.setPosterPath("venom1.png");
        hero.setBackdropPath("venom1.png");
        hero.setTitulo("Venom");
        lista.add(hero);

        hero = new Hero();
        hero.setPosterPath("vulture1.png");
        hero.setBackdropPath("vulture1.png");
        hero.setTitulo("Vulture");
        lista.add(hero);

        hero = new Hero();
        hero.setPosterPath("walker1.png");
        hero.setBackdropPath("walker1.png");
        hero.setTitulo("Walker");
        lista.add(hero);

        return lista;
    }
}
