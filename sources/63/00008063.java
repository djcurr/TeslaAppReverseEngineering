package kotlinx.serialization.json;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private boolean f35625a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f35626b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f35627c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f35628d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f35629e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f35630f;

    /* renamed from: g  reason: collision with root package name */
    private String f35631g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f35632h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f35633i;

    /* renamed from: j  reason: collision with root package name */
    private String f35634j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f35635k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f35636l;

    /* renamed from: m  reason: collision with root package name */
    private i30.c f35637m;

    public c(a json) {
        kotlin.jvm.internal.s.g(json, "json");
        this.f35625a = json.e().e();
        this.f35626b = json.e().f();
        this.f35627c = json.e().g();
        this.f35628d = json.e().l();
        this.f35629e = json.e().b();
        this.f35630f = json.e().h();
        this.f35631g = json.e().i();
        this.f35632h = json.e().d();
        this.f35633i = json.e().k();
        this.f35634j = json.e().c();
        this.f35635k = json.e().a();
        this.f35636l = json.e().j();
        this.f35637m = json.a();
    }

    public final e a() {
        if (!this.f35633i || kotlin.jvm.internal.s.c(this.f35634j, "type")) {
            if (!this.f35630f) {
                if (!kotlin.jvm.internal.s.c(this.f35631g, "    ")) {
                    throw new IllegalArgumentException("Indent should not be specified when default printing mode is used".toString());
                }
            } else if (!kotlin.jvm.internal.s.c(this.f35631g, "    ")) {
                String str = this.f35631g;
                boolean z11 = false;
                int i11 = 0;
                while (true) {
                    boolean z12 = true;
                    if (i11 >= str.length()) {
                        z11 = true;
                        break;
                    }
                    char charAt = str.charAt(i11);
                    if (charAt != ' ' && charAt != '\t' && charAt != '\r' && charAt != '\n') {
                        z12 = false;
                    }
                    if (!z12) {
                        break;
                    }
                    i11++;
                }
                if (!z11) {
                    throw new IllegalArgumentException(("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.f35631g).toString());
                }
            }
            return new e(this.f35625a, this.f35627c, this.f35628d, this.f35629e, this.f35630f, this.f35626b, this.f35631g, this.f35632h, this.f35633i, this.f35634j, this.f35635k, this.f35636l);
        }
        throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified".toString());
    }

    public final i30.c b() {
        return this.f35637m;
    }

    public final void c(boolean z11) {
        this.f35632h = z11;
    }

    public final void d(boolean z11) {
        this.f35625a = z11;
    }

    public final void e(boolean z11) {
        this.f35627c = z11;
    }

    public final void f(boolean z11) {
        this.f35628d = z11;
    }
}