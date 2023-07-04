package oi;

import ak.v;
import ji.i;

/* loaded from: classes3.dex */
final class f {

    /* renamed from: a  reason: collision with root package name */
    private final v f42541a = new v(8);

    /* renamed from: b  reason: collision with root package name */
    private int f42542b;

    private long a(i iVar) {
        int i11 = 0;
        iVar.n(this.f42541a.d(), 0, 1);
        int i12 = this.f42541a.d()[0] & 255;
        if (i12 == 0) {
            return Long.MIN_VALUE;
        }
        int i13 = 128;
        int i14 = 0;
        while ((i12 & i13) == 0) {
            i13 >>= 1;
            i14++;
        }
        int i15 = i12 & (~i13);
        iVar.n(this.f42541a.d(), 1, i14);
        while (i11 < i14) {
            i11++;
            i15 = (this.f42541a.d()[i11] & 255) + (i15 << 8);
        }
        this.f42542b += i14 + 1;
        return i15;
    }

    public boolean b(i iVar) {
        long a11;
        int i11;
        long length = iVar.getLength();
        int i12 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j11 = 1024;
        if (i12 != 0 && length <= 1024) {
            j11 = length;
        }
        int i13 = (int) j11;
        iVar.n(this.f42541a.d(), 0, 4);
        long E = this.f42541a.E();
        this.f42542b = 4;
        while (E != 440786851) {
            int i14 = this.f42542b + 1;
            this.f42542b = i14;
            if (i14 == i13) {
                return false;
            }
            iVar.n(this.f42541a.d(), 0, 1);
            E = ((E << 8) & (-256)) | (this.f42541a.d()[0] & 255);
        }
        long a12 = a(iVar);
        long j12 = this.f42542b;
        if (a12 == Long.MIN_VALUE) {
            return false;
        }
        if (i12 != 0 && j12 + a12 >= length) {
            return false;
        }
        while (true) {
            int i15 = this.f42542b;
            long j13 = j12 + a12;
            if (i15 >= j13) {
                return ((long) i15) == j13;
            } else if (a(iVar) != Long.MIN_VALUE && (a(iVar)) >= 0 && a11 <= 2147483647L) {
                if (i11 != 0) {
                    int i16 = (int) a11;
                    iVar.g(i16);
                    this.f42542b += i16;
                }
            }
        }
    }
}