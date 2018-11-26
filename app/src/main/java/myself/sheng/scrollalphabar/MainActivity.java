package myself.sheng.scrollalphabar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements ObservableScrollView.ScrollViewListener {
    private ChangeControll mChangeControll;
    private ObservableScrollView mScrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mScrollView = (ObservableScrollView) findViewById(R.id.scrollView_Main);
        mScrollView.setScrollViewListener(this);
        mChangeControll = new ChangeControll(getSupportActionBar());
//        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.RED));
    }

    @Override
    public void onScrollChanged(ObservableScrollView scrollView, int x, int y, int oldx, int oldy) {
        mChangeControll.ChangeAlphaInScroll(scrollView.getScrollY());
    }
}
