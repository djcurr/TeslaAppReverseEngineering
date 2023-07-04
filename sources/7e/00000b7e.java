package ay;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;

/* loaded from: classes5.dex */
public class b implements yx.a, cy.a {

    /* renamed from: a  reason: collision with root package name */
    private cy.b f7113a;

    /* renamed from: b  reason: collision with root package name */
    private tx.c f7114b;

    /* renamed from: d  reason: collision with root package name */
    private Context f7116d;

    /* renamed from: e  reason: collision with root package name */
    private zx.b f7117e;

    /* renamed from: g  reason: collision with root package name */
    private yx.a f7119g;

    /* renamed from: c  reason: collision with root package name */
    private boolean f7115c = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f7118f = false;

    public b(Context context) {
        if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(context) == 0) {
            this.f7119g = new a(this);
        } else {
            this.f7119g = new c();
        }
    }

    private void d() {
        this.f7113a.b("FusedLocationProvider not working, falling back and using LocationManager", new Object[0]);
        c cVar = new c();
        this.f7119g = cVar;
        cVar.a(this.f7116d, this.f7113a);
        if (this.f7115c) {
            this.f7119g.b(this.f7114b, this.f7117e, this.f7118f);
        }
    }

    @Override // yx.a
    public void a(Context context, cy.b bVar) {
        this.f7113a = bVar;
        this.f7116d = context;
        bVar.b("Currently selected provider = " + this.f7119g.getClass().getSimpleName(), new Object[0]);
        this.f7119g.a(context, bVar);
    }

    @Override // yx.a
    public void b(tx.c cVar, zx.b bVar, boolean z11) {
        this.f7115c = true;
        this.f7114b = cVar;
        this.f7117e = bVar;
        this.f7118f = z11;
        this.f7119g.b(cVar, bVar, z11);
    }

    @Override // yx.a
    public Location c() {
        return this.f7119g.c();
    }

    @Override // cy.a
    public void onConnected(Bundle bundle) {
    }

    @Override // cy.a
    public void onConnectionFailed(ConnectionResult connectionResult) {
        d();
    }

    @Override // cy.a
    public void onConnectionSuspended(int i11) {
        d();
    }
}