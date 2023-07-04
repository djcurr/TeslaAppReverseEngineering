package e60;

import javax.crypto.interfaces.PBEKey;

/* loaded from: classes5.dex */
public class j extends i implements PBEKey {

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f24877c;

    /* renamed from: d  reason: collision with root package name */
    private final int f24878d;

    @Override // javax.crypto.interfaces.PBEKey
    public int getIterationCount() {
        return this.f24878d;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public byte[] getSalt() {
        return this.f24877c;
    }
}