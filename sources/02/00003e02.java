package com.google.zxing;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    private final int f17422a;

    /* renamed from: b  reason: collision with root package name */
    private final int f17423b;

    /* JADX INFO: Access modifiers changed from: protected */
    public f(int i11, int i12) {
        this.f17422a = i11;
        this.f17423b = i12;
    }

    public final int a() {
        return this.f17423b;
    }

    public abstract byte[] b();

    public abstract byte[] c(int i11, byte[] bArr);

    public final int d() {
        return this.f17422a;
    }

    public f e() {
        return new e(this);
    }

    public boolean f() {
        return false;
    }

    public f g() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final String toString() {
        int i11 = this.f17422a;
        byte[] bArr = new byte[i11];
        StringBuilder sb2 = new StringBuilder(this.f17423b * (i11 + 1));
        for (int i12 = 0; i12 < this.f17423b; i12++) {
            bArr = c(i12, bArr);
            for (int i13 = 0; i13 < this.f17422a; i13++) {
                int i14 = bArr[i13] & 255;
                sb2.append(i14 < 64 ? '#' : i14 < 128 ? '+' : i14 < 192 ? CoreConstants.DOT : ' ');
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}