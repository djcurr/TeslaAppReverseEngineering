package androidx.compose.ui.input.pointer;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class PointerEventTimeoutCancellationException extends CancellationException {
    public PointerEventTimeoutCancellationException(long j11) {
        super("Timed out waiting for " + j11 + " ms");
    }
}