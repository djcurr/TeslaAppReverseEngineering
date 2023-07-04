package fj;

/* loaded from: classes3.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    public final Object f26303a;

    /* renamed from: b  reason: collision with root package name */
    public final int f26304b;

    /* renamed from: c  reason: collision with root package name */
    public final int f26305c;

    /* renamed from: d  reason: collision with root package name */
    public final long f26306d;

    /* renamed from: e  reason: collision with root package name */
    public final int f26307e;

    public i(Object obj) {
        this(obj, -1L);
    }

    public i a(Object obj) {
        return this.f26303a.equals(obj) ? this : new i(obj, this.f26304b, this.f26305c, this.f26306d, this.f26307e);
    }

    public boolean b() {
        return this.f26304b != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return this.f26303a.equals(iVar.f26303a) && this.f26304b == iVar.f26304b && this.f26305c == iVar.f26305c && this.f26306d == iVar.f26306d && this.f26307e == iVar.f26307e;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f26303a.hashCode()) * 31) + this.f26304b) * 31) + this.f26305c) * 31) + ((int) this.f26306d)) * 31) + this.f26307e;
    }

    public i(Object obj, long j11) {
        this(obj, -1, -1, j11, -1);
    }

    public i(Object obj, long j11, int i11) {
        this(obj, -1, -1, j11, i11);
    }

    public i(Object obj, int i11, int i12, long j11) {
        this(obj, i11, i12, j11, -1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public i(i iVar) {
        this.f26303a = iVar.f26303a;
        this.f26304b = iVar.f26304b;
        this.f26305c = iVar.f26305c;
        this.f26306d = iVar.f26306d;
        this.f26307e = iVar.f26307e;
    }

    private i(Object obj, int i11, int i12, long j11, int i13) {
        this.f26303a = obj;
        this.f26304b = i11;
        this.f26305c = i12;
        this.f26306d = j11;
        this.f26307e = i13;
    }
}