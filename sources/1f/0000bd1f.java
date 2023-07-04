package ws;

import android.app.PendingIntent;
import android.content.Context;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import lt.p0;
import vs.b;

/* loaded from: classes6.dex */
public final class d implements vs.b {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f56163a;

    public d(boolean z11) {
        this.f56163a = z11;
    }

    @Override // nu.a
    public nu.c a(boolean z11) {
        int i11;
        if (!z11) {
            i11 = os.c.f43983j;
        } else if (z11) {
            i11 = os.c.f43984k;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return new nu.c(i11, 0, 2, null);
    }

    @Override // vs.b
    public ot.c b(String productId) {
        s.g(productId, "productId");
        return xs.b.k(xs.b.f57689a, productId, p0.a.ClimateKeeperAction_Dog, this.f56163a, null, 8, null);
    }

    @Override // nu.a
    public PendingIntent c(Context context, int i11, String str) {
        return b.a.a(this, context, i11, str);
    }

    public /* synthetic */ d(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11);
    }
}