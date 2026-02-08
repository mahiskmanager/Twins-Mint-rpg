package com.dola.mindtwist;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.JavascriptInterface;

public class MainActivity extends Activity {

    WebView web;

    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_main);

        web = findViewById(R.id.webview);
        web.getSettings().setJavaScriptEnabled(true);
        web.addJavascriptInterface(this, "Android");
        web.loadUrl("file:///android_asset/web/index.html");
    }

    @JavascriptInterface
    public void onWin(int seconds) {
        GameManager.addTime(this, seconds);
    }
}
