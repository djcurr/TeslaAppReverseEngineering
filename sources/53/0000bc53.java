package w5;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f55608a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f55609b;

    /* renamed from: c  reason: collision with root package name */
    private final v5.b f55610c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Drawable drawable, boolean z11, v5.b dataSource) {
        super(null);
        s.g(drawable, "drawable");
        s.g(dataSource, "dataSource");
        this.f55608a = drawable;
        this.f55609b = z11;
        this.f55610c = dataSource;
    }

    public static /* synthetic */ e e(e eVar, Drawable drawable, boolean z11, v5.b bVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            drawable = eVar.f55608a;
        }
        if ((i11 & 2) != 0) {
            z11 = eVar.f55609b;
        }
        if ((i11 & 4) != 0) {
            bVar = eVar.f55610c;
        }
        return eVar.d(drawable, z11, bVar);
    }

    public final Drawable a() {
        return this.f55608a;
    }

    public final boolean b() {
        return this.f55609b;
    }

    public final v5.b c() {
        return this.f55610c;
    }

    public final e d(Drawable drawable, boolean z11, v5.b dataSource) {
        s.g(drawable, "drawable");
        s.g(dataSource, "dataSource");
        return new e(drawable, z11, dataSource);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                return s.c(this.f55608a, eVar.f55608a) && this.f55609b == eVar.f55609b && s.c(this.f55610c, eVar.f55610c);
            }
            return false;
        }
        return true;
    }

    public final Drawable f() {
        return this.f55608a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        Drawable drawable = this.f55608a;
        int hashCode = (drawable != null ? drawable.hashCode() : 0) * 31;
        boolean z11 = this.f55609b;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode + i11) * 31;
        v5.b bVar = this.f55610c;
        return i12 + (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "DrawableResult(drawable=" + this.f55608a + ", isSampled=" + this.f55609b + ", dataSource=" + this.f55610c + ")";
    }
}