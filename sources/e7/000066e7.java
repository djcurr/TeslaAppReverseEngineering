package e2;

import java.util.ArrayList;
import x2.v;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final b[] f24540a;

    /* renamed from: b  reason: collision with root package name */
    private int f24541b;

    public f() {
        b[] bVarArr = new b[20];
        for (int i11 = 0; i11 < 20; i11++) {
            bVarArr[i11] = null;
        }
        this.f24540a = bVarArr;
    }

    private final e c() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i11 = this.f24541b;
        b bVar = this.f24540a[i11];
        if (bVar == null) {
            return e.f24534e.a();
        }
        int i12 = 0;
        b bVar2 = bVar;
        while (true) {
            b bVar3 = this.f24540a[i11];
            if (bVar3 != null) {
                float b11 = (float) (bVar.b() - bVar3.b());
                float abs = (float) Math.abs(bVar3.b() - bVar2.b());
                if (b11 > 100.0f || abs > 40.0f) {
                    break;
                }
                long a11 = bVar3.a();
                arrayList.add(Float.valueOf(s1.f.l(a11)));
                arrayList2.add(Float.valueOf(s1.f.m(a11)));
                arrayList3.add(Float.valueOf(-b11));
                if (i11 == 0) {
                    i11 = 20;
                }
                i11--;
                i12++;
                if (i12 >= 20) {
                    bVar2 = bVar3;
                    break;
                }
                bVar2 = bVar3;
            } else {
                break;
            }
        }
        if (i12 >= 3) {
            try {
                c b12 = g.b(arrayList3, arrayList, 2);
                c b13 = g.b(arrayList3, arrayList2, 2);
                float f11 = 1000;
                return new e(s1.g.a(b12.a().get(1).floatValue() * f11, b13.a().get(1).floatValue() * f11), b12.b() * b13.b(), bVar.b() - bVar2.b(), s1.f.p(bVar.a(), bVar2.a()), null);
            } catch (IllegalArgumentException unused) {
                return e.f24534e.a();
            }
        }
        return new e(s1.f.f49950b.c(), 1.0f, bVar.b() - bVar2.b(), s1.f.p(bVar.a(), bVar2.a()), null);
    }

    public final void a(long j11, long j12) {
        int i11 = (this.f24541b + 1) % 20;
        this.f24541b = i11;
        this.f24540a[i11] = new b(j12, j11, null);
    }

    public final long b() {
        long b11 = c().b();
        return v.a(s1.f.l(b11), s1.f.m(b11));
    }
}