package hv;

import com.teslamotors.plugins.ble.authengine.AuthorizationResult;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private boolean f29427a;

    /* renamed from: b  reason: collision with root package name */
    private e f29428b;

    /* renamed from: c  reason: collision with root package name */
    private e f29429c;

    public a() {
        this(false, null, null, 7, null);
    }

    public a(boolean z11, e eVar, e eVar2) {
        this.f29427a = z11;
        this.f29428b = eVar;
        this.f29429c = eVar2;
    }

    public final void a(e eVar) {
        this.f29428b = eVar;
    }

    public final void b(e eVar) {
        this.f29429c = eVar;
    }

    public final AuthorizationResult c(String vin) {
        s.g(vin, "vin");
        if (!iv.c.f32778a.a(vin)) {
            d.f29433b.a().i("Passive Auth Disabled.");
            return AuthorizationResult.PASSIVE_AUTH_DISABLED;
        } else if (!this.f29427a) {
            d.f29433b.a().i("Device motion unavailable.");
            return AuthorizationResult.DEVICE_MOTION_UNAVAILABLE;
        } else {
            e eVar = this.f29428b;
            boolean z11 = false;
            if (eVar != null && eVar.b()) {
                d.f29433b.a().i("Has been moving recently, authorize at requested level.");
                return AuthorizationResult.IS_MOVING;
            }
            e eVar2 = this.f29429c;
            if (eVar2 != null && eVar2.b()) {
                z11 = true;
            }
            if (z11) {
                d.f29433b.a().m("Stationary is fresh.");
                return AuthorizationResult.IS_STATIONARY;
            }
            d.f29433b.a().m("No Fresh Data.");
            return AuthorizationResult.NO_FRESH_DATA;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f29427a == aVar.f29427a && s.c(this.f29428b, aVar.f29428b) && s.c(this.f29429c, aVar.f29429c);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z11 = this.f29427a;
        ?? r02 = z11;
        if (z11) {
            r02 = 1;
        }
        int i11 = r02 * 31;
        e eVar = this.f29428b;
        int hashCode = (i11 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        e eVar2 = this.f29429c;
        return hashCode + (eVar2 != null ? eVar2.hashCode() : 0);
    }

    public String toString() {
        boolean z11 = this.f29427a;
        e eVar = this.f29428b;
        e eVar2 = this.f29429c;
        return "AuthState(deviceMotionAvailable=" + z11 + ", mostRecentMovingDeviceMotion=" + eVar + ", mostRecentStationaryDeviceMotion=" + eVar2 + ")";
    }

    public /* synthetic */ a(boolean z11, e eVar, e eVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? null : eVar, (i11 & 4) != 0 ? null : eVar2);
    }
}