package q0;

import kotlin.jvm.internal.u;

/* loaded from: classes.dex */
public final class i {

    /* loaded from: classes.dex */
    static final class a extends u implements h00.a<h> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f47083a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f47084b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11, int i12) {
            super(0);
            this.f47083a = i11;
            this.f47084b = i12;
        }

        @Override // h00.a
        /* renamed from: a */
        public final h invoke() {
            return new h(this.f47083a, this.f47084b);
        }
    }

    public static final h a(int i11, int i12, c1.i iVar, int i13, int i14) {
        iVar.x(690738462);
        if ((i14 & 1) != 0) {
            i11 = 0;
        }
        if ((i14 & 2) != 0) {
            i12 = 0;
        }
        h hVar = (h) l1.b.b(new Object[0], h.f47059p.a(), null, new a(i11, i12), iVar, 72, 4);
        iVar.N();
        return hVar;
    }
}