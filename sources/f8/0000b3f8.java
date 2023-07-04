package t1;

import android.graphics.Canvas;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final Canvas f51386a = new Canvas();

    public static final u a(h0 image) {
        kotlin.jvm.internal.s.g(image, "image");
        b bVar = new b();
        bVar.y(new Canvas(f.b(image)));
        return bVar;
    }

    public static final Canvas c(u uVar) {
        kotlin.jvm.internal.s.g(uVar, "<this>");
        return ((b) uVar).w();
    }
}