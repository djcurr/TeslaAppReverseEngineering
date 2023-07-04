package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import ezvcard.property.Kind;
import java.util.Calendar;

/* loaded from: classes.dex */
class o {

    /* renamed from: d  reason: collision with root package name */
    private static o f1268d;

    /* renamed from: a  reason: collision with root package name */
    private final Context f1269a;

    /* renamed from: b  reason: collision with root package name */
    private final LocationManager f1270b;

    /* renamed from: c  reason: collision with root package name */
    private final a f1271c = new a();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f1272a;

        /* renamed from: b  reason: collision with root package name */
        long f1273b;

        a() {
        }
    }

    o(Context context, LocationManager locationManager) {
        this.f1269a = context;
        this.f1270b = locationManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static o a(Context context) {
        if (f1268d == null) {
            Context applicationContext = context.getApplicationContext();
            f1268d = new o(applicationContext, (LocationManager) applicationContext.getSystemService(Kind.LOCATION));
        }
        return f1268d;
    }

    private Location b() {
        Location c11 = androidx.core.content.c.c(this.f1269a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location c12 = androidx.core.content.c.c(this.f1269a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (c12 == null || c11 == null) ? c12 != null ? c12 : c11 : c12.getTime() > c11.getTime() ? c12 : c11;
    }

    private Location c(String str) {
        try {
            if (this.f1270b.isProviderEnabled(str)) {
                return this.f1270b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e11) {
            Log.d("TwilightManager", "Failed to get last known location", e11);
            return null;
        }
    }

    private boolean e() {
        return this.f1271c.f1273b > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j11;
        a aVar = this.f1271c;
        long currentTimeMillis = System.currentTimeMillis();
        n b11 = n.b();
        b11.a(currentTimeMillis - CoreConstants.MILLIS_IN_ONE_DAY, location.getLatitude(), location.getLongitude());
        b11.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z11 = b11.f1267c == 1;
        long j12 = b11.f1266b;
        long j13 = b11.f1265a;
        b11.a(currentTimeMillis + CoreConstants.MILLIS_IN_ONE_DAY, location.getLatitude(), location.getLongitude());
        long j14 = b11.f1266b;
        if (j12 == -1 || j13 == -1) {
            j11 = 43200000 + currentTimeMillis;
        } else {
            j11 = (currentTimeMillis > j13 ? j14 + 0 : currentTimeMillis > j12 ? j13 + 0 : j12 + 0) + 60000;
        }
        aVar.f1272a = z11;
        aVar.f1273b = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        a aVar = this.f1271c;
        if (e()) {
            return aVar.f1272a;
        }
        Location b11 = b();
        if (b11 != null) {
            f(b11);
            return aVar.f1272a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i11 = Calendar.getInstance().get(11);
        return i11 < 6 || i11 >= 22;
    }
}