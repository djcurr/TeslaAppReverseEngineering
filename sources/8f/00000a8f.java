package atd.g0;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e extends b {

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f6868b;

    static {
        atd.s0.a.a(-797316392741440L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(JSONObject jSONObject) {
        super(jSONObject);
        this.f6868b = atd.r0.a.a().a(jSONObject.getString(atd.s0.a.a(-798098076789312L)));
    }

    public byte[] c() {
        return (byte[]) this.f6868b.clone();
    }

    public e(String str, byte[] bArr) {
        super(str, atd.s0.a.a(-797299212872256L));
        this.f6868b = (byte[]) bArr.clone();
    }
}