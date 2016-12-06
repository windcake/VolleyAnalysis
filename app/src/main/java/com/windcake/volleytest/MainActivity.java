package com.windcake.volleytest;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import com.windcake.volleytest.Volley.Request;
import com.windcake.volleytest.Volley.RequestQueue;
import com.windcake.volleytest.Volley.Response;
import com.windcake.volleytest.Volley.VolleyError;
import com.windcake.volleytest.Volley.toolbox.StringRequest;
import com.windcake.volleytest.Volley.toolbox.Volley;
import android.net.http.AndroidHttpClient;
import android.util.Log;

public class MainActivity extends Activity
{

    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RequestQueue requestQueue = Volley.newRequestQueue(context);
        String url ="https://www.baidu.com";

        StringRequest stringRequest = new StringRequest(Request.Method.GET,
                                                        url,
                                                        new Response.Listener<String>()
                                                        {
                                                            @Override
                                                            public void onResponse(String response)
                                                            {
                                                                Log.i("aaa",response);
                                                            }
                                                        }, new Response.ErrorListener()
        {
            @Override
            public void onErrorResponse(VolleyError error)
            {

            }
        });


        requestQueue.add(stringRequest);

    }
}
