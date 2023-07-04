package l00;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a extends k00.a {
    @Override // k00.c
    public int e(int i11, int i12) {
        return ThreadLocalRandom.current().nextInt(i11, i12);
    }

    @Override // k00.c
    public long g(long j11, long j12) {
        return ThreadLocalRandom.current().nextLong(j11, j12);
    }

    @Override // k00.a
    public Random h() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        s.f(current, "current()");
        return current;
    }
}