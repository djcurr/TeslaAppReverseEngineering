package kotlin.text;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/* loaded from: classes5.dex */
public final class j {
    public static final /* synthetic */ g a(Matcher matcher, int i11, CharSequence charSequence) {
        return e(matcher, i11, charSequence);
    }

    public static final /* synthetic */ g b(Matcher matcher, CharSequence charSequence) {
        return f(matcher, charSequence);
    }

    public static final g e(Matcher matcher, int i11, CharSequence charSequence) {
        if (matcher.find(i11)) {
            return new h(matcher, charSequence);
        }
        return null;
    }

    public static final g f(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new h(matcher, charSequence);
        }
        return null;
    }

    public static final m00.i g(MatchResult matchResult) {
        m00.i r11;
        r11 = m00.l.r(matchResult.start(), matchResult.end());
        return r11;
    }

    public static final m00.i h(MatchResult matchResult, int i11) {
        m00.i r11;
        r11 = m00.l.r(matchResult.start(i11), matchResult.end(i11));
        return r11;
    }
}