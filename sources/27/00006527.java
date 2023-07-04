package d3;

import f3.e;

/* loaded from: classes.dex */
public class b {

    /* renamed from: h  reason: collision with root package name */
    public static final Object f23532h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public static final Object f23533i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public static final Object f23534j = new Object();

    /* renamed from: k  reason: collision with root package name */
    public static final Object f23535k = new Object();

    /* renamed from: f  reason: collision with root package name */
    Object f23541f;

    /* renamed from: a  reason: collision with root package name */
    int f23536a = 0;

    /* renamed from: b  reason: collision with root package name */
    int f23537b = Integer.MAX_VALUE;

    /* renamed from: c  reason: collision with root package name */
    float f23538c = 1.0f;

    /* renamed from: d  reason: collision with root package name */
    int f23539d = 0;

    /* renamed from: e  reason: collision with root package name */
    String f23540e = null;

    /* renamed from: g  reason: collision with root package name */
    boolean f23542g = false;

    private b(Object obj) {
        this.f23541f = f23533i;
        this.f23541f = obj;
    }

    public static b a(int i11) {
        b bVar = new b(f23532h);
        bVar.e(i11);
        return bVar;
    }

    public static b b(Object obj) {
        b bVar = new b(f23532h);
        bVar.f(obj);
        return bVar;
    }

    public static b c() {
        return new b(f23533i);
    }

    public void d(e eVar, f3.e eVar2, int i11) {
        String str = this.f23540e;
        if (str != null) {
            eVar2.C0(str);
        }
        int i12 = 2;
        if (i11 == 0) {
            if (this.f23542g) {
                eVar2.O0(e.b.MATCH_CONSTRAINT);
                Object obj = this.f23541f;
                if (obj == f23533i) {
                    i12 = 1;
                } else if (obj != f23535k) {
                    i12 = 0;
                }
                eVar2.P0(i12, this.f23536a, this.f23537b, this.f23538c);
                return;
            }
            int i13 = this.f23536a;
            if (i13 > 0) {
                eVar2.Z0(i13);
            }
            int i14 = this.f23537b;
            if (i14 < Integer.MAX_VALUE) {
                eVar2.W0(i14);
            }
            Object obj2 = this.f23541f;
            if (obj2 == f23533i) {
                eVar2.O0(e.b.WRAP_CONTENT);
            } else if (obj2 == f23534j) {
                eVar2.O0(e.b.MATCH_PARENT);
            } else if (obj2 == null) {
                eVar2.O0(e.b.FIXED);
                eVar2.j1(this.f23539d);
            }
        } else if (this.f23542g) {
            eVar2.f1(e.b.MATCH_CONSTRAINT);
            Object obj3 = this.f23541f;
            if (obj3 == f23533i) {
                i12 = 1;
            } else if (obj3 != f23535k) {
                i12 = 0;
            }
            eVar2.g1(i12, this.f23536a, this.f23537b, this.f23538c);
        } else {
            int i15 = this.f23536a;
            if (i15 > 0) {
                eVar2.Y0(i15);
            }
            int i16 = this.f23537b;
            if (i16 < Integer.MAX_VALUE) {
                eVar2.V0(i16);
            }
            Object obj4 = this.f23541f;
            if (obj4 == f23533i) {
                eVar2.f1(e.b.WRAP_CONTENT);
            } else if (obj4 == f23534j) {
                eVar2.f1(e.b.MATCH_PARENT);
            } else if (obj4 == null) {
                eVar2.f1(e.b.FIXED);
                eVar2.K0(this.f23539d);
            }
        }
    }

    public b e(int i11) {
        this.f23541f = null;
        this.f23539d = i11;
        return this;
    }

    public b f(Object obj) {
        this.f23541f = obj;
        if (obj instanceof Integer) {
            this.f23539d = ((Integer) obj).intValue();
            this.f23541f = null;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return this.f23539d;
    }

    public b h(int i11) {
        if (i11 >= 0) {
            this.f23536a = i11;
        }
        return this;
    }
}