package g30;

import ch.qos.logback.core.CoreConstants;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.SerializationException;

/* loaded from: classes5.dex */
public final class c {
    public static final Void a(String str, n00.d<?> baseClass) {
        String str2;
        kotlin.jvm.internal.s.g(baseClass, "baseClass");
        String str3 = "in the scope of '" + baseClass.o() + CoreConstants.SINGLE_QUOTE_CHAR;
        if (str == null) {
            str2 = "Class discriminator was missing and no default polymorphic serializers were registered " + str3;
        } else {
            str2 = "Class '" + str + "' is not registered for polymorphic serialization " + str3 + ".\nMark the base class as 'sealed' or register the serializer explicitly.";
        }
        throw new SerializationException(str2);
    }

    public static final Void b(n00.d<?> subClass, n00.d<?> baseClass) {
        kotlin.jvm.internal.s.g(subClass, "subClass");
        kotlin.jvm.internal.s.g(baseClass, "baseClass");
        String o11 = subClass.o();
        if (o11 == null) {
            o11 = String.valueOf(subClass);
        }
        a(o11, baseClass);
        throw new KotlinNothingValueException();
    }
}