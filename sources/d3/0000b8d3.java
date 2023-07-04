package v20;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class j1 implements v1 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f53959a;

    public j1(boolean z11) {
        this.f53959a = z11;
    }

    @Override // v20.v1
    public boolean a() {
        return this.f53959a;
    }

    @Override // v20.v1
    public m2 d() {
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Empty{");
        sb2.append(a() ? "Active" : "New");
        sb2.append(CoreConstants.CURLY_RIGHT);
        return sb2.toString();
    }
}