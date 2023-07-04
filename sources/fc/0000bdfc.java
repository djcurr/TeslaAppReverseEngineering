package x0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class e implements androidx.compose.ui.window.m {

    /* renamed from: a  reason: collision with root package name */
    private final f f56566a;

    /* renamed from: b  reason: collision with root package name */
    private final long f56567b;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f56568a;

        static {
            int[] iArr = new int[f.values().length];
            iArr[f.TopLeft.ordinal()] = 1;
            iArr[f.TopRight.ordinal()] = 2;
            iArr[f.TopMiddle.ordinal()] = 3;
            f56568a = iArr;
        }
    }

    private e(f fVar, long j11) {
        this.f56566a = fVar;
        this.f56567b = j11;
    }

    public /* synthetic */ e(f fVar, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, j11);
    }

    @Override // androidx.compose.ui.window.m
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo4calculatePositionllwVHH4(x2.m anchorBounds, long j11, x2.q layoutDirection, long j12) {
        kotlin.jvm.internal.s.g(anchorBounds, "anchorBounds");
        kotlin.jvm.internal.s.g(layoutDirection, "layoutDirection");
        int i11 = a.f56568a[this.f56566a.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return x2.l.a((anchorBounds.c() + x2.k.h(this.f56567b)) - (x2.o.g(j12) / 2), anchorBounds.e() + x2.k.i(this.f56567b));
                }
                throw new NoWhenBranchMatchedException();
            }
            return x2.l.a((anchorBounds.c() + x2.k.h(this.f56567b)) - x2.o.g(j12), anchorBounds.e() + x2.k.i(this.f56567b));
        }
        return x2.l.a(anchorBounds.c() + x2.k.h(this.f56567b), anchorBounds.e() + x2.k.i(this.f56567b));
    }
}