package net.time4j.tz.model;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.time4j.c0;
import net.time4j.h0;
import net.time4j.tz.p;
import net.time4j.tz.q;
import net.time4j.x0;

/* loaded from: classes5.dex */
final class SPX implements Externalizable {
    private static final long serialVersionUID = 6526945678752534989L;

    /* renamed from: a  reason: collision with root package name */
    private transient Object f41558a;

    /* renamed from: b  reason: collision with root package name */
    private transient int f41559b;

    public SPX() {
    }

    private static Object a(ObjectInput objectInput) {
        return new a(j(objectInput), false, false);
    }

    private static Object b(ObjectInput objectInput) {
        List<q> j11 = j(objectInput);
        return l.g(p.s(j11.get(0).f()), j11, h(objectInput), false, false);
    }

    private static d c(DataInput dataInput) {
        int readByte = dataInput.readByte() & 255;
        c0 valueOf = c0.valueOf(readByte >>> 4);
        int i11 = readByte & 15;
        i iVar = i.VALUES[i11 % 3];
        int i12 = i(i11);
        int readByte2 = dataInput.readByte() & 255;
        int i13 = readByte2 >>> 3;
        x0 valueOf2 = x0.valueOf(readByte2 & 7);
        int readByte3 = dataInput.readByte() & 255;
        boolean z11 = (readByte3 >>> 7) == 1;
        int i14 = readByte3 & 63;
        if (i12 == -1) {
            i12 = f(dataInput);
        }
        return new c(valueOf, i13, valueOf2, i14 == 63 ? dataInput.readInt() : i14 * 1800, iVar, i12, z11);
    }

    private static d d(DataInput dataInput) {
        int readByte = dataInput.readByte() & 255;
        int i11 = readByte >>> 4;
        int i12 = readByte & 15;
        i iVar = i.VALUES[i12 % 3];
        int i13 = i(i12);
        int readByte2 = dataInput.readByte() & 255;
        int i14 = readByte2 >>> 3;
        int n11 = n(readByte2 & 7);
        if (i13 == -1) {
            i13 = f(dataInput);
        }
        return new f(c0.valueOf(i11), i14, n11 == -1 ? dataInput.readInt() : n11, iVar, i13);
    }

    private static d e(DataInput dataInput) {
        int readByte = dataInput.readByte() & 255;
        c0 valueOf = c0.valueOf(readByte >>> 4);
        int i11 = readByte & 15;
        i iVar = i.VALUES[i11 % 3];
        int i12 = i(i11);
        int readByte2 = dataInput.readByte() & 255;
        x0 valueOf2 = x0.valueOf(readByte2 >>> 5);
        int i13 = readByte2 & 31;
        if (i12 == -1) {
            i12 = f(dataInput);
        }
        return new h(valueOf, valueOf2, i13 == 31 ? dataInput.readInt() : i13 * 3600, iVar, i12);
    }

    private static int f(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? dataInput.readInt() : readByte * 900;
    }

    private static Object g(ObjectInput objectInput) {
        int readByte;
        long readByte2;
        if ((objectInput.readByte() & 255) == 255) {
            readByte2 = objectInput.readLong();
        } else {
            readByte2 = ((((readByte << 16) + ((objectInput.readByte() & 255) << 8)) + (255 & objectInput.readByte())) * 900) - 4575744000L;
        }
        return new j(new q(readByte2, f(objectInput), f(objectInput), f(objectInput)), h(objectInput), false);
    }

