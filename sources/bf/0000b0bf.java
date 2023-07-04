package retrofit2;

import com.stripe.android.core.networking.NetworkConstantsKt;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m80.y;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import retrofit2.o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    private final Method f49496a;

    /* renamed from: b  reason: collision with root package name */
    private final HttpUrl f49497b;

    /* renamed from: c  reason: collision with root package name */
    final String f49498c;

    /* renamed from: d  reason: collision with root package name */
    private final String f49499d;

    /* renamed from: e  reason: collision with root package name */
    private final Headers f49500e;

    /* renamed from: f  reason: collision with root package name */
    private final MediaType f49501f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f49502g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f49503h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f49504i;

    /* renamed from: j  reason: collision with root package name */
    private final o<?>[] f49505j;

    /* renamed from: k  reason: collision with root package name */
    final boolean f49506k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: x  reason: collision with root package name */
        private static final Pattern f49507x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: y  reason: collision with root package name */
        private static final Pattern f49508y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a  reason: collision with root package name */
        final t f49509a;

        /* renamed from: b  reason: collision with root package name */
        final Method f49510b;

        /* renamed from: c  reason: collision with root package name */
        final Annotation[] f49511c;

        /* renamed from: d  reason: collision with root package name */
        final Annotation[][] f49512d;

        /* renamed from: e  reason: collision with root package name */
        final Type[] f49513e;

        /* renamed from: f  reason: collision with root package name */
        boolean f49514f;

        /* renamed from: g  reason: collision with root package name */
        boolean f49515g;

        /* renamed from: h  reason: collision with root package name */
        boolean f49516h;

        /* renamed from: i  reason: collision with root package name */
        boolean f49517i;

        /* renamed from: j  reason: collision with root package name */
        boolean f49518j;

        /* renamed from: k  reason: collision with root package name */
        boolean f49519k;

        /* renamed from: l  reason: collision with root package name */
        boolean f49520l;

        /* renamed from: m  reason: collision with root package name */
        boolean f49521m;

        /* renamed from: n  reason: collision with root package name */
        String f49522n;

        /* renamed from: o  reason: collision with root package name */
        boolean f49523o;

        /* renamed from: p  reason: collision with root package name */
        boolean f49524p;

        /* renamed from: q  reason: collision with root package name */
        boolean f49525q;

        /* renamed from: r  reason: collision with root package name */
        String f49526r;

        /* renamed from: s  reason: collision with root package name */
        Headers f49527s;

        /* renamed from: t  reason: collision with root package name */
        MediaType f49528t;

        /* renamed from: u  reason: collision with root package name */
        Set<String> f49529u;

        /* renamed from: v  reason: collision with root package name */
        o<?>[] f49530v;

        /* renamed from: w  reason: collision with root package name */
        boolean f49531w;

        a(t tVar, Method method) {
            this.f49509a = tVar;
            this.f49510b = method;
            this.f49511c = method.getAnnotations();
            this.f49513e = method.getGenericParameterTypes();
            this.f49512d = method.getParameterAnnotations();
        }

        private static Class<?> a(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        private Headers c(String[] strArr) {
            Headers.Builder builder = new Headers.Builder();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw x.m(this.f49510b, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if (NetworkConstantsKt.HEADER_CONTENT_TYPE.equalsIgnoreCase(substring)) {
                    try {
                        this.f49528t = MediaType.get(trim);
                    } catch (IllegalArgumentException e11) {
                        throw x.n(this.f49510b, e11, "Malformed content type: %s", trim);
                    }
                } else {
                    builder.add(substring, trim);
                }
            }
            return builder.build();
        }

        private void d(String str, String str2, boolean z11) {
            String str3 = this.f49522n;
            if (str3 != null) {
                throw x.m(this.f49510b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f49522n = str;
            this.f49523o = z11;
            if (str2.isEmpty()) {
                return;
            }
            int indexOf = str2.indexOf(63);
            if (indexOf != -1 && indexOf < str2.length() - 1) {
                String substring = str2.substring(indexOf + 1);
                if (f49507x.matcher(substring).find()) {
                    throw x.m(this.f49510b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                }
            }
            this.f49526r = str2;
            this.f49529u = h(str2);
        }

        private void e(Annotation annotation) {
            if (annotation instanceof m80.b) {
                d("DELETE", ((m80.b) annotation).value(), false);
            } else if (annotation instanceof m80.f) {
                d("GET", ((m80.f) annotation).value(), false);
            } else if (annotation instanceof m80.g) {
                d("HEAD", ((m80.g) annotation).value(), false);
            } else if (annotation instanceof m80.n) {
                d("PATCH", ((m80.n) annotation).value(), true);
            } else if (annotation instanceof m80.o) {
                d("POST", ((m80.o) annotation).value(), true);
            } else if (annotation instanceof m80.p) {
                d("PUT", ((m80.p) annotation).value(), true);
            } else if (annotation instanceof m80.m) {
                d("OPTIONS", ((m80.m) annotation).value(), false);
            } else if (annotation instanceof m80.h) {
                m80.h hVar = (m80.h) annotation;
                d(hVar.method(), hVar.path(), hVar.hasBody());
            } else if (annotation instanceof m80.k) {
                String[] value = ((m80.k) annotation).value();
                if (value.length != 0) {
                    this.f49527s = c(value);
                    return;
                }
                throw x.m(this.f49510b, "@Headers annotation is empty.", new Object[0]);
            } else if (annotation instanceof m80.l) {
                if (!this.f49524p) {
                    this.f49525q = true;
                    return;
                }
                throw x.m(this.f49510b, "Only one encoding annotation is allowed.", new Object[0]);
            } else if (annotation instanceof m80.e) {
                if (!this.f49525q) {
                    this.f49524p = true;
                    return;
                }
                throw x.m(this.f49510b, "Only one encoding annotation is allowed.", new Object[0]);
            }
        }

        private o<?> f(int i11, Type type, Annotation[] annotationArr, boolean z11) {
            o<?> oVar;
            if (annotationArr != null) {
                oVar = null;
                for (Annotation annotation : annotationArr) {
                    o<?> g11 = g(i11, type, annotationArr, annotation);
                    if (g11 != null) {
                        if (oVar != null) {
                            throw x.o(this.f49510b, i11, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        oVar = g11;
                    }
                }
            } else {
                oVar = null;
            }
            if (oVar == null) {
                if (z11) {
                    try {
                        if (x.h(type) == zz.d.class) {
                            this.f49531w = true;
                            return null;
                        }
                    } catch (NoClassDefFoundError unused) {
                    }
                }
                throw x.o(this.f49510b, i11, "No Retrofit annotation found.", new Object[0]);
            }
            return oVar;
        }

        private o<?> g(int i11, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof y) {
                j(i11, type);
                if (!this.f49521m) {
                    if (!this.f49517i) {
                        if (!this.f49518j) {
                            if (!this.f49519k) {
                                if (!this.f49520l) {
                                    if (this.f49526r == null) {
                                        this.f49521m = true;
                                        if (type != HttpUrl.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                            throw x.o(this.f49510b, i11, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                        }
                                        return new o.p(this.f49510b, i11);
                                    }
                                    throw x.o(this.f49510b, i11, "@Url cannot be used with @%s URL", this.f49522n);
                                }
                                throw x.o(this.f49510b, i11, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                            }
                            throw x.o(this.f49510b, i11, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                        }
                        throw x.o(this.f49510b, i11, "A @Url parameter must not come after a @Query.", new Object[0]);
                    }
                    throw x.o(this.f49510b, i11, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                throw x.o(this.f49510b, i11, "Multiple @Url method annotations found.", new Object[0]);
            } else if (annotation instanceof m80.s) {
                j(i11, type);
                if (!this.f49518j) {
                    if (!this.f49519k) {
                        if (!this.f49520l) {
                            if (!this.f49521m) {
                                if (this.f49526r != null) {
                                    this.f49517i = true;
                                    m80.s sVar = (m80.s) annotation;
                                    String value = sVar.value();
                                    i(i11, value);
                                    return new o.k(this.f49510b, i11, value, this.f49509a.i(type, annotationArr), sVar.encoded());
                                }
                                throw x.o(this.f49510b, i11, "@Path can only be used with relative url on @%s", this.f49522n);
                            }
                            throw x.o(this.f49510b, i11, "@Path parameters may not be used with @Url.", new Object[0]);
                        }
                        throw x.o(this.f49510b, i11, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                    }
                    throw x.o(this.f49510b, i11, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                throw x.o(this.f49510b, i11, "A @Path parameter must not come after a @Query.", new Object[0]);
            } else if (annotation instanceof m80.t) {
                j(i11, type);
                m80.t tVar = (m80.t) annotation;
                String value2 = tVar.value();
                boolean encoded = tVar.encoded();
                Class<?> h11 = x.h(type);
                this.f49518j = true;
                if (Iterable.class.isAssignableFrom(h11)) {
                    if (type instanceof ParameterizedType) {
                        return new o.l(value2, this.f49509a.i(x.g(0, (ParameterizedType) type), annotationArr), encoded).c();
                    }
                    throw x.o(this.f49510b, i11, h11.getSimpleName() + " must include generic type (e.g., " + h11.getSimpleName() + "<String>)", new Object[0]);
                } else if (h11.isArray()) {
                    return new o.l(value2, this.f49509a.i(a(h11.getComponentType()), annotationArr), encoded).b();
                } else {
                    return new o.l(value2, this.f49509a.i(type, annotationArr), encoded);
                }
            } else if (annotation instanceof m80.v) {
                j(i11, type);
                boolean encoded2 = ((m80.v) annotation).encoded();
                Class<?> h12 = x.h(type);
                this.f49519k = true;
                if (Iterable.class.isAssignableFrom(h12)) {
                    if (type instanceof ParameterizedType) {
                        return new o.n(this.f49509a.i(x.g(0, (ParameterizedType) type), annotationArr), encoded2).c();
                    }
                    throw x.o(this.f49510b, i11, h12.getSimpleName() + " must include generic type (e.g., " + h12.getSimpleName() + "<String>)", new Object[0]);
                } else if (h12.isArray()) {
                    return new o.n(this.f49509a.i(a(h12.getComponentType()), annotationArr), encoded2).b();
                } else {
                    return new o.n(this.f49509a.i(type, annotationArr), encoded2);
                }
            } else if (annotation instanceof m80.u) {
                j(i11, type);
                Class<?> h13 = x.h(type);
                this.f49520l = true;
                if (Map.class.isAssignableFrom(h13)) {
                    Type i12 = x.i(type, h13, Map.class);
                    if (i12 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) i12;
                        Type g11 = x.g(0, parameterizedType);
                        if (String.class == g11) {
                            return new o.m(this.f49510b, i11, this.f49509a.i(x.g(1, parameterizedType), annotationArr), ((m80.u) annotation).encoded());
                        }
                        throw x.o(this.f49510b, i11, "@QueryMap keys must be of type String: " + g11, new Object[0]);
                    }
                    throw x.o(this.f49510b, i11, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw x.o(this.f49510b, i11, "@QueryMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof m80.i) {
                j(i11, type);
                String value3 = ((m80.i) annotation).value();
                Class<?> h14 = x.h(type);
                if (Iterable.class.isAssignableFrom(h14)) {
                    if (type instanceof ParameterizedType) {
                        return new o.f(value3, this.f49509a.i(x.g(0, (ParameterizedType) type), annotationArr)).c();
                    }
                    throw x.o(this.f49510b, i11, h14.getSimpleName() + " must include generic type (e.g., " + h14.getSimpleName() + "<String>)", new Object[0]);
                } else if (h14.isArray()) {
                    return new o.f(value3, this.f49509a.i(a(h14.getComponentType()), annotationArr)).b();
                } else {
                    return new o.f(value3, this.f49509a.i(type, annotationArr));
                }
            } else if (annotation instanceof m80.j) {
                if (type == Headers.class) {
                    return new o.h(this.f49510b, i11);
                }
                j(i11, type);
                Class<?> h15 = x.h(type);
                if (Map.class.isAssignableFrom(h15)) {
                    Type i13 = x.i(type, h15, Map.class);
                    if (i13 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType2 = (ParameterizedType) i13;
                        Type g12 = x.g(0, parameterizedType2);
                        if (String.class == g12) {
                            return new o.g(this.f49510b, i11, this.f49509a.i(x.g(1, parameterizedType2), annotationArr));
                        }
                        throw x.o(this.f49510b, i11, "@HeaderMap keys must be of type String: " + g12, new Object[0]);
                    }
                    throw x.o(this.f49510b, i11, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw x.o(this.f49510b, i11, "@HeaderMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof m80.c) {
                j(i11, type);
                if (this.f49524p) {
                    m80.c cVar = (m80.c) annotation;
                    String value4 = cVar.value();
                    boolean encoded3 = cVar.encoded();
                    this.f49514f = true;
                    Class<?> h16 = x.h(type);
                    if (Iterable.class.isAssignableFrom(h16)) {
                        if (type instanceof ParameterizedType) {
                            return new o.d(value4, this.f49509a.i(x.g(0, (ParameterizedType) type), annotationArr), encoded3).c();
                        }
                        throw x.o(this.f49510b, i11, h16.getSimpleName() + " must include generic type (e.g., " + h16.getSimpleName() + "<String>)", new Object[0]);
                    } else if (h16.isArray()) {
                        return new o.d(value4, this.f49509a.i(a(h16.getComponentType()), annotationArr), encoded3).b();
                    } else {
                        return new o.d(value4, this.f49509a.i(type, annotationArr), encoded3);
                    }
                }
                throw x.o(this.f49510b, i11, "@Field parameters can only be used with form encoding.", new Object[0]);
            } else if (annotation instanceof m80.d) {
                j(i11, type);
                if (this.f49524p) {
                    Class<?> h17 = x.h(type);
                    if (Map.class.isAssignableFrom(h17)) {
                        Type i14 = x.i(type, h17, Map.class);
                        if (i14 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType3 = (ParameterizedType) i14;
                            Type g13 = x.g(0, parameterizedType3);
                            if (String.class == g13) {
                                f i15 = this.f49509a.i(x.g(1, parameterizedType3), annotationArr);
                                this.f49514f = true;
                                return new o.e(this.f49510b, i11, i15, ((m80.d) annotation).encoded());
                            }
                            throw x.o(this.f49510b, i11, "@FieldMap keys must be of type String: " + g13, new Object[0]);
                        }
                        throw x.o(this.f49510b, i11, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw x.o(this.f49510b, i11, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                throw x.o(this.f49510b, i11, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
            } else if (annotation instanceof m80.q) {
                j(i11, type);
                if (this.f49525q) {
                    m80.q qVar = (m80.q) annotation;
                    this.f49515g = true;
                    String value5 = qVar.value();
                    Class<?> h18 = x.h(type);
                    if (value5.isEmpty()) {
                        if (Iterable.class.isAssignableFrom(h18)) {
                            if (type instanceof ParameterizedType) {
                                if (MultipartBody.Part.class.isAssignableFrom(x.h(x.g(0, (ParameterizedType) type)))) {
                                    return o.C1080o.f49473a.c();
                                }
                                throw x.o(this.f49510b, i11, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                            }
                            throw x.o(this.f49510b, i11, h18.getSimpleName() + " must include generic type (e.g., " + h18.getSimpleName() + "<String>)", new Object[0]);
                        } else if (h18.isArray()) {
                            if (MultipartBody.Part.class.isAssignableFrom(h18.getComponentType())) {
                                return o.C1080o.f49473a.b();
                            }
                            throw x.o(this.f49510b, i11, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        } else if (MultipartBody.Part.class.isAssignableFrom(h18)) {
                            return o.C1080o.f49473a;
                        } else {
                            throw x.o(this.f49510b, i11, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                    }
                    Headers of2 = Headers.of("Content-Disposition", "form-data; name=\"" + value5 + "\"", "Content-Transfer-Encoding", qVar.encoding());
                    if (Iterable.class.isAssignableFrom(h18)) {
                        if (type instanceof ParameterizedType) {
                            Type g14 = x.g(0, (ParameterizedType) type);
                            if (!MultipartBody.Part.class.isAssignableFrom(x.h(g14))) {
                                return new o.i(this.f49510b, i11, of2, this.f49509a.g(g14, annotationArr, this.f49511c)).c();
                            }
                            throw x.o(this.f49510b, i11, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        }
                        throw x.o(this.f49510b, i11, h18.getSimpleName() + " must include generic type (e.g., " + h18.getSimpleName() + "<String>)", new Object[0]);
                    } else if (h18.isArray()) {
                        Class<?> a11 = a(h18.getComponentType());
                        if (!MultipartBody.Part.class.isAssignableFrom(a11)) {
                            return new o.i(this.f49510b, i11, of2, this.f49509a.g(a11, annotationArr, this.f49511c)).b();
                        }
                        throw x.o(this.f49510b, i11, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    } else if (!MultipartBody.Part.class.isAssignableFrom(h18)) {
                        return new o.i(this.f49510b, i11, of2, this.f49509a.g(type, annotationArr, this.f49511c));
                    } else {
                        throw x.o(this.f49510b, i11, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                }
                throw x.o(this.f49510b, i11, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            } else if (annotation instanceof m80.r) {
                j(i11, type);
                if (this.f49525q) {
                    this.f49515g = true;
                    Class<?> h19 = x.h(type);
                    if (Map.class.isAssignableFrom(h19)) {
                        Type i16 = x.i(type, h19, Map.class);
                        if (i16 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType4 = (ParameterizedType) i16;
                            Type g15 = x.g(0, parameterizedType4);
                            if (String.class == g15) {
                                Type g16 = x.g(1, parameterizedType4);
                                if (!MultipartBody.Part.class.isAssignableFrom(x.h(g16))) {
                                    return new o.j(this.f49510b, i11, this.f49509a.g(g16, annotationArr, this.f49511c), ((m80.r) annotation).encoding());
                                }
                                throw x.o(this.f49510b, i11, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                            }
                            throw x.o(this.f49510b, i11, "@PartMap keys must be of type String: " + g15, new Object[0]);
                        }
                        throw x.o(this.f49510b, i11, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw x.o(this.f49510b, i11, "@PartMap parameter type must be Map.", new Object[0]);
                }
                throw x.o(this.f49510b, i11, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
            } else if (annotation instanceof m80.a) {
                j(i11, type);
                if (!this.f49524p && !this.f49525q) {
                    if (!this.f49516h) {
                        try {
                            f g17 = this.f49509a.g(type, annotationArr, this.f49511c);
                            this.f49516h = true;
                            return new o.c(this.f49510b, i11, g17);
                        } catch (RuntimeException e11) {
                            throw x.p(this.f49510b, e11, i11, "Unable to create @Body converter for %s", type);
                        }
                    }
                    throw x.o(this.f49510b, i11, "Multiple @Body method annotations found.", new Object[0]);
                }
                throw x.o(this.f49510b, i11, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
            } else if (annotation instanceof m80.x) {
                j(i11, type);
                Class<?> h21 = x.h(type);
                for (int i17 = i11 - 1; i17 >= 0; i17--) {
                    o<?> oVar = this.f49530v[i17];
                    if ((oVar instanceof o.q) && ((o.q) oVar).f49476a.equals(h21)) {
                        throw x.o(this.f49510b, i11, "@Tag type " + h21.getName() + " is duplicate of parameter #" + (i17 + 1) + " and would always overwrite its value.", new Object[0]);
                    }
                }
                return new o.q(h21);
            } else {
                return null;
            }
        }

        static Set<String> h(String str) {
            Matcher matcher = f49507x.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        private void i(int i11, String str) {
            if (f49508y.matcher(str).matches()) {
                if (!this.f49529u.contains(str)) {
                    throw x.o(this.f49510b, i11, "URL \"%s\" does not contain \"{%s}\".", this.f49526r, str);
                }
                return;
            }
            throw x.o(this.f49510b, i11, "@Path parameter name must match %s. Found: %s", f49507x.pattern(), str);
        }

        private void j(int i11, Type type) {
            if (x.j(type)) {
                throw x.o(this.f49510b, i11, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }

        r b() {
            for (Annotation annotation : this.f49511c) {
                e(annotation);
            }
            if (this.f49522n != null) {
                if (!this.f49523o) {
                    if (!this.f49525q) {
                        if (this.f49524p) {
                            throw x.m(this.f49510b, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                        }
                    } else {
                        throw x.m(this.f49510b, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                int length = this.f49512d.length;
                this.f49530v = new o[length];
                int i11 = length - 1;
                int i12 = 0;
                while (true) {
                    boolean z11 = true;
                    if (i12 >= length) {
                        break;
                    }
                    o<?>[] oVarArr = this.f49530v;
                    Type type = this.f49513e[i12];
                    Annotation[] annotationArr = this.f49512d[i12];
                    if (i12 != i11) {
                        z11 = false;
                    }
                    oVarArr[i12] = f(i12, type, annotationArr, z11);
                    i12++;
                }
                if (this.f49526r != null || this.f49521m) {
                    boolean z12 = this.f49524p;
                    if (!z12 && !this.f49525q && !this.f49523o && this.f49516h) {
                        throw x.m(this.f49510b, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                    }
                    if (z12 && !this.f49514f) {
                        throw x.m(this.f49510b, "Form-encoded method must contain at least one @Field.", new Object[0]);
                    }
                    if (this.f49525q && !this.f49515g) {
                        throw x.m(this.f49510b, "Multipart method must contain at least one @Part.", new Object[0]);
                    }
                    return new r(this);
                }
                throw x.m(this.f49510b, "Missing either @%s URL or @Url parameter.", this.f49522n);
            }
            throw x.m(this.f49510b, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
        }
    }

    r(a aVar) {
        this.f49496a = aVar.f49510b;
        this.f49497b = aVar.f49509a.f49537c;
        this.f49498c = aVar.f49522n;
        this.f49499d = aVar.f49526r;
        this.f49500e = aVar.f49527s;
        this.f49501f = aVar.f49528t;
        this.f49502g = aVar.f49523o;
        this.f49503h = aVar.f49524p;
        this.f49504i = aVar.f49525q;
        this.f49505j = aVar.f49530v;
        this.f49506k = aVar.f49531w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r b(t tVar, Method method) {
        return new a(tVar, method).b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Request a(Object[] objArr) {
        o<?>[] oVarArr = this.f49505j;
        int length = objArr.length;
        if (length == oVarArr.length) {
            q qVar = new q(this.f49498c, this.f49497b, this.f49499d, this.f49500e, this.f49501f, this.f49502g, this.f49503h, this.f49504i);
            if (this.f49506k) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i11 = 0; i11 < length; i11++) {
                arrayList.add(objArr[i11]);
                oVarArr[i11].a(qVar, objArr[i11]);
            }
            return qVar.k().tag(k.class, new k(this.f49496a, arrayList)).build();
        }
        throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + oVarArr.length + ")");
    }
}