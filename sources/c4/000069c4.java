package expo.modules.haptics.arguments;

import expo.modules.core.errors.CodedException;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lexpo/modules/haptics/arguments/HapticsInvalidArgumentException;", "Lexpo/modules/core/errors/CodedException;", "", "getCode", "message", "<init>", "(Ljava/lang/String;)V", "expo-haptics_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class HapticsInvalidArgumentException extends CodedException {
    public HapticsInvalidArgumentException(String str) {
        super(str);
    }

    @Override // expo.modules.core.errors.CodedException, expo.modules.core.interfaces.CodedThrowable
    public String getCode() {
        return "E_HAPTICS_INVALID_ARGUMENT";
    }
}