    private static List<d> h(ObjectInput objectInput) {
        d d11;
        byte readByte = objectInput.readByte();
        if (readByte == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(readByte);
        d dVar = null;
        int i11 = 0;
        while (i11 < readByte) {
            switch (objectInput.readByte()) {
                case 120:
                    d11 = d(objectInput);
                    break;
                case 121:
                    d11 = c(objectInput);
                    break;
                case 122:
                    d11 = e(objectInput);
                    break;
                default:
                    d11 = (d) objectInput.readObject();
                    break;
            }
            if (dVar != null && k.INSTANCE.compare(dVar, d11) >= 0) {
                throw new InvalidObjectException("Order of daylight saving rules is not ascending.");
            }
            arrayList.add(d11);
            i11++;
            dVar = d11;
        }
        return arrayList;
    }

    private static int i(int i11) {
        int i12 = i11 / 3;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    return i12 != 3 ? -1 : 7200;
                }
                return 3600;
            }
            return 1800;
        }
        return 0;
    }

    private static List<q> j(ObjectInput objectInput) {
        long readByte;
        int i11;
        int i12;
        int readInt = objectInput.readInt();
        if (readInt == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(readInt);
        int f11 = f(objectInput);
        long j11 = Long.MIN_VALUE;
        int i13 = f11;
        int i14 = 0;
        while (i14 < readInt) {
            byte readByte2 = objectInput.readByte();
            boolean z11 = readByte2 < 0;
            int i15 = (readByte2 >>> 5) & 3;
            int o11 = o((readByte2 >>> 2) & 7);
            if (o11 == -1) {
                readByte = objectInput.readLong();
            } else {
                readByte = ((((((((readByte2 & 3) << 16) | ((objectInput.readByte() & 255) << 8)) | (objectInput.readByte() & 255)) * 86400) - 4575744000L) + o11) - 7200) - f11;
            }
            if (readByte > j11) {
                if (i15 != 1) {
                    if (i15 != 2) {
                        i12 = i15 != 3 ? f(objectInput) : 7200;
                    } else {
                        i12 = 3600;
                    }
                    i11 = i12;
                } else {
                    i11 = 0;
                }
                if (z11) {
                    f11 = f(objectInput);
                }
                int i16 = (i11 == Integer.MAX_VALUE ? 0 : i11) + f11;
                arrayList.add(new q(readByte, i13, i16, i11));
                i14++;
                i13 = i16;
                j11 = readByte;
            } else {
                throw new StreamCorruptedException("Wrong order of transitions.");
            }
        }
        return arrayList;
    }

    private static int k(int i11) {
        if (i11 != 0) {
            if (i11 != 3600) {
                if (i11 != 7200) {
                    if (i11 != 10800) {
                        if (i11 != 79200) {
                            if (i11 != 82800) {
                                return i11 != 86400 ? 0 : 7;
                            }
                            return 6;
                        }
                        return 5;
                    }
                    return 4;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    private static int l(int i11) {
        if (i11 != 0) {
            if (i11 != 60) {
                if (i11 != 3600) {
                    if (i11 != 7200) {
                        if (i11 != 10800) {
                            if (i11 != 14400) {
                                return i11 != 18000 ? 0 : 7;
                            }
                            return 6;
                        }
                        return 5;
                    }
                    return 4;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    private static int m(g gVar) {
        return gVar.f().h(h0.E) + net.time4j.base.c.g(gVar.c() * 86400);
    }

    private static int n(int i11) {
        switch (i11) {
            case 1:
                return 0;
            case 2:
                return 3600;
            case 3:
                return 7200;
            case 4:
                return 10800;
            case 5:
                return 79200;
            case 6:
                return 82800;
            case 7:
                return 86400;
            default:
                return -1;
        }
    }

    private static int o(int i11) {
        switch (i11) {
            case 1:
                return 0;
            case 2:
                return 60;
            case 3:
                return 3600;
            case 4:
                return 7200;
            case 5:
                return 10800;
            case 6:
                return 14400;
            case 7:
                return 18000;
            default:
                return -1;
        }
    }

    private static void p(Object obj, ObjectOutput objectOutput) {
        ((a) obj).u(objectOutput);
    }

    private static void q(Object obj, ObjectOutput objectOutput) {
        b bVar = (b) obj;
        bVar.l(objectOutput);
        x(bVar.k(), objectOutput);
    }

    private static void r(Object obj, DataOutput dataOutput) {
        int i11;
        c cVar = (c) obj;
        boolean u11 = u(cVar, dataOutput);
        dataOutput.writeByte(((cVar.m() << 3) | cVar.n()) & 255);
        boolean z11 = false;
        int i12 = cVar.o() ? 128 : 0;
        int m11 = m(cVar);
        if (m11 % 1800 == 0) {
            i11 = i12 | (m11 / 1800);
            z11 = true;
        } else {
            i11 = i12 | 63;
        }
        dataOutput.writeByte(i11 & 255);
        if (!u11) {
            v(dataOutput, cVar.e());
        }
        if (z11) {
            return;
        }
        dataOutput.writeInt(m11);
    }

    private Object readResolve() {
        return this.f41558a;
    }

    private static void s(Object obj, DataOutput dataOutput) {
        f fVar = (f) obj;
        boolean u11 = u(fVar, dataOutput);
        int m11 = m(fVar);
        int k11 = k(m11);
        dataOutput.writeByte(((fVar.m() << 3) | k11) & 255);
        if (!u11) {
            v(dataOutput, fVar.e());
        }
        if (k11 == 0) {
            dataOutput.writeInt(m11);
        }
    }

    private static void t(Object obj, DataOutput dataOutput) {
        int i11;
        boolean z11;
        h hVar = (h) obj;
        boolean u11 = u(hVar, dataOutput);
        int m11 = hVar.m() << 5;
        int m12 = m(hVar);
        if (m12 % 3600 == 0) {
            i11 = m11 | (m12 / 3600);
            z11 = true;
        } else {
            i11 = m11 | 31;
            z11 = false;
        }
        dataOutput.writeByte(i11 & 255);
        if (!u11) {
            v(dataOutput, hVar.e());
        }
        if (z11) {
            return;
        }
        dataOutput.writeInt(m12);
    }

    private static boolean u(g gVar, DataOutput dataOutput) {
        int k11 = gVar.k() << 4;
        int ordinal = gVar.d().ordinal();
        int e11 = gVar.e();
        boolean z11 = true;
        if (e11 != 0) {
            if (e11 == 1800) {
                ordinal += 3;
            } else if (e11 == 3600) {
                ordinal += 6;
            } else if (e11 != 7200) {
                z11 = false;
                ordinal += 12;
            } else {
                ordinal += 9;
            }
        }
        dataOutput.writeByte((k11 | ordinal) & 255);
        return z11;
    }

    private static void v(DataOutput dataOutput, int i11) {
        if (i11 % 900 == 0) {
            dataOutput.writeByte(i11 / 900);
            return;
        }
        dataOutput.writeByte(127);
        dataOutput.writeInt(i11);
    }

    private static void w(Object obj, ObjectOutput objectOutput) {
        j jVar = (j) obj;
        q l11 = jVar.l();
        long e11 = l11.e();
        if (e11 >= -4575744000L && e11 < 10464767099L && e11 % 900 == 0) {
            int i11 = (int) ((e11 - (-4575744000L)) / 900);
            objectOutput.writeByte((i11 >>> 16) & 255);
            objectOutput.writeByte((i11 >>> 8) & 255);
            objectOutput.writeByte(i11 & 255);
        } else {
            objectOutput.writeByte(255);
            objectOutput.writeLong(l11.e());
        }
        v(objectOutput, l11.f());
        v(objectOutput, l11.i());
        v(objectOutput, l11.d());
        x(jVar.n(), objectOutput);
    }

    private static void x(List<d> list, ObjectOutput objectOutput) {
        objectOutput.writeByte(list.size());
        for (d dVar : list) {
            objectOutput.writeByte(dVar.g());
            switch (dVar.g()) {
                case 120:
                    s(dVar, objectOutput);
                    break;
                case 121:
                    r(dVar, objectOutput);
                    break;
                case 122:
                    t(dVar, objectOutput);
                    break;
                default:
                    objectOutput.writeObject(dVar);
                    break;
            }
        }
    }

    private static int y(q qVar, int i11, DataOutput dataOutput) {
        int h11 = qVar.h();
        int i12 = 0;
        boolean z11 = h11 != i11;
        byte b11 = z11 ? (byte) 128 : (byte) 0;
        int d11 = qVar.d();
        int i13 = d11 != 0 ? d11 != 3600 ? d11 != 7200 ? 0 : 3 : 2 : 1;
        byte b12 = (byte) (b11 | (i13 << 5));
        long e11 = qVar.e() + i11 + 7200;
        if (e11 >= -4575744000L && e11 < 18067104000L) {
            i12 = l(net.time4j.base.c.d(e11, 86400));
        }
        byte b13 = (byte) ((i12 << 2) | b12);
        if (i12 == 0) {
            dataOutput.writeByte(b13);
            dataOutput.writeLong(qVar.e());
        } else {
            int i14 = (int) ((e11 - (-4575744000L)) / 86400);
            dataOutput.writeByte((byte) (b13 | ((byte) ((i14 >>> 16) & 3))));
            dataOutput.writeByte((i14 >>> 8) & 255);
            dataOutput.writeByte(i14 & 255);
        }
        if (i13 == 0) {
            v(dataOutput, d11);
        }
        if (z11) {
            v(dataOutput, h11);
        }
        return h11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void z(q[] qVarArr, int i11, DataOutput dataOutput) {
        int min = Math.min(i11, qVarArr.length);
        dataOutput.writeInt(min);
        if (min > 0) {
            int f11 = qVarArr[0].f();
            v(dataOutput, f11);
            for (int i12 = 0; i12 < min; i12++) {
                f11 = y(qVarArr[i12], f11, dataOutput);
            }
        }
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        switch (objectInput.readByte()) {
            case 120:
                this.f41558a = d(objectInput);
                return;
            case 121:
                this.f41558a = c(objectInput);
                return;
            case 122:
                this.f41558a = e(objectInput);
                return;
            case 123:
            case 124:
            default:
                throw new StreamCorruptedException("Unknown serialized type.");
            case 125:
                this.f41558a = g(objectInput);
                return;
            case 126:
                this.f41558a = a(objectInput);
                return;
            case Byte.MAX_VALUE:
                this.f41558a = b(objectInput);
                return;
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeByte(this.f41559b);
        switch (this.f41559b) {
            case 120:
                s(this.f41558a, objectOutput);
                return;
            case 121:
                r(this.f41558a, objectOutput);
                return;
            case 122:
                t(this.f41558a, objectOutput);
                return;
            case 123:
            case 124:
            default:
                throw new InvalidClassException("Unknown serialized type.");
            case 125:
                w(this.f41558a, objectOutput);
                return;
            case 126:
                p(this.f41558a, objectOutput);
                return;
            case 127:
                q(this.f41558a, objectOutput);
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SPX(Object obj, int i11) {
        this.f41558a = obj;
        this.f41559b = i11;
    }
}