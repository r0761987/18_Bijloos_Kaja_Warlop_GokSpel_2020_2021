package model.gokstrategies;

/**
 * @Author Sébastien Warlop
 *
 */

public class HogerDanVorigeStrategy implements GokStrategy {
    private int winstfactor;
    private int vorige = 0;
    private String omschrijving = GokEnum.HOGERDANVORIGESTRATEGY.getOmschrijving();
    private int gekozen = 0;
    private int gewonnen = 0;
    private int inzet = 0;
    private int bedrag = 0;

    @Override
    public int getWinstfactor() {
        return winstfactor;
    }

    @Override
    public void setWinstfactor(int winstfactor) {
        this.winstfactor = winstfactor;
    }

    @Override
    public boolean evalueerGok(int i) {
        if (i > vorige) {
            vorige = i;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void addGekozen() {
        gekozen++;
    }

    @Override
    public void addGewonnen() {
        gewonnen++;
    }

    @Override
    public void addInzet(int i) {
        inzet += i;
    }

    @Override
    public void addBedrag(int i) {
        bedrag += i;
    }

    @Override
    public String getOmschrijving() {
        return omschrijving;
    }

    @Override
    public int getGekozen() {
        return gekozen;
    }

    @Override
    public int getGewonnen() {
        return gewonnen;
    }

    @Override
    public int getInzet() {
        return inzet;
    }

    @Override
    public int getBedrag() {
        return bedrag;
    }
}
