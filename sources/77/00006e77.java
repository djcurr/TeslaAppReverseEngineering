package fp;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class i extends h {
    public i(uo.a aVar) {
        super(aVar);
    }

    protected abstract void h(StringBuilder sb2, int i11);

    protected abstract int i(int i11);

    public final void j(StringBuilder sb2, int i11, int i12) {
        int f11 = b().f(i11, i12);
        h(sb2, f11);
        int i13 = i(f11);
        int i14 = 100000;
        for (int i15 = 0; i15 < 5; i15++) {
            if (i13 / i14 == 0) {
                sb2.append('0');
            }
            i14 /= 10;
        }
        sb2.append(i13);
    }
}