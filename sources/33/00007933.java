package io.sentry;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f32182a;

    /* renamed from: b  reason: collision with root package name */
    private String f32183b;

    /* renamed from: c  reason: collision with root package name */
    private final String f32184c;

    /* renamed from: d  reason: collision with root package name */
    private final String f32185d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f32186e;

    /* renamed from: f  reason: collision with root package name */
    private String f32187f = "event.attachment";

    public b(byte[] bArr, String str, String str2, boolean z11) {
        this.f32182a = bArr;
        this.f32184c = str;
        this.f32185d = str2;
        this.f32186e = z11;
    }

    public static b a(byte[] bArr) {
        return new b(bArr, "screenshot.png", "image/png", false);
    }

    public String b() {
        return this.f32187f;
    }

    public byte[] c() {
        return this.f32182a;
    }

    public String d() {
        return this.f32185d;
    }

    public String e() {
        return this.f32184c;
    }

    public String f() {
        return this.f32183b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g() {
        return this.f32186e;
    }
}