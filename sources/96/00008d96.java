package o2;

import android.text.Layout;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final o f42176a = new o();

    /* renamed from: b  reason: collision with root package name */
    private static final Layout.Alignment f42177b;

    /* renamed from: c  reason: collision with root package name */
    private static final Layout.Alignment f42178c;

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        int length = values.length;
        int i11 = 0;
        Layout.Alignment alignment2 = alignment;
        while (i11 < length) {
            Layout.Alignment alignment3 = values[i11];
            i11++;
            if (s.c(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (s.c(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f42177b = alignment;
        f42178c = alignment2;
    }

    private o() {
    }

    public final Layout.Alignment a(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            return Layout.Alignment.ALIGN_NORMAL;
                        }
                        return f42178c;
                    }
                    return f42177b;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }
}