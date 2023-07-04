package z2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j implements f2.s {

    /* renamed from: a  reason: collision with root package name */
    private final e f60106a;

    /* renamed from: b  reason: collision with root package name */
    private final h00.l<d, vz.b0> f60107b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f60108c;

    /* JADX WARN: Multi-variable type inference failed */
    public j(e ref, h00.l<? super d, vz.b0> constrain) {
        kotlin.jvm.internal.s.g(ref, "ref");
        kotlin.jvm.internal.s.g(constrain, "constrain");
        this.f60106a = ref;
        this.f60107b = constrain;
        this.f60108c = ref.c();
    }

    @Override // f2.s
    public Object a() {
        return this.f60108c;
    }

    public final h00.l<d, vz.b0> b() {
        return this.f60107b;
    }

    public final e c() {
        return this.f60106a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (kotlin.jvm.internal.s.c(this.f60106a.c(), jVar.f60106a.c()) && kotlin.jvm.internal.s.c(this.f60107b, jVar.f60107b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f60106a.c().hashCode() * 31) + this.f60107b.hashCode();
    }
}