package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;

/* loaded from: classes.dex */
public class d extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    private int f35936a;

    /* renamed from: b  reason: collision with root package name */
    private Resources.Theme f35937b;

    /* renamed from: c  reason: collision with root package name */
    private LayoutInflater f35938c;

    /* renamed from: d  reason: collision with root package name */
    private Configuration f35939d;

    /* renamed from: e  reason: collision with root package name */
    private Resources f35940e;

    public d() {
        super(null);
    }

    private Resources b() {
        if (this.f35940e == null) {
            Configuration configuration = this.f35939d;
            if (configuration == null) {
                this.f35940e = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                this.f35940e = createConfigurationContext(configuration).getResources();
            } else {
                Resources resources = super.getResources();
                Configuration configuration2 = new Configuration(resources.getConfiguration());
                configuration2.updateFrom(this.f35939d);
                this.f35940e = new Resources(resources.getAssets(), resources.getDisplayMetrics(), configuration2);
            }
        }
        return this.f35940e;
    }

    private void d() {
        boolean z11 = this.f35937b == null;
        if (z11) {
            this.f35937b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f35937b.setTo(theme);
            }
        }
        e(this.f35937b, this.f35936a, z11);
    }

    public void a(Configuration configuration) {
        if (this.f35940e == null) {
            if (this.f35939d == null) {
                this.f35939d = new Configuration(configuration);
                return;
            }
            throw new IllegalStateException("Override configuration has already been set");
        }
        throw new IllegalStateException("getResources() or getAssets() has already been called");
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.f35936a;
    }

    protected void e(Resources.Theme theme, int i11, boolean z11) {
        theme.applyStyle(i11, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f35938c == null) {
                this.f35938c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f35938c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f35937b;
        if (theme != null) {
            return theme;
        }
        if (this.f35936a == 0) {
            this.f35936a = g.i.f27178d;
        }
        d();
        return this.f35937b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i11) {
        if (this.f35936a != i11) {
            this.f35936a = i11;
            d();
        }
    }

    public d(Context context, int i11) {
        super(context);
        this.f35936a = i11;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f35937b = theme;
    }
}