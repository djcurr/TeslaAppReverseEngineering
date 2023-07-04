package hx;

import java.security.PrivilegedAction;

/* loaded from: classes5.dex */
final class a implements PrivilegedAction {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f29471a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(String str) {
        this.f29471a = str;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        return System.getProperty(this.f29471a, null);
    }
}