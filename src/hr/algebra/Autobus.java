package hr.algebra;

public class Autobus extends Vozilo implements ICijenaKarte, IVelikoVozilo {
    @Override
    public double platiKartu() {
        return 70.0;
    }
}
