package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class r0 extends ContextWrapper {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f1917c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static ArrayList<WeakReference<r0>> f1918d;

    /* renamed from: a  reason: collision with root package name */
    private final Resources f1919a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources.Theme f1920b;

    private r0(Context context) {
        super(context);
        if (z0.b()) {
            z0 z0Var = new z0(this, context.getResources());
            this.f1919a = z0Var;
            Resources.Theme newTheme = z0Var.newTheme();
            this.f1920b = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.f1919a = new t0(this, context.getResources());
        this.f1920b = null;
    }

    private static boolean a(Context context) {
        if ((context instanceof r0) || (context.getResources() instanceof t0) || (context.getResources() instanceof z0)) {
            return false;
        }
        return Build.VERSION.SDK_INT < 21 || z0.b();
    }

    public static Context b(Context context) {
        if (a(context)) {
            synchronized (f1917c) {
                ArrayList<WeakReference<r0>> arrayList = f1918d;
                if (arrayList == null) {
                    f1918d = new ArrayList<>();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference<r0> weakReference = f1918d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f1918d.remove(size);
                        }
                    }
                    for (int size2 = f1918d.size() - 1; size2 >= 0; size2--) {
                        WeakReference<r0> weakReference2 = f1918d.get(size2);
                        r0 r0Var = weakReference2 != null ? weakReference2.get() : null;
                        if (r0Var != null && r0Var.getBaseContext() == context) {
                            return r0Var;
                        }
                    }
                }
                r0 r0Var2 = new r0(context);
                f1918d.add(new WeakReference<>(r0Var2));
                return r0Var2;
            }
        }
        return context;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f1919a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f1919a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1920b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i11) {
        Resources.Theme theme = this.f1920b;
        if (theme == null) {
            super.setTheme(i11);
        } else {
            theme.applyStyle(i11, true);
        }
    }
}