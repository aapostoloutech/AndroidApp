package com.codehub.myapplication;

import org.json.JSONException;
import org.json.JSONObject;

public class JSON {


    private void jsonParser (String url){
        try {
            JSONObject reader = new JSONObject(url);
        }
        catch (JSONException e) {

        }
    }
}
