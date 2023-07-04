package b6;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class e extends h {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f7436a;

    /* renamed from: b  reason: collision with root package name */
    private final g f7437b;

    /* renamed from: c  reason: collision with root package name */
    private final Throwable f7438c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Drawable drawable, g request, Throwable throwable) {
        super(null);
        s.g(request, "request");
        s.g(throwable, "throwable");
        this.f7436a = drawable;
        this.f7437b = request;
        this.f7438c = throwable;
    }

    @Override // b6.h
    public Drawable a() {
        return this.f7436a;
    }

    @Override // b6.h
    public g b() {
        return this.f7437b;
    }

    public final Throwable c() {
        return this.f7438c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                return s.c(a(), eVar.a()) && s.c(b(), eVar.b()) && s.c(this.f7438c, eVar.f7438c);
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
        Throwable th2 = this.f7438c;
        return hashCode2 + (th2 != null ? th2.hashCode() : 0);
    }

    public String toString() {
        return "ErrorResult(drawable=" + a() + ", request=" + b() + ", throwable=" + this.f7438c + ")";
    }
}