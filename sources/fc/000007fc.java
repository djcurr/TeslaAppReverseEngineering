package androidx.recyclerview.widget;

import androidx.core.util.Pools$SimplePool;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a implements s.a {

    /* renamed from: a  reason: collision with root package name */
    private v3.f<b> f5458a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayList<b> f5459b;

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<b> f5460c;

    /* renamed from: d  reason: collision with root package name */
    final InterfaceC0091a f5461d;

    /* renamed from: e  reason: collision with root package name */
    Runnable f5462e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f5463f;

    /* renamed from: g  reason: collision with root package name */
    final s f5464g;

    /* renamed from: h  reason: collision with root package name */
    private int f5465h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0091a {
        void a(int i11, int i12);

        void b(b bVar);

        void c(b bVar);

        void d(int i11, int i12);

        void e(int i11, int i12, Object obj);

        RecyclerView.e0 f(int i11);

        void g(int i11, int i12);

        void h(int i11, int i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        int f5466a;

        /* renamed from: b  reason: collision with root package name */
        int f5467b;

        /* renamed from: c  reason: collision with root package name */
        Object f5468c;

        /* renamed from: d  reason: collision with root package name */
        int f5469d;

        b(int i11, int i12, int i13, Object obj) {
            this.f5466a = i11;
            this.f5467b = i12;
            this.f5469d = i13;
            this.f5468c = obj;
        }

        String a() {
            int i11 = this.f5466a;
            return i11 != 1 ? i11 != 2 ? i11 != 4 ? i11 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                int i11 = this.f5466a;
                if (i11 != bVar.f5466a) {
                    return false;
                }
                if (i11 == 8 && Math.abs(this.f5469d - this.f5467b) == 1 && this.f5469d == bVar.f5467b && this.f5467b == bVar.f5469d) {
                    return true;
                }
                if (this.f5469d == bVar.f5469d && this.f5467b == bVar.f5467b) {
                    Object obj2 = this.f5468c;
                    if (obj2 != null) {
                        if (!obj2.equals(bVar.f5468c)) {
                            return false;
                        }
                    } else if (bVar.f5468c != null) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f5466a * 31) + this.f5467b) * 31) + this.f5469d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f5467b + "c:" + this.f5469d + ",p:" + this.f5468c + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(InterfaceC0091a interfaceC0091a) {
        this(interfaceC0091a, false);
    }

    private void c(b bVar) {
        v(bVar);
    }

    private void d(b bVar) {
        v(bVar);
    }

    private void f(b bVar) {
        boolean z11;
        char c11;
        int i11 = bVar.f5467b;
        int i12 = bVar.f5469d + i11;
        char c12 = 65535;
        int i13 = i11;
        int i14 = 0;
        while (i13 < i12) {
            if (this.f5461d.f(i13) != null || h(i13)) {
                if (c12 == 0) {
                    k(a(2, i11, i14, null));
                    z11 = true;
                } else {
                    z11 = false;
                }
                c11 = 1;
            } else {
                if (c12 == 1) {
                    v(a(2, i11, i14, null));
                    z11 = true;
                } else {
                    z11 = false;
                }
                c11 = 0;
            }
            if (z11) {
                i13 -= i14;
                i12 -= i14;
                i14 = 1;
            } else {
                i14++;
            }
            i13++;
            c12 = c11;
        }
        if (i14 != bVar.f5469d) {
            b(bVar);
            bVar = a(2, i11, i14, null);
        }
        if (c12 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    private void g(b bVar) {
        int i11 = bVar.f5467b;
        int i12 = bVar.f5469d + i11;
        int i13 = 0;
        boolean z11 = true;
        int i14 = i11;
        while (i11 < i12) {
            if (this.f5461d.f(i11) != null || h(i11)) {
                if (!z11) {
                    k(a(4, i14, i13, bVar.f5468c));
                    i14 = i11;
                    i13 = 0;
                }
                z11 = true;
            } else {
                if (z11) {
                    v(a(4, i14, i13, bVar.f5468c));
                    i14 = i11;
                    i13 = 0;
                }
                z11 = false;
            }
            i13++;
            i11++;
        }
        if (i13 != bVar.f5469d) {
            Object obj = bVar.f5468c;
            b(bVar);
            bVar = a(4, i14, i13, obj);
        }
        if (!z11) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    private boolean h(int i11) {
        int size = this.f5460c.size();
        for (int i12 = 0; i12 < size; i12++) {
            b bVar = this.f5460c.get(i12);
            int i13 = bVar.f5466a;
            if (i13 == 8) {
                if (n(bVar.f5469d, i12 + 1) == i11) {
                    return true;
                }
            } else if (i13 == 1) {
                int i14 = bVar.f5467b;
                int i15 = bVar.f5469d + i14;
                while (i14 < i15) {
                    if (n(i14, i12 + 1) == i11) {
                        return true;
                    }
                    i14++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    private void k(b bVar) {
        int i11;
        int i12 = bVar.f5466a;
        if (i12 != 1 && i12 != 8) {
            int z11 = z(bVar.f5467b, i12);
            int i13 = bVar.f5467b;
            int i14 = bVar.f5466a;
            if (i14 == 2) {
                i11 = 0;
            } else if (i14 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            } else {
                i11 = 1;
            }
            int i15 = 1;
            for (int i16 = 1; i16 < bVar.f5469d; i16++) {
                int z12 = z(bVar.f5467b + (i11 * i16), bVar.f5466a);
                int i17 = bVar.f5466a;
                if (i17 == 2 ? z12 == z11 : i17 == 4 && z12 == z11 + 1) {
                    i15++;
                } else {
                    b a11 = a(i17, z11, i15, bVar.f5468c);
                    l(a11, i13);
                    b(a11);
                    if (bVar.f5466a == 4) {
                        i13 += i15;
                    }
                    i15 = 1;
                    z11 = z12;
                }
            }
            Object obj = bVar.f5468c;
            b(bVar);
            if (i15 > 0) {
                b a12 = a(bVar.f5466a, z11, i15, obj);
                l(a12, i13);
                b(a12);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    private void v(b bVar) {
        this.f5460c.add(bVar);
        int i11 = bVar.f5466a;
        if (i11 == 1) {
            this.f5461d.g(bVar.f5467b, bVar.f5469d);
        } else if (i11 == 2) {
            this.f5461d.d(bVar.f5467b, bVar.f5469d);
        } else if (i11 == 4) {
            this.f5461d.e(bVar.f5467b, bVar.f5469d, bVar.f5468c);
        } else if (i11 == 8) {
            this.f5461d.a(bVar.f5467b, bVar.f5469d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    private int z(int i11, int i12) {
        int i13;
        int i14;
        for (int size = this.f5460c.size() - 1; size >= 0; size--) {
            b bVar = this.f5460c.get(size);
            int i15 = bVar.f5466a;
            if (i15 == 8) {
                int i16 = bVar.f5467b;
                int i17 = bVar.f5469d;
                if (i16 < i17) {
                    i14 = i16;
                    i13 = i17;
                } else {
                    i13 = i16;
                    i14 = i17;
                }
                if (i11 < i14 || i11 > i13) {
                    if (i11 < i16) {
                        if (i12 == 1) {
                            bVar.f5467b = i16 + 1;
                            bVar.f5469d = i17 + 1;
                        } else if (i12 == 2) {
                            bVar.f5467b = i16 - 1;
                            bVar.f5469d = i17 - 1;
                        }
                    }
                } else if (i14 == i16) {
                    if (i12 == 1) {
                        bVar.f5469d = i17 + 1;
                    } else if (i12 == 2) {
                        bVar.f5469d = i17 - 1;
                    }
                    i11++;
                } else {
                    if (i12 == 1) {
                        bVar.f5467b = i16 + 1;
                    } else if (i12 == 2) {
                        bVar.f5467b = i16 - 1;
                    }
                    i11--;
                }
            } else {
                int i18 = bVar.f5467b;
                if (i18 <= i11) {
                    if (i15 == 1) {
                        i11 -= bVar.f5469d;
                    } else if (i15 == 2) {
                        i11 += bVar.f5469d;
                    }
                } else if (i12 == 1) {
                    bVar.f5467b = i18 + 1;
                } else if (i12 == 2) {
                    bVar.f5467b = i18 - 1;
                }
            }
        }
        for (int size2 = this.f5460c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f5460c.get(size2);
            if (bVar2.f5466a == 8) {
                int i19 = bVar2.f5469d;
                if (i19 == bVar2.f5467b || i19 < 0) {
                    this.f5460c.remove(size2);
                    b(bVar2);
                }
            } else if (bVar2.f5469d <= 0) {
                this.f5460c.remove(size2);
                b(bVar2);
            }
        }
        return i11;
    }

    @Override // androidx.recyclerview.widget.s.a
    public b a(int i11, int i12, int i13, Object obj) {
        b b11 = this.f5458a.b();
        if (b11 == null) {
            return new b(i11, i12, i13, obj);
        }
        b11.f5466a = i11;
        b11.f5467b = i12;
        b11.f5469d = i13;
        b11.f5468c = obj;
        return b11;
    }

    @Override // androidx.recyclerview.widget.s.a
    public void b(b bVar) {
        if (this.f5463f) {
            return;
        }
        bVar.f5468c = null;
        this.f5458a.a(bVar);
    }

    public int e(int i11) {
        int size = this.f5459b.size();
        for (int i12 = 0; i12 < size; i12++) {
            b bVar = this.f5459b.get(i12);
            int i13 = bVar.f5466a;
            if (i13 != 1) {
                if (i13 == 2) {
                    int i14 = bVar.f5467b;
                    if (i14 <= i11) {
                        int i15 = bVar.f5469d;
                        if (i14 + i15 > i11) {
                            return -1;
                        }
                        i11 -= i15;
                    } else {
                        continue;
                    }
                } else if (i13 == 8) {
                    int i16 = bVar.f5467b;
                    if (i16 == i11) {
                        i11 = bVar.f5469d;
                    } else {
                        if (i16 < i11) {
                            i11--;
                        }
                        if (bVar.f5469d <= i11) {
                            i11++;
                        }
                    }
                }
            } else if (bVar.f5467b <= i11) {
                i11 += bVar.f5469d;
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        int size = this.f5460c.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f5461d.c(this.f5460c.get(i11));
        }
        x(this.f5460c);
        this.f5465h = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        i();
        int size = this.f5459b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f5459b.get(i11);
            int i12 = bVar.f5466a;
            if (i12 == 1) {
                this.f5461d.c(bVar);
                this.f5461d.g(bVar.f5467b, bVar.f5469d);
            } else if (i12 == 2) {
                this.f5461d.c(bVar);
                this.f5461d.h(bVar.f5467b, bVar.f5469d);
            } else if (i12 == 4) {
                this.f5461d.c(bVar);
                this.f5461d.e(bVar.f5467b, bVar.f5469d, bVar.f5468c);
            } else if (i12 == 8) {
                this.f5461d.c(bVar);
                this.f5461d.a(bVar.f5467b, bVar.f5469d);
            }
            Runnable runnable = this.f5462e;
            if (runnable != null) {
                runnable.run();
            }
        }
        x(this.f5459b);
        this.f5465h = 0;
    }

    void l(b bVar, int i11) {
        this.f5461d.b(bVar);
        int i12 = bVar.f5466a;
        if (i12 == 2) {
            this.f5461d.h(i11, bVar.f5469d);
        } else if (i12 == 4) {
            this.f5461d.e(i11, bVar.f5469d, bVar.f5468c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int m(int i11) {
        return n(i11, 0);
    }

    int n(int i11, int i12) {
        int size = this.f5460c.size();
        while (i12 < size) {
            b bVar = this.f5460c.get(i12);
            int i13 = bVar.f5466a;
            if (i13 == 8) {
                int i14 = bVar.f5467b;
                if (i14 == i11) {
                    i11 = bVar.f5469d;
                } else {
                    if (i14 < i11) {
                        i11--;
                    }
                    if (bVar.f5469d <= i11) {
                        i11++;
                    }
                }
            } else {
                int i15 = bVar.f5467b;
                if (i15 > i11) {
                    continue;
                } else if (i13 == 2) {
                    int i16 = bVar.f5469d;
                    if (i11 < i15 + i16) {
                        return -1;
                    }
                    i11 -= i16;
                } else if (i13 == 1) {
                    i11 += bVar.f5469d;
                }
            }
            i12++;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean o(int i11) {
        return (i11 & this.f5465h) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean p() {
        return this.f5459b.size() > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean q() {
        return (this.f5460c.isEmpty() || this.f5459b.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean r(int i11, int i12, Object obj) {
        if (i12 < 1) {
            return false;
        }
        this.f5459b.add(a(4, i11, i12, obj));
        this.f5465h |= 4;
        return this.f5459b.size() == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean s(int i11, int i12) {
        if (i12 < 1) {
            return false;
        }
        this.f5459b.add(a(1, i11, i12, null));
        this.f5465h |= 1;
        return this.f5459b.size() == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean t(int i11, int i12, int i13) {
        if (i11 == i12) {
            return false;
        }
        if (i13 == 1) {
            this.f5459b.add(a(8, i11, i12, null));
            this.f5465h |= 8;
            return this.f5459b.size() == 1;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean u(int i11, int i12) {
        if (i12 < 1) {
            return false;
        }
        this.f5459b.add(a(2, i11, i12, null));
        this.f5465h |= 2;
        return this.f5459b.size() == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w() {
        this.f5464g.b(this.f5459b);
        int size = this.f5459b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f5459b.get(i11);
            int i12 = bVar.f5466a;
            if (i12 == 1) {
                c(bVar);
            } else if (i12 == 2) {
                f(bVar);
            } else if (i12 == 4) {
                g(bVar);
            } else if (i12 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f5462e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f5459b.clear();
    }

    void x(List<b> list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            b(list.get(i11));
        }
        list.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y() {
        x(this.f5459b);
        x(this.f5460c);
        this.f5465h = 0;
    }

    a(InterfaceC0091a interfaceC0091a, boolean z11) {
        this.f5458a = new Pools$SimplePool(30);
        this.f5459b = new ArrayList<>();
        this.f5460c = new ArrayList<>();
        this.f5465h = 0;
        this.f5461d = interfaceC0091a;
        this.f5463f = z11;
        this.f5464g = new s(this);
    }
}