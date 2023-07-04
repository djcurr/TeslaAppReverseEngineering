package e1;

import java.util.Map;

/* loaded from: classes.dex */
public interface f<K, V> extends Map, i00.a {

    /* loaded from: classes.dex */
    public interface a<K, V> extends Map<K, V>, i00.e {
        f<K, V> build();
    }

    a<K, V> g();
}