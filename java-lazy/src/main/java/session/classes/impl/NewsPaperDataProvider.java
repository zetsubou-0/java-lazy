package session.classes.impl;

import session.classes.Data;
import session.classes.DataProvider;
import session.classes.NewsPaper;

public class NewsPaperDataProvider implements DataProvider {

    private NewsPaper[] newsPaperArray = new NewsPaper[5];

    public void save(String name, Data info) {
        NewsPaper newsPaper = new NewsPaper(name, info);
        for (int i = 0; i < newsPaperArray.length; i++) {
            if (newsPaperArray[i] == null) {
                newsPaperArray[i] = newsPaper;
                break;
            }
        }
    }

    public Data read(String name) {
        for (int i = 0; i < newsPaperArray.length; i++) {
            NewsPaper newsPaper = newsPaperArray[i];
            if (newsPaper != null && name.equals(newsPaper.getName())) {
                return newsPaper.getInfo();
            }
        }
        return null;
    }
}
