package qz;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

/* loaded from: classes5.dex */
final class u extends Authenticator {

    /* renamed from: a  reason: collision with root package name */
    private final String f48845a;

    /* renamed from: b  reason: collision with root package name */
    private final String f48846b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(String str, String str2) {
        this.f48845a = (String) rz.j.a(str, "user is required");
        this.f48846b = (String) rz.j.a(str2, "password is required");
    }

    @Override // java.net.Authenticator
    protected PasswordAuthentication getPasswordAuthentication() {
        if (getRequestorType() == Authenticator.RequestorType.PROXY) {
            return new PasswordAuthentication(this.f48845a, this.f48846b.toCharArray());
        }
        return null;
    }
}