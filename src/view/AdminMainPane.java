package view;


import controller.GamblerOverviewController;
import controller.SpelverloopController;
import controller.StatistiekController;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import model.Spel;
import view.panels.GamblerOverviewPane;
import view.panels.SpelverloopPane;
import view.panels.StatistiekPane;

public class AdminMainPane extends BorderPane {
    public AdminMainPane(Spel spel){
        TabPane tabPane = new TabPane();
        SpelverloopController spelverloopController = new SpelverloopController(spel);
        SpelverloopPane spelverloopPane = new SpelverloopPane(spelverloopController);
        Tab spelVerloopTab = new Tab("Spelverloop", spelverloopPane);
        GamblerOverviewController gamblerOverviewController = new GamblerOverviewController(spel);
        GamblerOverviewPane gamblerOverviewPane = new GamblerOverviewPane(gamblerOverviewController);
        Tab spelerTab = new Tab("Spelers",gamblerOverviewPane);
        Tab instellingTab = new Tab("Instellingen");
        StatistiekController statistiekController = new StatistiekController(spel);
        StatistiekPane statistiekPane = new StatistiekPane(statistiekController);
        Tab statistiekTab = new Tab("Statistieken", statistiekPane);
        tabPane.getTabs().add(spelVerloopTab);
        tabPane.getTabs().add(spelerTab);
        tabPane.getTabs().add(statistiekTab);
        tabPane.getTabs().add(instellingTab);
        this.setCenter(tabPane);
    }
}
