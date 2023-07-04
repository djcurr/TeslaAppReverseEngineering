package k5;

import android.os.Build;
import androidx.work.a0;
import androidx.work.d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Iterator;

/* loaded from: classes.dex */
public class v {

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f34444a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f34445b;

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ int[] f34446c;

        /* renamed from: d  reason: collision with root package name */
        static final /* synthetic */ int[] f34447d;

        static {
            int[] iArr = new int[androidx.work.u.values().length];
            f34447d = iArr;
            try {
                iArr[androidx.work.u.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34447d[androidx.work.u.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[androidx.work.r.values().length];
            f34446c = iArr2;
            try {
                iArr2[androidx.work.r.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34446c[androidx.work.r.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34446c[androidx.work.r.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34446c[androidx.work.r.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34446c[androidx.work.r.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[androidx.work.a.values().length];
            f34445b = iArr3;
            try {
                iArr3[androidx.work.a.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f34445b[androidx.work.a.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[a0.a.values().length];
            f34444a = iArr4;
            try {
                iArr4[a0.a.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f34444a[a0.a.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f34444a[a0.a.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f34444a[a0.a.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f34444a[a0.a.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f34444a[a0.a.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public static int a(androidx.work.a aVar) {
        int i11 = a.f34445b[aVar.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return 1;
            }
            throw new IllegalArgumentException("Could not convert " + aVar + " to int");
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0053 -> B:33:0x0056). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.work.d b(byte[] r6) {
        /*
            androidx.work.d r0 = new androidx.work.d
            r0.<init>()
            if (r6 != 0) goto L8
            return r0
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r6)
            r6 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3d
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3d
            int r6 = r2.readInt()     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
        L17:
            if (r6 <= 0) goto L2b
            java.lang.String r3 = r2.readUTF()     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
            boolean r4 = r2.readBoolean()     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
            r0.a(r3, r4)     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
            int r6 = r6 + (-1)
            goto L17
        L2b:
            r2.close()     // Catch: java.io.IOException -> L2f
            goto L33
        L2f:
            r6 = move-exception
            r6.printStackTrace()
        L33:
            r1.close()     // Catch: java.io.IOException -> L52
            goto L56
        L37:
            r6 = move-exception
            goto L41
        L39:
            r0 = move-exception
            r2 = r6
            r6 = r0
            goto L58
        L3d:
            r2 = move-exception
            r5 = r2
            r2 = r6
            r6 = r5
        L41:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L4e
            r2.close()     // Catch: java.io.IOException -> L4a
            goto L4e
        L4a:
            r6 = move-exception
            r6.printStackTrace()
        L4e:
            r1.close()     // Catch: java.io.IOException -> L52
            goto L56
        L52:
            r6 = move-exception
            r6.printStackTrace()
        L56:
            return r0
        L57:
            r6 = move-exception
        L58:
            if (r2 == 0) goto L62
            r2.close()     // Catch: java.io.IOException -> L5e
            goto L62
        L5e:
            r0 = move-exception
            r0.printStackTrace()
        L62:
            r1.close()     // Catch: java.io.IOException -> L66
            goto L6a
        L66:
            r0 = move-exception
            r0.printStackTrace()
        L6a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.v.b(byte[]):androidx.work.d");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0067 -> B:35:0x006a). Please submit an issue!!! */
    public static byte[] c(androidx.work.d dVar) {
        boolean hasNext;
        ObjectOutputStream objectOutputStream = null;
        ObjectOutputStream objectOutputStream2 = null;
        objectOutputStream = null;
        if (dVar.c() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
        } catch (IOException e11) {
            e11.printStackTrace();
            objectOutputStream = objectOutputStream;
        }
        try {
            try {
                ObjectOutputStream objectOutputStream3 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream3.writeInt(dVar.c());
                    Iterator<d.a> it2 = dVar.b().iterator();
                    while (true) {
                        hasNext = it2.hasNext();
                        if (hasNext != 0) {
                            d.a next = it2.next();
                            objectOutputStream3.writeUTF(next.a().toString());
                            objectOutputStream3.writeBoolean(next.b());
                        } else {
                            try {
                                break;
                            } catch (IOException e12) {
                                e12.printStackTrace();
                            }
                        }
                    }
                    objectOutputStream3.close();
                    byteArrayOutputStream.close();
                    objectOutputStream = hasNext;
                } catch (IOException e13) {
                    e = e13;
                    objectOutputStream2 = objectOutputStream3;
                    e.printStackTrace();
                    if (objectOutputStream2 != null) {
                        try {
                            objectOutputStream2.close();
                        } catch (IOException e14) {
                            e14.printStackTrace();
                        }
                    }
                    byteArrayOutputStream.close();
                    objectOutputStream = objectOutputStream2;
                    return byteArrayOutputStream.toByteArray();
                } catch (Throwable th2) {
                    th = th2;
                    objectOutputStream = objectOutputStream3;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e15) {
                            e15.printStackTrace();
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e16) {
                        e16.printStackTrace();
                    }
                    throw th;
                }
            } catch (IOException e17) {
                e = e17;
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static androidx.work.a d(int i11) {
        if (i11 != 0) {
            if (i11 == 1) {
                return androidx.work.a.LINEAR;
            }
            throw new IllegalArgumentException("Could not convert " + i11 + " to BackoffPolicy");
        }
        return androidx.work.a.EXPONENTIAL;
    }

    public static androidx.work.r e(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (Build.VERSION.SDK_INT >= 30 && i11 == 5) {
                                return androidx.work.r.TEMPORARILY_UNMETERED;
                            }
                            throw new IllegalArgumentException("Could not convert " + i11 + " to NetworkType");
                        }
                        return androidx.work.r.METERED;
                    }
                    return androidx.work.r.NOT_ROAMING;
                }
                return androidx.work.r.UNMETERED;
            }
            return androidx.work.r.CONNECTED;
        }
        return androidx.work.r.NOT_REQUIRED;
    }

    public static androidx.work.u f(int i11) {
        if (i11 != 0) {
            if (i11 == 1) {
                return androidx.work.u.DROP_WORK_REQUEST;
            }
            throw new IllegalArgumentException("Could not convert " + i11 + " to OutOfQuotaPolicy");
        }
        return androidx.work.u.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
    }

    public static a0.a g(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                return a0.a.CANCELLED;
                            }
                            throw new IllegalArgumentException("Could not convert " + i11 + " to State");
                        }
                        return a0.a.BLOCKED;
                    }
                    return a0.a.FAILED;
                }
                return a0.a.SUCCEEDED;
            }
            return a0.a.RUNNING;
        }
        return a0.a.ENQUEUED;
    }

    public static int h(androidx.work.r rVar) {
        int i11 = a.f34446c[rVar.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            if (Build.VERSION.SDK_INT < 30 || rVar != androidx.work.r.TEMPORARILY_UNMETERED) {
                                throw new IllegalArgumentException("Could not convert " + rVar + " to int");
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
        return 0;
    }

    public static int i(androidx.work.u uVar) {
        int i11 = a.f34447d[uVar.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return 1;
            }
            throw new IllegalArgumentException("Could not convert " + uVar + " to int");
        }
        return 0;
    }

    public static int j(a0.a aVar) {
        switch (a.f34444a[aVar.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new IllegalArgumentException("Could not convert " + aVar + " to int");
        }
    }
}