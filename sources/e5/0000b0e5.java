package rk;

import android.content.ContentResolver;
import android.os.Build;
import android.provider.Settings;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static float f49629a = 1.0f;

    public float a(ContentResolver contentResolver) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 17) {
            return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        }
        if (i11 == 16) {
            return Settings.System.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        }
        return f49629a;
    }
}