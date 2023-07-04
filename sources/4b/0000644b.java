package cs;

import android.content.Context;
import android.content.pm.PackageInfo;
import bs.e;
import com.facebook.react.v;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.d;
import com.tesla.TeslaV4.BuildConfig;
import com.tesla.domain.model.DataRestrictedCountry;
import com.tesla.logging.g;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.s;
import vz.b0;

/* loaded from: classes6.dex */
public final class c implements a {

    /* renamed from: a */
    public static final c f23069a = new c();

    /* renamed from: b */
    private static final g f23070b = g.f21878b.a("RegionPackageManager");

    /* renamed from: c */
    private static boolean f23071c;

    private c() {
    }

    public static final Object e(Context context, FirebaseCrashlytics firebaseCrashlytics) {
        s.g(context, "$context");
        s.g(firebaseCrashlytics, "$firebaseCrashlytics");
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss.SSS", Locale.US);
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            Calendar calendar = Calendar.getInstance();
            s.f(calendar, "getInstance()");
            firebaseCrashlytics.setCustomKey("version_name", packageInfo.versionName);
            firebaseCrashlytics.setCustomKey("git_hash", yu.b.e());
            firebaseCrashlytics.setCustomKey("binary_built", f(BuildConfig.BINARY_BUILD_TIMESTAMP, calendar, simpleDateFormat));
            firebaseCrashlytics.setCustomKey("first_install", f(packageInfo.firstInstallTime, calendar, simpleDateFormat));
            firebaseCrashlytics.setCustomKey("last_update", f(packageInfo.lastUpdateTime, calendar, simpleDateFormat));
            return firebaseCrashlytics;
        } catch (Exception e11) {
            f23070b.d("Error setting build properties to firebase", e11);
            return b0.f54756a;
        }
    }

    private static final String f(long j11, Calendar calendar, SimpleDateFormat simpleDateFormat) {
        calendar.setTimeInMillis(j11);
        String format = simpleDateFormat.format(calendar.getTime());
        s.f(format, "formatter.format(calendar.time)");
        return format;
    }

    @Override // cs.a
    public boolean a(Context context) {
        s.g(context, "context");
        return false;
    }

    @Override // cs.a
    public List<v> b() {
        List<v> d11;
        d11 = wz.v.d(new e());
        return d11;
    }

    @Override // cs.a
    public void c(final Context context) {
        s.g(context, "context");
        if (f23071c) {
            return;
        }
        f23071c = true;
        try {
            d.p(context);
            final FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            s.f(firebaseCrashlytics, "getInstance()");
            boolean b11 = DataRestrictedCountry.Companion.b(context);
            if (!b11) {
                firebaseCrashlytics.setCrashlyticsCollectionEnabled(true);
                hy.b.e(new Callable() { // from class: cs.b
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Object e11;
                        e11 = c.e(context, firebaseCrashlytics);
                        return e11;
                    }
                }).i(bz.a.c()).f();
                return;
            }
            if (b11) {
                f23070b.i("Data restricted country detected, not enabling firebase crashlytics");
            }
            firebaseCrashlytics.setCrashlyticsCollectionEnabled(false);
        } catch (Exception e11) {
            f23070b.d("Error during initialization of region package manager", e11);
        }
    }
}