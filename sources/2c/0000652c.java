package d3;

import f3.d;
import java.util.HashMap;

/* loaded from: classes.dex */
public class f {

    /* renamed from: t  reason: collision with root package name */
    public static float f23550t = Float.NaN;

    /* renamed from: a  reason: collision with root package name */
    public f3.e f23551a;

    /* renamed from: b  reason: collision with root package name */
    public int f23552b;

    /* renamed from: c  reason: collision with root package name */
    public int f23553c;

    /* renamed from: d  reason: collision with root package name */
    public int f23554d;

    /* renamed from: e  reason: collision with root package name */
    public int f23555e;

    /* renamed from: f  reason: collision with root package name */
    public float f23556f;

    /* renamed from: g  reason: collision with root package name */
    public float f23557g;

    /* renamed from: h  reason: collision with root package name */
    public float f23558h;

    /* renamed from: i  reason: collision with root package name */
    public float f23559i;

    /* renamed from: j  reason: collision with root package name */
    public float f23560j;

    /* renamed from: k  reason: collision with root package name */
    public float f23561k;

    /* renamed from: l  reason: collision with root package name */
    public float f23562l;

    /* renamed from: m  reason: collision with root package name */
    public float f23563m;

    /* renamed from: n  reason: collision with root package name */
    public float f23564n;

    /* renamed from: o  reason: collision with root package name */
    public float f23565o;

    /* renamed from: p  reason: collision with root package name */
    public float f23566p;

    /* renamed from: q  reason: collision with root package name */
    public float f23567q;

    /* renamed from: r  reason: collision with root package name */
    public int f23568r;

    /* renamed from: s  reason: collision with root package name */
    public final HashMap<String, b3.a> f23569s;

    public f() {
        this.f23551a = null;
        this.f23552b = 0;
        this.f23553c = 0;
        this.f23554d = 0;
        this.f23555e = 0;
        this.f23556f = Float.NaN;
        this.f23557g = Float.NaN;
        this.f23558h = Float.NaN;
        this.f23559i = Float.NaN;
        this.f23560j = Float.NaN;
        this.f23561k = Float.NaN;
        this.f23562l = Float.NaN;
        this.f23563m = Float.NaN;
        this.f23564n = Float.NaN;
        this.f23565o = Float.NaN;
        this.f23566p = Float.NaN;
        this.f23567q = Float.NaN;
        this.f23568r = 0;
        this.f23569s = new HashMap<>();
    }

    private static void a(StringBuilder sb2, String str, float f11) {
        if (Float.isNaN(f11)) {
            return;
        }
        sb2.append(str);
        sb2.append(": ");
        sb2.append(f11);
        sb2.append(",\n");
    }

    private static void b(StringBuilder sb2, String str, int i11) {
        sb2.append(str);
        sb2.append(": ");
        sb2.append(i11);
        sb2.append(",\n");
    }

    private void e(StringBuilder sb2, d.b bVar) {
        f3.d m11 = this.f23551a.m(bVar);
        if (m11 == null || m11.f25696f == null) {
            return;
        }
        sb2.append("Anchor");
        sb2.append(bVar.name());
        sb2.append(": ['");
        String str = m11.f25696f.g().f25726m;
        if (str == null) {
            str = "#PARENT";
        }
        sb2.append(str);
        sb2.append("', '");
        sb2.append(m11.f25696f.j().name());
        sb2.append("', '");
        sb2.append(m11.f25697g);
        sb2.append("'],\n");
    }

    public boolean c() {
        return Float.isNaN(this.f23558h) && Float.isNaN(this.f23559i) && Float.isNaN(this.f23560j) && Float.isNaN(this.f23561k) && Float.isNaN(this.f23562l) && Float.isNaN(this.f23563m) && Float.isNaN(this.f23564n) && Float.isNaN(this.f23565o) && Float.isNaN(this.f23566p);
    }

