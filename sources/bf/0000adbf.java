package qc;

import java.io.Serializable;

/* loaded from: classes.dex */
public class f implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final int f48048a;

    /* renamed from: b  reason: collision with root package name */
    private final int f48049b;

    /* renamed from: c  reason: collision with root package name */
    private final int f48050c;

    public f(int i11, int i12, int i13) {
        this.f48048a = i11;
        this.f48049b = i12;
        this.f48050c = i13;
    }

    public String a() {
        int i11 = this.f48048a;
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? String.format("Unknown (%s)", Integer.valueOf(i11)) : "Q" : "I" : "Cr" : "Cb" : "Y";
    }

    public int b() {
        return (this.f48049b >> 4) & 15;
    }

    public int c() {
        return this.f48049b & 15;
    }

    public String toString() {
        return String.format("Quantization table %d, Sampling factors %d horiz/%d vert", Integer.valueOf(this.f48050c), Integer.valueOf(b()), Integer.valueOf(c()));
    }
}