package nyt.assassment.nytapp.Core.Presenter;

import nyt.assassment.nytapp.Core.Model.ArticleModel;

/**
 * Created by akhil on 7/10/18.
 */

public interface HomeView {
    void showProgress(String msg);
    void hideProgress();
    void onResponseSuccess(ArticleModel articleModel);
    void onResponseFailure(String msg);
    void retrofitError(String msg);
}
