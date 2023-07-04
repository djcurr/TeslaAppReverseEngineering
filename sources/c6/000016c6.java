package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;

@com.facebook.soloader.e
/* loaded from: classes3.dex */
class PreverificationHelper {
    /* JADX INFO: Access modifiers changed from: package-private */
    @com.facebook.soloader.e
    public boolean shouldUseHardwareBitmapConfig(Bitmap.Config config) {
        return config == Bitmap.Config.HARDWARE;
    }
}