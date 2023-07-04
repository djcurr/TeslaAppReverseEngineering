package com.facebook.react.bridge;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes3.dex */
public interface ActivityEventListener {
    void onActivityResult(Activity activity, int i11, int i12, Intent intent);

    void onNewIntent(Intent intent);
}