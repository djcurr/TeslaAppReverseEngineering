package om;

import com.google.firebase.encoders.EncodingException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class i implements lm.f {

    /* renamed from: a  reason: collision with root package name */
    private boolean f42771a = false;

    /* renamed from: b  reason: collision with root package name */
    private boolean f42772b = false;

    /* renamed from: c  reason: collision with root package name */
    private lm.b f42773c;

    /* renamed from: d  reason: collision with root package name */
    private final f f42774d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(f fVar) {
        this.f42774d = fVar;
    }

    private void a() {
        if (!this.f42771a) {
            this.f42771a = true;
            return;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    @Override // lm.f
    public lm.f add(String str) {
        a();
        this.f42774d.d(this.f42773c, str, this.f42772b);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(lm.b bVar, boolean z11) {
        this.f42771a = false;
        this.f42773c = bVar;
        this.f42772b = z11;
    }

    @Override // lm.f
    public lm.f add(boolean z11) {
        a();
        this.f42774d.j(this.f42773c, z11, this.f42772b);
        return this;
    }
}