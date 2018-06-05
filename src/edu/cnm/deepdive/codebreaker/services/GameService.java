package edu.cnm.deepdive.codebreaker.services;

import edu.cnm.deepdive.codebreaker.models.Game;
import java.util.List;
import java.util.UUID;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GameService {

  @GET("games")
  Call<List<Game>> list();

  @GET("games/{uuid}")
  Call<Game> findById(@Path("uuid") UUID uuid);

}
