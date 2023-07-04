package c6;

import android.view.View;
import c6.i;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class e<T extends View> implements i<T> {

    /* renamed from: b  reason: collision with root package name */
    private final T f8893b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f8894c;

    public e(T view, boolean z11) {
        s.g(view, "view");
        this.f8893b = view;
        this.f8894c = z11;
    }

    @Override // c6.h
    public Object a(zz.d<? super g> dVar) {
        return i.b.h(this, dVar);
    }

    @Override // c6.i
    public boolean b() {
        return this.f8894c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (s.c(getView(), eVar.getView()) && b() == eVar.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // c6.i
    public T getView() {
        return this.f8893b;
    }

    public int hashCode() {
        return (getView().hashCode() * 31) + Boolean.hashCode(b());
    }

    public String toString() {
        return "RealViewSizeResolver(view=" + getView() + ", subtractPadding=" + b() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}