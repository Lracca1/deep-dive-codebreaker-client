package edu.cnm.deepdive.codebreaker.models;

import com.google.gson.annotations.Expose;
import java.net.URI;
import java.util.Date;
import java.util.UUID;

public class Guess {

  @Expose(deserialize = true, serialize = false)
  private UUID id;
  @Expose(deserialize = true, serialize = false)
  private URI href;
  @Expose(deserialize = true, serialize = false)
  private Date created;
  private String guess;
  @Expose(deserialize = true, serialize = false)
  private int inPlace;
  @Expose(deserialize = true, serialize = false)
  private int outOfPlace;



}
