package m00;

import java.util.NoSuchElementException;
import wz.s;

/* loaded from: classes5.dex */
public final class b extends s {

    /* renamed from: a  reason: collision with root package name */
    private final int f38141a;

    /* renamed from: b  reason: collision with root package name */
    private final int f38142b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f38143c;

    /* renamed from: d  reason: collision with root package name */
    private int f38144d;

    public b(char c11, char c12, int i11) {
        this.f38141a = i11;
        this.f38142b = c12;
        boolean z11 = true;
        if (i11 <= 0 ? kotlin.jvm.internal.s.i(c11, c12) < 0 : kotlin.jvm.internal.s.i(c11, c12) > 0) {
            z11 = false;
        }
        this.f38143c = z11;
        this.f38144d = z11 ? c11 : c12;
    }

    @Override // wz.s
    public char a() {
        int i11 = this.f38144d;
        if (i11 == this.f38142b) {
            if (this.f38143c) {
                this.f38143c = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f38144d = this.f38141a + i11;
        }
        return (char) i11;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f38143c;
    }
}