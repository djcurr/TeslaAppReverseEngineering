package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* loaded from: classes3.dex */
public class InvalidProtocolBufferException extends IOException {

    /* renamed from: a  reason: collision with root package name */
    private q0 f16229a;

    /* loaded from: classes3.dex */
    public static class InvalidWireTypeException extends InvalidProtocolBufferException {
        public InvalidWireTypeException(String str) {
            super(str);
        }
    }

    public InvalidProtocolBufferException(String str) {
        super(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static InvalidProtocolBufferException b() {
        return new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static InvalidProtocolBufferException c() {
        return new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static InvalidWireTypeException d() {
        return new InvalidWireTypeException("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static InvalidProtocolBufferException e() {
        return new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static InvalidProtocolBufferException f() {
        return new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static InvalidProtocolBufferException g() {
        return new InvalidProtocolBufferException("Failed to parse the message.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static InvalidProtocolBufferException h() {
        return new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static InvalidProtocolBufferException j() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public InvalidProtocolBufferException i(q0 q0Var) {
        this.f16229a = q0Var;
        return this;
    }
}