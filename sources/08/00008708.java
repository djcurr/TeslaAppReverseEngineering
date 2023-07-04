package mq;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes2.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f38724a;

    /* renamed from: b  reason: collision with root package name */
    private final int f38725b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c0(byte[] bArr, int i11) {
        this.f38724a = bArr;
        this.f38725b = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(c0 c0Var, d dVar) {
        if (c0Var == null) {
            dVar.g(0);
            return;
        }
        byte[] bArr = c0Var.f38724a;
        int i11 = c0Var.f38725b;
        dVar.h(bArr, i11, (bArr[i11] * 2) + 1);
    }

    public int a() {
        return this.f38724a[this.f38725b];
    }

    public int b(int i11) {
        return this.f38724a[this.f38725b + (i11 * 2) + 1];
    }

    public int c(int i11) {
        return this.f38724a[this.f38725b + (i11 * 2) + 2];
    }

    public String toString() {
        int a11 = a();
        StringBuilder sb2 = new StringBuilder(a11 * 2);
        for (int i11 = 0; i11 < a11; i11++) {
            int b11 = b(i11);
            if (b11 == 0) {
                sb2.append('[');
            } else if (b11 == 1) {
                sb2.append(CoreConstants.DOT);
            } else if (b11 == 2) {
                sb2.append('*');
            } else if (b11 == 3) {
                sb2.append(c(i11));
                sb2.append(';');
            } else {
                throw new AssertionError();
            }
        }
        return sb2.toString();
    }
}