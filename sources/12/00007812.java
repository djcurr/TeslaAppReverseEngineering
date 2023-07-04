package io.realm;

import io.realm.b0;
import io.realm.exceptions.RealmException;
import io.realm.internal.core.NativeRealmAny;

/* loaded from: classes5.dex */
public abstract class d0 {

    /* renamed from: a  reason: collision with root package name */
    private NativeRealmAny f31759a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f31760a;

        static {
            int[] iArr = new int[b0.a.values().length];
            f31760a = iArr;
            try {
                iArr[b0.a.INTEGER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31760a[b0.a.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31760a[b0.a.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31760a[b0.a.BINARY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31760a[b0.a.DATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31760a[b0.a.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31760a[b0.a.DOUBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f31760a[b0.a.DECIMAL128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f31760a[b0.a.OBJECT_ID.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f31760a[b0.a.UUID.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f31760a[b0.a.OBJECT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f31760a[b0.a.NULL.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public d0(b0.a aVar) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d0 b(io.realm.a aVar, NativeRealmAny nativeRealmAny) {
        b0.a type = nativeRealmAny.getType();
        switch (a.f31760a[type.ordinal()]) {
            case 1:
                return new p(nativeRealmAny);
            case 2:
                return new c(nativeRealmAny);
            case 3:
                return new t0(nativeRealmAny);
            case 4:
                return new b(nativeRealmAny);
            case 5:
                return new e(nativeRealmAny);
            case 6:
                return new l(nativeRealmAny);
            case 7:
                return new g(nativeRealmAny);
            case 8:
                return new f(nativeRealmAny);
            case 9:
                return new u(nativeRealmAny);
            case 10:
                return new u0(nativeRealmAny);
            case 11:
                if (aVar instanceof a0) {
                    try {
                        return new m0(aVar, nativeRealmAny, nativeRealmAny.getModelClass(aVar.f31744e, aVar.f31742c.n()));
                    } catch (RealmException unused) {
                    }
                }
                return new i(aVar, nativeRealmAny);
            case 12:
                return new s(nativeRealmAny);
            default:
                throw new ClassCastException("Couldn't cast to " + type);
        }
    }

    private synchronized NativeRealmAny d() {
        if (this.f31759a == null) {
            this.f31759a = a();
        }
        return this.f31759a;
    }

    protected abstract NativeRealmAny a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public long c() {
        return d().getNativePtr();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <T> T e(Class<T> cls);

    /* JADX INFO: Access modifiers changed from: protected */
    public d0(b0.a aVar, NativeRealmAny nativeRealmAny) {
        this.f31759a = nativeRealmAny;
    }
}