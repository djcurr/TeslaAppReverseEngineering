package ws;

import android.app.PendingIntent;
import android.content.Context;
import kotlin.jvm.internal.s;
import vs.b;

/* loaded from: classes6.dex */
public final class e implements vs.b {

    /* renamed from: a  reason: collision with root package name */
    public static final e f56164a = new e();

    private e() {
    }

    @Override // nu.a
    public nu.c a(boolean z11) {
        return new nu.c(os.c.f43987n, 0, 2, null);
    }

    @Override // vs.b
    public ot.c b(String productId) {
        s.g(productId, "productId");
        return xs.b.m(xs.b.f57689a, productId, null, 2, null);
    }

    @Override // nu.a
    public PendingIntent c(Context context, int i11, String str) {
        return b.a.a(this, context, i11, str);
    }
}