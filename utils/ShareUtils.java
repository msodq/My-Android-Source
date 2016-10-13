package com.msodq.androutils.utils;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ShareCompat;

import com.thepartyup.Constant;

/**
 * Created by mohamadsodiq on 4/13/16.
 */
public class ShareUtils {
    public static void shareViaEmail(Context context, String title, String message) {
        ShareCompat.IntentBuilder.from((Activity) context)
                .setType("message/rfc822")
                .addEmailTo("")
                .setSubject(title)
                .setText(message)
                .setChooserTitle("Share with email")
                .startChooser();
    }

    public static void copyLink(Context context, String title, String message) {
        ClipboardManager clipboard = (ClipboardManager) context.getSystemService(context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText(title, message);
        clipboard.setPrimaryClip(clip);
    }

    public static void shareViaSMS(Context context, String smsBody) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.putExtra("sms_body", smsBody);
        intent.setType("vnd.android-dir/mms-sms");
        context.startActivity(intent);
    }


    public static void shareViaWhatsApp(Context context, String message) {
        shareSoc(context, "com.whatsapp", "WhatsApp", message);
    }

    public static void shareViaTwitter(Context context, String message) {
        shareSoc(context, "com.twitter.android", "Twitter", message);
    }

    public static void shareViaFacebook(Context context, String link) {
        shareSoc(context, "com.facebook.katana", "Facebook", link);
    }


    private static void shareSoc(Context context, String packageInfo, String appname, String message) {
        PackageManager pm = context.getPackageManager();
        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            pm.getPackageInfo(packageInfo, PackageManager.GET_META_DATA);
            intent.setPackage(packageInfo);
            intent.putExtra(Intent.EXTRA_TEXT, message);
            context.startActivity(Intent.createChooser(intent, "Share with " + appname));

        } catch (PackageManager.NameNotFoundException e) {
            Toast.makeText(context, appname + " not Installed", Toast.LENGTH_SHORT).show();
        }
    }
}
