package io.sentry;

import java.net.URI;

/* loaded from: classes5.dex */
final class k {

    /* renamed from: a  reason: collision with root package name */
    private final String f32311a;

    /* renamed from: b  reason: collision with root package name */
    private final String f32312b;

    /* renamed from: c  reason: collision with root package name */
    private final String f32313c;

    /* renamed from: d  reason: collision with root package name */
    private final URI f32314d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(String str) {
        try {
            URI normalize = new URI(str).normalize();
            String userInfo = normalize.getUserInfo();
            if (userInfo != null && !userInfo.isEmpty()) {
                String[] split = userInfo.split(":", -1);
                String str2 = split[0];
                this.f32313c = str2;
                if (str2 != null && !str2.isEmpty()) {
                    this.f32312b = split.length > 1 ? split[1] : null;
                    String path = normalize.getPath();
                    path = path.endsWith("/") ? path.substring(0, path.length() - 1) : path;
                    int lastIndexOf = path.lastIndexOf("/") + 1;
                    String substring = path.substring(0, lastIndexOf);
                    if (!substring.endsWith("/")) {
                        substring = substring + "/";
                    }
                    String substring2 = path.substring(lastIndexOf);
                    this.f32311a = substring2;
                    if (!substring2.isEmpty()) {
                        this.f32314d = new URI(normalize.getScheme(), null, normalize.getHost(), normalize.getPort(), substring + "api/" + substring2, null, null);
                        return;
                    }
                    throw new IllegalArgumentException("Invalid DSN: A Project Id is required.");
                }
                throw new IllegalArgumentException("Invalid DSN: No public key provided.");
            }
            throw new IllegalArgumentException("Invalid DSN: No public key provided.");
        } catch (Throwable th2) {
            throw new IllegalArgumentException(th2);
        }
    }

    public String a() {
        return this.f32313c;
    }

    public String b() {
        return this.f32312b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public URI c() {
        return this.f32314d;
    }
}