package hi;

import ak.k0;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class n implements m {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f29223d;

    /* renamed from: a  reason: collision with root package name */
    public final UUID f29224a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f29225b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f29226c;

    static {
        boolean z11;
        if ("Amazon".equals(k0.f479c)) {
            String str = k0.f480d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z11 = true;
                f29223d = z11;
            }
        }
        z11 = false;
        f29223d = z11;
    }

    public n(UUID uuid, byte[] bArr, boolean z11) {
        this.f29224a = uuid;
        this.f29225b = bArr;
        this.f29226c = z11;
    }
}