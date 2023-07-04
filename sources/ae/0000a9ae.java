package p20;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.s;
import p20.b;
import w00.v0;

/* loaded from: classes5.dex */
final class h implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final h f45915a = new h();

    /* renamed from: b  reason: collision with root package name */
    private static final String f45916b = "should not have varargs or parameters with default values";

    private h() {
    }

    @Override // p20.b
    public String a(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        return b.a.a(this, eVar);
    }

    @Override // p20.b
    public boolean b(kotlin.reflect.jvm.internal.impl.descriptors.e functionDescriptor) {
        boolean z11;
        s.g(functionDescriptor, "functionDescriptor");
        List<v0> h11 = functionDescriptor.h();
        s.f(h11, "functionDescriptor.valueParameters");
        if (!(h11 instanceof Collection) || !h11.isEmpty()) {
            for (v0 it2 : h11) {
                s.f(it2, "it");
                if (a20.a.a(it2) || it2.q0() != null) {
                    z11 = false;
                    continue;
                } else {
                    z11 = true;
                    continue;
                }
                if (!z11) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // p20.b
    public String getDescription() {
        return f45916b;
    }
}