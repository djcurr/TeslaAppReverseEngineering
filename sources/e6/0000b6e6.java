package u2;

import android.graphics.Typeface;
import android.text.style.TypefaceSpan;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f53024a = new i();

    private i() {
    }

    public final TypefaceSpan a(Typeface typeface) {
        s.g(typeface, "typeface");
        return new TypefaceSpan(typeface);
    }
}