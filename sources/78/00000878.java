package androidx.room;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m0 implements v4.i {

    /* renamed from: a  reason: collision with root package name */
    private List<Object> f5794a = new ArrayList();

    private void g(int i11, Object obj) {
        int i12 = i11 - 1;
        if (i12 >= this.f5794a.size()) {
            for (int size = this.f5794a.size(); size <= i12; size++) {
                this.f5794a.add(null);
            }
        }
        this.f5794a.set(i12, obj);
    }

    @Override // v4.i
    public void A(int i11, double d11) {
        g(i11, Double.valueOf(d11));
    }

    @Override // v4.i
    public void A0(int i11, String str) {
        g(i11, str);
    }

    @Override // v4.i
    public void U0(int i11, long j11) {
        g(i11, Long.valueOf(j11));
    }

    @Override // v4.i
    public void V0(int i11, byte[] bArr) {
        g(i11, bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Object> a() {
        return this.f5794a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // v4.i
    public void o1(int i11) {
        g(i11, null);
    }
}