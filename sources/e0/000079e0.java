package io.sentry;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Map;

/* loaded from: classes5.dex */
public final class r1 {

    /* renamed from: a  reason: collision with root package name */
    private final URL f32573a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, String> f32574b;

    public r1(String str, Map<String, String> map) {
        rz.j.a(str, "url is required");
        rz.j.a(map, "headers is required");
        try {
            this.f32573a = URI.create(str).toURL();
            this.f32574b = map;
        } catch (MalformedURLException e11) {
            throw new IllegalArgumentException("Failed to compose the Sentry's server URL.", e11);
        }
    }

    public Map<String, String> a() {
        return this.f32574b;
    }

    public URL b() {
        return this.f32573a;
    }
}