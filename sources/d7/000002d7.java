package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class z0 extends Resources {

    /* renamed from: b  reason: collision with root package name */
    private static boolean f2033b = false;

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<Context> f2034a;

    public z0(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f2034a = new WeakReference<>(context);
    }

    public static boolean a() {
        return f2033b;
    }

    public static boolean b() {
        return a() && Build.VERSION.SDK_INT <= 20;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Drawable c(int i11) {
        return super.getDrawable(i11);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i11) {
        Context context = this.f2034a.get();
        if (context != null) {
            return k0.h().t(context, this, i11);
        }
        return super.getDrawable(i11);
    }
}