package b1;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import t1.a0;
import t1.c0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class r extends RippleDrawable {

    /* renamed from: e  reason: collision with root package name */
    public static final a f7276e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    private static Method f7277f;

    /* renamed from: g  reason: collision with root package name */
    private static boolean f7278g;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f7279a;

    /* renamed from: b  reason: collision with root package name */
    private a0 f7280b;

    /* renamed from: c  reason: collision with root package name */
    private Integer f7281c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f7282d;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes.dex */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f7283a = new b();

        private b() {
        }

        public final void a(RippleDrawable ripple, int i11) {
            s.g(ripple, "ripple");
            ripple.setRadius(i11);
        }
    }

    public r(boolean z11) {
        super(ColorStateList.valueOf(-16777216), null, z11 ? new ColorDrawable(-1) : null);
        this.f7279a = z11;
    }

    private final long a(long j11, float f11) {
        float h11;
        if (Build.VERSION.SDK_INT < 28) {
            f11 *= 2;
        }
        h11 = m00.l.h(f11, 1.0f);
        return a0.l(j11, h11, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
    }

    public final void b(long j11, float f11) {
        long a11 = a(j11, f11);
        a0 a0Var = this.f7280b;
        if (a0Var == null ? false : a0.n(a0Var.v(), a11)) {
            return;
        }
        this.f7280b = a0.h(a11);
        setColor(ColorStateList.valueOf(c0.j(a11)));
    }

    public final void c(int i11) {
        Integer num = this.f7281c;
        if (num != null && num.intValue() == i11) {
            return;
        }
        this.f7281c = Integer.valueOf(i11);
        if (Build.VERSION.SDK_INT < 23) {
            try {
                if (!f7278g) {
                    f7278g = true;
                    f7277f = RippleDrawable.class.getDeclaredMethod("setMaxRadius", Integer.TYPE);
                }
                Method method = f7277f;
                if (method == null) {
                    return;
                }
                method.invoke(this, Integer.valueOf(i11));
                return;
            } catch (Exception unused) {
                return;
            }
        }
        b.f7283a.a(this, i11);
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        if (!this.f7279a) {
            this.f7282d = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        s.f(dirtyBounds, "super.getDirtyBounds()");
        this.f7282d = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public boolean isProjected() {
        return this.f7282d;
    }
}