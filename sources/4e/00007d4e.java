package k30;

import java.text.ParsePosition;
import java.util.Locale;
import net.time4j.engine.o;
import net.time4j.format.g;
import net.time4j.format.m;
import net.time4j.format.t;
import net.time4j.format.v;

/* loaded from: classes5.dex */
public interface e<V> extends t<V> {
    V parse(CharSequence charSequence, ParsePosition parsePosition, Locale locale, v vVar, m mVar, g gVar);

    void print(o oVar, Appendable appendable, Locale locale, v vVar, m mVar);
}