package eg;

import com.facebook.react.bridge.WritableMap;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f25074a;

    /* renamed from: b  reason: collision with root package name */
    private final WritableMap f25075b;

    /* renamed from: c  reason: collision with root package name */
    private final long f25076c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f25077d;

    /* renamed from: e  reason: collision with root package name */
    private final d f25078e;

    public a(String str, WritableMap writableMap, long j11, boolean z11, d dVar) {
        this.f25074a = str;
        this.f25075b = writableMap;
        this.f25076c = j11;
        this.f25077d = z11;
        this.f25078e = dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WritableMap a() {
        return this.f25075b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d b() {
        return this.f25078e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String c() {
        return this.f25074a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long d() {
        return this.f25076c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        return this.f25077d;
    }

    public a(a aVar) {
        this.f25074a = aVar.f25074a;
        this.f25075b = aVar.f25075b.copy();
        this.f25076c = aVar.f25076c;
        this.f25077d = aVar.f25077d;
        d dVar = aVar.f25078e;
        if (dVar != null) {
            this.f25078e = dVar.copy();
        } else {
            this.f25078e = null;
        }
    }
}