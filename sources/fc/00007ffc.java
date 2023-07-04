package kotlinx.coroutines.internal;

import ch.qos.logback.core.CoreConstants;
import v20.o0;

/* loaded from: classes5.dex */
public final class g implements o0 {

    /* renamed from: a  reason: collision with root package name */
    private final zz.g f35460a;

    public g(zz.g gVar) {
        this.f35460a = gVar;
    }

    @Override // v20.o0
    public zz.g J() {
        return this.f35460a;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + J() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}