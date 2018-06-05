package edu.cnm.deepdive.codebreaker;

import edu.cnm.deepdive.codebreaker.models.Game;
import edu.cnm.deepdive.codebreaker.services.GameService;
import java.util.List;
import java.util.UUID;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Client {

  public static void main(String[] args) {
    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl("https://java-bootcamp.cnm.edu/rest/codebreaker/")
        .addConverterFactory(GsonConverterFactory.create())
        .build();

    GameService gameService = retrofit.create(GameService.class);

    gameService.findById(UUID.fromString("237895c4-0a9e-4ebf-8162-8ae9afdad4b2")).enqueue (
        new Callback<Game>() {

          @Override
          public void onResponse(Call<Game> call, Response<Game> response) {
            Game game = response.body();
            System.out.println("Guesses: " + game.getGuesses().size() + " Characters: "
            +game.getCharacters());
          }

          @Override
          public void onFailure(Call<Game> call, Throwable throwable) {
            throw new RuntimeException("Request Failed", throwable);

          }

    });
  }

}
