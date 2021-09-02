package com.example.thegirl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webview = (WebView) findViewById(R.id.webView1);
        //使App能播放音乐，false自动读取音乐内容
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1)
            webview.getSettings().setMediaPlaybackRequiresUserGesture(false);
        WebSettings wv_setttig = webview.getSettings();
        //设置读取js文件
        wv_setttig.setJavaScriptEnabled(true);
        webview.getSettings().setDefaultTextEncodingName("utf-8");
//         wv_setttig.setRenderPriority(WebSettings.RenderPriority.HIGH);

        //读取assets里面的文件路劲固定为file:///android_asset/。。。。
        String url = "file:///android_asset/index.html";
//        String url = "http://www.baidu.com";
        webview.loadUrl(url);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//        if (id == R.id.action_settings) {
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }

}