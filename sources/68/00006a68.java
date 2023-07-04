package expo.modules.kotlin;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import n00.p;
import o00.d;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lcom/facebook/react/bridge/ReadableType;", "Ln00/p;", "toKType", "expo-modules-core_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ReadableTypeExtensionsKt {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes5.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadableType.values().length];
            iArr[ReadableType.Null.ordinal()] = 1;
            iArr[ReadableType.Boolean.ordinal()] = 2;
            iArr[ReadableType.Number.ordinal()] = 3;
            iArr[ReadableType.String.ordinal()] = 4;
            iArr[ReadableType.Map.ordinal()] = 5;
            iArr[ReadableType.Array.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final p toKType(ReadableType readableType) {
        s.g(readableType, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[readableType.ordinal()]) {
            case 1:
                return d.c(m0.b(Object.class), null, true, null, 5, null);
            case 2:
                return d.c(m0.b(Boolean.TYPE), null, false, null, 7, null);
            case 3:
                return d.c(m0.b(Number.class), null, false, null, 7, null);
            case 4:
                return d.c(m0.b(String.class), null, false, null, 7, null);
            case 5:
                return d.c(m0.b(ReadableMap.class), null, false, null, 7, null);
            case 6:
                return d.c(m0.b(ReadableArray.class), null, false, null, 7, null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}