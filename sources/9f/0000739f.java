package hp;

import java.util.Formatter;

/* loaded from: classes2.dex */
class g {

    /* renamed from: a  reason: collision with root package name */
    private final c f29381a;

    /* renamed from: b  reason: collision with root package name */
    private final d[] f29382b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(c cVar) {
        this.f29381a = new c(cVar);
        this.f29382b = new d[(cVar.e() - cVar.g()) + 1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final c a() {
        return this.f29381a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final d b(int i11) {
        return this.f29382b[e(i11)];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final d c(int i11) {
        d dVar;
        d dVar2;
        d b11 = b(i11);
        if (b11 != null) {
            return b11;
        }
        for (int i12 = 1; i12 < 5; i12++) {
            int e11 = e(i11) - i12;
            if (e11 >= 0 && (dVar2 = this.f29382b[e11]) != null) {
                return dVar2;
            }
            int e12 = e(i11) + i12;
            d[] dVarArr = this.f29382b;
            if (e12 < dVarArr.length && (dVar = dVarArr[e12]) != null) {
                return dVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final d[] d() {
        return this.f29382b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int e(int i11) {
        return i11 - this.f29381a.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(int i11, d dVar) {
        this.f29382b[e(i11)] = dVar;
    }

    public String toString() {
        d[] dVarArr;
        Formatter formatter = new Formatter();
        try {
            int i11 = 0;
            for (d dVar : this.f29382b) {
                if (dVar == null) {
                    formatter.format("%3d:    |   %n", Integer.valueOf(i11));
                    i11++;
                } else {
                    formatter.format("%3d: %3d|%3d%n", Integer.valueOf(i11), Integer.valueOf(dVar.c()), Integer.valueOf(dVar.e()));
                    i11++;
                }
            }
            String formatter2 = formatter.toString();
            formatter.close();
            return formatter2;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    formatter.close();
                } catch (Throwable th4) {
                    th2.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }
}