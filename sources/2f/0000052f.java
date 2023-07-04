package androidx.compose.ui.window;

import kotlin.jvm.internal.u;
import vz.b0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f3271a = new d();

    /* renamed from: b  reason: collision with root package name */
    public static h00.p<c1.i, Integer, b0> f3272b = j1.c.c(-985535022, false, a.f3273a);

    /* loaded from: classes.dex */
    static final class a extends u implements h00.p<c1.i, Integer, b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f3273a = new a();

        a() {
            super(2);
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ b0 invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                iVar.G();
            }
        }
    }

    public final h00.p<c1.i, Integer, b0> a() {
        return f3272b;
    }
}