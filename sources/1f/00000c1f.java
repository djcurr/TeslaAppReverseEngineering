package b6;

import android.graphics.drawable.Drawable;
import b6.h;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class k extends h {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f7504a;

    /* renamed from: b  reason: collision with root package name */
    private final g f7505b;

    /* renamed from: c  reason: collision with root package name */
    private final h.a f7506c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Drawable drawable, g request, h.a metadata) {
        super(null);
        s.g(drawable, "drawable");
        s.g(request, "request");
        s.g(metadata, "metadata");
        this.f7504a = drawable;
        this.f7505b = request;
        this.f7506c = metadata;
    }

    @Override // b6.h
    public Drawable a() {
        return this.f7504a;
    }

    @Override // b6.h
    public g b() {
        return this.f7505b;
    }

    public final h.a c() {
        return this.f7506c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k) {
                k kVar = (k) obj;
                return s.c(a(), kVar.a()) && s.c(b(), kVar.b()) && s.c(this.f7506c, kVar.f7506c);
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Drawable a11 = a();
        int hashCode = (a11 != null ? a11.hashCode() : 0) * 31;
        g b11 = b();
        int hashCode2 = (hashCode + (b11 != null ? b11.hashCode() : 0)) * 31;
        h.a aVar = this.f7506c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "SuccessResult(drawable=" + a() + ", request=" + b() + ", metadata=" + this.f7506c + ")";
    }
}