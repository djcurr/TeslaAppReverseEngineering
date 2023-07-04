package mr;

import com.squareup.wire.f;
import com.squareup.wire.f.a;
import com.squareup.wire.o;
import java.util.Map;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class l<M extends com.squareup.wire.f<M, B>, B extends f.a<M, B>> implements g<M, B> {

    /* renamed from: a  reason: collision with root package name */
    private final n00.d<M> f38926a;

    /* renamed from: b  reason: collision with root package name */
    private final Class<B> f38927b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<Integer, b<M, B>> f38928c;

    /* renamed from: d  reason: collision with root package name */
    private final String f38929d;

    /* renamed from: e  reason: collision with root package name */
    private final o f38930e;

    /* JADX WARN: Multi-variable type inference failed */
    public l(n00.d<M> messageType, Class<B> builderType, Map<Integer, ? extends b<M, B>> fields, String str, o syntax) {
        s.g(messageType, "messageType");
        s.g(builderType, "builderType");
        s.g(fields, "fields");
        s.g(syntax, "syntax");
        this.f38926a = messageType;
        this.f38927b = builderType;
        this.f38928c = fields;
        this.f38929d = str;
        this.f38930e = syntax;
    }

    @Override // mr.g
    public n00.d<M> e() {
        return this.f38926a;
    }

    @Override // mr.g
    public Map<Integer, b<M, B>> getFields() {
        return this.f38928c;
    }

    @Override // mr.g
    public o getSyntax() {
        return this.f38930e;
    }

    @Override // mr.g
    public String getTypeUrl() {
        return this.f38929d;
    }

    @Override // mr.g
    /* renamed from: h */
    public void g(B builder, int i11, com.squareup.wire.b fieldEncoding, Object obj) {
        s.g(builder, "builder");
        s.g(fieldEncoding, "fieldEncoding");
        builder.a(i11, fieldEncoding, obj);
    }

    @Override // mr.g
    /* renamed from: i */
    public M b(B builder) {
        s.g(builder, "builder");
        return (M) builder.b();
    }

    @Override // mr.g
    /* renamed from: j */
    public void f(B builder) {
        s.g(builder, "builder");
        builder.c();
    }

    @Override // mr.g
    /* renamed from: k */
    public int a(M message) {
        s.g(message, "message");
        return message.getCachedSerializedSize$wire_runtime();
    }

    @Override // mr.g
    /* renamed from: l */
    public B newBuilder() {
        B newInstance = this.f38927b.newInstance();
        s.f(newInstance, "builderType.newInstance()");
        return newInstance;
    }

    @Override // mr.g
    /* renamed from: m */
    public void d(M message, int i11) {
        s.g(message, "message");
        message.setCachedSerializedSize$wire_runtime(i11);
    }

    @Override // mr.g
    /* renamed from: n */
    public okio.i c(M message) {
        s.g(message, "message");
        return message.unknownFields();
    }
}