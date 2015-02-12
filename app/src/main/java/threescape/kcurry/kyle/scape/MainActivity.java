package threescape.kcurry.kyle.scape;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;


public class MainActivity extends Activity {
Button sig, log;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sig = (Button) findViewById(R.id.Su);
        log = (Button) findViewById(R.id.li);
        sig.setOnClickListener(new View.OnClickListener() {

            private void suClick(){
                startActivity(new Intent("WebView"));
            }

            @Override
        public void onClick(View v) {
                switch (v.getId()){
                    case R.id.Su:
                        suClick();
                        break;
                }
            }


        });
        log.setOnClickListener(new View.OnClickListener() {

            private void liClick(){
                startActivity(new Intent("WebView2"));
            }

            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.li:
                        liClick();
                        break;
                }
            }


        });
//        WebView browser = (WebView) findViewById(R.id.webView);
//        browser.loadUrl("http://go.3scape.me");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
