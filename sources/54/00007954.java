package io.sentry;

/* loaded from: classes5.dex */
public final class e4 extends u3 {

    /* renamed from: j  reason: collision with root package name */
    private final String f32252j;

    /* renamed from: k  reason: collision with root package name */
    private Boolean f32253k;

    public e4(String str, String str2) {
        super(str2);
        this.f32252j = (String) rz.j.a(str, "name is required");
        this.f32253k = null;
    }

    public String m() {
        return this.f32252j;
    }

    public Boolean n() {
        return this.f32253k;
    }
}