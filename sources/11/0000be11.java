package x0;

import c1.w0;
import java.util.Map;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    private static final w0<o> f56583a = c1.r.c(null, a.f56584a, 1, null);

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.a<o> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f56584a = new a();

        a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final o invoke() {
            return null;
        }
    }

    public static final w0<o> a() {
        return f56583a;
    }

    public static final boolean b(o oVar, long j11) {
        Map<Long, j> b11;
        if (oVar == null || (b11 = oVar.b()) == null) {
            return false;
        }
        return b11.containsKey(Long.valueOf(j11));
    }
}