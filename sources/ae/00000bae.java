package b1;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final Map<a, l> f7245a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<l, a> f7246b = new LinkedHashMap();

    public final a a(l rippleHostView) {
        s.g(rippleHostView, "rippleHostView");
        return this.f7246b.get(rippleHostView);
    }

    public final l b(a indicationInstance) {
        s.g(indicationInstance, "indicationInstance");
        return this.f7245a.get(indicationInstance);
    }

    public final void c(a indicationInstance) {
        s.g(indicationInstance, "indicationInstance");
        l lVar = this.f7245a.get(indicationInstance);
        if (lVar != null) {
            this.f7246b.remove(lVar);
        }
        this.f7245a.remove(indicationInstance);
    }

    public final void d(a indicationInstance, l rippleHostView) {
        s.g(indicationInstance, "indicationInstance");
        s.g(rippleHostView, "rippleHostView");
        this.f7245a.put(indicationInstance, rippleHostView);
        this.f7246b.put(rippleHostView, indicationInstance);
    }
}