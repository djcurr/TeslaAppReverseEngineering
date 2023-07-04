package com.facebook.react.devsupport;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import com.facebook.react.j;

/* loaded from: classes3.dex */
public class e extends Dialog {
    public e(Activity activity, View view) {
        super(activity, j.f11905a);
        requestWindowFeature(1);
        setContentView(view);
    }
}