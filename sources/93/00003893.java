package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzee;
import com.google.android.gms.measurement.internal.zzhz;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.c;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class FirebaseAnalytics {

    /* renamed from: b  reason: collision with root package name */
    private static volatile FirebaseAnalytics f16439b;

    /* renamed from: a  reason: collision with root package name */
    private final zzee f16440a;

    public FirebaseAnalytics(zzee zzeeVar) {
        Preconditions.checkNotNull(zzeeVar);
        this.f16440a = zzeeVar;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f16439b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f16439b == null) {
                    f16439b = new FirebaseAnalytics(zzee.zzg(context, null, null, null, null));
                }
            }
        }
        return f16439b;
    }

    @Keep
    public static zzhz getScionFrontendApiImplementation(Context context, Bundle bundle) {
        zzee zzg = zzee.zzg(context, null, null, null, bundle);
        if (zzg == null) {
            return null;
        }
        return new a(zzg);
    }

    public void a(String str, Bundle bundle) {
        this.f16440a.zzx(str, bundle);
    }

    public void b(boolean z11) {
        this.f16440a.zzK(Boolean.valueOf(z11));
    }

    public void c(Bundle bundle) {
        this.f16440a.zzI(bundle);
    }

    public void d(String str, String str2) {
        this.f16440a.zzN(null, str, str2, false);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) Tasks.await(c.q().getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e11) {
            throw new IllegalStateException(e11);
        } catch (ExecutionException e12) {
            throw new IllegalStateException(e12.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.f16440a.zzG(activity, str, str2);
    }
}