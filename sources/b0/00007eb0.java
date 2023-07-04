package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.o;

/* loaded from: classes5.dex */
public abstract class b<MessageType extends o> implements q<MessageType> {
    static {
        f.c();
    }

    private MessageType e(MessageType messagetype) {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw f(messagetype).a().i(messagetype);
    }

    private UninitializedMessageException f(MessageType messagetype) {
        if (messagetype instanceof a) {
            return ((a) messagetype).b();
        }
        return new UninitializedMessageException(messagetype);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
    /* renamed from: g */
    public MessageType d(InputStream inputStream, f fVar) {
        return e(j(inputStream, fVar));
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
    /* renamed from: h */
    public MessageType a(InputStream inputStream, f fVar) {
        return e(k(inputStream, fVar));
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
    /* renamed from: i */
    public MessageType b(d dVar, f fVar) {
        return e(l(dVar, fVar));
    }

    public MessageType j(InputStream inputStream, f fVar) {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            return k(new a.AbstractC0651a.C0652a(inputStream, e.B(read, inputStream)), fVar);
        } catch (IOException e11) {
            throw new InvalidProtocolBufferException(e11.getMessage());
        }
    }

    public MessageType k(InputStream inputStream, f fVar) {
        e g11 = e.g(inputStream);
        MessageType messagetype = (MessageType) c(g11, fVar);
        try {
            g11.a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e11) {
            throw e11.i(messagetype);
        }
    }

    public MessageType l(d dVar, f fVar) {
        try {
            e p11 = dVar.p();
            MessageType messagetype = (MessageType) c(p11, fVar);
            try {
                p11.a(0);
                return messagetype;
            } catch (InvalidProtocolBufferException e11) {
                throw e11.i(messagetype);
            }
        } catch (InvalidProtocolBufferException e12) {
            throw e12;
        }
    }
}