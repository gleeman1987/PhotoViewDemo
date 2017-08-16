package cn.okline.photoviewdemo;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import uk.co.senab.photoview.PhotoView;
import uk.co.senab.photoview.PhotoViewAttacher;

public class DemoActivity extends AppCompatActivity {

    private PhotoView pv_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        pv_main = (PhotoView) findViewById(R.id.pv_main);
//        pv_main.setImageURI(Uri.parse("http://imgsrc.baidu.com/image/c0%3Dshijue1%2C0%2C0%2C294%2C40/sign=4ccd18eac9cec3fd9f33af36bee1be4a/fd039245d688d43f724b74d4771ed21b0ef43b32.jpg"));
        pv_main.setImageResource(R.mipmap.ic_launcher);
    }
}
