package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes3.dex */
public interface q0 extends r0 {

    /* loaded from: classes3.dex */
    public interface a extends r0, Cloneable {
        a C0(q0 q0Var);

        q0 build();

        q0 buildPartial();
    }

    void a(CodedOutputStream codedOutputStream);

    y0<? extends q0> getParserForType();

    int getSerializedSize();

    a newBuilderForType();

    a toBuilder();

    byte[] toByteArray();

    i toByteString();
}