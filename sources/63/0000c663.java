package zw;

import ezvcard.VCard;
import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.io.CannotParseException;
import ezvcard.io.EmbeddedVCardException;
import ezvcard.io.SkipMeException;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Address;
import ezvcard.property.Label;
import ezvcard.property.VCardProperty;
import ezvcard.util.h;
import ih.d;
import ih.e;
import ih.f;
import ih.g;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ww.b;
import yw.g1;
import yw.o0;

/* loaded from: classes5.dex */
public class a extends ww.c {

    /* renamed from: d */
    private final f f61250d;

    /* renamed from: e */
    private final VCardVersion f61251e;

    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a */
        private final List<C1413a> f61252a;

        /* renamed from: zw.a$b$a */
        /* loaded from: classes5.dex */
        public static class C1413a {

            /* renamed from: a */
            public final VCard f61253a;

            /* renamed from: b */
            public final List<Label> f61254b;

            public C1413a(VCard vCard, List<Label> list) {
                this.f61253a = vCard;
                this.f61254b = list;
            }
        }

        private b() {
            this.f61252a = new ArrayList();
        }

        public boolean a() {
            return this.f61252a.isEmpty();
        }

        public C1413a b() {
            if (a()) {
                return null;
            }
            List<C1413a> list = this.f61252a;
            return list.get(list.size() - 1);
        }

        public C1413a c() {
            if (a()) {
                return null;
            }
            List<C1413a> list = this.f61252a;
            return list.remove(list.size() - 1);
        }

