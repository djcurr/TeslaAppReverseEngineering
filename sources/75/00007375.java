package hl;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.q0;
import hl.h;
import java.security.GeneralSecurityException;
import ol.y;

/* loaded from: classes3.dex */
public class f<PrimitiveT, KeyProtoT extends q0> implements e<PrimitiveT> {

    /* renamed from: a  reason: collision with root package name */
    private final h<KeyProtoT> f29312a;

    /* renamed from: b  reason: collision with root package name */
    private final Class<PrimitiveT> f29313b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class a<KeyFormatProtoT extends q0, KeyProtoT extends q0> {

        /* renamed from: a  reason: collision with root package name */
        final h.a<KeyFormatProtoT, KeyProtoT> f29314a;

        a(h.a<KeyFormatProtoT, KeyProtoT> aVar) {
            this.f29314a = aVar;
        }

        private KeyProtoT b(KeyFormatProtoT keyformatprotot) {
            this.f29314a.d(keyformatprotot);
            return this.f29314a.a(keyformatprotot);
        }

        KeyProtoT a(com.google.crypto.tink.shaded.protobuf.i iVar) {
            return b(this.f29314a.c(iVar));
        }
    }

    public f(h<KeyProtoT> hVar, Class<PrimitiveT> cls) {
        if (!hVar.h().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", hVar.toString(), cls.getName()));
        }
        this.f29312a = hVar;
        this.f29313b = cls;
    }

    private a<?, KeyProtoT> f() {
        return new a<>(this.f29312a.e());
    }

    private PrimitiveT g(KeyProtoT keyprotot) {
        if (!Void.class.equals(this.f29313b)) {
            this.f29312a.i(keyprotot);
            return (PrimitiveT) this.f29312a.d(keyprotot, (Class<PrimitiveT>) this.f29313b);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    @Override // hl.e
    public final boolean a(String str) {
        return str.equals(e());
    }

    @Override // hl.e
    public final y b(com.google.crypto.tink.shaded.protobuf.i iVar) {
        try {
            return y.K().o(e()).p(f().a(iVar).toByteString()).n(this.f29312a.f()).build();
        } catch (InvalidProtocolBufferException e11) {
            throw new GeneralSecurityException("Unexpected proto", e11);
        }
    }

    @Override // hl.e
    public final PrimitiveT c(com.google.crypto.tink.shaded.protobuf.i iVar) {
        try {
            return g(this.f29312a.g(iVar));
        } catch (InvalidProtocolBufferException e11) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.f29312a.b().getName(), e11);
        }
    }

    @Override // hl.e
    public final q0 d(com.google.crypto.tink.shaded.protobuf.i iVar) {
        try {
            return f().a(iVar);
        } catch (InvalidProtocolBufferException e11) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.f29312a.e().b().getName(), e11);
        }
    }

    public final String e() {
        return this.f29312a.c();
    }
}