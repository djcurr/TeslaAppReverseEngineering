package y20;

import kotlinx.coroutines.flow.h0;
import kotlinx.coroutines.flow.z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class w extends z<Integer> implements h0<Integer> {
    public w(int i11) {
        super(1, Integer.MAX_VALUE, kotlinx.coroutines.channels.a.DROP_OLDEST);
        b(Integer.valueOf(i11));
    }

    @Override // kotlinx.coroutines.flow.h0
    /* renamed from: X */
    public Integer getValue() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(K().intValue());
        }
        return valueOf;
    }

    public final boolean Y(int i11) {
        boolean b11;
        synchronized (this) {
            b11 = b(Integer.valueOf(K().intValue() + i11));
        }
        return b11;
    }
}