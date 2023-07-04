package org.spongycastle.crypto.params;

/* loaded from: classes4.dex */
public class GOST3410ValidationParameters {

    /* renamed from: c  reason: collision with root package name */
    private int f43607c;
    private long cL;

    /* renamed from: x0  reason: collision with root package name */
    private int f43608x0;
    private long x0L;

    public GOST3410ValidationParameters(int i11, int i12) {
        this.f43608x0 = i11;
        this.f43607c = i12;
    }

    public boolean equals(Object obj) {
        if (obj instanceof GOST3410ValidationParameters) {
            GOST3410ValidationParameters gOST3410ValidationParameters = (GOST3410ValidationParameters) obj;
            return gOST3410ValidationParameters.f43607c == this.f43607c && gOST3410ValidationParameters.f43608x0 == this.f43608x0 && gOST3410ValidationParameters.cL == this.cL && gOST3410ValidationParameters.x0L == this.x0L;
        }
        return false;
    }

    public int getC() {
        return this.f43607c;
    }

    public long getCL() {
        return this.cL;
    }

    public int getX0() {
        return this.f43608x0;
    }

    public long getX0L() {
        return this.x0L;
    }

    public int hashCode() {
        int i11 = this.f43608x0 ^ this.f43607c;
        long j11 = this.x0L;
        int i12 = (i11 ^ ((int) j11)) ^ ((int) (j11 >> 32));
        long j12 = this.cL;
        return (i12 ^ ((int) j12)) ^ ((int) (j12 >> 32));
    }

    public GOST3410ValidationParameters(long j11, long j12) {
        this.x0L = j11;
        this.cL = j12;
    }
}