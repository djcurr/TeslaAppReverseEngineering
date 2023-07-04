package com.google.crypto.tink.shaded.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
import org.spongycastle.i18n.LocalizedMessage;

/* loaded from: classes3.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    static final Charset f16230a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f16231b;

    /* loaded from: classes3.dex */
    public interface a extends i<Boolean> {
    }

    /* loaded from: classes3.dex */
    public interface b extends i<Double> {
    }

    /* loaded from: classes3.dex */
    public interface c {
        int getNumber();
    }

    /* loaded from: classes3.dex */
    public interface d<T extends c> {
        T findValueByNumber(int i11);
    }

    /* loaded from: classes3.dex */
    public interface e {
        boolean isInRange(int i11);
    }

    /* loaded from: classes3.dex */
    public interface f extends i<Float> {
    }

    /* loaded from: classes3.dex */
    public interface g extends i<Integer> {
    }

    /* loaded from: classes3.dex */
    public interface h extends i<Long> {
    }

    /* loaded from: classes3.dex */
    public interface i<E> extends List<E>, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        i<E> mutableCopyWithCapacity(int i11);
    }

    static {
        Charset.forName(LocalizedMessage.DEFAULT_ENCODING);
        byte[] bArr = new byte[0];
        f16231b = bArr;
        ByteBuffer.wrap(bArr);
        j.f(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T a(T t11) {
        Objects.requireNonNull(t11);
        return t11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T b(T t11, String str) {
        Objects.requireNonNull(t11, str);
        return t11;
    }

    public static int c(boolean z11) {
        return z11 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    static int e(byte[] bArr, int i11, int i12) {
        int i13 = i(i12, bArr, i11, i12);
        if (i13 == 0) {
            return 1;
        }
        return i13;
    }

    public static int f(long j11) {
        return (int) (j11 ^ (j11 >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return q1.m(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object h(Object obj, Object obj2) {
        return ((q0) obj).toBuilder().C0((q0) obj2).buildPartial();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(int i11, byte[] bArr, int i12, int i13) {
        for (int i14 = i12; i14 < i12 + i13; i14++) {
            i11 = (i11 * 31) + bArr[i14];
        }
        return i11;
    }

    public static String j(byte[] bArr) {
        return new String(bArr, f16230a);
    }
}