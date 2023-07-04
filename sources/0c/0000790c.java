package io.sentry.android.core;

import android.util.Log;
import io.sentry.f3;

/* loaded from: classes5.dex */
final class k implements io.sentry.d0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f32101a;

        static {
            int[] iArr = new int[f3.values().length];
            f32101a = iArr;
            try {
                iArr[f3.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32101a[f3.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32101a[f3.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32101a[f3.FATAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32101a[f3.DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private int e(f3 f3Var) {
        int i11 = a.f32101a[f3Var.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                return i11 != 4 ? 3 : 7;
            }
            return 5;
        }
        return 4;
    }

    @Override // io.sentry.d0
    public void a(f3 f3Var, Throwable th2, String str, Object... objArr) {
        b(f3Var, String.format(str, objArr), th2);
    }

    @Override // io.sentry.d0
    public void b(f3 f3Var, String str, Throwable th2) {
        int i11 = a.f32101a[f3Var.ordinal()];
        if (i11 == 1) {
            Log.i("Sentry", str, th2);
        } else if (i11 == 2) {
            Log.w("Sentry", str, th2);
        } else if (i11 == 3) {
            Log.e("Sentry", str, th2);
        } else if (i11 != 4) {
            Log.d("Sentry", str, th2);
        } else {
            Log.wtf("Sentry", str, th2);
        }
    }

    @Override // io.sentry.d0
    public void c(f3 f3Var, String str, Object... objArr) {
        Log.println(e(f3Var), "Sentry", String.format(str, objArr));
    }

    @Override // io.sentry.d0
    public boolean d(f3 f3Var) {
        return true;
    }
}