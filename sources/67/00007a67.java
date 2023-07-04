package ix;

/* loaded from: classes5.dex */
public class d extends freemarker.ext.beans.i {

    /* renamed from: x */
    static final d f32819x = new d();

    /* renamed from: y */
    private static final g f32820y;

    /* renamed from: v */
    private boolean f32821v;

    /* renamed from: w */
    private boolean f32822w;

    static {
        g gVar = null;
        try {
            Class.forName("org.python.core.PyObject");
            fx.b bVar = fx.b.f27035c;
            gVar = (g) fx.b.class.getField("INSTANCE").get(null);
        } catch (Throwable th2) {
            if (!(th2 instanceof ClassNotFoundException)) {
                try {
                    hx.b.i("freemarker.template.DefaultObjectWrapper").f("Failed to init Jython support, so it was disabled.", th2);
                } catch (Throwable unused) {
                }
            }
        }
        f32820y = gVar;
    }

    public d() {
        this(a.E);
    }

    public static p l(p pVar) {
        q.a(pVar);
        p l11 = freemarker.ext.beans.i.l(pVar);
        int c11 = pVar.c();
        int i11 = q.f32845c;
        return (c11 < i11 || l11.c() >= i11) ? l11 : a.B;
    }

    @Override // freemarker.ext.beans.i
    public String o() {
        int indexOf;
        String o11 = super.o();
        if (o11.startsWith("simpleMapWrapper") && (indexOf = o11.indexOf(44)) != -1) {
            o11 = o11.substring(indexOf + 1).trim();
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("useAdaptersForContainers=");
        stringBuffer.append(this.f32821v);
        stringBuffer.append(", forceLegacyNonListCollections=");
        stringBuffer.append(this.f32822w);
        stringBuffer.append(", ");
        stringBuffer.append(o11);
        return stringBuffer.toString();
    }

    public d(p pVar) {
        this((f) new b(pVar), false);
    }

    public d(freemarker.ext.beans.j jVar, boolean z11) {
        super(jVar, z11, false);
        f cVar = jVar instanceof f ? (f) jVar : new c(this, jVar.c());
        this.f32821v = cVar.k();
        this.f32822w = cVar.j();
        e(z11);
    }

    protected d(f fVar, boolean z11) {
        this((freemarker.ext.beans.j) fVar, z11);
    }
}