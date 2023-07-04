package androidx.compose.ui.platform;

import java.util.List;
import java.util.Map;
import l1.f;

/* loaded from: classes.dex */
public final class p0 implements l1.f {

    /* renamed from: a  reason: collision with root package name */
    private final h00.a<vz.b0> f3047a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ l1.f f3048b;

    public p0(l1.f saveableStateRegistry, h00.a<vz.b0> onDispose) {
        kotlin.jvm.internal.s.g(saveableStateRegistry, "saveableStateRegistry");
        kotlin.jvm.internal.s.g(onDispose, "onDispose");
        this.f3047a = onDispose;
        this.f3048b = saveableStateRegistry;
    }

    @Override // l1.f
    public boolean a(Object value) {
        kotlin.jvm.internal.s.g(value, "value");
        return this.f3048b.a(value);
    }

    @Override // l1.f
    public Map<String, List<Object>> b() {
        return this.f3048b.b();
    }

    @Override // l1.f
    public Object c(String key) {
        kotlin.jvm.internal.s.g(key, "key");
        return this.f3048b.c(key);
    }

    @Override // l1.f
    public f.a d(String key, h00.a<? extends Object> valueProvider) {
        kotlin.jvm.internal.s.g(key, "key");
        kotlin.jvm.internal.s.g(valueProvider, "valueProvider");
        return this.f3048b.d(key, valueProvider);
    }

    public final void e() {
        this.f3047a.invoke();
    }
}