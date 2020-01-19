package com.example.mybustie.Common;

import com.example.mybustie.Remote.IGoogleAPI;
import com.example.mybustie.Remote.RetrofitClient;

public class Common {
    public static final String baseURL = "https://maps.googleapis.com";

    public static IGoogleAPI getGoogleAPI() {
        return RetrofitClient.getClient(baseURL).create(IGoogleAPI.class);
    }
}
