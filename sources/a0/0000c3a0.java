package yy;

/* loaded from: classes5.dex */
public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    final int f59918a;

    /* renamed from: b  reason: collision with root package name */
    final Object[] f59919b;

    /* renamed from: c  reason: collision with root package name */
    Object[] f59920c;

    /* renamed from: d  reason: collision with root package name */
    int f59921d;

    /* renamed from: yy.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1369a<T> extends ky.i<T> {
        @Override // ky.i
        boolean test(T t11);
    }

    public a(int i11) {
        this.f59918a = i11;
        Object[] objArr = new Object[i11 + 1];
        this.f59919b = objArr;
        this.f59920c = objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0019, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <U> boolean a(b80.b<? super U> r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.f59919b
            int r1 = r4.f59918a
        L4:
            r2 = 0
            if (r0 == 0) goto L1e
        L7:
            if (r2 >= r1) goto L19
            r3 = r0[r2]
            if (r3 != 0) goto Le
            goto L19
        Le:
            boolean r3 = yy.i.acceptFull(r3, r5)
            if (r3 == 0) goto L16
            r5 = 1
            return r5
        L16:
            int r2 = r2 + 1
            goto L7
        L19:
            r0 = r0[r1]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L4
        L1e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: yy.a.a(b80.b):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0019, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <U> boolean b(hy.k<? super U> r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.f59919b
            int r1 = r4.f59918a
        L4:
            r2 = 0
            if (r0 == 0) goto L1e
        L7:
            if (r2 >= r1) goto L19
            r3 = r0[r2]
            if (r3 != 0) goto Le
            goto L19
        Le:
            boolean r3 = yy.i.acceptFull(r3, r5)
            if (r3 == 0) goto L16
            r5 = 1
            return r5
        L16:
            int r2 = r2 + 1
            goto L7
        L19:
            r0 = r0[r1]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L4
        L1e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: yy.a.b(hy.k):boolean");
    }

    public void c(T t11) {
        int i11 = this.f59918a;
        int i12 = this.f59921d;
        if (i12 == i11) {
            Object[] objArr = new Object[i11 + 1];
            this.f59920c[i11] = objArr;
            this.f59920c = objArr;
            i12 = 0;
        }
        this.f59920c[i12] = t11;
        this.f59921d = i12 + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0018, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(yy.a.InterfaceC1369a<? super T> r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.f59919b
            int r1 = r4.f59918a
        L4:
            if (r0 == 0) goto L1d
            r2 = 0
        L7:
            if (r2 >= r1) goto L18
            r3 = r0[r2]
            if (r3 != 0) goto Le
            goto L18
        Le:
            boolean r3 = r5.test(r3)
            if (r3 == 0) goto L15
            return
        L15:
            int r2 = r2 + 1
            goto L7
        L18:
            r0 = r0[r1]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L4
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yy.a.d(yy.a$a):void");
    }

    public void e(T t11) {
        this.f59919b[0] = t11;
    }
}