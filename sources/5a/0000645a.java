package ct;

import io.realm.n0;
import io.realm.y0;

/* loaded from: classes6.dex */
public class l extends n0 implements y0 {

    /* renamed from: a  reason: collision with root package name */
    private String f23100a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f23101b;

    public l() {
        if (this instanceof io.realm.internal.m) {
            ((io.realm.internal.m) this).f();
        }
    }

    @Override // io.realm.y0
    public void a(String str) {
        this.f23100a = str;
    }

    @Override // io.realm.y0
    public byte[] b() {
        return this.f23101b;
    }

    @Override // io.realm.y0
    public String c() {
        return this.f23100a;
    }

    @Override // io.realm.y0
    public void g(byte[] bArr) {
        this.f23101b = bArr;
    }
}