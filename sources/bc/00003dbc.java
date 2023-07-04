package com.google.protobuf.kotlin;

import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0086\u0002\u001a\u0015\u0010\b\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\u0002\u001a\n\u0010\n\u001a\u00020\u0001*\u00020\t\u001a\n\u0010\n\u001a\u00020\u0001*\u00020\u000b¨\u0006\f"}, d2 = {"", "Lcom/google/protobuf/ByteString;", "toByteStringUtf8", "other", "plus", "", "index", "", "get", "", "toByteString", "Ljava/nio/ByteBuffer;", "protobuf-kotlin-lite"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ByteStringsKt {
    public static final byte get(ByteString byteString, int i11) {
        s.g(byteString, "<this>");
        return byteString.byteAt(i11);
    }

    public static final ByteString plus(ByteString byteString, ByteString other) {
        s.g(byteString, "<this>");
        s.g(other, "other");
        ByteString concat = byteString.concat(other);
        s.f(concat, "concat(other)");
        return concat;
    }

    public static final ByteString toByteString(byte[] bArr) {
        s.g(bArr, "<this>");
        ByteString copyFrom = ByteString.copyFrom(bArr);
        s.f(copyFrom, "copyFrom(this)");
        return copyFrom;
    }

    public static final ByteString toByteStringUtf8(String str) {
        s.g(str, "<this>");
        ByteString copyFromUtf8 = ByteString.copyFromUtf8(str);
        s.f(copyFromUtf8, "copyFromUtf8(this)");
        return copyFromUtf8;
    }

    public static final ByteString toByteString(ByteBuffer byteBuffer) {
        s.g(byteBuffer, "<this>");
        ByteString copyFrom = ByteString.copyFrom(byteBuffer);
        s.f(copyFrom, "copyFrom(this)");
        return copyFrom;
    }
}