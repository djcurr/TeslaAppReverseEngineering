package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.q0;

/* loaded from: classes3.dex */
public abstract class b<MessageType extends q0> implements y0<MessageType> {
    static {
        p.b();
    }

    private MessageType c(MessageType messagetype) {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw d(messagetype).a().i(messagetype);
    }

    private UninitializedMessageException d(MessageType messagetype) {
        if (messagetype instanceof a) {
            return ((a) messagetype).e();
        }
        return new UninitializedMessageException(messagetype);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y0
    /* renamed from: e */
    public MessageType b(i iVar, p pVar) {
        return c(f(iVar, pVar));
    }

    public MessageType f(i iVar, p pVar) {
        try {
            j p11 = iVar.p();
            MessageType messagetype = (MessageType) a(p11, pVar);
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