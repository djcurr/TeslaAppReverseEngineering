package androidx.compose.ui.platform;

import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: e  reason: collision with root package name */
    private static d f2868e;

    /* renamed from: c  reason: collision with root package name */
    private n2.w f2871c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f2867d = new a(null);

    /* renamed from: f  reason: collision with root package name */
    private static final w2.c f2869f = w2.c.Rtl;

    /* renamed from: g  reason: collision with root package name */
    private static final w2.c f2870g = w2.c.Ltr;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a() {
            if (d.f2868e == null) {
                d.f2868e = new d(null);
            }
            d dVar = d.f2868e;
            Objects.requireNonNull(dVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
            return dVar;
        }
    }

    private d() {
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final int i(int i11, w2.c cVar) {
        n2.w wVar = this.f2871c;
        n2.w wVar2 = null;
        if (wVar == null) {
            kotlin.jvm.internal.s.x("layoutResult");
            wVar = null;
        }
        int t11 = wVar.t(i11);
        n2.w wVar3 = this.f2871c;
        if (wVar3 == null) {
            kotlin.jvm.internal.s.x("layoutResult");
            wVar3 = null;
        }
        if (cVar != wVar3.x(t11)) {
            n2.w wVar4 = this.f2871c;
            if (wVar4 == null) {
                kotlin.jvm.internal.s.x("layoutResult");
            } else {
                wVar2 = wVar4;
            }
            return wVar2.t(i11);
        }
        n2.w wVar5 = this.f2871c;
        if (wVar5 == null) {
            kotlin.jvm.internal.s.x("layoutResult");
            wVar5 = null;
        }
        return n2.w.o(wVar5, i11, false, 2, null) - 1;
    }

    @Override // androidx.compose.ui.platform.g
    public int[] a(int i11) {
        int i12;
        if (d().length() > 0 && i11 < d().length()) {
            if (i11 < 0) {
                n2.w wVar = this.f2871c;
                if (wVar == null) {
                    kotlin.jvm.internal.s.x("layoutResult");
                    wVar = null;
                }
                i12 = wVar.p(0);
            } else {
                n2.w wVar2 = this.f2871c;
                if (wVar2 == null) {
                    kotlin.jvm.internal.s.x("layoutResult");
                    wVar2 = null;
                }
                int p11 = wVar2.p(i11);
                i12 = i(p11, f2869f) == i11 ? p11 : p11 + 1;
            }
            n2.w wVar3 = this.f2871c;
            if (wVar3 == null) {
                kotlin.jvm.internal.s.x("layoutResult");
                wVar3 = null;
            }
            if (i12 >= wVar3.m()) {
                return null;
            }
            return c(i(i12, f2869f), i(i12, f2870g) + 1);
        }
        return null;
    }

    @Override // androidx.compose.ui.platform.g
    public int[] b(int i11) {
        int i12;
        if (d().length() > 0 && i11 > 0) {
            if (i11 > d().length()) {
                n2.w wVar = this.f2871c;
                if (wVar == null) {
                    kotlin.jvm.internal.s.x("layoutResult");
                    wVar = null;
                }
                i12 = wVar.p(d().length());
            } else {
                n2.w wVar2 = this.f2871c;
                if (wVar2 == null) {
                    kotlin.jvm.internal.s.x("layoutResult");
                    wVar2 = null;
                }
                int p11 = wVar2.p(i11);
                i12 = i(p11, f2870g) + 1 == i11 ? p11 : p11 - 1;
            }
            if (i12 < 0) {
                return null;
            }
            return c(i(i12, f2869f), i(i12, f2870g) + 1);
        }
        return null;
    }

    public final void j(String text, n2.w layoutResult) {
        kotlin.jvm.internal.s.g(text, "text");
        kotlin.jvm.internal.s.g(layoutResult, "layoutResult");
        f(text);
        this.f2871c = layoutResult;
    }
}