        public void d(VCard vCard) {
            this.f61252a.add(new C1413a(vCard, new ArrayList()));
        }
    }

    /* loaded from: classes5.dex */
    private class c implements d {

        /* renamed from: a */
        private VCard f61255a;

        /* renamed from: b */
        private final b f61256b;

        /* renamed from: c */
        private EmbeddedVCardException f61257c;

        private c() {
            a.this = r2;
            this.f61256b = new b();
        }

        private String g(String str) {
            return VCardDataType.c(str) != null ? "VALUE" : ezvcard.parameter.a.e(str) != null ? "ENCODING" : "TYPE";
        }

        private void h(VCardProperty vCardProperty) {
            Address address;
            String label;
            if ((vCardProperty instanceof Address) && (label = (address = (Address) vCardProperty).getLabel()) != null) {
                address.setLabel(label.replace("\\n", h.f25469a));
            }
        }

        private void i(String str, int i11, SkipMeException skipMeException) {
            ((ww.c) a.this).f56432a.add(new b.C1282b(((ww.c) a.this).f56434c).c(22, skipMeException.getMessage()).a());
        }

        private VCardProperty j(String str, VCardParameters vCardParameters, String str2, VCardDataType vCardDataType, int i11, VCardVersion vCardVersion, CannotParseException cannotParseException) {
            ((ww.c) a.this).f56432a.add(new b.C1282b(((ww.c) a.this).f56434c).d(cannotParseException).a());
            return new o0(str).h(str2, vCardDataType, vCardParameters, null);
        }

        private void k(String str, String str2, int i11, EmbeddedVCardException embeddedVCardException) {
            if (str2.trim().length() == 0) {
                this.f61257c = embeddedVCardException;
                return;
            }
            a aVar = new a(e.f(str2));
            aVar.S0(a.this.R0());
            aVar.X0(a.this.Q0());
            aVar.m(((ww.c) a.this).f56433b);
            try {
                VCard l11 = aVar.l();
                if (l11 != null) {
                    embeddedVCardException.b(l11);
                }
            } catch (IOException unused) {
            } catch (Throwable th2) {
                ((ww.c) a.this).f56432a.addAll(aVar.j());
                ezvcard.util.f.a(aVar);
                throw th2;
            }
            ((ww.c) a.this).f56432a.addAll(aVar.j());
            ezvcard.util.f.a(aVar);
        }

        private boolean l(List<String> list) {
            if (list.isEmpty()) {
                return false;
            }
            return m(list.get(list.size() - 1));
        }

        private boolean m(String str) {
            return "VCARD".equals(str);
        }

        private VCardProperty n(gh.d dVar, VCardVersion vCardVersion, int i11) {
            VCardProperty a11;
            String a12 = dVar.a();
            String b11 = dVar.b();
            VCardParameters vCardParameters = new VCardParameters(dVar.c().h());
            String d11 = dVar.d();
            ((ww.c) a.this).f56434c.e().clear();
            ((ww.c) a.this).f56434c.h(vCardVersion);
            ((ww.c) a.this).f56434c.f(Integer.valueOf(i11));
            ((ww.c) a.this).f56434c.g(b11);
            o(vCardParameters);
            p(vCardParameters, vCardVersion);
            g1<? extends VCardProperty> a13 = ((ww.c) a.this).f56433b.a(b11);
            if (a13 == null) {
                a13 = new o0(b11);
            }
            VCardDataType D = vCardParameters.D();
            vCardParameters.T(null);
            if (D == null) {
                D = a13.d(vCardVersion);
            }
            VCardDataType vCardDataType = D;
            try {
                a11 = a13.h(d11, vCardDataType, vCardParameters, ((ww.c) a.this).f56434c);
                ((ww.c) a.this).f56432a.addAll(((ww.c) a.this).f56434c.e());
            } catch (CannotParseException e11) {
                a11 = j(b11, vCardParameters, d11, vCardDataType, i11, vCardVersion, e11);
            } catch (EmbeddedVCardException e12) {
                k(b11, d11, i11, e12);
                a11 = e12.a();
            } catch (SkipMeException e13) {
                i(b11, i11, e13);
                return null;
            }
            a11.setGroup(a12);
            if (a11 instanceof Label) {
                this.f61256b.b().f61254b.add((Label) a11);
                return null;
            }
            h(a11);
            return a11;
        }

        private void o(VCardParameters vCardParameters) {
            for (String str : vCardParameters.i(null)) {
                vCardParameters.f(g(str), str);
            }
        }

        private void p(VCardParameters vCardParameters, VCardVersion vCardVersion) {
            if (vCardVersion == VCardVersion.V2_1) {
                return;
            }
            List<String> C = vCardParameters.C();
            if (C.isEmpty()) {
                return;
            }
            String str = null;
            Iterator<String> it2 = C.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String next = it2.next();
                if (next.indexOf(44) >= 0) {
                    str = next;
                    break;
                }
            }
            if (str == null) {
                return;
            }
            C.clear();
            int i11 = -1;
            while (true) {
                int i12 = i11 + 1;
                int indexOf = str.indexOf(44, i12);
                if (indexOf >= 0) {
                    C.add(str.substring(i12, indexOf));
                    i11 = indexOf;
                } else {
                    C.add(str.substring(i12));
                    return;
                }
            }
        }

        @Override // ih.d
        public void a(String str, ih.b bVar) {
            if (m(str)) {
                VCard vCard = new VCard(a.this.f61251e);
                if (this.f61256b.a()) {
                    this.f61255a = vCard;
                }
                this.f61256b.d(vCard);
                EmbeddedVCardException embeddedVCardException = this.f61257c;
                if (embeddedVCardException != null) {
                    embeddedVCardException.b(vCard);
                    this.f61257c = null;
                }
            }
        }

        @Override // ih.d
        public void b(String str, ih.b bVar) {
            if (m(str)) {
                b.C1413a c11 = this.f61256b.c();
                a.this.g(c11.f61253a, c11.f61254b);
                if (this.f61256b.a()) {
                    bVar.d();
                }
            }
        }

        @Override // ih.d
        public void c(gh.d dVar, ih.b bVar) {
            if (l(bVar.b())) {
                EmbeddedVCardException embeddedVCardException = this.f61257c;
                if (embeddedVCardException != null) {
                    embeddedVCardException.b(null);
                    this.f61257c = null;
                }
                VCard vCard = this.f61256b.b().f61253a;
                VCardProperty n11 = n(dVar, vCard.q(), bVar.a());
                if (n11 != null) {
                    vCard.d(n11);
                }
            }
        }

        @Override // ih.d
        public void d(String str, ih.b bVar) {
            VCardVersion valueOfByStr = VCardVersion.valueOfByStr(str);
            ((ww.c) a.this).f56434c.h(valueOfByStr);
            this.f61256b.b().f61253a.r(valueOfByStr);
        }

        @Override // ih.d
        public void e(g gVar, gh.d dVar, Exception exc, ih.b bVar) {
            if (l(bVar.b())) {
                ((ww.c) a.this).f56432a.add(new b.C1282b(((ww.c) a.this).f56434c).b(Integer.valueOf(bVar.a())).e(dVar == null ? null : dVar.b()).c(27, gVar.getMessage(), bVar.c()).a());
            }
        }
    }

    public a(String str) {
        this(str, VCardVersion.V2_1);
    }

    public Charset Q0() {
        return this.f61250d.j();
    }

    public boolean R0() {
        return this.f61250d.l();
    }

    public void S0(boolean z11) {
        this.f61250d.L(z11);
    }

    public void X0(Charset charset) {
        this.f61250d.R(charset);
    }

    @Override // ww.c
    protected VCard a() {
        c cVar = new c();
        this.f61250d.D(cVar);
        return cVar.f61255a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f61250d.close();
    }

    public a(String str, VCardVersion vCardVersion) {
        this(new StringReader(str), vCardVersion);
    }

    public a(InputStream inputStream) {
        this(inputStream, VCardVersion.V2_1);
    }

    public a(InputStream inputStream, VCardVersion vCardVersion) {
        this(new InputStreamReader(inputStream), vCardVersion);
    }

    public a(File file) {
        this(file, VCardVersion.V2_1);
    }

    public a(File file, VCardVersion vCardVersion) {
        this(new BufferedReader(new FileReader(file)), vCardVersion);
    }

    public a(Reader reader) {
        this(reader, VCardVersion.V2_1);
    }

    public a(Reader reader, VCardVersion vCardVersion) {
        ih.c f11 = ih.c.f();
        f11.e(vCardVersion.getSyntaxStyle());
        this.f61250d = new f(reader, f11);
        this.f61251e = vCardVersion;
    }
}