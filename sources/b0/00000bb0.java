package b1;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import t1.v0;
import vz.b0;

/* loaded from: classes.dex */
public final class l extends View {

    /* renamed from: f */
    private static final int[] f7248f;

    /* renamed from: g */
    private static final int[] f7249g;

    /* renamed from: a */
    private r f7250a;

    /* renamed from: b */
    private Boolean f7251b;

    /* renamed from: c */
    private Long f7252c;

    /* renamed from: d */
    private Runnable f7253d;

    /* renamed from: e */
    private h00.a<b0> f7254e;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
        f7248f = new int[]{16842919, 16842910};
        f7249g = new int[0];
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context) {
        super(context);
        s.g(context, "context");
    }

    public static /* synthetic */ void a(l lVar) {
        m8setRippleState$lambda2(lVar);
    }

    private final void c(boolean z11) {
        r rVar = new r(z11);
        setBackground(rVar);
        this.f7250a = rVar;
    }

    private final void setRippleState(boolean z11) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f7253d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l11 = this.f7252c;
        long longValue = currentAnimationTimeMillis - (l11 == null ? 0L : l11.longValue());
        if (!z11 && longValue < 5) {
            Runnable runnable2 = new Runnable() { // from class: b1.k
                {
                    l.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    l.a(l.this);
                }
            };
            this.f7253d = runnable2;
            postDelayed(runnable2, 50L);
        } else {
            int[] iArr = z11 ? f7248f : f7249g;
            r rVar = this.f7250a;
            if (rVar != null) {
                rVar.setState(iArr);
            }
        }
        this.f7252c = Long.valueOf(currentAnimationTimeMillis);
    }

    /* renamed from: setRippleState$lambda-2 */
    public static final void m8setRippleState$lambda2(l this$0) {
        s.g(this$0, "this$0");
        r rVar = this$0.f7250a;
        if (rVar != null) {
            rVar.setState(f7249g);
        }
        this$0.f7253d = null;
    }

    public final void b(o0.p interaction, boolean z11, long j11, int i11, long j12, float f11, h00.a<b0> onInvalidateRipple) {
        s.g(interaction, "interaction");
        s.g(onInvalidateRipple, "onInvalidateRipple");
        if (this.f7250a == null || !s.c(Boolean.valueOf(z11), this.f7251b)) {
            c(z11);
            this.f7251b = Boolean.valueOf(z11);
        }
        r rVar = this.f7250a;
        s.e(rVar);
        this.f7254e = onInvalidateRipple;
        f(j11, i11, j12, f11);
        if (z11) {
            rVar.setHotspot(s1.f.l(interaction.a()), s1.f.m(interaction.a()));
        } else {
            rVar.setHotspot(rVar.getBounds().centerX(), rVar.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void d() {
        this.f7254e = null;
        Runnable runnable = this.f7253d;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.f7253d;
            s.e(runnable2);
            runnable2.run();
        } else {
            r rVar = this.f7250a;
            if (rVar != null) {
                rVar.setState(f7249g);
            }
        }
        r rVar2 = this.f7250a;
        if (rVar2 == null) {
            return;
        }
        rVar2.setVisible(false, false);
        unscheduleDrawable(rVar2);
    }

    public final void e() {
        setRippleState(false);
    }

    public final void f(long j11, int i11, long j12, float f11) {
        r rVar = this.f7250a;
        if (rVar == null) {
            return;
        }
        rVar.c(i11);
        rVar.b(j12, f11);
        Rect a11 = v0.a(s1.m.c(j11));
        setLeft(a11.left);
        setTop(a11.top);
        setRight(a11.right);
        setBottom(a11.bottom);
        rVar.setBounds(a11);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable who) {
        s.g(who, "who");
        h00.a<b0> aVar = this.f7254e;
        if (aVar == null) {
            return;
        }
        aVar.invoke();
    }

    @Override // android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void refreshDrawableState() {
    }
}