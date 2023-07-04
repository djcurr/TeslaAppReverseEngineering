package l1;

import c1.r;
import c1.w0;
import h00.l;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final w0<f> f36374a = r.d(a.f36375a);

    /* loaded from: classes.dex */
    static final class a extends u implements h00.a<f> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f36375a = new a();

        a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final f invoke() {
            return null;
        }
    }

    public static final f a(Map<String, ? extends List<? extends Object>> map, l<Object, Boolean> canBeSaved) {
        s.g(canBeSaved, "canBeSaved");
        return new g(map, canBeSaved);
    }

    public static final w0<f> b() {
        return f36374a;
    }
}