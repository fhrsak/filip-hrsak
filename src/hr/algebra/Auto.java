package hr.algebra;

public class Auto extends Vozilo implements ICijenaKarte, IMaloVozilo
{
    @Override
    public double platiKartu() {
        return 50.0;
    }
}
