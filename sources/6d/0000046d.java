package androidx.compose.ui.platform;

import android.graphics.Rect;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class e extends b {

    /* renamed from: f  reason: collision with root package name */
    private static e f2895f;

    /* renamed from: c  reason: collision with root package name */
    private n2.w f2898c;

    /* renamed from: d  reason: collision with root package name */
    private l2.p f2899d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f2894e = new a(null);

    /* renamed from: g  reason: collision with root package name */
    private static final w2.c f2896g = w2.c.Rtl;

    /* renamed from: h  reason: collision with root package name */
    private static final w2.c f2897h = w2.c.Ltr;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a() {
            if (e.f2895f == null) {
                e.f2895f = new e(null);
            }
            e eVar = e.f2895f;
            Objects.requireNonNull(eVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
            return eVar;
        }
    }

    private e() {
        new Rect();
    }

    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final int i(int i11, w2.c cVar) {
        n2.w wVar = this.f2898c;
        n2.w wVar2 = null;
        if (wVar == null) {
            kotlin.jvm.internal.s.x("layoutResult");
            wVar = null;
        }
        int t11 = wVar.t(i11);
        n2.w wVar3 = this.f2898c;
        if (wVar3 == null) {
            kotlin.jvm.internal.s.x("layoutResult");
            wVar3 = null;
        }
        if (cVar != wVar3.x(t11)) {
            n2.w wVar4 = this.f2898c;
            if (wVar4 == null) {
                kotlin.jvm.internal.s.x("layoutResult");
            } else {
                wVar2 = wVar4;
            }
            return wVar2.t(i11);
        }
        n2.w wVar5 = this.f2898c;
        if (wVar5 == null) {
            kotlin.jvm.internal.s.x("layoutResult");
            wVar5 = null;
        }
        return n2.w.o(wVar5, i11, false, 2, null) - 1;
    }

    @Override // androidx.compose.ui.platform.g
    public int[] a(int i11) {
        int c11;
        int d11;
        int m11;
        n2.w wVar = null;
        if (d().length() > 0 && i11 < d().length()) {
            try {
                l2.p pVar = this.f2899d;
                if (pVar == null) {
                    kotlin.jvm.internal.s.x("node");
                    pVar = null;
                }
                c11 = j00.c.c(pVar.f().h());
                d11 = m00.l.d(0, i11);
                n2.w wVar2 = this.f2898c;
                if (wVar2 == null) {
                    kotlin.jvm.internal.s.x("layoutResult");
                    wVar2 = null;
                }
                int p11 = wVar2.p(d11);
                n2.w wVar3 = this.f2898c;
                if (wVar3 == null) {
                    kotlin.jvm.internal.s.x("layoutResult");
                    wVar3 = null;
                }
                float u11 = wVar3.u(p11) + c11;
                n2.w wVar4 = this.f2898c;
                if (wVar4 == null) {
                    kotlin.jvm.internal.s.x("layoutResult");
                    wVar4 = null;
                }
                n2.w wVar5 = this.f2898c;
                if (wVar5 == null) {
                    kotlin.jvm.internal.s.x("layoutResult");
                    wVar5 = null;
                }
                if (u11 < wVar4.u(wVar5.m() - 1)) {
                    n2.w wVar6 = this.f2898c;
                    if (wVar6 == null) {
                        kotlin.jvm.internal.s.x("layoutResult");
                    } else {
                        wVar = wVar6;
                    }
                    m11 = wVar.q(u11);
                } else {
                    n2.w wVar7 = this.f2898c;
                    if (wVar7 == null) {
                        kotlin.jvm.internal.s.x("layoutResult");
                    } else {
                        wVar = wVar7;
                    }
                    m11 = wVar.m();
                }
                return c(d11, i(m11 - 1, f2897h) + 1);
            } catch (IllegalStateException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // androidx.compose.ui.platform.g
    public int[] b(int i11) {
        int c11;
        int i12;
        int i13;
        n2.w wVar = null;
        if (d().length() > 0 && i11 > 0) {
            try {
                l2.p pVar = this.f2899d;
                if (pVar == null) {
                    kotlin.jvm.internal.s.x("node");
                    pVar = null;
                }
                c11 = j00.c.c(pVar.f().h());
                i12 = m00.l.i(d().length(), i11);
                n2.w wVar2 = this.f2898c;
                if (wVar2 == null) {
                    kotlin.jvm.internal.s.x("layoutResult");
                    wVar2 = null;
                }
                int p11 = wVar2.p(i12);
                n2.w wVar3 = this.f2898c;
                if (wVar3 == null) {
                    kotlin.jvm.internal.s.x("layoutResult");
                    wVar3 = null;
                }
                float u11 = wVar3.u(p11) - c11;
                if (u11 > BitmapDescriptorFactory.HUE_RED) {
                    n2.w wVar4 = this.f2898c;
                    if (wVar4 == null) {
                        kotlin.jvm.internal.s.x("layoutResult");
                    } else {
                        wVar = wVar4;
                    }
                    i13 = wVar.q(u11);
                } else {
                    i13 = 0;
                }
                if (i12 == d().length() && i13 < p11) {
                    i13++;
                }
                return c(i(i13, f2896g), i12);
            } catch (IllegalStateException unused) {
                return null;
            }
        }
        return null;
    }

    public final void j(String text, n2.w layoutResult, l2.p node) {
        kotlin.jvm.internal.s.g(text, "text");
        kotlin.jvm.internal.s.g(layoutResult, "layoutResult");
        kotlin.jvm.internal.s.g(node, "node");
        f(text);
        this.f2898c = layoutResult;
        this.f2899d = node;
    }
}