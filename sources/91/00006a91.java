package expo.modules.kotlin.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.s;
import n00.p;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lexpo/modules/kotlin/exception/MissingTypeConverter;", "Lexpo/modules/kotlin/exception/CodedException;", "Ln00/p;", "forType", "<init>", "(Ln00/p;)V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class MissingTypeConverter extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingTypeConverter(p forType) {
        super("Cannot find type converter for '" + forType + "'.");
        s.g(forType, "forType");
    }
}