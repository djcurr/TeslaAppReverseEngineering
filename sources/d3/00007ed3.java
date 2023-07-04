package kotlin.reflect.jvm.internal.impl.protobuf;

/* loaded from: classes5.dex */
public interface o extends p {

    /* loaded from: classes5.dex */
    public interface a extends Cloneable, p {
        a D(e eVar, f fVar);

        o build();
    }

    void a(CodedOutputStream codedOutputStream);

    q<? extends o> getParserForType();

    int getSerializedSize();

    a newBuilderForType();

    a toBuilder();
}