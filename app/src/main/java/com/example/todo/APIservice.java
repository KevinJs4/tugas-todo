package com.example.todo;

import java.util.List;
import retrofit2.http.GET;
import retrofit2.Call;

public interface APIservice {
    @GET("todo.php")
    Call<List<todoItem>> gettodoItems();
}