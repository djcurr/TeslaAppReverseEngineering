package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private m0 f12219a = null;

    /* loaded from: classes3.dex */
    public interface a {
        d getFabricViewStateManager();
    }

    /* loaded from: classes3.dex */
    public interface b {
        WritableMap a();
    }

    private void d(m0 m0Var, b bVar, int i11) {
        WritableMap a11;
        if (m0Var == null) {
            nd.a.j("FabricViewStateManager", "setState called without a StateWrapper");
        } else if (m0Var == this.f12219a && i11 <= 60 && (a11 = bVar.a()) != null) {
            m0Var.a(a11);
        }
    }

    public ReadableMap a() {
        m0 m0Var = this.f12219a;
        if (m0Var != null) {
            return m0Var.b();
        }
        return null;
    }

    public boolean b() {
        return this.f12219a != null;
    }

    public void c(b bVar) {
        d(this.f12219a, bVar, 0);
    }

    public void e(m0 m0Var) {
        this.f12219a = m0Var;
    }
}