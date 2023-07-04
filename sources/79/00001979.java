package com.facebook.react.uimanager;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class d1 {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, ViewManager> f12244a;

    /* renamed from: b  reason: collision with root package name */
    private final e1 f12245b;

    public d1(e1 e1Var) {
        this.f12244a = yf.c.b();
        this.f12245b = e1Var;
    }

    private ViewManager b(String str) {
        ViewManager b11 = this.f12245b.b(str);
        if (b11 != null) {
            this.f12244a.put(str, b11);
        }
        return b11;
    }

    public ViewManager a(String str) {
        ViewManager viewManager = this.f12244a.get(str);
        if (viewManager != null) {
            return viewManager;
        }
        if (this.f12245b != null) {
            ViewManager b11 = b(str);
            if (b11 != null) {
                return b11;
            }
            throw new IllegalViewOperationException("ViewManagerResolver returned null for " + str + ", existing names are: " + this.f12245b.a());
        }
        throw new IllegalViewOperationException("No ViewManager found for class " + str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewManager c(String str) {
        ViewManager viewManager = this.f12244a.get(str);
        if (viewManager != null) {
            return viewManager;
        }
        if (this.f12245b != null) {
            return b(str);
        }
        return null;
    }

    public d1(List<ViewManager> list) {
        HashMap b11 = yf.c.b();
        for (ViewManager viewManager : list) {
            b11.put(viewManager.getName(), viewManager);
        }
        this.f12244a = b11;
        this.f12245b = null;
    }
}