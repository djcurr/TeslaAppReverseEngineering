package u2;

import android.graphics.Typeface;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f53034a = new k();

    private k() {
    }

    public final Typeface a(Typeface typeface, int i11, boolean z11) {
        s.g(typeface, "typeface");
        Typeface create = Typeface.create(typeface, i11, z11);
        s.f(create, "create(typeface, finalFontWeight, finalFontStyle)");
        return create;
    }
}