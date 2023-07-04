package f70;

import f70.j;
import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes5.dex */
public class b implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Integer, a> f25931a = new TreeMap();

    /* renamed from: b  reason: collision with root package name */
    private transient long f25932b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(long j11) {
        this.f25932b = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(b bVar, long j11) {
        for (Integer num : bVar.f25931a.keySet()) {
            this.f25931a.put(num, new a(bVar.f25931a.get(num)));
        }
        this.f25932b = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(r rVar, long j11, byte[] bArr, byte[] bArr2) {
        this.f25932b = (1 << rVar.a()) - 1;
        for (long j12 = 0; j12 < j11; j12++) {
            e(rVar, j12, bArr, bArr2);
        }
    }

    a a(int i11) {
        return this.f25931a.get(r70.f.d(i11));
    }

    public long b() {
        return this.f25932b;
    }

    void c(int i11, a aVar) {
        this.f25931a.put(r70.f.d(i11), aVar);
    }

    a d(int i11, byte[] bArr, byte[] bArr2, j jVar) {
        return this.f25931a.put(r70.f.d(i11), this.f25931a.get(r70.f.d(i11)).d(bArr, bArr2, jVar));
    }

    void e(r rVar, long j11, byte[] bArr, byte[] bArr2) {
        x h11 = rVar.h();
        int b11 = h11.b();
        long j12 = a0.j(j11, b11);
        int i11 = a0.i(j11, b11);
        j jVar = (j) new j.b().h(j12).p(i11).l();
        int i12 = (1 << b11) - 1;
        if (i11 < i12) {
            if (a(0) == null || i11 == 0) {
                c(0, new a(h11, bArr, bArr2, jVar));
            }
            d(0, bArr, bArr2, jVar);
        }
        for (int i13 = 1; i13 < rVar.b(); i13++) {
            int i14 = a0.i(j12, b11);
            j12 = a0.j(j12, b11);
            j jVar2 = (j) new j.b().g(i13).h(j12).p(i14).l();
            if (this.f25931a.get(Integer.valueOf(i13)) == null || a0.n(j11, b11, i13)) {
                this.f25931a.put(Integer.valueOf(i13), new a(h11, bArr, bArr2, jVar2));
            }
            if (i14 < i12 && a0.m(j11, b11, i13)) {
                d(i13, bArr, bArr2, jVar2);
            }
        }
    }

    public b f(org.bouncycastle.asn1.k kVar) {
        b bVar = new b(this.f25932b);
        for (Integer num : this.f25931a.keySet()) {
            bVar.f25931a.put(num, this.f25931a.get(num).h(kVar));
        }
        return bVar;
    }
}