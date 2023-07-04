package j$.time.format;

import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class n implements g {

    /* renamed from: a  reason: collision with root package name */
    private final j$.time.temporal.l f32920a;

    /* renamed from: b  reason: collision with root package name */
    private final v f32921b;

    /* renamed from: c  reason: collision with root package name */
    private final b f32922c;

    /* renamed from: d  reason: collision with root package name */
    private volatile j f32923d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(j$.time.temporal.l lVar, v vVar, b bVar) {
        this.f32920a = lVar;
        this.f32921b = vVar;
        this.f32922c = bVar;
    }

    @Override // j$.time.format.g
    public boolean c(q qVar, StringBuilder sb2) {
        String a11;
        j$.time.chrono.g gVar;
        Long e11 = qVar.e(this.f32920a);
        if (e11 == null) {
            return false;
        }
        j$.time.temporal.k d11 = qVar.d();
        int i11 = j$.time.temporal.t.f32969a;
        j$.time.chrono.f fVar = (j$.time.chrono.f) d11.d(j$.time.temporal.n.f32963a);
        if (fVar != null && fVar != (gVar = j$.time.chrono.g.f32874a)) {
            b bVar = this.f32922c;
            j$.time.temporal.l lVar = this.f32920a;
            long longValue = e11.longValue();
            v vVar = this.f32921b;
            qVar.c();
            Objects.requireNonNull(bVar);
            a11 = (fVar == gVar || !(lVar instanceof j$.time.temporal.a)) ? bVar.f32893a.a(longValue, vVar) : null;
        } else {
            b bVar2 = this.f32922c;
            long longValue2 = e11.longValue();
            v vVar2 = this.f32921b;
            qVar.c();
            a11 = bVar2.f32893a.a(longValue2, vVar2);
        }
        if (a11 != null) {
            sb2.append(a11);
            return true;
        }
        if (this.f32923d == null) {
            this.f32923d = new j(this.f32920a, 1, 19, u.NORMAL);
        }
        return this.f32923d.c(qVar, sb2);
    }

    public String toString() {
        StringBuilder sb2;
        Object obj;
        if (this.f32921b == v.FULL) {
            sb2 = new StringBuilder();
            sb2.append("Text(");
            obj = this.f32920a;
        } else {
            sb2 = new StringBuilder();
            sb2.append("Text(");
            sb2.append(this.f32920a);
            sb2.append(",");
            obj = this.f32921b;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}