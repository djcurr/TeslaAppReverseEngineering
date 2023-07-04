package androidx.core.app;

import android.app.ActivityOptions;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public class b {

    /* loaded from: classes.dex */
    private static class a extends b {

        /* renamed from: a  reason: collision with root package name */
        private final ActivityOptions f4275a;

        a(ActivityOptions activityOptions) {
            this.f4275a = activityOptions;
        }

        @Override // androidx.core.app.b
        public Bundle b() {
            return this.f4275a.toBundle();
        }
    }

    protected b() {
    }

    public static b a(Context context, int i11, int i12) {
        if (Build.VERSION.SDK_INT >= 16) {
            return new a(ActivityOptions.makeCustomAnimation(context, i11, i12));
        }
        return new b();
    }

    public Bundle b() {
        return null;
    }
}