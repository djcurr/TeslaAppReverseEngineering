package sc;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public long f50323a;

    /* renamed from: b  reason: collision with root package name */
    public String f50324b;

    public a(bc.m mVar) {
        this.f50323a = mVar.q();
        this.f50324b = mVar.m(4);
        long j11 = this.f50323a;
        if (j11 == 1) {
            this.f50323a = mVar.g();
        } else if (j11 == 0) {
            this.f50323a = -1L;
        }
    }

    public a(a aVar) {
        this.f50323a = aVar.f50323a;
        this.f50324b = aVar.f50324b;
    }
}