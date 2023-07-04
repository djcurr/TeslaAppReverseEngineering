package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.p implements RecyclerView.a0.b {

    /* renamed from: b  reason: collision with root package name */
    f[] f5403b;

    /* renamed from: c  reason: collision with root package name */
    t f5404c;

    /* renamed from: d  reason: collision with root package name */
    t f5405d;

    /* renamed from: e  reason: collision with root package name */
    private int f5406e;

    /* renamed from: f  reason: collision with root package name */
    private int f5407f;

    /* renamed from: g  reason: collision with root package name */
    private final o f5408g;

    /* renamed from: j  reason: collision with root package name */
    private BitSet f5411j;

    /* renamed from: o  reason: collision with root package name */
    private boolean f5416o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f5417p;

    /* renamed from: q  reason: collision with root package name */
    private e f5418q;

    /* renamed from: r  reason: collision with root package name */
    private int f5419r;

    /* renamed from: w  reason: collision with root package name */
    private int[] f5424w;

    /* renamed from: a  reason: collision with root package name */
    private int f5402a = -1;

    /* renamed from: h  reason: collision with root package name */
    boolean f5409h = false;

    /* renamed from: i  reason: collision with root package name */
    boolean f5410i = false;

    /* renamed from: k  reason: collision with root package name */
    int f5412k = -1;

    /* renamed from: l  reason: collision with root package name */
    int f5413l = Integer.MIN_VALUE;

    /* renamed from: m  reason: collision with root package name */
    d f5414m = new d();

    /* renamed from: n  reason: collision with root package name */
    private int f5415n = 2;

    /* renamed from: s  reason: collision with root package name */
    private final Rect f5420s = new Rect();

    /* renamed from: t  reason: collision with root package name */
    private final b f5421t = new b();

    /* renamed from: u  reason: collision with root package name */
    private boolean f5422u = false;

    /* renamed from: v  reason: collision with root package name */
    private boolean f5423v = true;

    /* renamed from: x  reason: collision with root package name */
    private final Runnable f5425x = new a();

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        int f5427a;

        /* renamed from: b  reason: collision with root package name */
        int f5428b;

        /* renamed from: c  reason: collision with root package name */
        boolean f5429c;

        /* renamed from: d  reason: collision with root package name */
        boolean f5430d;

        /* renamed from: e  reason: collision with root package name */
        boolean f5431e;

        /* renamed from: f  reason: collision with root package name */
        int[] f5432f;

        b() {
            c();
        }

        void a() {
            this.f5428b = this.f5429c ? StaggeredGridLayoutManager.this.f5404c.i() : StaggeredGridLayoutManager.this.f5404c.m();
        }

        void b(int i11) {
            if (this.f5429c) {
                this.f5428b = StaggeredGridLayoutManager.this.f5404c.i() - i11;
            } else {
                this.f5428b = StaggeredGridLayoutManager.this.f5404c.m() + i11;
            }
        }

        void c() {
            this.f5427a = -1;
            this.f5428b = Integer.MIN_VALUE;
            this.f5429c = false;
            this.f5430d = false;
            this.f5431e = false;
            int[] iArr = this.f5432f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        void d(f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f5432f;
            if (iArr == null || iArr.length < length) {
                this.f5432f = new int[StaggeredGridLayoutManager.this.f5403b.length];
            }
            for (int i11 = 0; i11 < length; i11++) {
                this.f5432f[i11] = fVarArr[i11].p(Integer.MIN_VALUE);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends RecyclerView.q {

        /* renamed from: e  reason: collision with root package name */
        f f5434e;

        /* renamed from: f  reason: collision with root package name */
        boolean f5435f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public boolean e() {
            return this.f5435f;
        }

        public c(int i11, int i12) {
            super(i11, i12);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* loaded from: classes.dex */
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        int f5442a;

        /* renamed from: b  reason: collision with root package name */
        int f5443b;

        /* renamed from: c  reason: collision with root package name */
        int f5444c;

        /* renamed from: d  reason: collision with root package name */
        int[] f5445d;

        /* renamed from: e  reason: collision with root package name */
        int f5446e;

        /* renamed from: f  reason: collision with root package name */
        int[] f5447f;

        /* renamed from: g  reason: collision with root package name */
        List<d.a> f5448g;

        /* renamed from: h  reason: collision with root package name */
        boolean f5449h;

        /* renamed from: i  reason: collision with root package name */
        boolean f5450i;

        /* renamed from: j  reason: collision with root package name */
        boolean f5451j;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<e> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public e[] newArray(int i11) {
                return new e[i11];
            }
        }

        public e() {
        }

        void a() {
            this.f5445d = null;
            this.f5444c = 0;
            this.f5442a = -1;
            this.f5443b = -1;
        }

        void b() {
            this.f5445d = null;
            this.f5444c = 0;
            this.f5446e = 0;
            this.f5447f = null;
            this.f5448g = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeInt(this.f5442a);
            parcel.writeInt(this.f5443b);
            parcel.writeInt(this.f5444c);
            if (this.f5444c > 0) {
                parcel.writeIntArray(this.f5445d);
            }
            parcel.writeInt(this.f5446e);
            if (this.f5446e > 0) {
                parcel.writeIntArray(this.f5447f);
            }
            parcel.writeInt(this.f5449h ? 1 : 0);
            parcel.writeInt(this.f5450i ? 1 : 0);
            parcel.writeInt(this.f5451j ? 1 : 0);
            parcel.writeList(this.f5448g);
        }

        e(Parcel parcel) {
            this.f5442a = parcel.readInt();
            this.f5443b = parcel.readInt();
            int readInt = parcel.readInt();
            this.f5444c = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f5445d = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f5446e = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f5447f = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f5449h = parcel.readInt() == 1;
            this.f5450i = parcel.readInt() == 1;
            this.f5451j = parcel.readInt() == 1;
            this.f5448g = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f5444c = eVar.f5444c;
            this.f5442a = eVar.f5442a;
            this.f5443b = eVar.f5443b;
            this.f5445d = eVar.f5445d;
            this.f5446e = eVar.f5446e;
            this.f5447f = eVar.f5447f;
            this.f5449h = eVar.f5449h;
            this.f5450i = eVar.f5450i;
            this.f5451j = eVar.f5451j;
            this.f5448g = eVar.f5448g;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f {

        /* renamed from: a  reason: collision with root package name */
        ArrayList<View> f5452a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        int f5453b = Integer.MIN_VALUE;

        /* renamed from: c  reason: collision with root package name */
        int f5454c = Integer.MIN_VALUE;

        /* renamed from: d  reason: collision with root package name */
        int f5455d = 0;

        /* renamed from: e  reason: collision with root package name */
        final int f5456e;

        f(int i11) {
            this.f5456e = i11;
        }

        void a(View view) {
            c n11 = n(view);
            n11.f5434e = this;
            this.f5452a.add(view);
            this.f5454c = Integer.MIN_VALUE;
            if (this.f5452a.size() == 1) {
                this.f5453b = Integer.MIN_VALUE;
            }
            if (n11.c() || n11.b()) {
                this.f5455d += StaggeredGridLayoutManager.this.f5404c.e(view);
            }
        }

        void b(boolean z11, int i11) {
            int p11;
            if (z11) {
                p11 = l(Integer.MIN_VALUE);
            } else {
                p11 = p(Integer.MIN_VALUE);
            }
            e();
            if (p11 == Integer.MIN_VALUE) {
                return;
            }
            if (!z11 || p11 >= StaggeredGridLayoutManager.this.f5404c.i()) {
                if (z11 || p11 <= StaggeredGridLayoutManager.this.f5404c.m()) {
                    if (i11 != Integer.MIN_VALUE) {
                        p11 += i11;
                    }
                    this.f5454c = p11;
                    this.f5453b = p11;
                }
            }
        }

        void c() {
            d.a f11;
            ArrayList<View> arrayList = this.f5452a;
            View view = arrayList.get(arrayList.size() - 1);
            c n11 = n(view);
            this.f5454c = StaggeredGridLayoutManager.this.f5404c.d(view);
            if (n11.f5435f && (f11 = StaggeredGridLayoutManager.this.f5414m.f(n11.a())) != null && f11.f5439b == 1) {
                this.f5454c += f11.a(this.f5456e);
            }
        }

        void d() {
            d.a f11;
            View view = this.f5452a.get(0);
            c n11 = n(view);
            this.f5453b = StaggeredGridLayoutManager.this.f5404c.g(view);
            if (n11.f5435f && (f11 = StaggeredGridLayoutManager.this.f5414m.f(n11.a())) != null && f11.f5439b == -1) {
                this.f5453b -= f11.a(this.f5456e);
            }
        }

        void e() {
            this.f5452a.clear();
            q();
            this.f5455d = 0;
        }

        public int f() {
            if (StaggeredGridLayoutManager.this.f5409h) {
                return i(this.f5452a.size() - 1, -1, true);
            }
            return i(0, this.f5452a.size(), true);
        }

        public int g() {
            if (StaggeredGridLayoutManager.this.f5409h) {
                return i(0, this.f5452a.size(), true);
            }
            return i(this.f5452a.size() - 1, -1, true);
        }

        int h(int i11, int i12, boolean z11, boolean z12, boolean z13) {
            int m11 = StaggeredGridLayoutManager.this.f5404c.m();
            int i13 = StaggeredGridLayoutManager.this.f5404c.i();
            int i14 = i12 > i11 ? 1 : -1;
            while (i11 != i12) {
                View view = this.f5452a.get(i11);
                int g11 = StaggeredGridLayoutManager.this.f5404c.g(view);
                int d11 = StaggeredGridLayoutManager.this.f5404c.d(view);
                boolean z14 = false;
                boolean z15 = !z13 ? g11 >= i13 : g11 > i13;
                if (!z13 ? d11 > m11 : d11 >= m11) {
                    z14 = true;
                }
                if (z15 && z14) {
                    if (z11 && z12) {
                        if (g11 >= m11 && d11 <= i13) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    } else if (z12) {
                        return StaggeredGridLayoutManager.this.getPosition(view);
                    } else {
                        if (g11 < m11 || d11 > i13) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    }
                }
                i11 += i14;
            }
            return -1;
        }

        int i(int i11, int i12, boolean z11) {
            return h(i11, i12, false, false, z11);
        }

        public int j() {
            return this.f5455d;
        }

        int k() {
            int i11 = this.f5454c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            c();
            return this.f5454c;
        }

        int l(int i11) {
            int i12 = this.f5454c;
            if (i12 != Integer.MIN_VALUE) {
                return i12;
            }
            if (this.f5452a.size() == 0) {
                return i11;
            }
            c();
            return this.f5454c;
        }

        public View m(int i11, int i12) {
            View view = null;
            if (i12 == -1) {
                int size = this.f5452a.size();
                int i13 = 0;
                while (i13 < size) {
                    View view2 = this.f5452a.get(i13);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f5409h && staggeredGridLayoutManager.getPosition(view2) <= i11) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f5409h && staggeredGridLayoutManager2.getPosition(view2) >= i11) || !view2.hasFocusable()) {
                        break;
                    }
                    i13++;
                    view = view2;
                }
            } else {
                int size2 = this.f5452a.size() - 1;
                while (size2 >= 0) {
                    View view3 = this.f5452a.get(size2);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f5409h && staggeredGridLayoutManager3.getPosition(view3) >= i11) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f5409h && staggeredGridLayoutManager4.getPosition(view3) <= i11) || !view3.hasFocusable()) {
                        break;
                    }
                    size2--;
                    view = view3;
                }
            }
            return view;
        }

        c n(View view) {
            return (c) view.getLayoutParams();
        }

        int o() {
            int i11 = this.f5453b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            d();
            return this.f5453b;
        }

        int p(int i11) {
            int i12 = this.f5453b;
            if (i12 != Integer.MIN_VALUE) {
                return i12;
            }
            if (this.f5452a.size() == 0) {
                return i11;
            }
            d();
            return this.f5453b;
        }

        void q() {
            this.f5453b = Integer.MIN_VALUE;
            this.f5454c = Integer.MIN_VALUE;
        }

        void r(int i11) {
            int i12 = this.f5453b;
            if (i12 != Integer.MIN_VALUE) {
                this.f5453b = i12 + i11;
            }
            int i13 = this.f5454c;
            if (i13 != Integer.MIN_VALUE) {
                this.f5454c = i13 + i11;
            }
        }

        void s() {
            int size = this.f5452a.size();
            View remove = this.f5452a.remove(size - 1);
            c n11 = n(remove);
            n11.f5434e = null;
            if (n11.c() || n11.b()) {
                this.f5455d -= StaggeredGridLayoutManager.this.f5404c.e(remove);
            }
            if (size == 1) {
                this.f5453b = Integer.MIN_VALUE;
            }
            this.f5454c = Integer.MIN_VALUE;
        }

        void t() {
            View remove = this.f5452a.remove(0);
            c n11 = n(remove);
            n11.f5434e = null;
            if (this.f5452a.size() == 0) {
                this.f5454c = Integer.MIN_VALUE;
            }
            if (n11.c() || n11.b()) {
                this.f5455d -= StaggeredGridLayoutManager.this.f5404c.e(remove);
            }
            this.f5453b = Integer.MIN_VALUE;
        }

        void u(View view) {
            c n11 = n(view);
            n11.f5434e = this;
            this.f5452a.add(0, view);
            this.f5453b = Integer.MIN_VALUE;
            if (this.f5452a.size() == 1) {
                this.f5454c = Integer.MIN_VALUE;
            }
            if (n11.c() || n11.b()) {
                this.f5455d += StaggeredGridLayoutManager.this.f5404c.e(view);
            }
        }

        void v(int i11) {
            this.f5453b = i11;
            this.f5454c = i11;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i11, int i12) {
        RecyclerView.p.d properties = RecyclerView.p.getProperties(context, attributeSet, i11, i12);
        setOrientation(properties.f5378a);
        O(properties.f5379b);
        setReverseLayout(properties.f5380c);
        this.f5408g = new o();
        k();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f5410i
            if (r0 == 0) goto L9
            int r0 = r6.u()
            goto Ld
        L9:
            int r0 = r6.t()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1a
            if (r7 >= r8) goto L16
            int r2 = r8 + 1
            goto L1c
        L16:
            int r2 = r7 + 1
            r3 = r8
            goto L1d
        L1a:
            int r2 = r7 + r8
        L1c:
            r3 = r7
        L1d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f5414m
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f5414m
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.f5414m
            r7.j(r8, r4)
            goto L41
        L36:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f5414m
            r9.k(r7, r8)
            goto L41
        L3c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f5414m
            r9.j(r7, r8)
        L41:
            if (r2 > r0) goto L44
            return
        L44:
            boolean r7 = r6.f5410i
            if (r7 == 0) goto L4d
            int r7 = r6.t()
            goto L51
        L4d:
            int r7 = r6.u()
        L51:
            if (r3 > r7) goto L56
            r6.requestLayout()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A(int, int, int):void");
    }

    private void D(View view, int i11, int i12, boolean z11) {
        boolean shouldMeasureChild;
        calculateItemDecorationsForChild(view, this.f5420s);
        c cVar = (c) view.getLayoutParams();
        int i13 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.f5420s;
        int W = W(i11, i13 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i14 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.f5420s;
        int W2 = W(i12, i14 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z11) {
            shouldMeasureChild = shouldReMeasureChild(view, W, W2, cVar);
        } else {
            shouldMeasureChild = shouldMeasureChild(view, W, W2, cVar);
        }
        if (shouldMeasureChild) {
            view.measure(W, W2);
        }
    }

    private void E(View view, c cVar, boolean z11) {
        if (cVar.f5435f) {
            if (this.f5406e == 1) {
                D(view, this.f5419r, RecyclerView.p.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z11);
            } else {
                D(view, RecyclerView.p.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.f5419r, z11);
            }
        } else if (this.f5406e == 1) {
            D(view, RecyclerView.p.getChildMeasureSpec(this.f5407f, getWidthMode(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.p.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z11);
        } else {
            D(view, RecyclerView.p.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.p.getChildMeasureSpec(this.f5407f, getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), z11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0157, code lost:
        if (g() != false) goto L83;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void F(androidx.recyclerview.widget.RecyclerView.w r9, androidx.recyclerview.widget.RecyclerView.b0 r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.F(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0, boolean):void");
    }

    private boolean G(int i11) {
        if (this.f5406e == 0) {
            return (i11 == -1) != this.f5410i;
        }
        return ((i11 == -1) == this.f5410i) == isLayoutRTL();
    }

    private void I(View view) {
        for (int i11 = this.f5402a - 1; i11 >= 0; i11--) {
            this.f5403b[i11].u(view);
        }
    }

    private void J(RecyclerView.w wVar, o oVar) {
        int min;
        int min2;
        if (!oVar.f5678a || oVar.f5686i) {
            return;
        }
        if (oVar.f5679b == 0) {
            if (oVar.f5682e == -1) {
                K(wVar, oVar.f5684g);
            } else {
                L(wVar, oVar.f5683f);
            }
        } else if (oVar.f5682e == -1) {
            int i11 = oVar.f5683f;
            int w11 = i11 - w(i11);
            if (w11 < 0) {
                min2 = oVar.f5684g;
            } else {
                min2 = oVar.f5684g - Math.min(w11, oVar.f5679b);
            }
            K(wVar, min2);
        } else {
            int x11 = x(oVar.f5684g) - oVar.f5684g;
            if (x11 < 0) {
                min = oVar.f5683f;
            } else {
                min = Math.min(x11, oVar.f5679b) + oVar.f5683f;
            }
            L(wVar, min);
        }
    }

    private void K(RecyclerView.w wVar, int i11) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.f5404c.g(childAt) < i11 || this.f5404c.q(childAt) < i11) {
                return;
            }
            c cVar = (c) childAt.getLayoutParams();
            if (cVar.f5435f) {
                for (int i12 = 0; i12 < this.f5402a; i12++) {
                    if (this.f5403b[i12].f5452a.size() == 1) {
                        return;
                    }
                }
                for (int i13 = 0; i13 < this.f5402a; i13++) {
                    this.f5403b[i13].s();
                }
            } else if (cVar.f5434e.f5452a.size() == 1) {
                return;
            } else {
                cVar.f5434e.s();
            }
            removeAndRecycleView(childAt, wVar);
        }
    }

    private void L(RecyclerView.w wVar, int i11) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f5404c.d(childAt) > i11 || this.f5404c.p(childAt) > i11) {
                return;
            }
            c cVar = (c) childAt.getLayoutParams();
            if (cVar.f5435f) {
                for (int i12 = 0; i12 < this.f5402a; i12++) {
                    if (this.f5403b[i12].f5452a.size() == 1) {
                        return;
                    }
                }
                for (int i13 = 0; i13 < this.f5402a; i13++) {
                    this.f5403b[i13].t();
                }
            } else if (cVar.f5434e.f5452a.size() == 1) {
                return;
            } else {
                cVar.f5434e.t();
            }
            removeAndRecycleView(childAt, wVar);
        }
    }

    private void M() {
        if (this.f5405d.k() == 1073741824) {
            return;
        }
        float f11 = BitmapDescriptorFactory.HUE_RED;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            float e11 = this.f5405d.e(childAt);
            if (e11 >= f11) {
                if (((c) childAt.getLayoutParams()).e()) {
                    e11 = (e11 * 1.0f) / this.f5402a;
                }
                f11 = Math.max(f11, e11);
            }
        }
        int i12 = this.f5407f;
        int round = Math.round(f11 * this.f5402a);
        if (this.f5405d.k() == Integer.MIN_VALUE) {
            round = Math.min(round, this.f5405d.n());
        }
        U(round);
        if (this.f5407f == i12) {
            return;
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt2 = getChildAt(i13);
            c cVar = (c) childAt2.getLayoutParams();
            if (!cVar.f5435f) {
                if (isLayoutRTL() && this.f5406e == 1) {
                    int i14 = this.f5402a;
                    int i15 = cVar.f5434e.f5456e;
                    childAt2.offsetLeftAndRight(((-((i14 - 1) - i15)) * this.f5407f) - ((-((i14 - 1) - i15)) * i12));
                } else {
                    int i16 = cVar.f5434e.f5456e;
                    int i17 = this.f5407f * i16;
                    int i18 = i16 * i12;
                    if (this.f5406e == 1) {
                        childAt2.offsetLeftAndRight(i17 - i18);
                    } else {
                        childAt2.offsetTopAndBottom(i17 - i18);
                    }
                }
            }
        }
    }

    private void N(int i11) {
        o oVar = this.f5408g;
        oVar.f5682e = i11;
        oVar.f5681d = this.f5410i != (i11 == -1) ? -1 : 1;
    }

    private void P(int i11, int i12) {
        for (int i13 = 0; i13 < this.f5402a; i13++) {
            if (!this.f5403b[i13].f5452a.isEmpty()) {
                V(this.f5403b[i13], i11, i12);
            }
        }
    }

    private boolean Q(RecyclerView.b0 b0Var, b bVar) {
        int m11;
        if (this.f5416o) {
            m11 = q(b0Var.b());
        } else {
            m11 = m(b0Var.b());
        }
        bVar.f5427a = m11;
        bVar.f5428b = Integer.MIN_VALUE;
        return true;
    }

    private void T(int i11, RecyclerView.b0 b0Var) {
        int i12;
        int i13;
        int c11;
        o oVar = this.f5408g;
        boolean z11 = false;
        oVar.f5679b = 0;
        oVar.f5680c = i11;
        if (!isSmoothScrolling() || (c11 = b0Var.c()) == -1) {
            i12 = 0;
            i13 = 0;
        } else {
            if (this.f5410i == (c11 < i11)) {
                i12 = this.f5404c.n();
                i13 = 0;
            } else {
                i13 = this.f5404c.n();
                i12 = 0;
            }
        }
        if (getClipToPadding()) {
            this.f5408g.f5683f = this.f5404c.m() - i13;
            this.f5408g.f5684g = this.f5404c.i() + i12;
        } else {
            this.f5408g.f5684g = this.f5404c.h() + i12;
            this.f5408g.f5683f = -i13;
        }
        o oVar2 = this.f5408g;
        oVar2.f5685h = false;
        oVar2.f5678a = true;
        if (this.f5404c.k() == 0 && this.f5404c.h() == 0) {
            z11 = true;
        }
        oVar2.f5686i = z11;
    }

    private void V(f fVar, int i11, int i12) {
        int j11 = fVar.j();
        if (i11 == -1) {
            if (fVar.o() + j11 <= i12) {
                this.f5411j.set(fVar.f5456e, false);
            }
        } else if (fVar.k() - j11 >= i12) {
            this.f5411j.set(fVar.f5456e, false);
        }
    }

    private int W(int i11, int i12, int i13) {
        if (i12 == 0 && i13 == 0) {
            return i11;
        }
        int mode = View.MeasureSpec.getMode(i11);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i11) - i12) - i13), mode) : i11;
    }

    private void a(View view) {
        for (int i11 = this.f5402a - 1; i11 >= 0; i11--) {
            this.f5403b[i11].a(view);
        }
    }

    private void b(b bVar) {
        int m11;
        e eVar = this.f5418q;
        int i11 = eVar.f5444c;
        if (i11 > 0) {
            if (i11 == this.f5402a) {
                for (int i12 = 0; i12 < this.f5402a; i12++) {
                    this.f5403b[i12].e();
                    e eVar2 = this.f5418q;
                    int i13 = eVar2.f5445d[i12];
                    if (i13 != Integer.MIN_VALUE) {
                        if (eVar2.f5450i) {
                            m11 = this.f5404c.i();
                        } else {
                            m11 = this.f5404c.m();
                        }
                        i13 += m11;
                    }
                    this.f5403b[i12].v(i13);
                }
            } else {
                eVar.b();
                e eVar3 = this.f5418q;
                eVar3.f5442a = eVar3.f5443b;
            }
        }
        e eVar4 = this.f5418q;
        this.f5417p = eVar4.f5451j;
        setReverseLayout(eVar4.f5449h);
        resolveShouldLayoutReverse();
        e eVar5 = this.f5418q;
        int i14 = eVar5.f5442a;
        if (i14 != -1) {
            this.f5412k = i14;
            bVar.f5429c = eVar5.f5450i;
        } else {
            bVar.f5429c = this.f5410i;
        }
        if (eVar5.f5446e > 1) {
            d dVar = this.f5414m;
            dVar.f5436a = eVar5.f5447f;
            dVar.f5437b = eVar5.f5448g;
        }
    }

    private int computeScrollExtent(RecyclerView.b0 b0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        return w.a(b0Var, this.f5404c, o(!this.f5423v), n(!this.f5423v), this, this.f5423v);
    }

    private int computeScrollOffset(RecyclerView.b0 b0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        return w.b(b0Var, this.f5404c, o(!this.f5423v), n(!this.f5423v), this, this.f5423v, this.f5410i);
    }

    private int computeScrollRange(RecyclerView.b0 b0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        return w.c(b0Var, this.f5404c, o(!this.f5423v), n(!this.f5423v), this, this.f5423v);
    }

    private int convertFocusDirectionToLayoutDirection(int i11) {
        return i11 != 1 ? i11 != 2 ? i11 != 17 ? i11 != 33 ? i11 != 66 ? (i11 == 130 && this.f5406e == 1) ? 1 : Integer.MIN_VALUE : this.f5406e == 0 ? 1 : Integer.MIN_VALUE : this.f5406e == 1 ? -1 : Integer.MIN_VALUE : this.f5406e == 0 ? -1 : Integer.MIN_VALUE : (this.f5406e != 1 && isLayoutRTL()) ? -1 : 1 : (this.f5406e != 1 && isLayoutRTL()) ? 1 : -1;
    }

    private void e(View view, c cVar, o oVar) {
        if (oVar.f5682e == 1) {
            if (cVar.f5435f) {
                a(view);
            } else {
                cVar.f5434e.a(view);
            }
        } else if (cVar.f5435f) {
            I(view);
        } else {
            cVar.f5434e.u(view);
        }
    }

    private int f(int i11) {
        if (getChildCount() == 0) {
            return this.f5410i ? 1 : -1;
        }
        return (i11 < t()) != this.f5410i ? -1 : 1;
    }

    private boolean h(f fVar) {
        if (this.f5410i) {
            if (fVar.k() < this.f5404c.i()) {
                ArrayList<View> arrayList = fVar.f5452a;
                return !fVar.n(arrayList.get(arrayList.size() - 1)).f5435f;
            }
        } else if (fVar.o() > this.f5404c.m()) {
            return !fVar.n(fVar.f5452a.get(0)).f5435f;
        }
        return false;
    }

    private d.a i(int i11) {
        d.a aVar = new d.a();
        aVar.f5440c = new int[this.f5402a];
        for (int i12 = 0; i12 < this.f5402a; i12++) {
            aVar.f5440c[i12] = i11 - this.f5403b[i12].l(i11);
        }
        return aVar;
    }

    private d.a j(int i11) {
        d.a aVar = new d.a();
        aVar.f5440c = new int[this.f5402a];
        for (int i12 = 0; i12 < this.f5402a; i12++) {
            aVar.f5440c[i12] = this.f5403b[i12].p(i11) - i11;
        }
        return aVar;
    }

    private void k() {
        this.f5404c = t.b(this, this.f5406e);
        this.f5405d = t.b(this, 1 - this.f5406e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    private int l(RecyclerView.w wVar, o oVar, RecyclerView.b0 b0Var) {
        int i11;
        int m11;
        int v11;
        f fVar;
        int e11;
        int i12;
        int i13;
        int e12;
        boolean z11;
        boolean d11;
        ?? r92 = 0;
        this.f5411j.set(0, this.f5402a, true);
        if (this.f5408g.f5686i) {
            i11 = oVar.f5682e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else if (oVar.f5682e == 1) {
            i11 = oVar.f5684g + oVar.f5679b;
        } else {
            i11 = oVar.f5683f - oVar.f5679b;
        }
        int i14 = i11;
        P(oVar.f5682e, i14);
        if (this.f5410i) {
            m11 = this.f5404c.i();
        } else {
            m11 = this.f5404c.m();
        }
        int i15 = m11;
        boolean z12 = false;
        while (oVar.a(b0Var) && (this.f5408g.f5686i || !this.f5411j.isEmpty())) {
            View b11 = oVar.b(wVar);
            c cVar = (c) b11.getLayoutParams();
            int a11 = cVar.a();
            int g11 = this.f5414m.g(a11);
            boolean z13 = g11 == -1 ? true : r92;
            if (z13) {
                fVar = cVar.f5435f ? this.f5403b[r92] : z(oVar);
                this.f5414m.n(a11, fVar);
            } else {
                fVar = this.f5403b[g11];
            }
            f fVar2 = fVar;
            cVar.f5434e = fVar2;
            if (oVar.f5682e == 1) {
                addView(b11);
            } else {
                addView(b11, r92);
            }
            E(b11, cVar, r92);
            if (oVar.f5682e == 1) {
                int v12 = cVar.f5435f ? v(i15) : fVar2.l(i15);
                int e13 = this.f5404c.e(b11) + v12;
                if (z13 && cVar.f5435f) {
                    d.a i16 = i(v12);
                    i16.f5439b = -1;
                    i16.f5438a = a11;
                    this.f5414m.a(i16);
                }
                i12 = e13;
                e11 = v12;
            } else {
                int y11 = cVar.f5435f ? y(i15) : fVar2.p(i15);
                e11 = y11 - this.f5404c.e(b11);
                if (z13 && cVar.f5435f) {
                    d.a j11 = j(y11);
                    j11.f5439b = 1;
                    j11.f5438a = a11;
                    this.f5414m.a(j11);
                }
                i12 = y11;
            }
            if (cVar.f5435f && oVar.f5681d == -1) {
                if (z13) {
                    this.f5422u = true;
                } else {
                    if (oVar.f5682e == 1) {
                        d11 = c();
                    } else {
                        d11 = d();
                    }
                    if (!d11) {
                        d.a f11 = this.f5414m.f(a11);
                        if (f11 != null) {
                            f11.f5441d = true;
                        }
                        this.f5422u = true;
                    }
                }
            }
            e(b11, cVar, oVar);
            if (isLayoutRTL() && this.f5406e == 1) {
                int i17 = cVar.f5435f ? this.f5405d.i() : this.f5405d.i() - (((this.f5402a - 1) - fVar2.f5456e) * this.f5407f);
                e12 = i17;
                i13 = i17 - this.f5405d.e(b11);
            } else {
                int m12 = cVar.f5435f ? this.f5405d.m() : (fVar2.f5456e * this.f5407f) + this.f5405d.m();
                i13 = m12;
                e12 = this.f5405d.e(b11) + m12;
            }
            if (this.f5406e == 1) {
                layoutDecoratedWithMargins(b11, i13, e11, e12, i12);
            } else {
                layoutDecoratedWithMargins(b11, e11, i13, i12, e12);
            }
            if (cVar.f5435f) {
                P(this.f5408g.f5682e, i14);
            } else {
                V(fVar2, this.f5408g.f5682e, i14);
            }
            J(wVar, this.f5408g);
            if (this.f5408g.f5685h && b11.hasFocusable()) {
                if (cVar.f5435f) {
                    this.f5411j.clear();
                } else {
                    z11 = false;
                    this.f5411j.set(fVar2.f5456e, false);
                    r92 = z11;
                    z12 = true;
                }
            }
            z11 = false;
            r92 = z11;
            z12 = true;
        }
        int i18 = r92;
        if (!z12) {
            J(wVar, this.f5408g);
        }
        if (this.f5408g.f5682e == -1) {
            v11 = this.f5404c.m() - y(this.f5404c.m());
        } else {
            v11 = v(this.f5404c.i()) - this.f5404c.i();
        }
        return v11 > 0 ? Math.min(oVar.f5679b, v11) : i18;
    }

    private int m(int i11) {
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            int position = getPosition(getChildAt(i12));
            if (position >= 0 && position < i11) {
                return position;
            }
        }
        return 0;
    }

    private int q(int i11) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            int position = getPosition(getChildAt(childCount));
            if (position >= 0 && position < i11) {
                return position;
            }
        }
        return 0;
    }

    private void r(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z11) {
        int i11;
        int v11 = v(Integer.MIN_VALUE);
        if (v11 != Integer.MIN_VALUE && (i11 = this.f5404c.i() - v11) > 0) {
            int i12 = i11 - (-scrollBy(-i11, wVar, b0Var));
            if (!z11 || i12 <= 0) {
                return;
            }
            this.f5404c.r(i12);
        }
    }

    private void resolveShouldLayoutReverse() {
        if (this.f5406e != 1 && isLayoutRTL()) {
            this.f5410i = !this.f5409h;
        } else {
            this.f5410i = this.f5409h;
        }
    }

    private void s(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z11) {
        int m11;
        int y11 = y(Integer.MAX_VALUE);
        if (y11 != Integer.MAX_VALUE && (m11 = y11 - this.f5404c.m()) > 0) {
            int scrollBy = m11 - scrollBy(m11, wVar, b0Var);
            if (!z11 || scrollBy <= 0) {
                return;
            }
            this.f5404c.r(-scrollBy);
        }
    }

    private int v(int i11) {
        int l11 = this.f5403b[0].l(i11);
        for (int i12 = 1; i12 < this.f5402a; i12++) {
            int l12 = this.f5403b[i12].l(i11);
            if (l12 > l11) {
                l11 = l12;
            }
        }
        return l11;
    }

    private int w(int i11) {
        int p11 = this.f5403b[0].p(i11);
        for (int i12 = 1; i12 < this.f5402a; i12++) {
            int p12 = this.f5403b[i12].p(i11);
            if (p12 > p11) {
                p11 = p12;
            }
        }
        return p11;
    }

    private int x(int i11) {
        int l11 = this.f5403b[0].l(i11);
        for (int i12 = 1; i12 < this.f5402a; i12++) {
            int l12 = this.f5403b[i12].l(i11);
            if (l12 < l11) {
                l11 = l12;
            }
        }
        return l11;
    }

    private int y(int i11) {
        int p11 = this.f5403b[0].p(i11);
        for (int i12 = 1; i12 < this.f5402a; i12++) {
            int p12 = this.f5403b[i12].p(i11);
            if (p12 < p11) {
                p11 = p12;
            }
        }
        return p11;
    }

    private f z(o oVar) {
        int i11;
        int i12;
        int i13 = -1;
        if (G(oVar.f5682e)) {
            i11 = this.f5402a - 1;
            i12 = -1;
        } else {
            i11 = 0;
            i13 = this.f5402a;
            i12 = 1;
        }
        f fVar = null;
        if (oVar.f5682e == 1) {
            int i14 = Integer.MAX_VALUE;
            int m11 = this.f5404c.m();
            while (i11 != i13) {
                f fVar2 = this.f5403b[i11];
                int l11 = fVar2.l(m11);
                if (l11 < i14) {
                    fVar = fVar2;
                    i14 = l11;
                }
                i11 += i12;
            }
            return fVar;
        }
        int i15 = Integer.MIN_VALUE;
        int i16 = this.f5404c.i();
        while (i11 != i13) {
            f fVar3 = this.f5403b[i11];
            int p11 = fVar3.p(i16);
            if (p11 > i15) {
                fVar = fVar3;
                i15 = p11;
            }
            i11 += i12;
        }
        return fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
        if (r10 == r11) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
        if (r10 == r11) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008a, code lost:
        r10 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    android.view.View B() {
        /*
            r12 = this;
            int r0 = r12.getChildCount()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f5402a
            r2.<init>(r3)
            int r3 = r12.f5402a
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f5406e
            r5 = -1
            if (r3 != r1) goto L20
            boolean r3 = r12.isLayoutRTL()
            if (r3 == 0) goto L20
            r3 = r1
            goto L21
        L20:
            r3 = r5
        L21:
            boolean r6 = r12.f5410i
            if (r6 == 0) goto L27
            r6 = r5
            goto L2b
        L27:
            int r0 = r0 + 1
            r6 = r0
            r0 = r4
        L2b:
            if (r0 >= r6) goto L2e
            r5 = r1
        L2e:
            if (r0 == r6) goto Lab
            android.view.View r7 = r12.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f5434e
            int r9 = r9.f5456e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L54
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f5434e
            boolean r9 = r12.h(r9)
            if (r9 == 0) goto L4d
            return r7
        L4d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f5434e
            int r9 = r9.f5456e
            r2.clear(r9)
        L54:
            boolean r9 = r8.f5435f
            if (r9 == 0) goto L59
            goto La9
        L59:
            int r9 = r0 + r5
            if (r9 == r6) goto La9
            android.view.View r9 = r12.getChildAt(r9)
            boolean r10 = r12.f5410i
            if (r10 == 0) goto L77
            androidx.recyclerview.widget.t r10 = r12.f5404c
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.t r11 = r12.f5404c
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L74
            return r7
        L74:
            if (r10 != r11) goto L8a
            goto L88
        L77:
            androidx.recyclerview.widget.t r10 = r12.f5404c
            int r10 = r10.g(r7)
            androidx.recyclerview.widget.t r11 = r12.f5404c
            int r11 = r11.g(r9)
            if (r10 <= r11) goto L86
            return r7
        L86:
            if (r10 != r11) goto L8a
        L88:
            r10 = r1
            goto L8b
        L8a:
            r10 = r4
        L8b:
            if (r10 == 0) goto La9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f5434e
            int r8 = r8.f5456e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f5434e
            int r9 = r9.f5456e
            int r8 = r8 - r9
            if (r8 >= 0) goto La0
            r8 = r1
            goto La1
        La0:
            r8 = r4
        La1:
            if (r3 >= 0) goto La5
            r9 = r1
            goto La6
        La5:
            r9 = r4
        La6:
            if (r8 == r9) goto La9
            return r7
        La9:
            int r0 = r0 + r5
            goto L2e
        Lab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.B():android.view.View");
    }

    public void C() {
        this.f5414m.b();
        requestLayout();
    }

    void H(int i11, RecyclerView.b0 b0Var) {
        int i12;
        int t11;
        if (i11 > 0) {
            t11 = u();
            i12 = 1;
        } else {
            i12 = -1;
            t11 = t();
        }
        this.f5408g.f5678a = true;
        T(t11, b0Var);
        N(i12);
        o oVar = this.f5408g;
        oVar.f5680c = t11 + oVar.f5681d;
        oVar.f5679b = Math.abs(i11);
    }

    public void O(int i11) {
        assertNotInLayoutOrScroll(null);
        if (i11 != this.f5402a) {
            C();
            this.f5402a = i11;
            this.f5411j = new BitSet(this.f5402a);
            this.f5403b = new f[this.f5402a];
            for (int i12 = 0; i12 < this.f5402a; i12++) {
                this.f5403b[i12] = new f(i12);
            }
            requestLayout();
        }
    }

    boolean R(RecyclerView.b0 b0Var, b bVar) {
        int i11;
        int m11;
        if (!b0Var.e() && (i11 = this.f5412k) != -1) {
            if (i11 >= 0 && i11 < b0Var.b()) {
                e eVar = this.f5418q;
                if (eVar != null && eVar.f5442a != -1 && eVar.f5444c >= 1) {
                    bVar.f5428b = Integer.MIN_VALUE;
                    bVar.f5427a = this.f5412k;
                } else {
                    View findViewByPosition = findViewByPosition(this.f5412k);
                    if (findViewByPosition != null) {
                        bVar.f5427a = this.f5410i ? u() : t();
                        if (this.f5413l != Integer.MIN_VALUE) {
                            if (bVar.f5429c) {
                                bVar.f5428b = (this.f5404c.i() - this.f5413l) - this.f5404c.d(findViewByPosition);
                            } else {
                                bVar.f5428b = (this.f5404c.m() + this.f5413l) - this.f5404c.g(findViewByPosition);
                            }
                            return true;
                        } else if (this.f5404c.e(findViewByPosition) > this.f5404c.n()) {
                            if (bVar.f5429c) {
                                m11 = this.f5404c.i();
                            } else {
                                m11 = this.f5404c.m();
                            }
                            bVar.f5428b = m11;
                            return true;
                        } else {
                            int g11 = this.f5404c.g(findViewByPosition) - this.f5404c.m();
                            if (g11 < 0) {
                                bVar.f5428b = -g11;
                                return true;
                            }
                            int i12 = this.f5404c.i() - this.f5404c.d(findViewByPosition);
                            if (i12 < 0) {
                                bVar.f5428b = i12;
                                return true;
                            }
                            bVar.f5428b = Integer.MIN_VALUE;
                        }
                    } else {
                        int i13 = this.f5412k;
                        bVar.f5427a = i13;
                        int i14 = this.f5413l;
                        if (i14 == Integer.MIN_VALUE) {
                            bVar.f5429c = f(i13) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i14);
                        }
                        bVar.f5430d = true;
                    }
                }
                return true;
            }
            this.f5412k = -1;
            this.f5413l = Integer.MIN_VALUE;
        }
        return false;
    }

    void S(RecyclerView.b0 b0Var, b bVar) {
        if (R(b0Var, bVar) || Q(b0Var, bVar)) {
            return;
        }
        bVar.a();
        bVar.f5427a = 0;
    }

    void U(int i11) {
        this.f5407f = i11 / this.f5402a;
        this.f5419r = View.MeasureSpec.makeMeasureSpec(i11, this.f5405d.k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void assertNotInLayoutOrScroll(String str) {
        if (this.f5418q == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    boolean c() {
        int l11 = this.f5403b[0].l(Integer.MIN_VALUE);
        for (int i11 = 1; i11 < this.f5402a; i11++) {
            if (this.f5403b[i11].l(Integer.MIN_VALUE) != l11) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean canScrollHorizontally() {
        return this.f5406e == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean canScrollVertically() {
        return this.f5406e == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean checkLayoutParams(RecyclerView.q qVar) {
        return qVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void collectAdjacentPrefetchPositions(int i11, int i12, RecyclerView.b0 b0Var, RecyclerView.p.c cVar) {
        int l11;
        int i13;
        if (this.f5406e != 0) {
            i11 = i12;
        }
        if (getChildCount() == 0 || i11 == 0) {
            return;
        }
        H(i11, b0Var);
        int[] iArr = this.f5424w;
        if (iArr == null || iArr.length < this.f5402a) {
            this.f5424w = new int[this.f5402a];
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f5402a; i15++) {
            o oVar = this.f5408g;
            if (oVar.f5681d == -1) {
                l11 = oVar.f5683f;
                i13 = this.f5403b[i15].p(l11);
            } else {
                l11 = this.f5403b[i15].l(oVar.f5684g);
                i13 = this.f5408g.f5684g;
            }
            int i16 = l11 - i13;
            if (i16 >= 0) {
                this.f5424w[i14] = i16;
                i14++;
            }
        }
        Arrays.sort(this.f5424w, 0, i14);
        for (int i17 = 0; i17 < i14 && this.f5408g.a(b0Var); i17++) {
            cVar.a(this.f5408g.f5680c, this.f5424w[i17]);
            o oVar2 = this.f5408g;
            oVar2.f5680c += oVar2.f5681d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollExtent(RecyclerView.b0 b0Var) {
        return computeScrollExtent(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollOffset(RecyclerView.b0 b0Var) {
        return computeScrollOffset(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollRange(RecyclerView.b0 b0Var) {
        return computeScrollRange(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0.b
    public PointF computeScrollVectorForPosition(int i11) {
        int f11 = f(i11);
        PointF pointF = new PointF();
        if (f11 == 0) {
            return null;
        }
        if (this.f5406e == 0) {
            pointF.x = f11;
            pointF.y = BitmapDescriptorFactory.HUE_RED;
        } else {
            pointF.x = BitmapDescriptorFactory.HUE_RED;
            pointF.y = f11;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollExtent(RecyclerView.b0 b0Var) {
        return computeScrollExtent(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollOffset(RecyclerView.b0 b0Var) {
        return computeScrollOffset(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollRange(RecyclerView.b0 b0Var) {
        return computeScrollRange(b0Var);
    }

    boolean d() {
        int p11 = this.f5403b[0].p(Integer.MIN_VALUE);
        for (int i11 = 1; i11 < this.f5402a; i11++) {
            if (this.f5403b[i11].p(Integer.MIN_VALUE) != p11) {
                return false;
            }
        }
        return true;
    }

    boolean g() {
        int t11;
        int u11;
        if (getChildCount() == 0 || this.f5415n == 0 || !isAttachedToWindow()) {
            return false;
        }
        if (this.f5410i) {
            t11 = u();
            u11 = t();
        } else {
            t11 = t();
            u11 = u();
        }
        if (t11 == 0 && B() != null) {
            this.f5414m.b();
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        } else if (this.f5422u) {
            int i11 = this.f5410i ? -1 : 1;
            int i12 = u11 + 1;
            d.a e11 = this.f5414m.e(t11, i12, i11, true);
            if (e11 == null) {
                this.f5422u = false;
                this.f5414m.d(i12);
                return false;
            }
            d.a e12 = this.f5414m.e(t11, e11.f5438a, i11 * (-1), true);
            if (e12 == null) {
                this.f5414m.d(e11.f5438a);
            } else {
                this.f5414m.d(e12.f5438a + 1);
            }
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        } else {
            return false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q generateDefaultLayoutParams() {
        if (this.f5406e == 0) {
            return new c(-2, -1);
        }
        return new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean isAutoMeasureEnabled() {
        return this.f5415n != 0;
    }

    boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    View n(boolean z11) {
        int m11 = this.f5404c.m();
        int i11 = this.f5404c.i();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int g11 = this.f5404c.g(childAt);
            int d11 = this.f5404c.d(childAt);
            if (d11 > m11 && g11 < i11) {
                if (d11 <= i11 || !z11) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    View o(boolean z11) {
        int m11 = this.f5404c.m();
        int i11 = this.f5404c.i();
        int childCount = getChildCount();
        View view = null;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            int g11 = this.f5404c.g(childAt);
            if (this.f5404c.d(childAt) > m11 && g11 < i11) {
                if (g11 >= m11 || !z11) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void offsetChildrenHorizontal(int i11) {
        super.offsetChildrenHorizontal(i11);
        for (int i12 = 0; i12 < this.f5402a; i12++) {
            this.f5403b[i12].r(i11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void offsetChildrenVertical(int i11) {
        super.offsetChildrenVertical(i11);
        for (int i12 = 0; i12 < this.f5402a; i12++) {
            this.f5403b[i12].r(i11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onAdapterChanged(RecyclerView.h hVar, RecyclerView.h hVar2) {
        this.f5414m.b();
        for (int i11 = 0; i11 < this.f5402a; i11++) {
            this.f5403b[i11].e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.onDetachedFromWindow(recyclerView, wVar);
        removeCallbacks(this.f5425x);
        for (int i11 = 0; i11 < this.f5402a; i11++) {
            this.f5403b[i11].e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View onFocusSearchFailed(View view, int i11, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        View findContainingItemView;
        int t11;
        int g11;
        int g12;
        int g13;
        View m11;
        if (getChildCount() == 0 || (findContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        resolveShouldLayoutReverse();
        int convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i11);
        if (convertFocusDirectionToLayoutDirection == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) findContainingItemView.getLayoutParams();
        boolean z11 = cVar.f5435f;
        f fVar = cVar.f5434e;
        if (convertFocusDirectionToLayoutDirection == 1) {
            t11 = u();
        } else {
            t11 = t();
        }
        T(t11, b0Var);
        N(convertFocusDirectionToLayoutDirection);
        o oVar = this.f5408g;
        oVar.f5680c = oVar.f5681d + t11;
        oVar.f5679b = (int) (this.f5404c.n() * 0.33333334f);
        o oVar2 = this.f5408g;
        oVar2.f5685h = true;
        oVar2.f5678a = false;
        l(wVar, oVar2, b0Var);
        this.f5416o = this.f5410i;
        if (z11 || (m11 = fVar.m(t11, convertFocusDirectionToLayoutDirection)) == null || m11 == findContainingItemView) {
            if (G(convertFocusDirectionToLayoutDirection)) {
                for (int i12 = this.f5402a - 1; i12 >= 0; i12--) {
                    View m12 = this.f5403b[i12].m(t11, convertFocusDirectionToLayoutDirection);
                    if (m12 != null && m12 != findContainingItemView) {
                        return m12;
                    }
                }
            } else {
                for (int i13 = 0; i13 < this.f5402a; i13++) {
                    View m13 = this.f5403b[i13].m(t11, convertFocusDirectionToLayoutDirection);
                    if (m13 != null && m13 != findContainingItemView) {
                        return m13;
                    }
                }
            }
            boolean z12 = (this.f5409h ^ true) == (convertFocusDirectionToLayoutDirection == -1);
            if (!z11) {
                if (z12) {
                    g13 = fVar.f();
                } else {
                    g13 = fVar.g();
                }
                View findViewByPosition = findViewByPosition(g13);
                if (findViewByPosition != null && findViewByPosition != findContainingItemView) {
                    return findViewByPosition;
                }
            }
            if (G(convertFocusDirectionToLayoutDirection)) {
                for (int i14 = this.f5402a - 1; i14 >= 0; i14--) {
                    if (i14 != fVar.f5456e) {
                        if (z12) {
                            g12 = this.f5403b[i14].f();
                        } else {
                            g12 = this.f5403b[i14].g();
                        }
                        View findViewByPosition2 = findViewByPosition(g12);
                        if (findViewByPosition2 != null && findViewByPosition2 != findContainingItemView) {
                            return findViewByPosition2;
                        }
                    }
                }
            } else {
                for (int i15 = 0; i15 < this.f5402a; i15++) {
                    if (z12) {
                        g11 = this.f5403b[i15].f();
                    } else {
                        g11 = this.f5403b[i15].g();
                    }
                    View findViewByPosition3 = findViewByPosition(g11);
                    if (findViewByPosition3 != null && findViewByPosition3 != findContainingItemView) {
                        return findViewByPosition3;
                    }
                }
            }
            return null;
        }
        return m11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View o11 = o(false);
            View n11 = n(false);
            if (o11 == null || n11 == null) {
                return;
            }
            int position = getPosition(o11);
            int position2 = getPosition(n11);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
                return;
            }
            accessibilityEvent.setFromIndex(position2);
            accessibilityEvent.setToIndex(position);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsAdded(RecyclerView recyclerView, int i11, int i12) {
        A(i11, i12, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsChanged(RecyclerView recyclerView) {
        this.f5414m.b();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsMoved(RecyclerView recyclerView, int i11, int i12, int i13) {
        A(i11, i12, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsRemoved(RecyclerView recyclerView, int i11, int i12) {
        A(i11, i12, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsUpdated(RecyclerView recyclerView, int i11, int i12, Object obj) {
        A(i11, i12, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onLayoutChildren(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        F(wVar, b0Var, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onLayoutCompleted(RecyclerView.b0 b0Var) {
        super.onLayoutCompleted(b0Var);
        this.f5412k = -1;
        this.f5413l = Integer.MIN_VALUE;
        this.f5418q = null;
        this.f5421t.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof e) {
            e eVar = (e) parcelable;
            this.f5418q = eVar;
            if (this.f5412k != -1) {
                eVar.a();
                this.f5418q.b();
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable onSaveInstanceState() {
        int p11;
        int m11;
        int[] iArr;
        if (this.f5418q != null) {
            return new e(this.f5418q);
        }
        e eVar = new e();
        eVar.f5449h = this.f5409h;
        eVar.f5450i = this.f5416o;
        eVar.f5451j = this.f5417p;
        d dVar = this.f5414m;
        if (dVar != null && (iArr = dVar.f5436a) != null) {
            eVar.f5447f = iArr;
            eVar.f5446e = iArr.length;
            eVar.f5448g = dVar.f5437b;
        } else {
            eVar.f5446e = 0;
        }
        if (getChildCount() > 0) {
            eVar.f5442a = this.f5416o ? u() : t();
            eVar.f5443b = p();
            int i11 = this.f5402a;
            eVar.f5444c = i11;
            eVar.f5445d = new int[i11];
            for (int i12 = 0; i12 < this.f5402a; i12++) {
                if (this.f5416o) {
                    p11 = this.f5403b[i12].l(Integer.MIN_VALUE);
                    if (p11 != Integer.MIN_VALUE) {
                        m11 = this.f5404c.i();
                        p11 -= m11;
                        eVar.f5445d[i12] = p11;
                    } else {
                        eVar.f5445d[i12] = p11;
                    }
                } else {
                    p11 = this.f5403b[i12].p(Integer.MIN_VALUE);
                    if (p11 != Integer.MIN_VALUE) {
                        m11 = this.f5404c.m();
                        p11 -= m11;
                        eVar.f5445d[i12] = p11;
                    } else {
                        eVar.f5445d[i12] = p11;
                    }
                }
            }
        } else {
            eVar.f5442a = -1;
            eVar.f5443b = -1;
            eVar.f5444c = 0;
        }
        return eVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onScrollStateChanged(int i11) {
        if (i11 == 0) {
            g();
        }
    }

    int p() {
        View n11 = this.f5410i ? n(true) : o(true);
        if (n11 == null) {
            return -1;
        }
        return getPosition(n11);
    }

    int scrollBy(int i11, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (getChildCount() == 0 || i11 == 0) {
            return 0;
        }
        H(i11, b0Var);
        int l11 = l(wVar, this.f5408g, b0Var);
        if (this.f5408g.f5679b >= l11) {
            i11 = i11 < 0 ? -l11 : l11;
        }
        this.f5404c.r(-i11);
        this.f5416o = this.f5410i;
        o oVar = this.f5408g;
        oVar.f5679b = 0;
        J(wVar, oVar);
        return i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int scrollHorizontallyBy(int i11, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        return scrollBy(i11, wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void scrollToPosition(int i11) {
        e eVar = this.f5418q;
        if (eVar != null && eVar.f5442a != i11) {
            eVar.a();
        }
        this.f5412k = i11;
        this.f5413l = Integer.MIN_VALUE;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int scrollVerticallyBy(int i11, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        return scrollBy(i11, wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void setMeasuredDimension(Rect rect, int i11, int i12) {
        int chooseSize;
        int chooseSize2;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f5406e == 1) {
            chooseSize2 = RecyclerView.p.chooseSize(i12, rect.height() + paddingTop, getMinimumHeight());
            chooseSize = RecyclerView.p.chooseSize(i11, (this.f5407f * this.f5402a) + paddingLeft, getMinimumWidth());
        } else {
            chooseSize = RecyclerView.p.chooseSize(i11, rect.width() + paddingLeft, getMinimumWidth());
            chooseSize2 = RecyclerView.p.chooseSize(i12, (this.f5407f * this.f5402a) + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    public void setOrientation(int i11) {
        if (i11 != 0 && i11 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i11 == this.f5406e) {
            return;
        }
        this.f5406e = i11;
        t tVar = this.f5404c;
        this.f5404c = this.f5405d;
        this.f5405d = tVar;
        requestLayout();
    }

    public void setReverseLayout(boolean z11) {
        assertNotInLayoutOrScroll(null);
        e eVar = this.f5418q;
        if (eVar != null && eVar.f5449h != z11) {
            eVar.f5449h = z11;
        }
        this.f5409h = z11;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i11) {
        p pVar = new p(recyclerView.getContext());
        pVar.p(i11);
        startSmoothScroll(pVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean supportsPredictiveItemAnimations() {
        return this.f5418q == null;
    }

    int t() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    int u() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new c(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        int[] f5436a;

        /* renamed from: b  reason: collision with root package name */
        List<a> f5437b;

        d() {
        }

        private int i(int i11) {
            if (this.f5437b == null) {
                return -1;
            }
            a f11 = f(i11);
            if (f11 != null) {
                this.f5437b.remove(f11);
            }
            int size = this.f5437b.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    i12 = -1;
                    break;
                } else if (this.f5437b.get(i12).f5438a >= i11) {
                    break;
                } else {
                    i12++;
                }
            }
            if (i12 != -1) {
                this.f5437b.remove(i12);
                return this.f5437b.get(i12).f5438a;
            }
            return -1;
        }

        private void l(int i11, int i12) {
            List<a> list = this.f5437b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f5437b.get(size);
                int i13 = aVar.f5438a;
                if (i13 >= i11) {
                    aVar.f5438a = i13 + i12;
                }
            }
        }

        private void m(int i11, int i12) {
            List<a> list = this.f5437b;
            if (list == null) {
                return;
            }
            int i13 = i11 + i12;
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f5437b.get(size);
                int i14 = aVar.f5438a;
                if (i14 >= i11) {
                    if (i14 < i13) {
                        this.f5437b.remove(size);
                    } else {
                        aVar.f5438a = i14 - i12;
                    }
                }
            }
        }

        public void a(a aVar) {
            if (this.f5437b == null) {
                this.f5437b = new ArrayList();
            }
            int size = this.f5437b.size();
            for (int i11 = 0; i11 < size; i11++) {
                a aVar2 = this.f5437b.get(i11);
                if (aVar2.f5438a == aVar.f5438a) {
                    this.f5437b.remove(i11);
                }
                if (aVar2.f5438a >= aVar.f5438a) {
                    this.f5437b.add(i11, aVar);
                    return;
                }
            }
            this.f5437b.add(aVar);
        }

        void b() {
            int[] iArr = this.f5436a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f5437b = null;
        }

        void c(int i11) {
            int[] iArr = this.f5436a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i11, 10) + 1];
                this.f5436a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i11 >= iArr.length) {
                int[] iArr3 = new int[o(i11)];
                this.f5436a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f5436a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        int d(int i11) {
            List<a> list = this.f5437b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f5437b.get(size).f5438a >= i11) {
                        this.f5437b.remove(size);
                    }
                }
            }
            return h(i11);
        }

        public a e(int i11, int i12, int i13, boolean z11) {
            List<a> list = this.f5437b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                a aVar = this.f5437b.get(i14);
                int i15 = aVar.f5438a;
                if (i15 >= i12) {
                    return null;
                }
                if (i15 >= i11 && (i13 == 0 || aVar.f5439b == i13 || (z11 && aVar.f5441d))) {
                    return aVar;
                }
            }
            return null;
        }

        public a f(int i11) {
            List<a> list = this.f5437b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f5437b.get(size);
                if (aVar.f5438a == i11) {
                    return aVar;
                }
            }
            return null;
        }

        int g(int i11) {
            int[] iArr = this.f5436a;
            if (iArr == null || i11 >= iArr.length) {
                return -1;
            }
            return iArr[i11];
        }

        int h(int i11) {
            int[] iArr = this.f5436a;
            if (iArr != null && i11 < iArr.length) {
                int i12 = i(i11);
                if (i12 == -1) {
                    int[] iArr2 = this.f5436a;
                    Arrays.fill(iArr2, i11, iArr2.length, -1);
                    return this.f5436a.length;
                }
                int min = Math.min(i12 + 1, this.f5436a.length);
                Arrays.fill(this.f5436a, i11, min, -1);
                return min;
            }
            return -1;
        }

        void j(int i11, int i12) {
            int[] iArr = this.f5436a;
            if (iArr == null || i11 >= iArr.length) {
                return;
            }
            int i13 = i11 + i12;
            c(i13);
            int[] iArr2 = this.f5436a;
            System.arraycopy(iArr2, i11, iArr2, i13, (iArr2.length - i11) - i12);
            Arrays.fill(this.f5436a, i11, i13, -1);
            l(i11, i12);
        }

        void k(int i11, int i12) {
            int[] iArr = this.f5436a;
            if (iArr == null || i11 >= iArr.length) {
                return;
            }
            int i13 = i11 + i12;
            c(i13);
            int[] iArr2 = this.f5436a;
            System.arraycopy(iArr2, i13, iArr2, i11, (iArr2.length - i11) - i12);
            int[] iArr3 = this.f5436a;
            Arrays.fill(iArr3, iArr3.length - i12, iArr3.length, -1);
            m(i11, i12);
        }

        void n(int i11, f fVar) {
            c(i11);
            this.f5436a[i11] = fVar.f5456e;
        }

        int o(int i11) {
            int length = this.f5436a.length;
            while (length <= i11) {
                length *= 2;
            }
            return length;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0090a();

            /* renamed from: a  reason: collision with root package name */
            int f5438a;

            /* renamed from: b  reason: collision with root package name */
            int f5439b;

            /* renamed from: c  reason: collision with root package name */
            int[] f5440c;

            /* renamed from: d  reason: collision with root package name */
            boolean f5441d;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            class C0090a implements Parcelable.Creator<a> {
                C0090a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b */
                public a[] newArray(int i11) {
                    return new a[i11];
                }
            }

            a(Parcel parcel) {
                this.f5438a = parcel.readInt();
                this.f5439b = parcel.readInt();
                this.f5441d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f5440c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            int a(int i11) {
                int[] iArr = this.f5440c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i11];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f5438a + ", mGapDir=" + this.f5439b + ", mHasUnwantedGapAfter=" + this.f5441d + ", mGapPerSpan=" + Arrays.toString(this.f5440c) + CoreConstants.CURLY_RIGHT;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i11) {
                parcel.writeInt(this.f5438a);
                parcel.writeInt(this.f5439b);
                parcel.writeInt(this.f5441d ? 1 : 0);
                int[] iArr = this.f5440c;
                if (iArr != null && iArr.length > 0) {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f5440c);
                    return;
                }
                parcel.writeInt(0);
            }

            a() {
            }
        }
    }
}