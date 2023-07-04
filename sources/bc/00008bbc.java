package net.time4j.history;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import net.time4j.engine.z;
import net.time4j.g0;

/* loaded from: classes5.dex */
final class SPX implements Externalizable {

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f41352c = new int[0];
    private static final long serialVersionUID = 1;

    /* renamed from: a  reason: collision with root package name */
    private transient Object f41353a;

    /* renamed from: b  reason: collision with root package name */
    private transient int f41354b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f41355a;

        static {
            int[] iArr = new int[l30.b.values().length];
            f41355a = iArr;
            try {
                iArr[l30.b.PROLEPTIC_GREGORIAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41355a[l30.b.PROLEPTIC_JULIAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41355a[l30.b.PROLEPTIC_BYZANTINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41355a[l30.b.SWEDEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41355a[l30.b.INTRODUCTION_ON_1582_10_15.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public SPX() {
    }

    private static l30.b a(int i11) {
        l30.b[] values;
        for (l30.b bVar : l30.b.values()) {
            if (bVar.getSerialValue() == i11) {
                return bVar;
            }
        }
        throw new StreamCorruptedException("Unknown variant of chronological history.");
    }

    private d b(DataInput dataInput, byte b11) {
        int i11 = a.f41355a[a(b11 & 15).ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return d.G(g0.V0(dataInput.readLong(), z.MODIFIED_JULIAN_DATE));
                        }
                        return d.E();
                    }
                    return d.H();
                }
                return d.f41366w;
            }
            return d.f41365t;
        }
        return d.f41364q;
    }

    private static net.time4j.history.a c(DataInput dataInput) {
        int readInt = dataInput.readInt();
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            for (int i11 = 0; i11 < readInt; i11++) {
                iArr[i11] = 1 - dataInput.readInt();
            }
            return net.time4j.history.a.f(iArr);
        }
        return null;
    }

    private void d(DataOutput dataOutput) {
        d dVar = (d) this.f41353a;
        dataOutput.writeByte(dVar.t().getSerialValue() | (this.f41354b << 4));
        if (dVar.t() == l30.b.SINGLE_CUTOVER_DATE) {
            dataOutput.writeLong(dVar.q().get(0).f41388a);
        }
        int[] e11 = dVar.x() ? dVar.m().e() : f41352c;
        dataOutput.writeInt(e11.length);
        for (int i11 : e11) {
            dataOutput.writeInt(i11);
        }
        dVar.w().g(dataOutput);
        dVar.p().h(dataOutput);
    }

    private Object readResolve() {
        return this.f41353a;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        d b11;
        byte readByte = objectInput.readByte();
        int i11 = (readByte & 255) >> 4;
        if (i11 == 1) {
            b11 = b(objectInput, readByte);
        } else if (i11 == 2) {
            d b12 = b(objectInput, readByte);
            net.time4j.history.a c11 = c(objectInput);
            b11 = c11 != null ? b12.I(c11) : b12;
        } else if (i11 == 3) {
            d b13 = b(objectInput, readByte);
            net.time4j.history.a c12 = c(objectInput);
            if (c12 != null) {
                b13 = b13.I(c12);
            }
            b11 = b13.K(o.e(objectInput)).J(g.g(objectInput));
        } else {
            throw new StreamCorruptedException("Unknown serialized type.");
        }
        this.f41353a = b11;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        int i11 = this.f41354b;
        if (i11 != 1 && i11 != 2 && i11 != 3) {
            throw new InvalidClassException("Unknown serialized type.");
        }
        d(objectOutput);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SPX(Object obj, int i11) {
        this.f41353a = obj;
        this.f41354b = i11;
    }
}