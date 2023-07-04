package ay;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import ezvcard.property.Kind;

/* loaded from: classes5.dex */
public class c implements yx.a, LocationListener {

    /* renamed from: a  reason: collision with root package name */
    private LocationManager f7120a;

    /* renamed from: b  reason: collision with root package name */
    private tx.c f7121b;

    /* renamed from: c  reason: collision with root package name */
    private yx.b f7122c;

    /* renamed from: d  reason: collision with root package name */
    private cy.b f7123d;

    /* renamed from: e  reason: collision with root package name */
    private Context f7124e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7125a;

        static {
            int[] iArr = new int[zx.a.values().length];
            f7125a = iArr;
            try {
                iArr[zx.a.HIGH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7125a[zx.a.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7125a[zx.a.LOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7125a[zx.a.LOWEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private Criteria d(zx.b bVar) {
        zx.a a11 = bVar.a();
        Criteria criteria = new Criteria();
        int i11 = a.f7125a[a11.ordinal()];
        if (i11 == 1) {
            criteria.setAccuracy(1);
            criteria.setHorizontalAccuracy(3);
            criteria.setVerticalAccuracy(3);
            criteria.setBearingAccuracy(3);
            criteria.setSpeedAccuracy(3);
            criteria.setPowerRequirement(3);
        } else if (i11 != 2) {
            criteria.setAccuracy(2);
            criteria.setHorizontalAccuracy(1);
            criteria.setVerticalAccuracy(1);
            criteria.setBearingAccuracy(1);
            criteria.setSpeedAccuracy(1);
            criteria.setPowerRequirement(1);
        } else {
            criteria.setAccuracy(2);
            criteria.setHorizontalAccuracy(2);
            criteria.setVerticalAccuracy(2);
            criteria.setBearingAccuracy(2);
            criteria.setSpeedAccuracy(2);
            criteria.setPowerRequirement(2);
        }
        return criteria;
    }

    @Override // yx.a
    public void a(Context context, cy.b bVar) {
        this.f7120a = (LocationManager) context.getSystemService(Kind.LOCATION);
        this.f7123d = bVar;
        this.f7124e = context;
        this.f7122c = new yx.b(context);
    }

    @Override // yx.a
    public void b(tx.c cVar, zx.b bVar, boolean z11) {
        this.f7121b = cVar;
        if (cVar == null) {
            this.f7123d.b("Listener is null, you sure about this?", new Object[0]);
        }
        Criteria d11 = d(bVar);
        if (z11) {
            if (androidx.core.content.b.checkSelfPermission(this.f7124e, "android.permission.ACCESS_FINE_LOCATION") != 0 && androidx.core.content.b.checkSelfPermission(this.f7124e, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
                this.f7123d.a("Permission check failed. Please handle it in your app before setting up location", new Object[0]);
                return;
            } else {
                this.f7120a.requestSingleUpdate(d11, this, Looper.getMainLooper());
                return;
            }
        }
        this.f7120a.requestLocationUpdates(bVar.c(), bVar.b(), d11, this, Looper.getMainLooper());
    }

    @Override // yx.a
    public Location c() {
        if (this.f7120a != null) {
            if (androidx.core.content.b.checkSelfPermission(this.f7124e, "android.permission.ACCESS_FINE_LOCATION") != 0 && androidx.core.content.b.checkSelfPermission(this.f7124e, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
                return null;
            }
            Location lastKnownLocation = this.f7120a.getLastKnownLocation("gps");
            if (lastKnownLocation != null) {
                return lastKnownLocation;
            }
        }
        Location a11 = this.f7122c.a("LMP");
        if (a11 != null) {
            return a11;
        }
        return null;
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        this.f7123d.b("onLocationChanged", location);
        tx.c cVar = this.f7121b;
        if (cVar != null) {
            cVar.a(location);
        }
        if (this.f7122c != null) {
            this.f7123d.b("Stored in SharedPreferences", new Object[0]);
            this.f7122c.c("LMP", location);
        }
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i11, Bundle bundle) {
    }
}