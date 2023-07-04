package k00;

import java.util.Random;

/* loaded from: classes5.dex */
public abstract class a extends c {
    @Override // k00.c
    public int b(int i11) {
        return d.e(h().nextInt(), i11);
    }

    @Override // k00.c
    public int c() {
        return h().nextInt();
    }

    @Override // k00.c
    public int d(int i11) {
        return h().nextInt(i11);
    }

    @Override // k00.c
    public long f() {
        return h().nextLong();
    }

    public abstract Random h();
}