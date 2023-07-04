package com.facebook.soloader;

import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedByInterruptException;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes3.dex */
public final class m {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class a extends RuntimeException {
        a(String str) {
            super(str);
        }
    }

    /* loaded from: classes3.dex */
    public enum b {
        NOT_SO("not_so"),
        X86("x86"),
        ARM("armeabi-v7a"),
        X86_64("x86_64"),
        AARCH64("arm64-v8a"),
        OTHERS("others");
        
        private final String value;

        b(String str) {
            this.value = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    public static String[] a(f fVar) {
        if (fVar instanceof g) {
            return c((g) fVar);
        }
        return b(fVar);
    }

    private static String[] b(f fVar) {
        long g11;
        long j11;
        long j12;
        String str;
        long j13;
        String str2;
        long g12;
        long d11;
        long d12;
        long d13;
        long g13;
        long g14;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (g(fVar, allocate, 0L) == 1179403647) {
            boolean z11 = h(fVar, allocate, 4L) == 1;
            if (h(fVar, allocate, 5L) == 2) {
                allocate.order(ByteOrder.BIG_ENDIAN);
            }
            long g15 = z11 ? g(fVar, allocate, 28L) : d(fVar, allocate, 32L);
            long f11 = z11 ? f(fVar, allocate, 44L) : f(fVar, allocate, 56L);
            int f12 = f(fVar, allocate, z11 ? 42L : 54L);
            if (f11 == WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                long g16 = z11 ? g(fVar, allocate, 32L) : d(fVar, allocate, 40L);
                if (z11) {
                    g14 = g(fVar, allocate, g16 + 28);
                } else {
                    g14 = g(fVar, allocate, g16 + 44);
                }
                f11 = g14;
            }
            long j14 = g15;
            long j15 = 0;
            while (true) {
                if (j15 >= f11) {
                    j11 = 0;
                    break;
                }
                if (z11) {
                    g13 = g(fVar, allocate, j14 + 0);
                } else {
                    g13 = g(fVar, allocate, j14 + 0);
                }
                if (g13 != 2) {
                    j14 += f12;
                    j15++;
                } else if (z11) {
                    j11 = g(fVar, allocate, j14 + 4);
                } else {
                    j11 = d(fVar, allocate, j14 + 8);
                }
            }
            long j16 = 0;
            if (j11 == 0) {
                throw new a("ELF file does not contain dynamic linking information");
            }
            long j17 = j11;
            long j18 = 0;
            int i11 = 0;
            while (true) {
                boolean z12 = z11;
                long g17 = z11 ? g(fVar, allocate, j17 + j16) : d(fVar, allocate, j17 + j16);
                long j19 = j11;
                String str3 = "malformed DT_NEEDED section";
                if (g17 != 1) {
                    j12 = g17;
                    if (g17 == 5) {
                        j18 = z12 ? g(fVar, allocate, j17 + 4) : d(fVar, allocate, j17 + 8);
                    }
                } else if (i11 == Integer.MAX_VALUE) {
                    throw new a("malformed DT_NEEDED section");
                } else {
                    i11++;
                    j12 = g17;
                }
                long j21 = 16;
                j17 += z12 ? 8L : 16L;
                j16 = 0;
                if (j12 != 0) {
                    z11 = z12;
                    j11 = j19;
                } else if (j18 == 0) {
                    throw new a("Dynamic section string-table not found");
                } else {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= f11) {
                            str = str3;
                            j13 = 0;
                            break;
                        }
                        if (z12) {
                            g12 = g(fVar, allocate, g15 + j16);
                        } else {
                            g12 = g(fVar, allocate, g15 + j16);
                        }
                        if (g12 == 1) {
                            if (z12) {
                                d11 = g(fVar, allocate, g15 + 8);
                            } else {
                                d11 = d(fVar, allocate, g15 + j21);
                            }
                            if (z12) {
                                str = str3;
                                d12 = g(fVar, allocate, g15 + 20);
                            } else {
                                str = str3;
                                d12 = d(fVar, allocate, g15 + 40);
                            }
                            if (d11 <= j18 && j18 < d12 + d11) {
                                if (z12) {
                                    d13 = g(fVar, allocate, g15 + 4);
                                } else {
                                    d13 = d(fVar, allocate, g15 + 8);
                                }
                                j13 = d13 + (j18 - d11);
                            }
                        } else {
                            str = str3;
                        }
                        g15 += f12;
                        i12++;
                        str3 = str;
                        j21 = 16;
                        j16 = 0;
                    }
                    long j22 = 0;
                    if (j13 != 0) {
                        String[] strArr = new String[i11];
                        long j23 = j19;
                        int i13 = 0;
                        while (true) {
                            long j24 = j23 + j22;
                            long g18 = z12 ? g(fVar, allocate, j24) : d(fVar, allocate, j24);
                            if (g18 == 1) {
                                strArr[i13] = e(fVar, allocate, (z12 ? g(fVar, allocate, j23 + 4) : d(fVar, allocate, j23 + 8)) + j13);
                                if (i13 == Integer.MAX_VALUE) {
                                    throw new a(str);
                                }
                                i13++;
                                str2 = str;
                            } else {
                                str2 = str;
                            }
                            j23 += z12 ? 8L : 16L;
                            if (g18 == 0) {
                                if (i13 == i11) {
                                    return strArr;
                                }
                                throw new a(str2);
                            }
                            str = str2;
                            j22 = 0;
                        }
                    } else {
                        throw new a("did not find file offset of DT_STRTAB table");
                    }
                }
            }
        } else {
            throw new a("file is not ELF: 0x" + Long.toHexString(g11));
        }
    }

    private static String[] c(g gVar) {
        int i11 = 0;
        while (true) {
            try {
                return b(gVar);
            } catch (ClosedByInterruptException e11) {
                i11++;
                if (i11 <= 4) {
                    Thread.interrupted();
                    Log.e("MinElf", "retrying extract_DT_NEEDED due to ClosedByInterruptException", e11);
                    gVar.a();
                } else {
                    throw e11;
                }
            }
        }
    }

    private static long d(f fVar, ByteBuffer byteBuffer, long j11) {
        i(fVar, byteBuffer, 8, j11);
        return byteBuffer.getLong();
    }

    private static String e(f fVar, ByteBuffer byteBuffer, long j11) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            long j12 = 1 + j11;
            short h11 = h(fVar, byteBuffer, j11);
            if (h11 != 0) {
                sb2.append((char) h11);
                j11 = j12;
            } else {
                return sb2.toString();
            }
        }
    }

    private static int f(f fVar, ByteBuffer byteBuffer, long j11) {
        i(fVar, byteBuffer, 2, j11);
        return byteBuffer.getShort() & 65535;
    }

    private static long g(f fVar, ByteBuffer byteBuffer, long j11) {
        i(fVar, byteBuffer, 4, j11);
        return byteBuffer.getInt() & 4294967295L;
    }

    private static short h(f fVar, ByteBuffer byteBuffer, long j11) {
        i(fVar, byteBuffer, 1, j11);
        return (short) (byteBuffer.get() & 255);
    }

    private static void i(f fVar, ByteBuffer byteBuffer, int i11, long j11) {
        int M;
        byteBuffer.position(0);
        byteBuffer.limit(i11);
        while (byteBuffer.remaining() > 0 && (M = fVar.M(byteBuffer, j11)) != -1) {
            j11 += M;
        }
        if (byteBuffer.remaining() <= 0) {
            byteBuffer.position(0);
            return;
        }
        throw new a("ELF file truncated");
    }
}