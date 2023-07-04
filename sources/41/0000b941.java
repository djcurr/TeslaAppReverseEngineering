package v5;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f54060a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f54061b;

    public c(Drawable drawable, boolean z11) {
        s.g(drawable, "drawable");
        this.f54060a = drawable;
        this.f54061b = z11;
    }

    public final Drawable a() {
        return this.f54060a;
    }

    public final boolean b() {
        return this.f54061b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                return s.c(this.f54060a, cVar.f54060a) && this.f54061b == cVar.f54061b;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        Drawable drawable = this.f54060a;
        int hashCode = (drawable != null ? drawable.hashCode() : 0) * 31;
        boolean z11 = this.f54061b;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        return hashCode + i11;
    }

    public String toString() {
        return "DecodeResult(drawable=" + this.f54060a + ", isSampled=" + this.f54061b + ")";
    }
}