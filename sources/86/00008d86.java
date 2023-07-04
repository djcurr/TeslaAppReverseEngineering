package o2;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f42135a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final Layout.Alignment f42136b = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: c  reason: collision with root package name */
    private static final TextDirectionHeuristic f42137c;

    static {
        TextDirectionHeuristic FIRSTSTRONG_LTR = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        s.f(FIRSTSTRONG_LTR, "FIRSTSTRONG_LTR");
        f42137c = FIRSTSTRONG_LTR;
    }

    private c() {
    }

    public final Layout.Alignment a() {
        return f42136b;
    }

    public final TextDirectionHeuristic b() {
        return f42137c;
    }
}