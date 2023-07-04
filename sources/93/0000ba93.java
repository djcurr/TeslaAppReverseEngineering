package vz;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class o extends Error {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String message) {
        super(message);
        kotlin.jvm.internal.s.g(message, "message");
    }

    public /* synthetic */ o(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "An operation is not implemented." : str);
    }
}