package atd.i0;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class f {

    /* renamed from: b  reason: collision with root package name */
    private static final atd.r0.a f6883b = atd.r0.a.a();

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f6884a;

    /* JADX INFO: Access modifiers changed from: protected */
    public f(byte[] bArr) {
        this.f6884a = (byte[]) bArr.clone();
    }

    protected final atd.r0.a a() {
        return f6883b;
    }

    public final byte[] b() {
        return (byte[]) this.f6884a.clone();
    }

    public final String c() {
        return a().d(this.f6884a);
    }

    public final JSONObject d() {
        return new JSONObject(new String(b(), a().b()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public f(String str) {
        this.f6884a = a().a(str);
    }
}