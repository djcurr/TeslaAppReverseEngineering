package f3;

import a3.i;
import g3.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b  reason: collision with root package name */
    private int f25692b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f25693c;

    /* renamed from: d  reason: collision with root package name */
    public final e f25694d;

    /* renamed from: e  reason: collision with root package name */
    public final b f25695e;

    /* renamed from: f  reason: collision with root package name */
    public d f25696f;

    /* renamed from: i  reason: collision with root package name */
    a3.i f25699i;

    /* renamed from: a  reason: collision with root package name */
    private HashSet<d> f25691a = null;

    /* renamed from: g  reason: collision with root package name */
    public int f25697g = 0;

    /* renamed from: h  reason: collision with root package name */
    int f25698h = Integer.MIN_VALUE;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f25700a;

        static {
            int[] iArr = new int[b.values().length];
            f25700a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25700a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25700a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25700a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f25700a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f25700a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f25700a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f25700a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f25700a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, b bVar) {
        this.f25694d = eVar;
        this.f25695e = bVar;
    }

    public boolean a(d dVar, int i11, int i12, boolean z11) {
        if (dVar == null) {
            p();
            return true;
        } else if (z11 || o(dVar)) {
            this.f25696f = dVar;
            if (dVar.f25691a == null) {
                dVar.f25691a = new HashSet<>();
            }
            HashSet<d> hashSet = this.f25696f.f25691a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.f25697g = i11;
            this.f25698h = i12;
            return true;
        } else {
            return false;
        }
    }

    public void b(int i11, ArrayList<o> arrayList, o oVar) {
        HashSet<d> hashSet = this.f25691a;
        if (hashSet != null) {
            Iterator<d> it2 = hashSet.iterator();
            while (it2.hasNext()) {
                g3.i.a(it2.next().f25694d, i11, arrayList, oVar);
            }
        }
    }

    public HashSet<d> c() {
        return this.f25691a;
    }

    public int d() {
        if (this.f25693c) {
            return this.f25692b;
        }
        return 0;
    }

    public int e() {
        d dVar;
        if (this.f25694d.V() == 8) {
            return 0;
        }
        if (this.f25698h != Integer.MIN_VALUE && (dVar = this.f25696f) != null && dVar.f25694d.V() == 8) {
            return this.f25698h;
        }
        return this.f25697g;
    }

    public final d f() {
        switch (a.f25700a[this.f25695e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f25694d.O;
            case 3:
                return this.f25694d.M;
            case 4:
                return this.f25694d.P;
            case 5:
                return this.f25694d.N;
            default:
                throw new AssertionError(this.f25695e.name());
        }
    }

    public e g() {
        return this.f25694d;
    }

    public a3.i h() {
        return this.f25699i;
    }

    public d i() {
        return this.f25696f;
    }

    public b j() {
        return this.f25695e;
    }

    public boolean k() {
        HashSet<d> hashSet = this.f25691a;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it2 = hashSet.iterator();
        while (it2.hasNext()) {
            if (it2.next().f().n()) {
                return true;
            }
        }
        return false;
    }

    public boolean l() {
        HashSet<d> hashSet = this.f25691a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean m() {
        return this.f25693c;
    }

    public boolean n() {
        return this.f25696f != null;
    }

    public boolean o(d dVar) {
        boolean z11 = false;
        if (dVar == null) {
            return false;
        }
        b j11 = dVar.j();
        b bVar = this.f25695e;
        if (j11 == bVar) {
            return bVar != b.BASELINE || (dVar.g().Z() && g().Z());
        }
        switch (a.f25700a[bVar.ordinal()]) {
            case 1:
                return (j11 == b.BASELINE || j11 == b.CENTER_X || j11 == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z12 = j11 == b.LEFT || j11 == b.RIGHT;
                if (dVar.g() instanceof g) {
                    if (z12 || j11 == b.CENTER_X) {
                        z11 = true;
                    }
                    return z11;
                }
                return z12;
            case 4:
            case 5:
                boolean z13 = j11 == b.TOP || j11 == b.BOTTOM;
                if (dVar.g() instanceof g) {
                    if (z13 || j11 == b.CENTER_Y) {
                        z11 = true;
                    }
                    return z11;
                }
                return z13;
            case 6:
                return (j11 == b.LEFT || j11 == b.RIGHT) ? false : true;
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f25695e.name());
        }
    }

    public void p() {
        HashSet<d> hashSet;
        d dVar = this.f25696f;
        if (dVar != null && (hashSet = dVar.f25691a) != null) {
            hashSet.remove(this);
            if (this.f25696f.f25691a.size() == 0) {
                this.f25696f.f25691a = null;
            }
        }
        this.f25691a = null;
        this.f25696f = null;
        this.f25697g = 0;
        this.f25698h = Integer.MIN_VALUE;
        this.f25693c = false;
        this.f25692b = 0;
    }

    public void q() {
        this.f25693c = false;
        this.f25692b = 0;
    }

    public void r(a3.c cVar) {
        a3.i iVar = this.f25699i;
        if (iVar == null) {
            this.f25699i = new a3.i(i.a.UNRESTRICTED, null);
        } else {
            iVar.e();
        }
    }

    public void s(int i11) {
        this.f25692b = i11;
        this.f25693c = true;
    }

    public String toString() {
        return this.f25694d.r() + ":" + this.f25695e.toString();
    }
}