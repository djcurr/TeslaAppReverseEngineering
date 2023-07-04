package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements x4.a<c> {

    /* loaded from: classes.dex */
    public static class a {
        public static /* synthetic */ void a(Runnable runnable, long j11) {
            runnable.run();
        }

        public static void c(final Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.profileinstaller.e
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j11) {
                    ProfileInstallerInitializer.a.a(runnable, j11);
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
    }

    public static /* synthetic */ void c(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        profileInstallerInitializer.i(context);
    }

    public static /* synthetic */ void d(Context context) {
        l(context);
    }

    public static /* synthetic */ void e(Context context) {
        d.g(context);
    }

    public static void l(final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: r4.d
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.e(context);
            }
        });
    }

    @Override // x4.a
    public List<Class<? extends x4.a<?>>> a() {
        return Collections.emptyList();
    }

    @Override // x4.a
    /* renamed from: f */
    public c b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new c();
        }
        g(context.getApplicationContext());
        return new c();
    }

    void g(final Context context) {
        a.c(new Runnable() { // from class: r4.e
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.c(ProfileInstallerInitializer.this, context);
            }
        });
    }

    /* renamed from: h */
    public void i(final Context context) {
        Handler handler;
        if (Build.VERSION.SDK_INT >= 28) {
            handler = b.a(Looper.getMainLooper());
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.postDelayed(new Runnable() { // from class: r4.c
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.d(context);
            }
        }, new Random().nextInt(Math.max(1000, 1)) + 5000);
    }
}