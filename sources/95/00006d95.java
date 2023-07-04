package f7;

import android.app.Application;
import androidx.lifecycle.l0;
import e7.f;

/* loaded from: classes.dex */
public abstract class a<ConfigurationT extends f> extends androidx.lifecycle.b implements c7.a<ConfigurationT> {

    /* renamed from: a  reason: collision with root package name */
    private final ConfigurationT f25912a;

    /* renamed from: b  reason: collision with root package name */
    private final l0 f25913b;

    public a(l0 l0Var, Application application, ConfigurationT configurationt) {
        super(application);
        this.f25912a = configurationt;
        this.f25913b = l0Var;
    }

    @Override // c7.c
    public ConfigurationT f() {
        return this.f25912a;
    }

    public l0 getSavedStateHandle() {
        return this.f25913b;
    }
}