package dg;

import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RetryableMountingLayerException;

/* loaded from: classes3.dex */
public class f implements d {

    /* renamed from: a  reason: collision with root package name */
    private final int f23995a;

    /* renamed from: b  reason: collision with root package name */
    private final int f23996b;

    /* renamed from: c  reason: collision with root package name */
    private final int f23997c;

    public f(int i11, int i12, int i13) {
        this.f23995a = i11;
        this.f23996b = i12;
        this.f23997c = i13;
    }

    @Override // dg.d
    public int a() {
        return this.f23995a;
    }

    @Override // dg.d
    public void b(cg.c cVar) {
        try {
            cVar.o(this.f23995a, this.f23996b, this.f23997c);
        } catch (RetryableMountingLayerException e11) {
            ReactSoftExceptionLogger.logSoftException("Fabric.SendAccessibilityEvent", e11);
        }
    }

    public String toString() {
        return "SendAccessibilityEvent [" + this.f23996b + "] " + this.f23997c;
    }
}