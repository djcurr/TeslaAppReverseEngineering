package l6;

import ch.qos.logback.classic.spi.CallerData;
import com.adobe.xmp.XMPException;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class j implements k6.b {

    /* renamed from: a  reason: collision with root package name */
    private n6.b f37016a;

    /* renamed from: b  reason: collision with root package name */
    private String f37017b;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f37018c = false;

    /* renamed from: d  reason: collision with root package name */
    private Iterator f37019d;

    /* loaded from: classes.dex */
    private class a implements Iterator {

        /* renamed from: a  reason: collision with root package name */
        private int f37020a;

        /* renamed from: b  reason: collision with root package name */
        private m f37021b;

        /* renamed from: c  reason: collision with root package name */
        private String f37022c;

        /* renamed from: d  reason: collision with root package name */
        private Iterator f37023d;

        /* renamed from: e  reason: collision with root package name */
        private int f37024e;

        /* renamed from: f  reason: collision with root package name */
        private Iterator f37025f;

        /* renamed from: g  reason: collision with root package name */
        private o6.b f37026g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: l6.j$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0699a implements o6.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f37028a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f37029b;

            C0699a(a aVar, m mVar, String str, String str2, String str3) {
                this.f37028a = str2;
                this.f37029b = str3;
            }

            @Override // o6.b
            public String getPath() {
                return this.f37028a;
            }

            @Override // o6.b
            public String getValue() {
                return this.f37029b;
            }
        }

        public a() {
            this.f37020a = 0;
            this.f37023d = null;
            this.f37024e = 0;
            this.f37025f = Collections.EMPTY_LIST.iterator();
            this.f37026g = null;
        }

        public a(m mVar, String str, int i11) {
            this.f37020a = 0;
            this.f37023d = null;
            this.f37024e = 0;
            this.f37025f = Collections.EMPTY_LIST.iterator();
            this.f37026g = null;
            this.f37021b = mVar;
            this.f37020a = 0;
            if (mVar.t().o()) {
                j.this.c(mVar.s());
            }
            this.f37022c = a(mVar, str, i11);
        }

        private boolean d(Iterator it2) {
            j jVar = j.this;
            if (jVar.f37018c) {
                jVar.f37018c = false;
                this.f37025f = Collections.EMPTY_LIST.iterator();
            }
            if (!this.f37025f.hasNext() && it2.hasNext()) {
                int i11 = this.f37024e + 1;
                this.f37024e = i11;
                this.f37025f = new a((m) it2.next(), this.f37022c, i11);
            }
            if (this.f37025f.hasNext()) {
                this.f37026g = (o6.b) this.f37025f.next();
                return true;
            }
            return false;
        }

        protected String a(m mVar, String str, int i11) {
            String s11;
            String str2;
            if (mVar.u() == null || mVar.t().o()) {
                return null;
            }
            if (mVar.u().t().i()) {
                s11 = "[" + String.valueOf(i11) + "]";
                str2 = "";
            } else {
                s11 = mVar.s();
                str2 = "/";
            }
            if (str == null || str.length() == 0) {
                return s11;
            }
            if (j.this.b().i()) {
                return !s11.startsWith(CallerData.NA) ? s11 : s11.substring(1);
            }
            return str + str2 + s11;
        }

        protected o6.b b(m mVar, String str, String str2) {
            return new C0699a(this, mVar, str, str2, mVar.t().o() ? null : mVar.z());
        }

        protected o6.b c() {
            return this.f37026g;
        }

        protected boolean e() {
            this.f37020a = 1;
            if (this.f37021b.u() == null || (j.this.b().j() && this.f37021b.A())) {
                return hasNext();
            }
            this.f37026g = b(this.f37021b, j.this.a(), this.f37022c);
            return true;
        }

        protected void f(o6.b bVar) {
            this.f37026g = bVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f37026g != null) {
                return true;
            }
            int i11 = this.f37020a;
            if (i11 == 0) {
                return e();
            }
            if (i11 != 1) {
                if (this.f37023d == null) {
                    this.f37023d = this.f37021b.I();
                }
                return d(this.f37023d);
            }
            if (this.f37023d == null) {
                this.f37023d = this.f37021b.H();
            }
            boolean d11 = d(this.f37023d);
            if (d11 || !this.f37021b.B() || j.this.b().k()) {
                return d11;
            }
            this.f37020a = 2;
            this.f37023d = null;
            return hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (hasNext()) {
                o6.b bVar = this.f37026g;
                this.f37026g = null;
                return bVar;
            }
            throw new NoSuchElementException("There are no more nodes to return");
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    private class b extends a {

        /* renamed from: i  reason: collision with root package name */
        private String f37030i;

        /* renamed from: j  reason: collision with root package name */
        private Iterator f37031j;

        /* renamed from: k  reason: collision with root package name */
        private int f37032k;

        public b(m mVar, String str) {
            super();
            this.f37032k = 0;
            if (mVar.t().o()) {
                j.this.c(mVar.s());
            }
            this.f37030i = a(mVar, str, 1);
            this.f37031j = mVar.H();
        }

        @Override // l6.j.a, java.util.Iterator
        public boolean hasNext() {
            if (c() != null) {
                return true;
            }
            if (!j.this.f37018c && this.f37031j.hasNext()) {
                m mVar = (m) this.f37031j.next();
                this.f37032k++;
                String str = null;
                if (mVar.t().o()) {
                    j.this.c(mVar.s());
                } else if (mVar.u() != null) {
                    str = a(mVar, this.f37030i, this.f37032k);
                }
                if (j.this.b().j() && mVar.A()) {
                    return hasNext();
                }
                f(b(mVar, j.this.a(), str));
                return true;
            }
            return false;
        }
    }

    public j(k kVar, String str, String str2, n6.b bVar) {
        m j11;
        String str3 = null;
        this.f37017b = null;
        this.f37019d = null;
        this.f37016a = bVar == null ? new n6.b() : bVar;
        boolean z11 = str != null && str.length() > 0;
        boolean z12 = str2 != null && str2.length() > 0;
        if (!z11 && !z12) {
            j11 = kVar.a();
        } else if (z11 && z12) {
            m6.b a11 = m6.c.a(str, str2);
            m6.b bVar2 = new m6.b();
            for (int i11 = 0; i11 < a11.c() - 1; i11++) {
                bVar2.a(a11.b(i11));
            }
            j11 = n.g(kVar.a(), a11, false, null);
            this.f37017b = str;
            str3 = bVar2.toString();
        } else if (!z11 || z12) {
            throw new XMPException("Schema namespace URI is required", 101);
        } else {
            j11 = n.j(kVar.a(), str, false);
        }
        if (j11 != null) {
            this.f37019d = !this.f37016a.h() ? new a(j11, str3, 1) : new b(j11, str3);
        } else {
            this.f37019d = Collections.EMPTY_LIST.iterator();
        }
    }

    protected String a() {
        return this.f37017b;
    }

    protected n6.b b() {
        return this.f37016a;
    }

    protected void c(String str) {
        this.f37017b = str;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f37019d.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        return this.f37019d.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("The XMPIterator does not support remove().");
    }
}