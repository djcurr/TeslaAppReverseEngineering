package expo.modules.core.interfaces;

import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public interface Arguments {
    boolean containsKey(String str);

    Object get(String str);

    Arguments getArguments(String str);

    boolean getBoolean(String str);

    boolean getBoolean(String str, boolean z11);

    double getDouble(String str);

    double getDouble(String str, double d11);

    int getInt(String str);

    int getInt(String str, int i11);

    List getList(String str);

    List getList(String str, List list);

    long getLong(String str);

    long getLong(String str, long j11);

    Map getMap(String str);

    Map getMap(String str, Map map);

    String getString(String str);

    String getString(String str, String str2);

    boolean isEmpty();

    int size();
}