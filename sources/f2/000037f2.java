package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a;
import com.google.crypto.tink.shaded.protobuf.a.AbstractC0298a;
import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.q0;
import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0298a<MessageType, BuilderType>> implements q0 {
    protected int memoizedHashCode = 0;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC0298a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0298a<MessageType, BuilderType>> implements q0.a {
        /* JADX INFO: Access modifiers changed from: protected */
        public static UninitializedMessageException d(q0 q0Var) {
            return new UninitializedMessageException(q0Var);
        }

        protected abstract BuilderType b(MessageType messagetype);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.crypto.tink.shaded.protobuf.q0.a
        /* renamed from: c */
        public BuilderType C0(q0 q0Var) {
            if (getDefaultInstanceForType().getClass().isInstance(q0Var)) {
                return (BuilderType) b((a) q0Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    private String d(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    int b() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c(f1 f1Var) {
        int b11 = b();
        if (b11 == -1) {
            int serializedSize = f1Var.getSerializedSize(this);
            f(serializedSize);
            return serializedSize;
        }
        return b11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public UninitializedMessageException e() {
        return new UninitializedMessageException(this);
    }

    void f(int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            CodedOutputStream d02 = CodedOutputStream.d0(bArr);
            a(d02);
            d02.c();
            return bArr;
        } catch (IOException e11) {
            throw new RuntimeException(d("byte array"), e11);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public i toByteString() {
        try {
            i.h o11 = i.o(getSerializedSize());
            a(o11.b());
            return o11.a();
        } catch (IOException e11) {
            throw new RuntimeException(d("ByteString"), e11);
        }
    }
}