package threescape.kcurry.kyle.scape;

import android.webkit.*;

/**
 * Created by Master on 2/12/2015.
 */
public class ourViewClient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(android.webkit.WebView v, String url){
      v.loadUrl(url);
        return true;
    };
}