    public StringBuilder d(StringBuilder sb2, boolean z11) {
        sb2.append("{\n");
        b(sb2, "left", this.f23552b);
        b(sb2, "top", this.f23553c);
        b(sb2, "right", this.f23554d);
        b(sb2, "bottom", this.f23555e);
        a(sb2, "pivotX", this.f23556f);
        a(sb2, "pivotY", this.f23557g);
        a(sb2, "rotationX", this.f23558h);
        a(sb2, "rotationY", this.f23559i);
        a(sb2, "rotationZ", this.f23560j);
        a(sb2, "translationX", this.f23561k);
        a(sb2, "translationY", this.f23562l);
        a(sb2, "translationZ", this.f23563m);
        a(sb2, "scaleX", this.f23564n);
        a(sb2, "scaleY", this.f23565o);
        a(sb2, "alpha", this.f23566p);
        b(sb2, "visibility", this.f23568r);
        a(sb2, "interpolatedPos", this.f23567q);
        if (this.f23551a != null) {
            for (d.b bVar : d.b.values()) {
                e(sb2, bVar);
            }
        }
        if (z11) {
            a(sb2, "phone_orientation", f23550t);
        }
        if (z11) {
            a(sb2, "phone_orientation", f23550t);
        }
        if (this.f23569s.size() != 0) {
            sb2.append("custom : {\n");
            for (String str : this.f23569s.keySet()) {
                b3.a aVar = this.f23569s.get(str);
                sb2.append(str);
                sb2.append(": ");
                switch (aVar.h()) {
                    case 900:
                        sb2.append(aVar.e());
                        sb2.append(",\n");
                        break;
                    case 901:
                    case 905:
                        sb2.append(aVar.d());
                        sb2.append(",\n");
                        break;
                    case 902:
                        sb2.append("'");
                        sb2.append(b3.a.a(aVar.e()));
                        sb2.append("',\n");
                        break;
                    case 903:
                        sb2.append("'");
                        sb2.append(aVar.g());
                        sb2.append("',\n");
                        break;
                    case 904:
                        sb2.append("'");
                        sb2.append(aVar.c());
                        sb2.append("',\n");
                        break;
                }
            }
            sb2.append("}\n");
        }
        sb2.append("}\n");
        return sb2;
    }

    public void f(String str, int i11, float f11) {
        if (this.f23569s.containsKey(str)) {
            this.f23569s.get(str).i(f11);
        } else {
            this.f23569s.put(str, new b3.a(str, i11, f11));
        }
    }

    public void g(String str, int i11, int i12) {
        if (this.f23569s.containsKey(str)) {
            this.f23569s.get(str).j(i12);
        } else {
            this.f23569s.put(str, new b3.a(str, i11, i12));
        }
    }

    public f h() {
        f3.e eVar = this.f23551a;
        if (eVar != null) {
            this.f23552b = eVar.C();
            this.f23553c = this.f23551a.Q();
            this.f23554d = this.f23551a.L();
            this.f23555e = this.f23551a.p();
            i(this.f23551a.f25724l);
        }
        return this;
    }

    public void i(f fVar) {
        this.f23556f = fVar.f23556f;
        this.f23557g = fVar.f23557g;
        this.f23558h = fVar.f23558h;
        this.f23559i = fVar.f23559i;
        this.f23560j = fVar.f23560j;
        this.f23561k = fVar.f23561k;
        this.f23562l = fVar.f23562l;
        this.f23563m = fVar.f23563m;
        this.f23564n = fVar.f23564n;
        this.f23565o = fVar.f23565o;
        this.f23566p = fVar.f23566p;
        this.f23568r = fVar.f23568r;
        this.f23569s.clear();
        for (b3.a aVar : fVar.f23569s.values()) {
            this.f23569s.put(aVar.f(), aVar.b());
        }
    }

    public f(f3.e eVar) {
        this.f23551a = null;
        this.f23552b = 0;
        this.f23553c = 0;
        this.f23554d = 0;
        this.f23555e = 0;
        this.f23556f = Float.NaN;
        this.f23557g = Float.NaN;
        this.f23558h = Float.NaN;
        this.f23559i = Float.NaN;
        this.f23560j = Float.NaN;
        this.f23561k = Float.NaN;
        this.f23562l = Float.NaN;
        this.f23563m = Float.NaN;
        this.f23564n = Float.NaN;
        this.f23565o = Float.NaN;
        this.f23566p = Float.NaN;
        this.f23567q = Float.NaN;
        this.f23568r = 0;
        this.f23569s = new HashMap<>();
        this.f23551a = eVar;
    }

    public f(f fVar) {
        this.f23551a = null;
        this.f23552b = 0;
        this.f23553c = 0;
        this.f23554d = 0;
        this.f23555e = 0;
        this.f23556f = Float.NaN;
        this.f23557g = Float.NaN;
        this.f23558h = Float.NaN;
        this.f23559i = Float.NaN;
        this.f23560j = Float.NaN;
        this.f23561k = Float.NaN;
        this.f23562l = Float.NaN;
        this.f23563m = Float.NaN;
        this.f23564n = Float.NaN;
        this.f23565o = Float.NaN;
        this.f23566p = Float.NaN;
        this.f23567q = Float.NaN;
        this.f23568r = 0;
        this.f23569s = new HashMap<>();
        this.f23551a = fVar.f23551a;
        this.f23552b = fVar.f23552b;
        this.f23553c = fVar.f23553c;
        this.f23554d = fVar.f23554d;
        this.f23555e = fVar.f23555e;
        i(fVar);
    }
}