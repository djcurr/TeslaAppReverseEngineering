package g30;

import ch.qos.logback.core.CoreConstants;
import e30.j;
import e30.k;
import java.util.Iterator;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
public final class w extends g1 {

    /* renamed from: m  reason: collision with root package name */
    private final e30.j f27667m;

    /* renamed from: n  reason: collision with root package name */
    private final vz.k f27668n;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.a<SerialDescriptor[]> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f27669a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f27670b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ w f27671c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11, String str, w wVar) {
            super(0);
            this.f27669a = i11;
            this.f27670b = str;
            this.f27671c = wVar;
        }

        @Override // h00.a
        /* renamed from: a */
        public final e30.f[] invoke() {
            int i11 = this.f27669a;
            e30.f[] fVarArr = new e30.f[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                fVarArr[i12] = e30.i.d(this.f27670b + CoreConstants.DOT + this.f27671c.e(i12), k.d.f24593a, new e30.f[0], null, 8, null);
            }
            return fVarArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(String name, int i11) {
        super(name, null, i11, 2, null);
        vz.k a11;
        kotlin.jvm.internal.s.g(name, "name");
        this.f27667m = j.b.f24589a;
        a11 = vz.m.a(new a(i11, name, this));
        this.f27668n = a11;
    }

    private final e30.f[] p() {
        return (e30.f[]) this.f27668n.getValue();
    }

    @Override // g30.g1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof e30.f)) {
            e30.f fVar = (e30.f) obj;
            return fVar.getKind() == j.b.f24589a && kotlin.jvm.internal.s.c(h(), fVar.h()) && kotlin.jvm.internal.s.c(e1.a(this), e1.a(fVar));
        }
        return false;
    }

    @Override // g30.g1, e30.f
    public e30.f g(int i11) {
        return p()[i11];
    }

    @Override // g30.g1, e30.f
    public e30.j getKind() {
        return this.f27667m;
    }

    @Override // g30.g1
    public int hashCode() {
        int hashCode = h().hashCode();
        Iterator<String> it2 = e30.h.b(this).iterator();
        int i11 = 1;
        while (it2.hasNext()) {
            int i12 = i11 * 31;
            String next = it2.next();
            i11 = i12 + (next != null ? next.hashCode() : 0);
        }
        return (hashCode * 31) + i11;
    }

    @Override // g30.g1
    public String toString() {
        String l02;
        Iterable<String> b11 = e30.h.b(this);
        l02 = wz.e0.l0(b11, ", ", h() + CoreConstants.LEFT_PARENTHESIS_CHAR, ")", 0, null, null, 56, null);
        return l02;
    }
}