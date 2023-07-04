package l80;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.f;
import retrofit2.t;

/* loaded from: classes4.dex */
public final class a extends f.a {

    /* renamed from: a  reason: collision with root package name */
    private final ExtensionRegistryLite f37112a;

    private a(ExtensionRegistryLite extensionRegistryLite) {
        this.f37112a = extensionRegistryLite;
    }

    public static a f() {
        return new a(null);
    }

    @Override // retrofit2.f.a
    public f<?, RequestBody> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, t tVar) {
        if ((type instanceof Class) && MessageLite.class.isAssignableFrom((Class) type)) {
            return new b();
        }
        return null;
    }

    @Override // retrofit2.f.a
    public f<ResponseBody, ?> d(Type type, Annotation[] annotationArr, t tVar) {
        Parser parser;
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (MessageLite.class.isAssignableFrom(cls)) {
                try {
                    try {
                        parser = (Parser) cls.getDeclaredMethod("parser", new Class[0]).invoke(null, new Object[0]);
                    } catch (IllegalAccessException | NoSuchMethodException unused) {
                        parser = (Parser) cls.getDeclaredField("PARSER").get(null);
                    } catch (InvocationTargetException e11) {
                        throw new RuntimeException(e11.getCause());
                    }
                    return new c(parser, this.f37112a);
                } catch (IllegalAccessException | NoSuchFieldException e12) {
                    throw new IllegalArgumentException("Found a protobuf message but " + cls.getName() + " had no parser() method or PARSER field.", e12);
                }
            }
            return null;
        }
        return null;
    }
}