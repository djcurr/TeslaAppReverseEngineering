package sp;

import android.view.View;
import com.henninghall.date_picker.j;
import com.henninghall.date_picker.pickers.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private final j f50501a;

    /* renamed from: b  reason: collision with root package name */
    private final q5.a f50502b;

    /* renamed from: c  reason: collision with root package name */
    private final q5.a f50503c;

    /* renamed from: d  reason: collision with root package name */
    private up.d f50504d;

    /* renamed from: e  reason: collision with root package name */
    private up.c f50505e;

    /* renamed from: f  reason: collision with root package name */
    private up.e f50506f;

    /* renamed from: g  reason: collision with root package name */
    private up.a f50507g;

    /* renamed from: h  reason: collision with root package name */
    private up.b f50508h;

    /* renamed from: i  reason: collision with root package name */
    private up.f f50509i;

    /* renamed from: j  reason: collision with root package name */
    private up.h f50510j;

    /* renamed from: k  reason: collision with root package name */
    private View f50511k;

    /* renamed from: l  reason: collision with root package name */
    private final c f50512l;

    /* renamed from: m  reason: collision with root package name */
    private HashMap<qp.d, up.g> f50513m = z();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements a.b {
        a() {
        }

        @Override // com.henninghall.date_picker.pickers.a.b
        public void a(com.henninghall.date_picker.pickers.a aVar, int i11, int i12) {
            if (h.this.f50501a.f17498p.i()) {
                String n11 = h.this.f50504d.n(i11);
                String n12 = h.this.f50504d.n(i12);
                if ((n11.equals("12") && n12.equals("11")) || (n11.equals("11") && n12.equals("12"))) {
                    h.this.f50507g.f53653d.a((h.this.f50507g.f53653d.getValue() + 1) % 2, false);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b extends HashMap<qp.d, up.g> {
        b() {
            put(qp.d.DAY, h.this.f50505e);
            put(qp.d.YEAR, h.this.f50510j);
            put(qp.d.MONTH, h.this.f50509i);
            put(qp.d.DATE, h.this.f50508h);
            put(qp.d.HOUR, h.this.f50504d);
            put(qp.d.MINUTE, h.this.f50506f);
            put(qp.d.AM_PM, h.this.f50507g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(j jVar, View view) {
        this.f50501a = jVar;
        this.f50511k = view;
        this.f50512l = new c(view);
        this.f50510j = new up.h(w(com.henninghall.date_picker.h.year), jVar);
        this.f50509i = new up.f(w(com.henninghall.date_picker.h.month), jVar);
        this.f50508h = new up.b(w(com.henninghall.date_picker.h.date), jVar);
        this.f50505e = new up.c(w(com.henninghall.date_picker.h.day), jVar);
        this.f50506f = new up.e(w(com.henninghall.date_picker.h.minutes), jVar);
        this.f50507g = new up.a(w(com.henninghall.date_picker.h.ampm), jVar);
        this.f50504d = new up.d(w(com.henninghall.date_picker.h.hour), jVar);
        this.f50502b = (q5.a) view.findViewById(com.henninghall.date_picker.h.empty_start);
        this.f50503c = (q5.a) view.findViewById(com.henninghall.date_picker.h.empty_end);
        m();
    }

    private void i() {
        Iterator<qp.d> it2 = this.f50501a.f17498p.b().iterator();
        while (it2.hasNext()) {
            this.f50512l.a(y(it2.next()).f53653d.getView());
        }
    }

    private void m() {
        this.f50504d.f53653d.setOnValueChangeListenerInScrolling(new a());
    }

    private List<up.g> n() {
        return new ArrayList(Arrays.asList(this.f50510j, this.f50509i, this.f50508h, this.f50505e, this.f50504d, this.f50506f, this.f50507g));
    }

    private String o() {
        ArrayList<up.g> v11 = v();
        if (this.f50501a.z() == qp.b.date) {
            return v11.get(0).e() + " " + v11.get(1).e() + " " + v11.get(2).e();
        }
        return this.f50505e.e();
    }

    private String p(int i11) {
        ArrayList<up.g> v11 = v();
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < 3; i12++) {
            if (i12 != 0) {
                sb2.append(" ");
            }
            up.g gVar = v11.get(i12);
            if (gVar instanceof up.b) {
                sb2.append(gVar.j(i11));
            } else {
                sb2.append(gVar.m());
            }
        }
        return sb2.toString();
    }

    private String q(int i11) {
        if (this.f50501a.z() == qp.b.date) {
            return p(i11);
        }
        return this.f50505e.m();
    }

    private ArrayList<up.g> v() {
        ArrayList<up.g> arrayList = new ArrayList<>();
        Iterator<qp.d> it2 = this.f50501a.f17498p.b().iterator();
        while (it2.hasNext()) {
            arrayList.add(y(it2.next()));
        }
        return arrayList;
    }

    private com.henninghall.date_picker.pickers.a w(int i11) {
        return (com.henninghall.date_picker.pickers.a) this.f50511k.findViewById(i11);
    }

    private HashMap<qp.d, up.g> z() {
        return new b();
    }

    public boolean A() {
        for (up.g gVar : n()) {
            if (gVar.f53653d.c()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B() {
        int o11 = this.f50501a.o();
        j(new tp.f(o11));
        if (this.f50501a.E() == qp.c.iosClone) {
            this.f50502b.setDividerHeight(o11);
            this.f50503c.setDividerHeight(o11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C() {
        int e11 = this.f50501a.f17498p.e();
        j(new tp.g(e11));
        if (this.f50501a.E() == qp.c.iosClone) {
            this.f50502b.setShownCount(e11);
            this.f50503c.setShownCount(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D() {
        this.f50512l.b();
        qp.c E = this.f50501a.E();
        qp.c cVar = qp.c.iosClone;
        if (E == cVar) {
            this.f50512l.a(this.f50502b);
        }
        i();
        if (this.f50501a.E() == cVar) {
            this.f50512l.a(this.f50503c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(tp.j jVar) {
        for (up.g gVar : n()) {
            jVar.a(gVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(tp.j jVar) {
        for (up.g gVar : n()) {
            if (!gVar.v()) {
                jVar.a(gVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(tp.j jVar) {
        for (up.g gVar : n()) {
            if (gVar.v()) {
                jVar.a(gVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String r() {
        return s(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String s(int i11) {
        return q(i11) + " " + x();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String t() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<up.g> it2 = v().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next().b());
        }
        return sb2.toString();
    }

    public String u() {
        return o() + " " + this.f50504d.e() + " " + this.f50506f.e() + this.f50507g.e();
    }

    String x() {
        return this.f50504d.m() + " " + this.f50506f.m() + this.f50507g.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public up.g y(qp.d dVar) {
        return this.f50513m.get(dVar);
    }
}