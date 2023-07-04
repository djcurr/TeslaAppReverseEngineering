package com.stripe.android.ui.core.elements.menu;

import androidx.compose.ui.window.m;
import ch.qos.logback.core.CoreConstants;
import h00.p;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import u20.h;
import u20.n;
import vz.b0;
import x2.d;
import x2.i;
import x2.l;
import x2.o;
import x2.q;

/* loaded from: classes6.dex */
public final class DropdownMenuPositionProvider implements m {
    private final long contentOffset;
    private final d density;
    private final p<x2.m, x2.m, b0> onPositionCalculated;

    /* renamed from: com.stripe.android.ui.core.elements.menu.DropdownMenuPositionProvider$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass1 extends u implements p<x2.m, x2.m, b0> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(2);
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ b0 invoke(x2.m mVar, x2.m mVar2) {
            invoke2(mVar, mVar2);
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(x2.m noName_0, x2.m noName_1) {
            s.g(noName_0, "$noName_0");
            s.g(noName_1, "$noName_1");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DropdownMenuPositionProvider(long j11, d dVar, p<? super x2.m, ? super x2.m, b0> pVar) {
        this.contentOffset = j11;
        this.density = dVar;
        this.onPositionCalculated = pVar;
    }

    public /* synthetic */ DropdownMenuPositionProvider(long j11, d dVar, p pVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, dVar, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-rOJDEFc$default  reason: not valid java name */
    public static /* synthetic */ DropdownMenuPositionProvider m498copyrOJDEFc$default(DropdownMenuPositionProvider dropdownMenuPositionProvider, long j11, d dVar, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = dropdownMenuPositionProvider.contentOffset;
        }
        if ((i11 & 2) != 0) {
            dVar = dropdownMenuPositionProvider.density;
        }
        if ((i11 & 4) != 0) {
            pVar = dropdownMenuPositionProvider.onPositionCalculated;
        }
        return dropdownMenuPositionProvider.m500copyrOJDEFc(j11, dVar, pVar);
    }

    @Override // androidx.compose.ui.window.m
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo4calculatePositionllwVHH4(x2.m anchorBounds, long j11, q layoutDirection, long j12) {
        h l11;
        Object obj;
        Object obj2;
        h l12;
        boolean z11;
        boolean z12;
        s.g(anchorBounds, "anchorBounds");
        s.g(layoutDirection, "layoutDirection");
        int G = this.density.G(MenuKt.getMenuVerticalMargin());
        int G2 = this.density.G(i.f(m501getContentOffsetRKDOV3M()));
        int G3 = this.density.G(i.g(m501getContentOffsetRKDOV3M()));
        int c11 = anchorBounds.c() + G2;
        int d11 = (anchorBounds.d() - G2) - o.g(j12);
        int g11 = o.g(j11) - o.g(j12);
        if (layoutDirection == q.Ltr) {
            Integer[] numArr = new Integer[3];
            numArr[0] = Integer.valueOf(c11);
            numArr[1] = Integer.valueOf(d11);
            if (anchorBounds.c() < 0) {
                g11 = 0;
            }
            numArr[2] = Integer.valueOf(g11);
            l11 = n.l(numArr);
        } else {
            Integer[] numArr2 = new Integer[3];
            numArr2[0] = Integer.valueOf(d11);
            numArr2[1] = Integer.valueOf(c11);
            if (anchorBounds.d() <= o.g(j11)) {
                g11 = 0;
            }
            numArr2[2] = Integer.valueOf(g11);
            l11 = n.l(numArr2);
        }
        Iterator it2 = l11.iterator();
        while (true) {
            obj = null;
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            int intValue = ((Number) obj2).intValue();
            if (intValue < 0 || intValue + o.g(j12) > o.g(j11)) {
                z12 = false;
                continue;
            } else {
                z12 = true;
                continue;
            }
            if (z12) {
                break;
            }
        }
        Integer num = (Integer) obj2;
        if (num != null) {
            d11 = num.intValue();
        }
        int max = Math.max(anchorBounds.a() + G3, G);
        int e11 = (anchorBounds.e() - G3) - o.f(j12);
        l12 = n.l(Integer.valueOf(max), Integer.valueOf(e11), Integer.valueOf(anchorBounds.e() - (o.f(j12) / 2)), Integer.valueOf((o.f(j11) - o.f(j12)) - G));
        Iterator it3 = l12.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            int intValue2 = ((Number) next).intValue();
            if (intValue2 < G || intValue2 + o.f(j12) > o.f(j11) - G) {
                z11 = false;
                continue;
            } else {
                z11 = true;
                continue;
            }
            if (z11) {
                obj = next;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            e11 = num2.intValue();
        }
        this.onPositionCalculated.invoke(anchorBounds, new x2.m(d11, e11, o.g(j12) + d11, o.f(j12) + e11));
        return l.a(d11, e11);
    }

    /* renamed from: component1-RKDOV3M  reason: not valid java name */
    public final long m499component1RKDOV3M() {
        return this.contentOffset;
    }

    public final d component2() {
        return this.density;
    }

    public final p<x2.m, x2.m, b0> component3() {
        return this.onPositionCalculated;
    }

    /* renamed from: copy-rOJDEFc  reason: not valid java name */
    public final DropdownMenuPositionProvider m500copyrOJDEFc(long j11, d density, p<? super x2.m, ? super x2.m, b0> onPositionCalculated) {
        s.g(density, "density");
        s.g(onPositionCalculated, "onPositionCalculated");
        return new DropdownMenuPositionProvider(j11, density, onPositionCalculated, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DropdownMenuPositionProvider) {
            DropdownMenuPositionProvider dropdownMenuPositionProvider = (DropdownMenuPositionProvider) obj;
            return i.e(this.contentOffset, dropdownMenuPositionProvider.contentOffset) && s.c(this.density, dropdownMenuPositionProvider.density) && s.c(this.onPositionCalculated, dropdownMenuPositionProvider.onPositionCalculated);
        }
        return false;
    }

    /* renamed from: getContentOffset-RKDOV3M  reason: not valid java name */
    public final long m501getContentOffsetRKDOV3M() {
        return this.contentOffset;
    }

    public final d getDensity() {
        return this.density;
    }

    public final p<x2.m, x2.m, b0> getOnPositionCalculated() {
        return this.onPositionCalculated;
    }

    public int hashCode() {
        return (((i.h(this.contentOffset) * 31) + this.density.hashCode()) * 31) + this.onPositionCalculated.hashCode();
    }

    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) i.i(this.contentOffset)) + ", density=" + this.density + ", onPositionCalculated=" + this.onPositionCalculated + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ DropdownMenuPositionProvider(long j11, d dVar, p pVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, dVar, (i11 & 4) != 0 ? AnonymousClass1.INSTANCE : pVar, null);
    }
}