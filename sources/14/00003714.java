package com.google.common.base;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes3.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private final String f15928a;

    private n(String str) {
        this.f15928a = (String) u.o(str);
    }

    public static n f(char c11) {
        return new n(String.valueOf(c11));
    }

    public static n g(String str) {
        return new n(str);
    }

    public <A extends Appendable> A a(A a11, Iterator<? extends Object> it2) {
        u.o(a11);
        if (it2.hasNext()) {
            a11.append(h(it2.next()));
            while (it2.hasNext()) {
                a11.append(this.f15928a);
                a11.append(h(it2.next()));
            }
        }
        return a11;
    }

    public final StringBuilder b(StringBuilder sb2, Iterable<? extends Object> iterable) {
        return c(sb2, iterable.iterator());
    }

    public final StringBuilder c(StringBuilder sb2, Iterator<? extends Object> it2) {
        try {
            a(sb2, it2);
            return sb2;
        } catch (IOException e11) {
            throw new AssertionError(e11);
        }
    }

    public final String d(Iterable<? extends Object> iterable) {
        return e(iterable.iterator());
    }

    public final String e(Iterator<? extends Object> it2) {
        return c(new StringBuilder(), it2).toString();
    }

    CharSequence h(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}