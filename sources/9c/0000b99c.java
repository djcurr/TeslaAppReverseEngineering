package v7;

import android.graphics.Rect;
import ch.qos.logback.classic.net.SyslogAppender;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class d {

    /* renamed from: c */
    private Map<String, List<d8.e>> f54245c;

    /* renamed from: d */
    private Map<String, f> f54246d;

    /* renamed from: e */
    private Map<String, a8.c> f54247e;

    /* renamed from: f */
    private List<a8.h> f54248f;

    /* renamed from: g */
    private androidx.collection.h<a8.d> f54249g;

    /* renamed from: h */
    private androidx.collection.d<d8.e> f54250h;

    /* renamed from: i */
    private List<d8.e> f54251i;

    /* renamed from: j */
    private Rect f54252j;

    /* renamed from: k */
    private float f54253k;

    /* renamed from: l */
    private float f54254l;

    /* renamed from: m */
    private float f54255m;

    /* renamed from: n */
    private boolean f54256n;

    /* renamed from: a */
    private final l f54243a = new l();

    /* renamed from: b */
    private final HashSet<String> f54244b = new HashSet<>();

    /* renamed from: o */
    private int f54257o = 0;

    public void a(String str) {
        h8.d.c(str);
        this.f54244b.add(str);
    }

    public Rect b() {
        return this.f54252j;
    }

    public androidx.collection.h<a8.d> c() {
        return this.f54249g;
    }

    public float d() {
        return (e() / this.f54255m) * 1000.0f;
    }

    public float e() {
        return this.f54254l - this.f54253k;
    }

    public float f() {
        return this.f54254l;
    }

    public Map<String, a8.c> g() {
        return this.f54247e;
    }

    public float h(float f11) {
        return h8.g.k(this.f54253k, this.f54254l, f11);
    }

    public float i() {
        return this.f54255m;
    }

    public Map<String, f> j() {
        return this.f54246d;
    }

    public List<d8.e> k() {
        return this.f54251i;
    }

    public a8.h l(String str) {
        int size = this.f54248f.size();
        for (int i11 = 0; i11 < size; i11++) {
            a8.h hVar = this.f54248f.get(i11);
            if (hVar.a(str)) {
                return hVar;
            }
        }
        return null;
    }

    public int m() {
        return this.f54257o;
    }

    public l n() {
        return this.f54243a;
    }

    public List<d8.e> o(String str) {
        return this.f54245c.get(str);
    }

    public float p() {
        return this.f54253k;
    }

    public boolean q() {
        return this.f54256n;
    }

    public void r(int i11) {
        this.f54257o += i11;
    }

    public void s(Rect rect, float f11, float f12, float f13, List<d8.e> list, androidx.collection.d<d8.e> dVar, Map<String, List<d8.e>> map, Map<String, f> map2, androidx.collection.h<a8.d> hVar, Map<String, a8.c> map3, List<a8.h> list2) {
        this.f54252j = rect;
        this.f54253k = f11;
        this.f54254l = f12;
        this.f54255m = f13;
        this.f54251i = list;
        this.f54250h = dVar;
        this.f54245c = map;
        this.f54246d = map2;
        this.f54249g = hVar;
        this.f54247e = map3;
        this.f54248f = list2;
    }

    public d8.e t(long j11) {
        return this.f54250h.f(j11);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        for (d8.e eVar : this.f54251i) {
            sb2.append(eVar.y(SyslogAppender.DEFAULT_STACKTRACE_PATTERN));
        }
        return sb2.toString();
    }

    public void u(boolean z11) {
        this.f54256n = z11;
    }

    public void v(boolean z11) {
        this.f54243a.b(z11);
    }
}