package androidx.recyclerview.widget;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private static final Comparator<d> f5551a = new a();

    /* loaded from: classes.dex */
    class a implements Comparator<d> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(d dVar, d dVar2) {
            return dVar.f5554a - dVar2.f5554a;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract boolean a(int i11, int i12);

        public abstract boolean b(int i11, int i12);

        public abstract Object c(int i11, int i12);

        public abstract int d();

        public abstract int e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private final int[] f5552a;

        /* renamed from: b  reason: collision with root package name */
        private final int f5553b;

        c(int i11) {
            int[] iArr = new int[i11];
            this.f5552a = iArr;
            this.f5553b = iArr.length / 2;
        }

        int[] a() {
            return this.f5552a;
        }

        int b(int i11) {
            return this.f5552a[i11 + this.f5553b];
        }

        void c(int i11, int i12) {
            this.f5552a[i11 + this.f5553b] = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f5554a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5555b;

        /* renamed from: c  reason: collision with root package name */
        public final int f5556c;

        d(int i11, int i12, int i13) {
            this.f5554a = i11;
            this.f5555b = i12;
            this.f5556c = i13;
        }

        int a() {
            return this.f5554a + this.f5556c;
        }

        int b() {
            return this.f5555b + this.f5556c;
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        private final List<d> f5557a;

        /* renamed from: b  reason: collision with root package name */
        private final int[] f5558b;

        /* renamed from: c  reason: collision with root package name */
        private final int[] f5559c;

        /* renamed from: d  reason: collision with root package name */
        private final b f5560d;

        /* renamed from: e  reason: collision with root package name */
        private final int f5561e;

        /* renamed from: f  reason: collision with root package name */
        private final int f5562f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f5563g;

        e(b bVar, List<d> list, int[] iArr, int[] iArr2, boolean z11) {
            this.f5557a = list;
            this.f5558b = iArr;
            this.f5559c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f5560d = bVar;
            this.f5561e = bVar.e();
            this.f5562f = bVar.d();
            this.f5563g = z11;
            a();
            d();
        }

        private void a() {
            d dVar = this.f5557a.isEmpty() ? null : this.f5557a.get(0);
            if (dVar == null || dVar.f5554a != 0 || dVar.f5555b != 0) {
                this.f5557a.add(0, new d(0, 0, 0));
            }
            this.f5557a.add(new d(this.f5561e, this.f5562f, 0));
        }

        private void c(int i11) {
            int size = this.f5557a.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                d dVar = this.f5557a.get(i13);
                while (i12 < dVar.f5555b) {
                    if (this.f5559c[i12] == 0 && this.f5560d.b(i11, i12)) {
                        int i14 = this.f5560d.a(i11, i12) ? 8 : 4;
                        this.f5558b[i11] = (i12 << 4) | i14;
                        this.f5559c[i12] = (i11 << 4) | i14;
                        return;
                    }
                    i12++;
                }
                i12 = dVar.b();
            }
        }

        private void d() {
            for (d dVar : this.f5557a) {
                for (int i11 = 0; i11 < dVar.f5556c; i11++) {
                    int i12 = dVar.f5554a + i11;
                    int i13 = dVar.f5555b + i11;
                    int i14 = this.f5560d.a(i12, i13) ? 1 : 2;
                    this.f5558b[i12] = (i13 << 4) | i14;
                    this.f5559c[i13] = (i12 << 4) | i14;
                }
            }
            if (this.f5563g) {
                e();
            }
        }

        private void e() {
            int i11 = 0;
            for (d dVar : this.f5557a) {
                while (i11 < dVar.f5554a) {
                    if (this.f5558b[i11] == 0) {
                        c(i11);
                    }
                    i11++;
                }
                i11 = dVar.a();
            }
        }

        private static g f(Collection<g> collection, int i11, boolean z11) {
            g gVar;
            Iterator<g> it2 = collection.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    gVar = null;
                    break;
                }
                gVar = it2.next();
                if (gVar.f5564a == i11 && gVar.f5566c == z11) {
                    it2.remove();
                    break;
                }
            }
            while (it2.hasNext()) {
                g next = it2.next();
                if (z11) {
                    next.f5565b--;
                } else {
                    next.f5565b++;
                }
            }
            return gVar;
        }

        public void b(r rVar) {
            androidx.recyclerview.widget.e eVar;
            int i11;
            if (rVar instanceof androidx.recyclerview.widget.e) {
                eVar = (androidx.recyclerview.widget.e) rVar;
            } else {
                eVar = new androidx.recyclerview.widget.e(rVar);
            }
            int i12 = this.f5561e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i13 = this.f5561e;
            int i14 = this.f5562f;
            for (int size = this.f5557a.size() - 1; size >= 0; size--) {
                d dVar = this.f5557a.get(size);
                int a11 = dVar.a();
                int b11 = dVar.b();
                while (true) {
                    if (i13 <= a11) {
                        break;
                    }
                    i13--;
                    int i15 = this.f5558b[i13];
                    if ((i15 & 12) != 0) {
                        int i16 = i15 >> 4;
                        g f11 = f(arrayDeque, i16, false);
                        if (f11 != null) {
                            int i17 = (i12 - f11.f5565b) - 1;
                            eVar.d(i13, i17);
                            if ((i15 & 4) != 0) {
                                eVar.c(i17, 1, this.f5560d.c(i13, i16));
                            }
                        } else {
                            arrayDeque.add(new g(i13, (i12 - i13) - 1, true));
                        }
                    } else {
                        eVar.b(i13, 1);
                        i12--;
                    }
                }
                while (i14 > b11) {
                    i14--;
                    int i18 = this.f5559c[i14];
                    if ((i18 & 12) != 0) {
                        int i19 = i18 >> 4;
                        g f12 = f(arrayDeque, i19, true);
                        if (f12 == null) {
                            arrayDeque.add(new g(i14, i12 - i13, false));
                        } else {
                            eVar.d((i12 - f12.f5565b) - 1, i13);
                            if ((i18 & 4) != 0) {
                                eVar.c(i13, 1, this.f5560d.c(i19, i14));
                            }
                        }
                    } else {
                        eVar.a(i13, 1);
                        i12++;
                    }
                }
                int i21 = dVar.f5554a;
                int i22 = dVar.f5555b;
                for (i11 = 0; i11 < dVar.f5556c; i11++) {
                    if ((this.f5558b[i21] & 15) == 2) {
                        eVar.c(i21, 1, this.f5560d.c(i21, i22));
                    }
                    i21++;
                    i22++;
                }
                i13 = dVar.f5554a;
                i14 = dVar.f5555b;
            }
            eVar.e();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f<T> {
        public abstract boolean areContentsTheSame(T t11, T t12);

        public abstract boolean areItemsTheSame(T t11, T t12);

        public Object getChangePayload(T t11, T t12) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        int f5564a;

        /* renamed from: b  reason: collision with root package name */
        int f5565b;

        /* renamed from: c  reason: collision with root package name */
        boolean f5566c;

        g(int i11, int i12, boolean z11) {
            this.f5564a = i11;
            this.f5565b = i12;
            this.f5566c = z11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.h$h  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0094h {

        /* renamed from: a  reason: collision with root package name */
        int f5567a;

        /* renamed from: b  reason: collision with root package name */
        int f5568b;

        /* renamed from: c  reason: collision with root package name */
        int f5569c;

        /* renamed from: d  reason: collision with root package name */
        int f5570d;

        public C0094h() {
        }

        int a() {
            return this.f5570d - this.f5569c;
        }

        int b() {
            return this.f5568b - this.f5567a;
        }

        public C0094h(int i11, int i12, int i13, int i14) {
            this.f5567a = i11;
            this.f5568b = i12;
            this.f5569c = i13;
            this.f5570d = i14;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class i {

        /* renamed from: a  reason: collision with root package name */
        public int f5571a;

        /* renamed from: b  reason: collision with root package name */
        public int f5572b;

        /* renamed from: c  reason: collision with root package name */
        public int f5573c;

        /* renamed from: d  reason: collision with root package name */
        public int f5574d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f5575e;

        i() {
        }

        int a() {
            return Math.min(this.f5573c - this.f5571a, this.f5574d - this.f5572b);
        }

        boolean b() {
            return this.f5574d - this.f5572b != this.f5573c - this.f5571a;
        }

        boolean c() {
            return this.f5574d - this.f5572b > this.f5573c - this.f5571a;
        }

        d d() {
            if (b()) {
                if (this.f5575e) {
                    return new d(this.f5571a, this.f5572b, a());
                }
                if (c()) {
                    return new d(this.f5571a, this.f5572b + 1, a());
                }
                return new d(this.f5571a + 1, this.f5572b, a());
            }
            int i11 = this.f5571a;
            return new d(i11, this.f5572b, this.f5573c - i11);
        }
    }

    private static i a(C0094h c0094h, b bVar, c cVar, c cVar2, int i11) {
        int b11;
        int i12;
        int i13;
        boolean z11 = (c0094h.b() - c0094h.a()) % 2 == 0;
        int b12 = c0094h.b() - c0094h.a();
        int i14 = -i11;
        for (int i15 = i14; i15 <= i11; i15 += 2) {
            if (i15 != i14 && (i15 == i11 || cVar2.b(i15 + 1) >= cVar2.b(i15 - 1))) {
                b11 = cVar2.b(i15 - 1);
                i12 = b11 - 1;
            } else {
                b11 = cVar2.b(i15 + 1);
                i12 = b11;
            }
            int i16 = c0094h.f5570d - ((c0094h.f5568b - i12) - i15);
            int i17 = (i11 == 0 || i12 != b11) ? i16 : i16 + 1;
            while (i12 > c0094h.f5567a && i16 > c0094h.f5569c && bVar.b(i12 - 1, i16 - 1)) {
                i12--;
                i16--;
            }
            cVar2.c(i15, i12);
            if (z11 && (i13 = b12 - i15) >= i14 && i13 <= i11 && cVar.b(i13) >= i12) {
                i iVar = new i();
                iVar.f5571a = i12;
                iVar.f5572b = i16;
                iVar.f5573c = b11;
                iVar.f5574d = i17;
                iVar.f5575e = true;
                return iVar;
            }
        }
        return null;
    }

    public static e b(b bVar) {
        return c(bVar, true);
    }

    public static e c(b bVar, boolean z11) {
        int e11 = bVar.e();
        int d11 = bVar.d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C0094h(0, e11, 0, d11));
        int i11 = ((((e11 + d11) + 1) / 2) * 2) + 1;
        c cVar = new c(i11);
        c cVar2 = new c(i11);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            C0094h c0094h = (C0094h) arrayList2.remove(arrayList2.size() - 1);
            i e12 = e(c0094h, bVar, cVar, cVar2);
            if (e12 != null) {
                if (e12.a() > 0) {
                    arrayList.add(e12.d());
                }
                C0094h c0094h2 = arrayList3.isEmpty() ? new C0094h() : (C0094h) arrayList3.remove(arrayList3.size() - 1);
                c0094h2.f5567a = c0094h.f5567a;
                c0094h2.f5569c = c0094h.f5569c;
                c0094h2.f5568b = e12.f5571a;
                c0094h2.f5570d = e12.f5572b;
                arrayList2.add(c0094h2);
                c0094h.f5568b = c0094h.f5568b;
                c0094h.f5570d = c0094h.f5570d;
                c0094h.f5567a = e12.f5573c;
                c0094h.f5569c = e12.f5574d;
                arrayList2.add(c0094h);
            } else {
                arrayList3.add(c0094h);
            }
        }
        Collections.sort(arrayList, f5551a);
        return new e(bVar, arrayList, cVar.a(), cVar2.a(), z11);
    }

    private static i d(C0094h c0094h, b bVar, c cVar, c cVar2, int i11) {
        int b11;
        int i12;
        int i13;
        boolean z11 = Math.abs(c0094h.b() - c0094h.a()) % 2 == 1;
        int b12 = c0094h.b() - c0094h.a();
        int i14 = -i11;
        for (int i15 = i14; i15 <= i11; i15 += 2) {
            if (i15 != i14 && (i15 == i11 || cVar.b(i15 + 1) <= cVar.b(i15 - 1))) {
                b11 = cVar.b(i15 - 1);
                i12 = b11 + 1;
            } else {
                b11 = cVar.b(i15 + 1);
                i12 = b11;
            }
            int i16 = (c0094h.f5569c + (i12 - c0094h.f5567a)) - i15;
            int i17 = (i11 == 0 || i12 != b11) ? i16 : i16 - 1;
            while (i12 < c0094h.f5568b && i16 < c0094h.f5570d && bVar.b(i12, i16)) {
                i12++;
                i16++;
            }
            cVar.c(i15, i12);
            if (z11 && (i13 = b12 - i15) >= i14 + 1 && i13 <= i11 - 1 && cVar2.b(i13) <= i12) {
                i iVar = new i();
                iVar.f5571a = b11;
                iVar.f5572b = i17;
                iVar.f5573c = i12;
                iVar.f5574d = i16;
                iVar.f5575e = false;
                return iVar;
            }
        }
        return null;
    }

    private static i e(C0094h c0094h, b bVar, c cVar, c cVar2) {
        if (c0094h.b() >= 1 && c0094h.a() >= 1) {
            int b11 = ((c0094h.b() + c0094h.a()) + 1) / 2;
            cVar.c(1, c0094h.f5567a);
            cVar2.c(1, c0094h.f5568b);
            for (int i11 = 0; i11 < b11; i11++) {
                i d11 = d(c0094h, bVar, cVar, cVar2, i11);
                if (d11 != null) {
                    return d11;
                }
                i a11 = a(c0094h, bVar, cVar, cVar2, i11);
                if (a11 != null) {
                    return a11;
                }
            }
        }
        return null;
    }
}