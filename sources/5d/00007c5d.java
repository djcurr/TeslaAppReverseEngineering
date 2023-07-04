package jx;

import java.security.PrivilegedAction;

/* loaded from: classes5.dex */
final class c implements PrivilegedAction {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f34012a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f34013b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(String str, String str2) {
        this.f34012a = str;
        this.f34013b = str2;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        return System.getProperty(this.f34012a, this.f34013b);
    }
}