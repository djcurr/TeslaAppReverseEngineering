package androidx.camera.core.impl;

import android.content.Context;

/* loaded from: classes.dex */
public interface q1 {

    /* loaded from: classes.dex */
    public enum a {
        IMAGE_CAPTURE,
        PREVIEW,
        IMAGE_ANALYSIS,
        VIDEO_CAPTURE
    }

    /* loaded from: classes.dex */
    public interface b {
        q1 a(Context context);
    }

    d0 a(a aVar);
}