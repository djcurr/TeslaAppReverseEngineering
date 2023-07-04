package ih;

import ch.qos.logback.core.CoreConstants;
import com.github.mangstadt.vinnie.codec.DecoderException;
import java.io.Closeable;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class f implements Closeable {

    /* renamed from: b  reason: collision with root package name */
    private final Reader f30409b;

    /* renamed from: c  reason: collision with root package name */
    private final c f30410c;

    /* renamed from: e  reason: collision with root package name */
    private Charset f30412e;

    /* renamed from: f  reason: collision with root package name */
    private final b f30413f;

    /* renamed from: h  reason: collision with root package name */
    private final ih.b f30415h;

    /* renamed from: a  reason: collision with root package name */
    private final String f30408a = System.getProperty("line.separator");

    /* renamed from: d  reason: collision with root package name */
    private boolean f30411d = true;

    /* renamed from: g  reason: collision with root package name */
    private final ih.a f30414g = new ih.a();

    /* renamed from: i  reason: collision with root package name */
    private int f30416i = -1;

    /* renamed from: j  reason: collision with root package name */
    private int f30417j = 1;

    /* renamed from: k  reason: collision with root package name */
    private boolean f30418k = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f30419a;

        static {
            int[] iArr = new int[gh.a.values().length];
            f30419a = iArr;
            try {
                iArr[gh.a.OLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30419a[gh.a.NEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final List<String> f30420a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private final List<gh.a> f30421b;

        public b(gh.a aVar) {
            ArrayList arrayList = new ArrayList();
            this.f30421b = arrayList;
            arrayList.add(aVar);
        }

        public String b() {
            if (this.f30420a.isEmpty()) {
                return null;
            }
            List<String> list = this.f30420a;
            return list.get(list.size() - 1);
        }

        public gh.a c() {
            if (this.f30421b.isEmpty()) {
                return null;
            }
            List<gh.a> list = this.f30421b;
            return list.get(list.size() - 1);
        }

        public String d() {
            List<gh.a> list = this.f30421b;
            list.remove(list.size() - 1);
            List<String> list2 = this.f30420a;
            return list2.remove(list2.size() - 1);
        }

        public int e(String str) {
            int lastIndexOf = this.f30420a.lastIndexOf(str);
            if (lastIndexOf < 0) {
                return 0;
            }
            return this.f30420a.size() - lastIndexOf;
        }

        public void f(String str) {
            this.f30420a.add(str);
            this.f30421b.add(c());
        }

        public void g(gh.a aVar) {
            List<gh.a> list = this.f30421b;
            list.set(list.size() - 1, aVar);
        }
    }

    public f(Reader reader, c cVar) {
        this.f30409b = reader;
        this.f30410c = cVar;
        b bVar = new b(cVar.b());
        this.f30413f = bVar;
        this.f30415h = new ih.b(bVar.f30420a);
        if (reader instanceof InputStreamReader) {
            this.f30412e = Charset.forName(((InputStreamReader) reader).getEncoding());
        } else {
            this.f30412e = Charset.defaultCharset();
        }
    }

    private int C() {
        int i11 = this.f30416i;
        if (i11 >= 0) {
            this.f30416i = -1;
            return i11;
        }
        return this.f30409b.read();
    }

    private gh.d J(d dVar) {
        int i11;
        gh.d dVar2 = new gh.d();
        gh.a c11 = this.f30413f.c();
        gh.d dVar3 = null;
        String str = null;
        char c12 = 0;
        boolean z11 = false;
        boolean z12 = false;
        char c13 = 0;
        boolean z13 = false;
        boolean z14 = false;
        while (true) {
            int C = C();
            if (C < 0) {
                this.f30418k = true;
                break;
            }
            char c14 = (char) C;
            if (c12 != '\r' || c14 != '\n') {
                if (m(c14)) {
                    z12 = z11 && c12 == '=' && dVar2.c().i();
                    if (z12) {
                        this.f30414g.c();
                        this.f30415h.f30400b.c();
                    }
                    this.f30417j++;
                } else {
                    if (m(c12)) {
                        if (!p(c14)) {
                            if (!z12) {
                                this.f30416i = c14;
                                break;
                            }
                        } else {
                            z13 = true;
                        }
                    }
                    if (z13) {
                        if (!p(c14) || c11 != gh.a.OLD) {
                            z13 = false;
                        }
                    }
                    this.f30415h.f30400b.a(c14);
                    if (z11) {
                        this.f30414g.a(c14);
                    } else if (c13 != 0) {
                        if (c13 != '\\') {
                            if (c13 == '^') {
                                if (c14 == '\'') {
                                    this.f30414g.a(CoreConstants.DOUBLE_QUOTE_CHAR);
                                } else if (c14 == '^') {
                                    this.f30414g.a(c14);
                                } else if (c14 == 'n') {
                                    this.f30414g.b(this.f30408a);
                                }
                                c12 = c14;
                                dVar3 = null;
                                c13 = 0;
                            }
                            this.f30414g.a(c13).a(c14);
                            c12 = c14;
                            dVar3 = null;
                            c13 = 0;
                        } else {
                            if (c14 != ';') {
                                if (c14 == '\\') {
                                    this.f30414g.a(c14);
                                }
                                this.f30414g.a(c13).a(c14);
                            } else {
                                this.f30414g.a(c14);
                            }
                            c12 = c14;
                            dVar3 = null;
                            c13 = 0;
                        }
                    } else if (str != null && ((i11 = a.f30419a[c11.ordinal()]) == 1 ? c14 == '\\' : i11 == 2 && c14 == '^' && this.f30411d)) {
                        c12 = c14;
                        c13 = c12;
                        dVar3 = null;
                    } else if (c14 == '.' && dVar2.a() == null && dVar2.b() == null) {
                        dVar2.e(this.f30414g.f());
                    } else if ((c14 == ';' || c14 == ':') && !z14) {
                        if (dVar2.b() == null) {
                            dVar2.f(this.f30414g.f());
                        } else {
                            String f11 = this.f30414g.f();
                            if (c11 == gh.a.OLD) {
                                f11 = gh.b.a(f11);
                            }
                            dVar2.c().j(str, f11);
                            str = null;
                        }
                        if (c14 == ':') {
                            z11 = true;
                        }
                    } else {
                        if (dVar2.b() != null) {
                            if (c14 == ',' && str != null && !z14 && c11 != gh.a.OLD) {
                                dVar2.c().j(str, this.f30414g.f());
                            } else if (c14 == '=' && str == null) {
                                String upperCase = this.f30414g.f().toUpperCase();
                                if (c11 == gh.a.OLD) {
                                    upperCase = gh.b.b(upperCase);
                                }
                                str = upperCase;
                            } else if (c14 == '\"' && str != null && c11 != gh.a.OLD) {
                                z14 = !z14;
                            }
                        }
                        this.f30414g.a(c14);
                    }
                    c12 = c14;
                    dVar3 = null;
                }
            }
            c12 = c14;
        }
        if (z11) {
            dVar2.g(this.f30414g.f());
            if (dVar2.c().i()) {
                a(dVar2, dVar);
            }
            return dVar2;
        }
        return dVar3;
    }

    private void a(gh.d dVar, d dVar2) {
        Charset g11 = g(dVar, dVar2);
        if (g11 == null) {
            g11 = this.f30412e;
        }
        try {
            dVar.g(new hh.a(g11.name()).a(dVar.d()));
        } catch (DecoderException e11) {
            dVar2.e(g.QUOTED_PRINTABLE_ERROR, dVar, e11, this.f30415h);
        }
    }

    private Charset g(gh.d dVar, d dVar2) {
        try {
            return dVar.c().f();
        } catch (IllegalCharsetNameException | UnsupportedCharsetException e11) {
            dVar2.e(g.UNKNOWN_CHARSET, dVar, e11, this.f30415h);
            return null;
        }
    }

    private static boolean m(char c11) {
        return c11 == '\n' || c11 == '\r';
    }

    private static boolean p(char c11) {
        return c11 == ' ' || c11 == '\t';
    }

    public void D(d dVar) {
        this.f30415h.f30402d = false;
        while (!this.f30418k) {
            ih.b bVar = this.f30415h;
            if (bVar.f30402d) {
                return;
            }
            bVar.f30401c = this.f30417j;
            this.f30414g.d();
            this.f30415h.f30400b.d();
            gh.d J = J(dVar);
            if (this.f30415h.f30400b.g() == 0) {
                return;
            }
            if (J == null) {
                dVar.e(g.MALFORMED_LINE, null, null, this.f30415h);
            } else if ("BEGIN".equalsIgnoreCase(J.b().trim())) {
                String upperCase = J.d().trim().toUpperCase();
                if (upperCase.length() == 0) {
                    dVar.e(g.EMPTY_BEGIN, null, null, this.f30415h);
                } else {
                    dVar.a(upperCase, this.f30415h);
                    this.f30413f.f(upperCase);
                }
            } else if ("END".equalsIgnoreCase(J.b().trim())) {
                String upperCase2 = J.d().trim().toUpperCase();
                if (upperCase2.length() == 0) {
                    dVar.e(g.EMPTY_END, null, null, this.f30415h);
                } else {
                    int e11 = this.f30413f.e(upperCase2);
                    if (e11 == 0) {
                        dVar.e(g.UNMATCHED_END, null, null, this.f30415h);
                    } else {
                        while (e11 > 0) {
                            dVar.b(this.f30413f.d(), this.f30415h);
                            e11--;
                        }
                    }
                }
            } else {
                if ("VERSION".equalsIgnoreCase(J.b())) {
                    String b11 = this.f30413f.b();
                    if (this.f30410c.d(b11)) {
                        gh.a c11 = this.f30410c.c(b11, J.d());
                        if (c11 == null) {
                            dVar.e(g.UNKNOWN_VERSION, J, null, this.f30415h);
                        } else {
                            dVar.d(J.d(), this.f30415h);
                            this.f30413f.g(c11);
                        }
                    }
                }
                dVar.c(J, this.f30415h);
            }
        }
    }

    public void L(boolean z11) {
        this.f30411d = z11;
    }

    public void R(Charset charset) {
        this.f30412e = charset;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f30409b.close();
    }

    public Charset j() {
        return this.f30412e;
    }

    public boolean l() {
        return this.f30411d;
    }
}