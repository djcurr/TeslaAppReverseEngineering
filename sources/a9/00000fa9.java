package c6;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class a implements h {

    /* renamed from: b  reason: collision with root package name */
    private final Context f8889b;

    public a(Context context) {
        s.g(context, "context");
        this.f8889b = context;
    }

    @Override // c6.h
    public Object a(zz.d<? super g> dVar) {
        Resources resources = this.f8889b.getResources();
        s.f(resources, "context.resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return new c(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof a) && s.c(this.f8889b, ((a) obj).f8889b));
    }

    public int hashCode() {
        return this.f8889b.hashCode();
    }

    public String toString() {
        return "DisplaySizeResolver(context=" + this.f8889b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}