package l;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ViewConfiguration;
import g.j;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private Context f35933a;

    private a(Context context) {
        this.f35933a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.f35933a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f35933a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f35933a.getResources().getConfiguration();
        int i11 = configuration.screenWidthDp;
        int i12 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i11 > 600) {
            return 5;
        }
        if (i11 <= 960 || i12 <= 720) {
            if (i11 <= 720 || i12 <= 960) {
                if (i11 < 500) {
                    if (i11 <= 640 || i12 <= 480) {
                        if (i11 <= 480 || i12 <= 640) {
                            return i11 >= 360 ? 3 : 2;
                        }
                        return 4;
                    }
                    return 4;
                }
                return 4;
            }
            return 5;
        }
        return 5;
    }

    public int e() {
        return this.f35933a.getResources().getDimensionPixelSize(g.d.f27075b);
    }

    public int f() {
        TypedArray obtainStyledAttributes = this.f35933a.obtainStyledAttributes(null, j.f27179a, g.a.f27041c, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(j.f27224j, 0);
        Resources resources = this.f35933a.getResources();
        if (!g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(g.d.f27074a));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean g() {
        return this.f35933a.getResources().getBoolean(g.b.f27065a);
    }

    public boolean h() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.f35933a).hasPermanentMenuKey();
    }
}