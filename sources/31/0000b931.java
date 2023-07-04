package v4;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;

/* loaded from: classes.dex */
public interface g extends Closeable {
    boolean B1();

    k H0(String str);

    void N();

    void P(String str, Object[] objArr);

    void Q();

    void X();

    Cursor a1(String str);

    void beginTransaction();

    Cursor d0(j jVar);

    Cursor e1(j jVar, CancellationSignal cancellationSignal);

    String getPath();

    boolean isOpen();

    List<Pair<String, String>> s();

    boolean s1();

    void u(String str);
}