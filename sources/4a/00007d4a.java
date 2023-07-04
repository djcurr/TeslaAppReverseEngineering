package k30;

import java.text.ParsePosition;
import net.time4j.engine.o;
import net.time4j.engine.q;
import net.time4j.format.j;
import net.time4j.format.t;

/* loaded from: classes5.dex */
public interface a extends t<Integer> {

    /* renamed from: c1  reason: collision with root package name */
    public static final net.time4j.engine.c<Integer> f34354c1 = net.time4j.format.a.e("COUNT_OF_PATTERN_SYMBOLS", Integer.class);

    Integer e(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar, q<?> qVar);

    void h(o oVar, Appendable appendable, net.time4j.engine.d dVar, j jVar, char c11, int i11, int i12);
}