package wj;

import ak.k0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes3.dex */
final class k implements nj.f {

    /* renamed from: a */
    private final List<e> f55969a;

    /* renamed from: b */
    private final long[] f55970b;

    /* renamed from: c */
    private final long[] f55971c;

    public k(List<e> list) {
        this.f55969a = Collections.unmodifiableList(new ArrayList(list));
        this.f55970b = new long[list.size() * 2];
        for (int i11 = 0; i11 < list.size(); i11++) {
            e eVar = list.get(i11);
            int i12 = i11 * 2;
            long[] jArr = this.f55970b;
            jArr[i12] = eVar.f55938b;
            jArr[i12 + 1] = eVar.f55939c;
        }
        long[] jArr2 = this.f55970b;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f55971c = copyOf;
        Arrays.sort(copyOf);
    }

    public static /* synthetic */ int e(e eVar, e eVar2) {
        return f(eVar, eVar2);
    }

    public static /* synthetic */ int f(e eVar, e eVar2) {
        return Long.compare(eVar.f55938b, eVar2.f55938b);
    }

    @Override // nj.f
    public int a(long j11) {
        int e11 = k0.e(this.f55971c, j11, false, false);
        if (e11 < this.f55971c.length) {
            return e11;
        }
        return -1;
    }

    @Override // nj.f
    public List<nj.b> b(long j11) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < this.f55969a.size(); i11++) {
            long[] jArr = this.f55970b;
            int i12 = i11 * 2;
            if (jArr[i12] <= j11 && j11 < jArr[i12 + 1]) {
                e eVar = this.f55969a.get(i11);
                nj.b bVar = eVar.f55937a;
                if (bVar.f41697d == -3.4028235E38f) {
                    arrayList2.add(eVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: wj.j
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return k.e((e) obj, (e) obj2);
            }
        });
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            arrayList.add(((e) arrayList2.get(i13)).f55937a.a().h((-1) - i13, 1).a());
        }
        return arrayList;
    }

    @Override // nj.f
    public long c(int i11) {
        ak.a.a(i11 >= 0);
        ak.a.a(i11 < this.f55971c.length);
        return this.f55971c[i11];
    }

    @Override // nj.f
    public int d() {
        return this.f55971c.length;
    }
}