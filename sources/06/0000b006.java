package r3;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class b {
    public static final Bundle a(Pair<String, ? extends Object>... pairs) {
        s.g(pairs, "pairs");
        Bundle bundle = new Bundle(pairs.length);
        int length = pairs.length;
        int i11 = 0;
        while (i11 < length) {
            Pair<String, ? extends Object> pair = pairs[i11];
            i11++;
            String str = (String) pair.a();
            Object b11 = pair.b();
            if (b11 == null) {
                bundle.putString(str, null);
            } else if (b11 instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) b11).booleanValue());
            } else if (b11 instanceof Byte) {
                bundle.putByte(str, ((Number) b11).byteValue());
            } else if (b11 instanceof Character) {
                bundle.putChar(str, ((Character) b11).charValue());
            } else if (b11 instanceof Double) {
                bundle.putDouble(str, ((Number) b11).doubleValue());
            } else if (b11 instanceof Float) {
                bundle.putFloat(str, ((Number) b11).floatValue());
            } else if (b11 instanceof Integer) {
                bundle.putInt(str, ((Number) b11).intValue());
            } else if (b11 instanceof Long) {
                bundle.putLong(str, ((Number) b11).longValue());
            } else if (b11 instanceof Short) {
                bundle.putShort(str, ((Number) b11).shortValue());
            } else if (b11 instanceof Bundle) {
                bundle.putBundle(str, (Bundle) b11);
            } else if (b11 instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) b11);
            } else if (b11 instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) b11);
            } else if (b11 instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) b11);
            } else if (b11 instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) b11);
            } else if (b11 instanceof char[]) {
                bundle.putCharArray(str, (char[]) b11);
            } else if (b11 instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) b11);
            } else if (b11 instanceof float[]) {
                bundle.putFloatArray(str, (float[]) b11);
            } else if (b11 instanceof int[]) {
                bundle.putIntArray(str, (int[]) b11);
            } else if (b11 instanceof long[]) {
                bundle.putLongArray(str, (long[]) b11);
            } else if (b11 instanceof short[]) {
                bundle.putShortArray(str, (short[]) b11);
            } else if (b11 instanceof Object[]) {
                Class<?> componentType = b11.getClass().getComponentType();
                s.e(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) b11);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) b11);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) b11);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(str, (Serializable) b11);
                } else {
                    String canonicalName = componentType.getCanonicalName();
                    throw new IllegalArgumentException("Illegal value array type " + ((Object) canonicalName) + " for key \"" + str + CoreConstants.DOUBLE_QUOTE_CHAR);
                }
            } else if (b11 instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) b11);
            } else {
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 18 && (b11 instanceof IBinder)) {
                    bundle.putBinder(str, (IBinder) b11);
                } else if (i12 >= 21 && (b11 instanceof Size)) {
                    bundle.putSize(str, (Size) b11);
                } else if (i12 >= 21 && (b11 instanceof SizeF)) {
                    bundle.putSizeF(str, (SizeF) b11);
                } else {
                    String canonicalName2 = b11.getClass().getCanonicalName();
                    throw new IllegalArgumentException("Illegal value type " + ((Object) canonicalName2) + " for key \"" + str + CoreConstants.DOUBLE_QUOTE_CHAR);
                }
            }
        }
        return bundle;
    }
}