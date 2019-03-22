package nyt.assassment.nytapp.WebService;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by akhil on 7/10/18.
 */

public interface ApiInterface {
    @GET("v2/viewed/{period}/.json")
    Call<JsonObject> getArticleDetails(@Path("period") int period,
                                       @Query("api-key") String key);
}
