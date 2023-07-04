package expo.modules.kotlin;

import com.facebook.react.bridge.ReadableArray;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lcom/facebook/react/bridge/ReadableArray;", "Lexpo/modules/kotlin/ReadableArrayIterator;", "iterator", "expo-modules-core_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ReadableArrayIteratorKt {
    public static final ReadableArrayIterator iterator(ReadableArray readableArray) {
        s.g(readableArray, "<this>");
        return new ReadableArrayIterator(readableArray);
    }
}