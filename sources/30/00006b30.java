package expo.modules.kotlin.types;

import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import expo.modules.kotlin.records.Record;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import vz.b0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\b\tB\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¨\u0006\n"}, d2 = {"Lexpo/modules/kotlin/types/JSTypeConverter;", "", "value", "Lexpo/modules/kotlin/types/JSTypeConverter$ContainerProvider;", "containerProvider", "convertToJSValue", "<init>", "()V", "ContainerProvider", "DefaultContainerProvider", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class JSTypeConverter {
    public static final JSTypeConverter INSTANCE = new JSTypeConverter();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0006"}, d2 = {"Lexpo/modules/kotlin/types/JSTypeConverter$ContainerProvider;", "", "Lcom/facebook/react/bridge/WritableMap;", "createMap", "Lcom/facebook/react/bridge/WritableArray;", "createArray", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes5.dex */
    public interface ContainerProvider {
        WritableArray createArray();

        WritableMap createMap();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lexpo/modules/kotlin/types/JSTypeConverter$DefaultContainerProvider;", "Lexpo/modules/kotlin/types/JSTypeConverter$ContainerProvider;", "Lcom/facebook/react/bridge/WritableMap;", "createMap", "Lcom/facebook/react/bridge/WritableArray;", "createArray", "<init>", "()V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes5.dex */
    public static final class DefaultContainerProvider implements ContainerProvider {
        public static final DefaultContainerProvider INSTANCE = new DefaultContainerProvider();

        private DefaultContainerProvider() {
        }

        @Override // expo.modules.kotlin.types.JSTypeConverter.ContainerProvider
        public WritableArray createArray() {
            WritableArray createArray = Arguments.createArray();
            s.f(createArray, "createArray()");
            return createArray;
        }

        @Override // expo.modules.kotlin.types.JSTypeConverter.ContainerProvider
        public WritableMap createMap() {
            WritableMap createMap = Arguments.createMap();
            s.f(createMap, "createMap()");
            return createMap;
        }
    }

    private JSTypeConverter() {
    }

    public static /* synthetic */ Object convertToJSValue$default(JSTypeConverter jSTypeConverter, Object obj, ContainerProvider containerProvider, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            containerProvider = DefaultContainerProvider.INSTANCE;
        }
        return jSTypeConverter.convertToJSValue(obj, containerProvider);
    }

    public final Object convertToJSValue(Object obj, ContainerProvider containerProvider) {
        s.g(containerProvider, "containerProvider");
        if (obj == null ? true : obj instanceof b0) {
            return null;
        }
        return obj instanceof Bundle ? JSTypeConverterHelperKt.toJSValue((Bundle) obj, containerProvider) : obj instanceof Iterable ? JSTypeConverterHelperKt.toJSValue((Iterable) obj, containerProvider) : obj instanceof Object[] ? JSTypeConverterHelperKt.toJSValue((Object[]) obj, containerProvider) : obj instanceof int[] ? JSTypeConverterHelperKt.toJSValue((int[]) obj, containerProvider) : obj instanceof float[] ? JSTypeConverterHelperKt.toJSValue((float[]) obj, containerProvider) : obj instanceof double[] ? JSTypeConverterHelperKt.toJSValue((double[]) obj, containerProvider) : obj instanceof Map ? JSTypeConverterHelperKt.toJSValue((Map) obj, containerProvider) : obj instanceof Enum ? JSTypeConverterHelperKt.toJSValue((Enum) obj) : obj instanceof Record ? JSTypeConverterHelperKt.toJSValue((Record) obj, containerProvider) : obj;
    }
}