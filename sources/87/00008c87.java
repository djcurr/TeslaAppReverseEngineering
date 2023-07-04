package nm;

import com.google.firebase.encoders.EncodingException;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import lm.f;

/* loaded from: classes3.dex */
public final class d implements mm.b<d> {

    /* renamed from: e */
    private static final lm.c<Object> f41750e = new lm.c() { // from class: nm.a
        @Override // lm.c
        public final void encode(Object obj, Object obj2) {
            d.a(obj, (lm.d) obj2);
        }
    };

    /* renamed from: f */
    private static final lm.e<String> f41751f = new lm.e() { // from class: nm.c
        @Override // lm.e
        public final void encode(Object obj, Object obj2) {
            d.b((String) obj, (f) obj2);
        }
    };

    /* renamed from: g */
    private static final lm.e<Boolean> f41752g = new lm.e() { // from class: nm.b
        @Override // lm.e
        public final void encode(Object obj, Object obj2) {
            d.c((Boolean) obj, (f) obj2);
        }
    };

    /* renamed from: h */
    private static final b f41753h = new b(null);

    /* renamed from: a */
    private final Map<Class<?>, lm.c<?>> f41754a = new HashMap();

    /* renamed from: b */
    private final Map<Class<?>, lm.e<?>> f41755b = new HashMap();

    /* renamed from: c */
    private lm.c<Object> f41756c = f41750e;

    /* renamed from: d */
    private boolean f41757d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements lm.a {
        a() {
            d.this = r1;
        }

        @Override // lm.a
        public void a(Object obj, Writer writer) {
            e eVar = new e(writer, d.this.f41754a, d.this.f41755b, d.this.f41756c, d.this.f41757d);
            eVar.c(obj, false);
            eVar.l();
        }

        @Override // lm.a
        public String encode(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class b implements lm.e<Date> {

        /* renamed from: a */
        private static final DateFormat f41759a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f41759a = simpleDateFormat;
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        @Override // lm.e
        /* renamed from: a */
        public void encode(Date date, f fVar) {
            fVar.add(f41759a.format(date));
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public d() {
        o(String.class, f41751f);
        o(Boolean.class, f41752g);
        o(Date.class, f41753h);
    }

    public static /* synthetic */ void a(Object obj, lm.d dVar) {
        k(obj, dVar);
    }

    public static /* synthetic */ void b(String str, f fVar) {
        fVar.add(str);
    }

    public static /* synthetic */ void c(Boolean bool, f fVar) {
        m(bool, fVar);
    }

    public static /* synthetic */ void k(Object obj, lm.d dVar) {
        throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    public static /* synthetic */ void m(Boolean bool, f fVar) {
        fVar.add(bool.booleanValue());
    }

    public lm.a h() {
        return new a();
    }

    public d i(mm.a aVar) {
        aVar.configure(this);
        return this;
    }

    public d j(boolean z11) {
        this.f41757d = z11;
        return this;
    }

    @Override // mm.b
    /* renamed from: n */
    public <T> d registerEncoder(Class<T> cls, lm.c<? super T> cVar) {
        this.f41754a.put(cls, cVar);
        this.f41755b.remove(cls);
        return this;
    }

    public <T> d o(Class<T> cls, lm.e<? super T> eVar) {
        this.f41755b.put(cls, eVar);
        this.f41754a.remove(cls);
        return this;
    }
}