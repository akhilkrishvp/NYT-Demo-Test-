package nyt.assassment.nytapp;

import org.junit.Test;

import java.util.List;

import nyt.assassment.nytapp.Core.Model.Results;
import nyt.assassment.nytapp.Core.View.Home.HomeActivity;

import static org.junit.Assert.assertEquals;

public class SearchArticleTest {
    HomeActivity homeActivity;
    @Test
    public void searchedValueEmpty(){
        String queryString = "";
        List<Results> resultsList = homeActivity.getFilteredList(queryString);
        assertEquals(0,resultsList.size());
    }
}
