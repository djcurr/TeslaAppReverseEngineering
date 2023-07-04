package expo.modules.kotlin.exception;

import expo.modules.kotlin.exception.CodedException;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\u0086\b¨\u0006\u0004"}, d2 = {"Lexpo/modules/kotlin/exception/CodedException;", "T", "", "errorCodeOf", "expo-modules-core_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class CodedExceptionKt {
    public static final /* synthetic */ <T extends CodedException> String errorCodeOf() {
        CodedException.Companion companion = CodedException.Companion;
        s.m(4, "T");
        return companion.inferCode(CodedException.class);
    }
}