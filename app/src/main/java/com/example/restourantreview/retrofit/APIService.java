package com.example.restourantreview.retrofit;
import com.example.restourantreview.response.PostReviewResponse;
import com.example.restourantreview.response.RestaurantResponse;

import retrofit2.Call;
import retrofit2.http.*;

public interface APIService {

    @GET("detail/{id}")
    Call<RestaurantResponse> getRestaurant(@Path("id") String id);

    @FormUrlEncoded
    @Headers({"Authorization: token 12345"})
    @POST("review")
    Call<PostReviewResponse> postReview(@Field("id")String id, @Field("name")String name, @Field("review")String review);

}