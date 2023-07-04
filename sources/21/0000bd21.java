package ws;

import android.app.PendingIntent;
import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vs.b;

/* loaded from: classes6.dex */
public final class f implements vs.b {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f56165a;

    public f(boolean z11) {
        this.f56165a = z11;
    }

    @Override // nu.a
    public nu.c a(boolean z11) {
        int i11;
        if (z11) {
            i11 = os.c.f43989p;
        } else {
            i11 = os.c.f43988o;
        }
        return new nu.c(i11, 0, 2, null);
    }

    @Override // vs.b
    public ot.c b(String productId) {
        s.g(productId, "productId");
        return xs.b.o(xs.b.f57689a, productId, this.f56165a, null, 4, null);
    }

    @Override // nu.a
    public PendingIntent c(Context context, int i11, String str) {
        return b.a.a(this, context, i11, str);
    }

    public /* synthetic */ f(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11);
    }
}