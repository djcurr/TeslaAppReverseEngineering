package m3;

import android.graphics.Insets;
import android.graphics.Rect;
import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final b f38363e = new b(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f38364a;

    /* renamed from: b  reason: collision with root package name */
    public final int f38365b;

    /* renamed from: c  reason: collision with root package name */
    public final int f38366c;

    /* renamed from: d  reason: collision with root package name */
    public final int f38367d;

    private b(int i11, int i12, int i13, int i14) {
        this.f38364a = i11;
        this.f38365b = i12;
        this.f38366c = i13;
        this.f38367d = i14;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f38364a, bVar2.f38364a), Math.max(bVar.f38365b, bVar2.f38365b), Math.max(bVar.f38366c, bVar2.f38366c), Math.max(bVar.f38367d, bVar2.f38367d));
    }

    public static b b(int i11, int i12, int i13, int i14) {
        if (i11 == 0 && i12 == 0 && i13 == 0 && i14 == 0) {
            return f38363e;
        }
        return new b(i11, i12, i13, i14);
    }

    public static b c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static b d(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets e() {
        return Insets.of(this.f38364a, this.f38365b, this.f38366c, this.f38367d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f38367d == bVar.f38367d && this.f38364a == bVar.f38364a && this.f38366c == bVar.f38366c && this.f38365b == bVar.f38365b;
    }

    public int hashCode() {
        return (((((this.f38364a * 31) + this.f38365b) * 31) + this.f38366c) * 31) + this.f38367d;
    }

    public String toString() {
        return "Insets{left=" + this.f38364a + ", top=" + this.f38365b + ", right=" + this.f38366c + ", bottom=" + this.f38367d + CoreConstants.CURLY_RIGHT;
    }
}