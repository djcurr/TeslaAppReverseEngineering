package dg;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.uimanager.m0;

/* loaded from: classes3.dex */
public class e implements d {

    /* renamed from: a  reason: collision with root package name */
    private final String f23988a;

    /* renamed from: b  reason: collision with root package name */
    private final int f23989b;

    /* renamed from: c  reason: collision with root package name */
    private final int f23990c;

    /* renamed from: d  reason: collision with root package name */
    private final ReadableMap f23991d;

    /* renamed from: e  reason: collision with root package name */
    private final m0 f23992e;

    /* renamed from: f  reason: collision with root package name */
    private final EventEmitterWrapper f23993f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f23994g;

    public e(int i11, int i12, String str, ReadableMap readableMap, m0 m0Var, EventEmitterWrapper eventEmitterWrapper, boolean z11) {
        this.f23988a = str;
        this.f23989b = i11;
        this.f23991d = readableMap;
        this.f23992e = m0Var;
        this.f23993f = eventEmitterWrapper;
        this.f23990c = i12;
        this.f23994g = z11;
    }

    @Override // dg.d
    public int a() {
        return this.f23989b;
    }

    @Override // dg.d
    public void b(cg.c cVar) {
        cg.d d11 = cVar.d(this.f23989b);
        if (d11 == null) {
            String str = FabricUIManager.TAG;
            nd.a.j(str, "Skipping View PreAllocation; no SurfaceMountingManager found for [" + this.f23989b + "]");
            return;
        }
        d11.F(this.f23988a, this.f23990c, this.f23991d, this.f23992e, this.f23993f, this.f23994g);
    }

    public String toString() {
        return "PreAllocateViewMountItem [" + this.f23990c + "] - component: " + this.f23988a + " surfaceId: " + this.f23989b + " isLayoutable: " + this.f23994g;
    }
}