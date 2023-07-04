package j$.time.chrono;

import java.io.Serializable;

/* loaded from: classes7.dex */
public final class g extends a implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final g f32874a = new g();

    private g() {
    }

    public boolean c(long j11) {
        return (3 & j11) == 0 && (j11 % 100 != 0 || j11 % 400 == 0);
    }
}