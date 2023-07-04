package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.f;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e extends RecyclerView.u {

    /* renamed from: a  reason: collision with root package name */
    private f.i f6402a;

    /* renamed from: b  reason: collision with root package name */
    private final f f6403b;

    /* renamed from: c  reason: collision with root package name */
    private final RecyclerView f6404c;

    /* renamed from: d  reason: collision with root package name */
    private final LinearLayoutManager f6405d;

    /* renamed from: e  reason: collision with root package name */
    private int f6406e;

    /* renamed from: f  reason: collision with root package name */
    private int f6407f;

    /* renamed from: g  reason: collision with root package name */
    private a f6408g;

    /* renamed from: h  reason: collision with root package name */
    private int f6409h;

    /* renamed from: i  reason: collision with root package name */
    private int f6410i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f6411j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f6412k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f6413l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f6414m;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        int f6415a;

        /* renamed from: b  reason: collision with root package name */
        float f6416b;

        /* renamed from: c  reason: collision with root package name */
        int f6417c;

        a() {
        }

        void a() {
            this.f6415a = -1;
            this.f6416b = BitmapDescriptorFactory.HUE_RED;
            this.f6417c = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(f fVar) {
        this.f6403b = fVar;
        RecyclerView recyclerView = fVar.f6428j;
        this.f6404c = recyclerView;
        this.f6405d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f6408g = new a();
        l();
    }

    private void a(int i11, float f11, int i12) {
        f.i iVar = this.f6402a;
        if (iVar != null) {
            iVar.b(i11, f11, i12);
        }
    }

    private void b(int i11) {
        f.i iVar = this.f6402a;
        if (iVar != null) {
            iVar.c(i11);
        }
    }

    private void c(int i11) {
        if ((this.f6406e == 3 && this.f6407f == 0) || this.f6407f == i11) {
            return;
        }
        this.f6407f = i11;
        f.i iVar = this.f6402a;
        if (iVar != null) {
            iVar.a(i11);
        }
    }

    private int d() {
        return this.f6405d.findFirstVisibleItemPosition();
    }

    private boolean i() {
        int i11 = this.f6406e;
        return i11 == 1 || i11 == 4;
    }

    private void l() {
        this.f6406e = 0;
        this.f6407f = 0;
        this.f6408g.a();
        this.f6409h = -1;
        this.f6410i = -1;
        this.f6411j = false;
        this.f6412k = false;
        this.f6414m = false;
        this.f6413l = false;
    }

    private void n(boolean z11) {
        this.f6414m = z11;
        this.f6406e = z11 ? 4 : 1;
        int i11 = this.f6410i;
        if (i11 != -1) {
            this.f6409h = i11;
            this.f6410i = -1;
        } else if (this.f6409h == -1) {
            this.f6409h = d();
        }
        c(1);
    }

    private void o() {
        int top;
        a aVar = this.f6408g;
        int findFirstVisibleItemPosition = this.f6405d.findFirstVisibleItemPosition();
        aVar.f6415a = findFirstVisibleItemPosition;
        if (findFirstVisibleItemPosition == -1) {
            aVar.a();
            return;
        }
        View findViewByPosition = this.f6405d.findViewByPosition(findFirstVisibleItemPosition);
        if (findViewByPosition == null) {
            aVar.a();
            return;
        }
        int leftDecorationWidth = this.f6405d.getLeftDecorationWidth(findViewByPosition);
        int rightDecorationWidth = this.f6405d.getRightDecorationWidth(findViewByPosition);
        int topDecorationHeight = this.f6405d.getTopDecorationHeight(findViewByPosition);
        int bottomDecorationHeight = this.f6405d.getBottomDecorationHeight(findViewByPosition);
        ViewGroup.LayoutParams layoutParams = findViewByPosition.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            leftDecorationWidth += marginLayoutParams.leftMargin;
            rightDecorationWidth += marginLayoutParams.rightMargin;
            topDecorationHeight += marginLayoutParams.topMargin;
            bottomDecorationHeight += marginLayoutParams.bottomMargin;
        }
        int height = findViewByPosition.getHeight() + topDecorationHeight + bottomDecorationHeight;
        int width = findViewByPosition.getWidth() + leftDecorationWidth + rightDecorationWidth;
        if (this.f6405d.getOrientation() == 0) {
            top = (findViewByPosition.getLeft() - leftDecorationWidth) - this.f6404c.getPaddingLeft();
            if (this.f6403b.d()) {
                top = -top;
            }
            height = width;
        } else {
            top = (findViewByPosition.getTop() - topDecorationHeight) - this.f6404c.getPaddingTop();
        }
        int i11 = -top;
        aVar.f6417c = i11;
        if (i11 < 0) {
            if (new androidx.viewpager2.widget.a(this.f6405d).d()) {
                throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
            }
            throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(aVar.f6417c)));
        }
        aVar.f6416b = height == 0 ? BitmapDescriptorFactory.HUE_RED : i11 / height;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double e() {
        o();
        a aVar = this.f6408g;
        return aVar.f6415a + aVar.f6416b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.f6407f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g() {
        return this.f6414m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h() {
        return this.f6407f == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        this.f6413l = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(int i11, boolean z11) {
        this.f6406e = z11 ? 2 : 3;
        this.f6414m = false;
        boolean z12 = this.f6410i != i11;
        this.f6410i = i11;
        c(2);
        if (z12) {
            b(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(f.i iVar) {
        this.f6402a = iVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void onScrollStateChanged(RecyclerView recyclerView, int i11) {
        boolean z11 = true;
        if ((this.f6406e != 1 || this.f6407f != 1) && i11 == 1) {
            n(false);
        } else if (i() && i11 == 2) {
            if (this.f6412k) {
                c(2);
                this.f6411j = true;
            }
        } else {
            if (i() && i11 == 0) {
                o();
                if (!this.f6412k) {
                    int i12 = this.f6408g.f6415a;
                    if (i12 != -1) {
                        a(i12, BitmapDescriptorFactory.HUE_RED, 0);
                    }
                } else {
                    a aVar = this.f6408g;
                    if (aVar.f6417c == 0) {
                        int i13 = this.f6409h;
                        int i14 = aVar.f6415a;
                        if (i13 != i14) {
                            b(i14);
                        }
                    } else {
                        z11 = false;
                    }
                }
                if (z11) {
                    c(0);
                    l();
                }
            }
            if (this.f6406e == 2 && i11 == 0 && this.f6413l) {
                o();
                a aVar2 = this.f6408g;
                if (aVar2.f6417c == 0) {
                    int i15 = this.f6410i;
                    int i16 = aVar2.f6415a;
                    if (i15 != i16) {
                        if (i16 == -1) {
                            i16 = 0;
                        }
                        b(i16);
                    }
                    c(0);
                    l();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        if ((r5 < 0) == r3.f6403b.d()) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    @Override // androidx.recyclerview.widget.RecyclerView.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onScrolled(androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 1
            r3.f6412k = r4
            r3.o()
            boolean r0 = r3.f6411j
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L3d
            r3.f6411j = r2
            if (r6 > 0) goto L22
            if (r6 != 0) goto L20
            if (r5 >= 0) goto L16
            r5 = r4
            goto L17
        L16:
            r5 = r2
        L17:
            androidx.viewpager2.widget.f r6 = r3.f6403b
            boolean r6 = r6.d()
            if (r5 != r6) goto L20
            goto L22
        L20:
            r5 = r2
            goto L23
        L22:
            r5 = r4
        L23:
            if (r5 == 0) goto L2f
            androidx.viewpager2.widget.e$a r5 = r3.f6408g
            int r6 = r5.f6417c
            if (r6 == 0) goto L2f
            int r5 = r5.f6415a
            int r5 = r5 + r4
            goto L33
        L2f:
            androidx.viewpager2.widget.e$a r5 = r3.f6408g
            int r5 = r5.f6415a
        L33:
            r3.f6410i = r5
            int r6 = r3.f6409h
            if (r6 == r5) goto L4b
            r3.b(r5)
            goto L4b
        L3d:
            int r5 = r3.f6406e
            if (r5 != 0) goto L4b
            androidx.viewpager2.widget.e$a r5 = r3.f6408g
            int r5 = r5.f6415a
            if (r5 != r1) goto L48
            r5 = r2
        L48:
            r3.b(r5)
        L4b:
            androidx.viewpager2.widget.e$a r5 = r3.f6408g
            int r6 = r5.f6415a
            if (r6 != r1) goto L52
            r6 = r2
        L52:
            float r0 = r5.f6416b
            int r5 = r5.f6417c
            r3.a(r6, r0, r5)
            androidx.viewpager2.widget.e$a r5 = r3.f6408g
            int r6 = r5.f6415a
            int r0 = r3.f6410i
            if (r6 == r0) goto L63
            if (r0 != r1) goto L71
        L63:
            int r5 = r5.f6417c
            if (r5 != 0) goto L71
            int r5 = r3.f6407f
            if (r5 == r4) goto L71
            r3.c(r2)
            r3.l()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.e.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}