package n00;

import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public interface c<R> extends b {
    R call(Object... objArr);

    R callBy(Map<l, ? extends Object> map);

    String getName();

    List<l> getParameters();

    p getReturnType();

    List<q> getTypeParameters();

    t getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}