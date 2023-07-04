package androidx.core.app;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: classes.dex */
public class a extends androidx.core.content.b {

    /* renamed from: a  reason: collision with root package name */
    private static d f4270a;

    /* renamed from: androidx.core.app.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class RunnableC0069a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String[] f4271a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f4272b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f4273c;

        RunnableC0069a(String[] strArr, Activity activity, int i11) {
            this.f4271a = strArr;
            this.f4272b = activity;
            this.f4273c = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f4271a.length];
            PackageManager packageManager = this.f4272b.getPackageManager();
            String packageName = this.f4272b.getPackageName();
            int length = this.f4271a.length;
            for (int i11 = 0; i11 < length; i11++) {
                iArr[i11] = packageManager.checkPermission(this.f4271a[i11], packageName);
            }
            ((c) this.f4272b).onRequestPermissionsResult(this.f4273c, this.f4271a, iArr);
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f4274a;

        b(Activity activity) {
            this.f4274a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f4274a.isFinishing() || androidx.core.app.c.i(this.f4274a)) {
                return;
            }
            this.f4274a.recreate();
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr);
    }

    /* loaded from: classes.dex */
    public interface d {
        boolean a(Activity activity, String[] strArr, int i11);
    }

    /* loaded from: classes.dex */
    public interface e {
        void validateRequestPermissionsRequestCode(int i11);
    }

    public static void a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.finishAfterTransition();
        } else {
            activity.finish();
        }
    }

    public static void c(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.postponeEnterTransition();
        }
    }

    public static void d(Activity activity) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            activity.recreate();
        } else if (i11 <= 23) {
            new Handler(activity.getMainLooper()).post(new b(activity));
        } else if (androidx.core.app.c.i(activity)) {
        } else {
            activity.recreate();
        }
    }

    public static void e(Activity activity, String[] strArr, int i11) {
        d dVar = f4270a;
        if (dVar == null || !dVar.a(activity, strArr, i11)) {
            for (String str : strArr) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof e) {
                    ((e) activity).validateRequestPermissionsRequestCode(i11);
                }
                activity.requestPermissions(strArr, i11);
            } else if (activity instanceof c) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0069a(strArr, activity, i11));
            }
        }
    }

    public static void f(Activity activity, p pVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.setEnterSharedElementCallback(null);
        }
    }

    public static void g(Activity activity, p pVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.setExitSharedElementCallback(null);
        }
    }

    public static boolean h(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    public static void i(Activity activity, Intent intent, int i11, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i11, bundle);
        } else {
            activity.startActivityForResult(intent, i11);
        }
    }

    public static void j(Activity activity, IntentSender intentSender, int i11, Intent intent, int i12, int i13, int i14, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startIntentSenderForResult(intentSender, i11, intent, i12, i13, i14, bundle);
        } else {
            activity.startIntentSenderForResult(intentSender, i11, intent, i12, i13, i14);
        }
    }

    public static void k(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.startPostponedEnterTransition();
        }
    }
}