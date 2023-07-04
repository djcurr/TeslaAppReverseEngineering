package h30;

/* loaded from: classes5.dex */
public final class i extends g {

    /* renamed from: c  reason: collision with root package name */
    private final kotlinx.serialization.json.a f28848c;

    /* renamed from: d  reason: collision with root package name */
    private int f28849d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(t sb2, kotlinx.serialization.json.a json) {
        super(sb2);
        kotlin.jvm.internal.s.g(sb2, "sb");
        kotlin.jvm.internal.s.g(json, "json");
        this.f28848c = json;
    }

    @Override // h30.g
    public void b() {
        n(true);
        this.f28849d++;
    }

    @Override // h30.g
    public void c() {
        n(false);
        j("\n");
        int i11 = this.f28849d;
        for (int i12 = 0; i12 < i11; i12++) {
            j(this.f28848c.e().i());
        }
    }

    @Override // h30.g
    public void o() {
        e(' ');
    }

    @Override // h30.g
    public void p() {
        this.f28849d--;
    }
}