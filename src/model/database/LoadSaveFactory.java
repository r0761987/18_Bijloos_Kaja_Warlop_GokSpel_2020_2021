package model.database;

/**
 * @Author Niels Bijloos
 * @Author Sébastien Warlop
 * @Author Blenda Kaja
 */

public class LoadSaveFactory {
    private static LoadSaveFactory uniqueInstance = null;

    public static LoadSaveFactory getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new LoadSaveFactory();
        }
        return uniqueInstance;
    }

    public LoadSaveStrategy createLoadSaveStrategy(String type) {
        LoadSaveEnum loadSaveEnum = LoadSaveEnum.valueOf(type);
        String klasseNaam = loadSaveEnum.getKlasseNaam();
        LoadSaveStrategy loadSaveStrategy = null;
        try {
            Class dbKlasseNaam = Class.forName(klasseNaam);
            Object object = dbKlasseNaam.newInstance();
            loadSaveStrategy = (LoadSaveStrategy) object;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return loadSaveStrategy;
    }
}
