package mr;

import com.squareup.wire.o;
import java.util.Map;

/* loaded from: classes2.dex */
public interface g<M, B> {
    int a(M m11);

    M b(B b11);

    okio.i c(M m11);

    void d(M m11, int i11);

    n00.d<? super M> e();

    void f(B b11);

    void g(B b11, int i11, com.squareup.wire.b bVar, Object obj);

    Map<Integer, b<M, B>> getFields();

    o getSyntax();

    String getTypeUrl();

    B newBuilder();
}