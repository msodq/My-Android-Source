package com.msodq.androutils.utils.text;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by mohamadsodiq on 1/14/16.
 */
public class GlowingTextUtils {
    public static void setGlowingTab(TabLayout tab) {
        TextView tv = (TextView) (((LinearLayout) ((LinearLayout) tab.getChildAt(0)).getChildAt(tab.getSelectedTabPosition())).getChildAt(1));
        tv.setShadowLayer(23, 0, 0, Color.WHITE);
    }

    public static void removeGlowingTab(TabLayout tab) {
        TextView tv = (TextView) (((LinearLayout) ((LinearLayout) tab.getChildAt(0)).getChildAt(tab.getSelectedTabPosition())).getChildAt(1));
        tv.setShadowLayer(0, 0, 0, 0);
    }

    public static void setGlowingTab(TextView tv) {
        tv.setShadowLayer(23, 0, 0, Color.WHITE);
    }

   public static void removeGlowingTab(TextView tv) {
        tv.setShadowLayer(0, 0, 0, 0);
    }

}
