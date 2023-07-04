package u50;

/* loaded from: classes5.dex */
public class w0 {

    /* renamed from: a  reason: collision with root package name */
    private int f53302a;

    /* renamed from: b  reason: collision with root package name */
    private int f53303b;

    /* renamed from: c  reason: collision with root package name */
    private long f53304c;

    /* renamed from: d  reason: collision with root package name */
    private long f53305d;

    public w0(int i11, int i12) {
        this.f53302a = i11;
        this.f53303b = i12;
    }

    public w0(long j11, long j12) {
        this.f53304c = j11;
        this.f53305d = j12;
    }

    public boolean equals(Object obj) {
        if (obj instanceof w0) {
            w0 w0Var = (w0) obj;
            return w0Var.f53303b == this.f53303b && w0Var.f53302a == this.f53302a && w0Var.f53305d == this.f53305d && w0Var.f53304c == this.f53304c;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.f53302a ^ this.f53303b;
        long j11 = this.f53304c;
        int i12 = (i11 ^ ((int) j11)) ^ ((int) (j11 >> 32));
        long j12 = this.f53305d;
        return (i12 ^ ((int) j12)) ^ ((int) (j12 >> 32));
    }
}