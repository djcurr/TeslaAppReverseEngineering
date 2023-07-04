package com.adyen.checkout.components.ui.view;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.lifecycle.v;
import c7.e;
import c7.i;
import e7.f;
import e7.j;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class a<OutputDataT extends j, ConfigurationT extends f, ComponentStateT, ComponentT extends i<OutputDataT, ConfigurationT, ComponentStateT>> extends LinearLayout implements e<OutputDataT, ComponentT> {

    /* renamed from: a  reason: collision with root package name */
    private ComponentT f9571a;

    /* renamed from: b  reason: collision with root package name */
    protected Context f9572b;

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void d(Locale locale) {
        Configuration configuration = new Configuration(getContext().getResources().getConfiguration());
        configuration.setLocale(locale);
        this.f9572b = getContext().createConfigurationContext(configuration);
    }

    public void c(ComponentT componentt, v vVar) {
        this.f9571a = componentt;
        b();
        d(this.f9571a.f().c());
        a();
        e(this.f9572b);
        setVisibility(0);
        this.f9571a.b(getContext());
        f(vVar);
    }

    protected abstract void e(Context context);

    protected abstract void f(v vVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public ComponentT getComponent() {
        ComponentT componentt = this.f9571a;
        if (componentt != null) {
            return componentt;
        }
        throw new RuntimeException("Should not get Component before it's attached");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Context getLocalizedContext() {
        return this.f9572b;
    }

    public a(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        setVisibility(isInEditMode() ? 0 : 8);
    }
}