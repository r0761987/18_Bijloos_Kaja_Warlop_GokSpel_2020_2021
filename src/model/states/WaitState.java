package model.states;

import model.Spel;

/**
 * @Author Blenda Kaja
 */

public class WaitState implements State {
    private Spel spel;

    public WaitState(Spel spel) {
        this.spel = spel;
    }

    @Override
    public void startNewGame() {
        spel.startNewGame();
        spel.setState(spel.getSpelerState());
        spel.notifyObservers();
    }

    @Override
    public void closeGame() {
        spel.setState(spel.getClosedState());
        spel.notifyObservers();
    }
}
