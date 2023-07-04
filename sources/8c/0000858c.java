package m00;

import java.util.NoSuchElementException;
import wz.n0;

/* loaded from: classes5.dex */
public final class h extends n0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f38151a;

    /* renamed from: b  reason: collision with root package name */
    private final int f38152b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f38153c;

    /* renamed from: d  reason: collision with root package name */
    private int f38154d;

    public h(int i11, int i12, int i13) {
        this.f38151a = i13;
        this.f38152b = i12;
        boolean z11 = true;
        if (i13 <= 0 ? i11 < i12 : i11 > i12) {
            z11 = false;
        }
        this.f38153c = z11;
        this.f38154d = z11 ? i11 : i12;
    }

    @Override // wz.n0
    public int a() {
        int i11 = this.f38154d;
        if (i11 == this.f38152b) {
            if (this.f38153c) {
                this.f38153c = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f38154d = this.f38151a + i11;
        }
        return i11;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f38153c;
    }
}