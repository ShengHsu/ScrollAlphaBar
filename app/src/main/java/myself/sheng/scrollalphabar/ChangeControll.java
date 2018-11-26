package myself.sheng.scrollalphabar;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;

public class ChangeControll {
    public String TAG = "ShengHsu";
    private ActionBar mActionBar;
    private ColorDrawable mColorDrawer;
    private String Default_Background_Color = "#FF0000";
    private String Default_Text_Color_First = "#555555";
    private String Default_Text_Color_Second = "#FFFFFF";

    public ChangeControll(ActionBar actionbar){
        this.mActionBar = actionbar;
        mColorDrawer = new ColorDrawable(Color.parseColor(Default_Background_Color));
        mColorDrawer.setAlpha(0);
        mActionBar.setBackgroundDrawable(mColorDrawer);
        setActionbarTextColor(Color.parseColor(Default_Text_Color_First));
    }

    public ChangeControll(ActionBar actionbar,String hexColor){
        this.mActionBar = actionbar;
        Default_Background_Color = hexColor;
        mColorDrawer = new ColorDrawable(Color.parseColor(Default_Background_Color));
        mColorDrawer.setAlpha(0);
        mActionBar.setBackgroundDrawable(mColorDrawer);
        setActionbarTextColor(Color.parseColor(Default_Text_Color_First));
    }

    public void ChangeAlphaInScroll(int ScrollY){
        mColorDrawer.setAlpha(getAlphaforActionBar(ScrollY));
        if(getAlphaforActionBar(ScrollY)>200){
            setActionbarTextColor(Color.parseColor(Default_Text_Color_Second));
        }else{
            setActionbarTextColor(Color.parseColor(Default_Text_Color_First));
        }
    }

    private int getAlphaforActionBar(int scrollY) {
        int minDist = 0,maxDist = 500;
        if(scrollY>maxDist){
            return 255;
        }
        else if(scrollY<minDist){
            return 0;
        }
        else {
            int alpha = 0;
            alpha = (int)  ((255.0/maxDist)*scrollY);
            return alpha;
        }
    }

    private void setActionbarTextColor(int color) {
        String title = mActionBar.getTitle().toString();
        Spannable spannablerTitle = new SpannableString(title);
        spannablerTitle.setSpan(new ForegroundColorSpan(color), 0, spannablerTitle.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        mActionBar.setTitle(spannablerTitle);
    }

}
