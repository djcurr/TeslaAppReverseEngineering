package o2;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class q {
    public static final TextDirectionHeuristic a(int i11) {
        if (i11 == 0) {
            TextDirectionHeuristic LTR = TextDirectionHeuristics.LTR;
            s.f(LTR, "LTR");
            return LTR;
        } else if (i11 == 1) {
            TextDirectionHeuristic RTL = TextDirectionHeuristics.RTL;
            s.f(RTL, "RTL");
            return RTL;
        } else if (i11 == 2) {
            TextDirectionHeuristic FIRSTSTRONG_LTR = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            s.f(FIRSTSTRONG_LTR, "FIRSTSTRONG_LTR");
            return FIRSTSTRONG_LTR;
        } else if (i11 == 3) {
            TextDirectionHeuristic FIRSTSTRONG_RTL = TextDirectionHeuristics.FIRSTSTRONG_RTL;
            s.f(FIRSTSTRONG_RTL, "FIRSTSTRONG_RTL");
            return FIRSTSTRONG_RTL;
        } else if (i11 == 4) {
            TextDirectionHeuristic ANYRTL_LTR = TextDirectionHeuristics.ANYRTL_LTR;
            s.f(ANYRTL_LTR, "ANYRTL_LTR");
            return ANYRTL_LTR;
        } else if (i11 != 5) {
            TextDirectionHeuristic FIRSTSTRONG_LTR2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            s.f(FIRSTSTRONG_LTR2, "FIRSTSTRONG_LTR");
            return FIRSTSTRONG_LTR2;
        } else {
            TextDirectionHeuristic LOCALE = TextDirectionHeuristics.LOCALE;
            s.f(LOCALE, "LOCALE");
            return LOCALE;
        }
    }
}