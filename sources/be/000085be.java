package m1;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f38228a = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void d() {
        throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(int i11, int i12) {
        boolean z11 = false;
        if (i11 >= 0 && i11 < i12) {
            z11 = true;
        }
        if (z11) {
            return;
        }
        throw new IndexOutOfBoundsException("index (" + i11 + ") is out of bound of [0, " + i12 + CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}