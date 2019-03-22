package nyt.assassment.nytapp.Core.Presenter;

/**
 * Created by akhil on 7/10/18.
 */

public interface HomeInteractor {
    void getArticleDetails(int period, String key, HomeListner homeListner);

}
