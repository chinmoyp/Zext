package com.chinmoyxyz.zext;


import android.app.Application;

import com.parse.Parse;

public class ZextApplication extends Application{

    @Override
    public void onCreate(){
        super.onCreate();
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "gMEBgQ8gpXnYaQJhoOIwJPnzSnufov19sesGcEZW", "QAi2xojvWE5BrcO44G3FAtYjsoo047IN7ndTpADl");


    }
}
