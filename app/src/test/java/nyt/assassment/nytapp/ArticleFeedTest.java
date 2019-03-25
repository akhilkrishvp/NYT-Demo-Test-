package nyt.assassment.nytapp;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import nyt.assassment.nytapp.Core.Model.ArticleModel;
import nyt.assassment.nytapp.Core.Presenter.HomePresenter;
import nyt.assassment.nytapp.Core.Presenter.HomePresenterImpl;
import nyt.assassment.nytapp.Core.Presenter.HomeView;
import nyt.assassment.nytapp.Helper.Constants;

public class ArticleFeedTest {
    HomePresenter homePresenter;
    @Mock
    HomeView homeView;
    @Mock
    ArticleModel articleModel;
    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);// required for the "@Mock" annotations

        // Make presenter a mock while using mock repository and viewContract created above
        homePresenter = Mockito.spy(new HomePresenterImpl(homeView));
    }
    @Test
    public void getArticleListWrongAccessToken() {
        String accessToken = null;
        homePresenter.getArticleDetails(7,accessToken);
        Mockito.verify(homeView, Mockito.never()).onResponseSuccess(articleModel);
    }
}
