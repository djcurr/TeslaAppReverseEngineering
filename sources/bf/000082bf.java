package l6;

import com.adobe.xmp.XMPException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
class m implements Comparable {

    /* renamed from: a  reason: collision with root package name */
    private String f37037a;

    /* renamed from: b  reason: collision with root package name */
    private String f37038b;

    /* renamed from: c  reason: collision with root package name */
    private m f37039c;

    /* renamed from: d  reason: collision with root package name */
    private List f37040d;

    /* renamed from: e  reason: collision with root package name */
    private List f37041e;

    /* renamed from: f  reason: collision with root package name */
    private n6.e f37042f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f37043g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f37044h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f37045i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f37046j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Iterator {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Iterator f37047a;

        a(m mVar, Iterator it2) {
            this.f37047a = it2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f37047a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return this.f37047a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("remove() is not allowed due to the internal contraints");
        }
    }

    public m(String str, String str2, n6.e eVar) {
        this.f37040d = null;
        this.f37041e = null;
        this.f37042f = null;
        this.f37037a = str;
        this.f37038b = str2;
        this.f37042f = eVar;
    }

    public m(String str, n6.e eVar) {
        this(str, null, eVar);
    }

    private boolean F() {
        return "xml:lang".equals(this.f37037a);
    }

    private boolean G() {
        return "rdf:type".equals(this.f37037a);
    }

    private void d(String str) {
        if (HttpUrl.PATH_SEGMENT_ENCODE_SET_URI.equals(str) || i(str) == null) {
            return;
        }
        throw new XMPException("Duplicate property or field node '" + str + "'", 203);
    }

    private void e(String str) {
        if (HttpUrl.PATH_SEGMENT_ENCODE_SET_URI.equals(str) || k(str) == null) {
            return;
        }
        throw new XMPException("Duplicate '" + str + "' qualifier", 203);
    }

    private m h(List list, String str) {
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                m mVar = (m) it2.next();
                if (mVar.s().equals(str)) {
                    return mVar;
                }
            }
            return null;
        }
        return null;
    }

    private List n() {
        if (this.f37040d == null) {
            this.f37040d = new ArrayList(0);
        }
        return this.f37040d;
    }

    private List v() {
        if (this.f37041e == null) {
            this.f37041e = new ArrayList(0);
        }
        return this.f37041e;
    }

    public boolean A() {
        List list = this.f37040d;
        return list != null && list.size() > 0;
    }

    public boolean B() {
        List list = this.f37041e;
        return list != null && list.size() > 0;
    }

    public boolean D() {
        return this.f37045i;
    }

    public boolean E() {
        return this.f37043g;
    }

    public Iterator H() {
        return this.f37040d != null ? n().iterator() : Collections.EMPTY_LIST.listIterator();
    }

    public Iterator I() {
        return this.f37041e != null ? new a(this, v().iterator()) : Collections.EMPTY_LIST.iterator();
    }

    public void J(int i11) {
        n().remove(i11 - 1);
        f();
    }

    public void K(m mVar) {
        n().remove(mVar);
        f();
    }

    public void M() {
        this.f37040d = null;
    }

    public void N(m mVar) {
        n6.e t11 = t();
        if (mVar.F()) {
            t11.w(false);
        } else if (mVar.G()) {
            t11.y(false);
        }
        v().remove(mVar);
        if (this.f37041e.isEmpty()) {
            t11.x(false);
            this.f37041e = null;
        }
    }

    public void O() {
        n6.e t11 = t();
        t11.x(false);
        t11.w(false);
        t11.y(false);
        this.f37041e = null;
    }

    public void P(int i11, m mVar) {
        mVar.X(this);
        n().set(i11 - 1, mVar);
    }

    public void Q(boolean z11) {
        this.f37045i = z11;
    }

    public void S(boolean z11) {
        this.f37044h = z11;
    }

    public void T(boolean z11) {
        this.f37046j = z11;
    }

    public void U(boolean z11) {
        this.f37043g = z11;
    }

    public void V(String str) {
        this.f37037a = str;
    }

    public void W(n6.e eVar) {
        this.f37042f = eVar;
    }

    protected void X(m mVar) {
        this.f37039c = mVar;
    }

    public void Y(String str) {
        this.f37038b = str;
    }

    public void a(int i11, m mVar) {
        d(mVar.s());
        mVar.X(this);
        n().add(i11 - 1, mVar);
    }

    public void b(m mVar) {
        d(mVar.s());
        mVar.X(this);
        n().add(mVar);
    }

    public void c(m mVar) {
        List v11;
        int i11;
        e(mVar.s());
        mVar.X(this);
        mVar.t().z(true);
        t().x(true);
        if (mVar.F()) {
            this.f37042f.w(true);
            v11 = v();
            i11 = 0;
        } else if (!mVar.G()) {
            v().add(mVar);
            return;
        } else {
            this.f37042f.y(true);
            v11 = v();
            i11 = this.f37042f.h();
        }
        v11.add(i11, mVar);
    }

    public Object clone() {
        n6.e eVar;
        try {
            eVar = new n6.e(t().d());
        } catch (XMPException unused) {
            eVar = new n6.e();
        }
        m mVar = new m(this.f37037a, this.f37038b, eVar);
        g(mVar);
        return mVar;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        String str;
        String s11;
        if (t().o()) {
            str = this.f37038b;
            s11 = ((m) obj).z();
        } else {
            str = this.f37037a;
            s11 = ((m) obj).s();
        }
        return str.compareTo(s11);
    }

    protected void f() {
        if (this.f37040d.isEmpty()) {
            this.f37040d = null;
        }
    }

    public void g(m mVar) {
        try {
            Iterator H = H();
            while (H.hasNext()) {
                mVar.b((m) ((m) H.next()).clone());
            }
            Iterator I = I();
            while (I.hasNext()) {
                mVar.c((m) ((m) I.next()).clone());
            }
        } catch (XMPException unused) {
        }
    }

    public m i(String str) {
        return h(n(), str);
    }

    public m k(String str) {
        return h(this.f37041e, str);
    }

    public m l(int i11) {
        return (m) n().get(i11 - 1);
    }

    public int o() {
        List list = this.f37040d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public boolean q() {
        return this.f37044h;
    }

    public boolean r() {
        return this.f37046j;
    }

    public String s() {
        return this.f37037a;
    }

    public n6.e t() {
        if (this.f37042f == null) {
            this.f37042f = new n6.e();
        }
        return this.f37042f;
    }

    public m u() {
        return this.f37039c;
    }

    public m w(int i11) {
        return (m) v().get(i11 - 1);
    }

    public int x() {
        List list = this.f37041e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public List y() {
        return Collections.unmodifiableList(new ArrayList(n()));
    }

    public String z() {
        return this.f37038b;
    }
}