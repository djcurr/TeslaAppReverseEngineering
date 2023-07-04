package expo.modules.kotlin.types;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import expo.modules.kotlin.ReadableTypeExtensionsKt;
import expo.modules.kotlin.exception.IncompatibleArgTypeException;
import g00.a;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import n00.d;
import n00.h;
import n00.l;
import n00.o;
import o00.b;
import wz.u;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B!\u0012\u0010\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0016¨\u0006\u0015"}, d2 = {"Lexpo/modules/kotlin/types/EnumTypeConverter;", "Lexpo/modules/kotlin/types/TypeConverter;", "", "Lcom/facebook/react/bridge/Dynamic;", "jsValue", "", "enumConstants", "convertEnumWithoutParameter", "(Lcom/facebook/react/bridge/Dynamic;[Ljava/lang/Enum;)Ljava/lang/Enum;", "", "parameterName", "convertEnumWithParameter", "(Lcom/facebook/react/bridge/Dynamic;[Ljava/lang/Enum;Ljava/lang/String;)Ljava/lang/Enum;", "value", "convertNonOptional", "Ln00/d;", "enumClass", "", "isOptional", "<init>", "(Ln00/d;Z)V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class EnumTypeConverter extends TypeConverter<Enum<?>> {
    private final d<Enum<?>> enumClass;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumTypeConverter(d<Enum<?>> enumClass, boolean z11) {
        super(z11);
        s.g(enumClass, "enumClass");
        this.enumClass = enumClass;
    }

    private final Enum<?> convertEnumWithParameter(Dynamic dynamic, Enum<?>[] enumArr, String str) {
        Enum<?> r22;
        Object obj;
        Object valueOf;
        Iterator it2 = b.b(this.enumClass).iterator();
        while (true) {
            r22 = null;
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (s.c(((o) obj).getName(), str)) {
                break;
            }
        }
        o oVar = (o) obj;
        if (oVar != null) {
            if (s.c(oVar.getReturnType().c(), m0.b(String.class))) {
                valueOf = dynamic.asString();
            } else {
                valueOf = Integer.valueOf(dynamic.asInt());
            }
            int i11 = 0;
            int length = enumArr.length;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                Enum<?> r52 = enumArr[i11];
                i11++;
                if (s.c(oVar.get(r52), valueOf)) {
                    r22 = r52;
                    break;
                }
            }
            if (r22 != null) {
                return r22;
            }
            throw new IllegalArgumentException(("Couldn't convert " + dynamic.asString() + " to " + this.enumClass.o() + " where " + str + " is the enum parameter. ").toString());
        }
        throw new IllegalArgumentException(("Cannot find a property for " + str + " parameter.").toString());
    }

    private final Enum<?> convertEnumWithoutParameter(Dynamic dynamic, Enum<?>[] enumArr) {
        Enum<?> r32;
        String asString = dynamic.asString();
        int length = enumArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                r32 = null;
                break;
            }
            r32 = enumArr[i11];
            i11++;
            if (s.c(r32.name(), asString)) {
                break;
            }
        }
        if (r32 != null) {
            return r32;
        }
        String asString2 = dynamic.asString();
        String o11 = this.enumClass.o();
        throw new IllegalArgumentException(("Couldn't convert " + asString2 + " to " + o11 + ".").toString());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // expo.modules.kotlin.types.TypeConverter
    public Enum<?> convertNonOptional(Dynamic value) {
        s.g(value, "value");
        Object[] enumConstants = a.b(this.enumClass).getEnumConstants();
        if (enumConstants != null) {
            Enum<?>[] enumArr = (Enum[]) enumConstants;
            if (!(enumArr.length == 0)) {
                h d11 = b.d(this.enumClass);
                if (d11 != null) {
                    if (d11.getParameters().isEmpty()) {
                        return convertEnumWithoutParameter(value, enumArr);
                    }
                    if (d11.getParameters().size() == 1) {
                        String name = ((l) u.b0(d11.getParameters())).getName();
                        s.e(name);
                        return convertEnumWithParameter(value, enumArr, name);
                    }
                    ReadableType type = value.getType();
                    s.f(type, "value.type");
                    throw new IncompatibleArgTypeException(ReadableTypeExtensionsKt.toKType(type), o00.d.c(this.enumClass, null, false, null, 7, null), null, 4, null);
                }
                throw new IllegalArgumentException("Cannot convert js value to enum without the primary constructor.".toString());
            }
            throw new IllegalArgumentException("Passed enum type is empty.".toString());
        }
        throw new IllegalArgumentException("Passed type is not an enum type.".toString());
    }
}