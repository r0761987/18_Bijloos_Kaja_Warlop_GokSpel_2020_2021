package model.gokstrategies;

/**
 * @Author Niels Bijloos
 */

public class SomIsMin6Strategy  implements GokStrategy{
    private int aantal = 0;
    private int som = 0;

    @Override
    public boolean evalueerGok(int i) {
        aantal++;
        som += i;

        if(aantal == 4) {
            return som >= 6;
        }
        else {
            return true;
        }
    }
}
