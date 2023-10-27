import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MinimalistBrowserActivity extends Activity {

    private WebView webView;
    private EditText urlEditText;
    private Button goButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webView);
        urlEditText = findViewById(R.id.urlEditText);
        goButton = findViewById(R.id.goButton);

        // WebView settings
        webView.getSettings().setJavaScriptEnabled(true);

        // Handle page loading
        webView.setWebViewClient(new WebViewClient());

        // Load a default page
        webView.loadUrl("https://www.example.com");

        goButton.setOnClickListener(v -> {
            String url = urlEditText.getText().toString();
            if (!url.isEmpty()) {
                webView.loadUrl(url);
            }
        });
    }
}
